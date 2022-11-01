package com.example.paedsdeve.CSVODKDownloader.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetHFacilities;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetLHWs;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetSources;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetTehsil;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetUCs;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetUsers;
import com.example.paedsdeve.CSVODKDownloader.getclasses.GetVillages;
import com.example.paedsdeve.CSVODKDownloader.syncclasses.SyncForms;
import com.example.paedsdeve.CSVODKDownloader.AndroidDatabaseManager;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.FormsList;
import com.example.paedsdeve.CSVODKDownloader.R;
import com.example.paedsdeve.CSVODKDownloader.contracts.FormsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.HFacilitiesContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.LHWsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.TehsilsContract;

public class MainActivity extends Activity {

    public static String TAG = MainActivity.class.getSimpleName();
    public List<String> lhwName;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    //    @BindView(R.id.clusterNo)
//    EditText clusterNo;
    @BindView(R.id.MN01)
    Spinner mN01;
    @BindView(R.id.MN02)
    Spinner mN02;
    @BindView(R.id.MN03)
    Spinner mN03;
    Map<String, String> tehsils, lhws;
    DatabaseHelper db;
    List<String> hfCodes;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    private String rSumText = "";

    //boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        AppMain.mnb1 = "Test";
        AppMain.chCount = 0;
        AppMain.chTotal = 0;

        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }

//        Tag Working

        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Tag Name");

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }

//        End Tag


        db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = db.getTodayForms();
        Collection<FormsContract> unsyncedForms = db.getUnsyncedForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size() + "\r\n";
        rSumText += "\r\n";
        if (todaysForms.size() > 0) {
            rSumText += "\tFORMS' LIST: \r\n";
            String iStatus;
            rSumText += "--------------------------------------------------\r\n";
            rSumText += "[ CHILD_ID ] \t[Form Status] \t[Sync Status]----------\r\n";
            rSumText += "--------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                if (fc.getiStatus() != null) {
                    switch (fc.getiStatus()) {
                        case "1":
                            iStatus = "\tComplete";
                            break;
                        case "2":
                            iStatus = "\tIncomplete";
                            break;
                        case "3":
                            iStatus = "\tRefused";
                            break;
                        case "4":
                            iStatus = "\tRefused";
                            break;
                        default:
                            iStatus = "\tN/A";
                    }
                } else {
                    iStatus = "\tN/A";
                }

                rSumText += fc.getChildId();

                rSumText += " " + iStatus + " ";

                rSumText += (fc.getSynced() == null ? "\t\tNot Synced" : "\t\tSynced");
                rSumText += "\r\n";
                rSumText += "--------------------------------------------------\r\n";
            }
        }
        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Data Download: \t" + syncPref.getString("LastDownSyncServer", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Data Upload: \t" + syncPref.getString("LastUpSyncServer", "Never Synced");
            rSumText += "\r\n";
            rSumText += "\r\n";
            rSumText += "Unsynced Forms: \t" + unsyncedForms.size();
            rSumText += "\r\n";
        }
        Log.d(TAG, "onCreate: " + rSumText);
        recordSummary.setText(rSumText);

        //        Sync Spinners

        AppMain.fc = null;

        // Spinner Drop down elements
        tehsils = new HashMap<>();
        final List<String> Tname = new ArrayList<>();
        Collection<TehsilsContract> Tc = db.getAllTehsil();
        Log.d(TAG, "onCreate: " + Tc.size());
        for (TehsilsContract hf : Tc) {
            tehsils.put(hf.getTehsil_name(), hf.getTehsil_code());
            Tname.add(hf.getTehsil_name());
        }

        mN01.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Tname));

        final List<String> hfCodes = new ArrayList<>();

        mN01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Spinner Drop down elements
                List<String> hfNames = new ArrayList<>();

                AppMain.tehsilCode = tehsils.get(Tname.get(position));

                Collection<HFacilitiesContract> hfc = db.getAllHFacilitiesByTehsil(AppMain.tehsilCode);
                Log.d(TAG, "onCreate: " + hfc.size());
                for (HFacilitiesContract hf : hfc) {
                    hfNames.add(hf.gethFacilityName());
                    hfCodes.add(hf.gethFacilityCode());
                }

                // attaching data adapter to spinner
                mN02.setAdapter(new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, hfNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mN02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                AppMain.hfCode = hfCodes.get(position);

                lhwName = new ArrayList<String>();
                lhws = new HashMap<String, String>();
                Collection<LHWsContract> lhwc = db.getAllLhwsByHf(hfCodes.get(position));
                for (LHWsContract lhw : lhwc) {
                    lhws.put("" + (lhw.getLHWName() + " (" + lhw.getLHWCode() + ")"), lhw.getLHWCode());
                    lhwName.add(lhw.getLHWName() + " (" + lhw.getLHWCode() + ")");
                }
                ArrayAdapter<String> psuAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, lhwName);

                psuAdapter
                        .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mN03.setAdapter(psuAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mN03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                AppMain.lhwCode = lhws.get(lhwName.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void CheckCluster(View v) {
        Intent childList = new Intent(getApplicationContext(), FormsList.class);
        startActivity(childList);

    }

    public void openForm(View v) {


        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null) {

            if (mN01.getSelectedItem() != null) {
                Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                startActivity(oF);
            } else {
                Toast.makeText(getApplicationContext(), "First click on Download Data", Toast.LENGTH_SHORT).show();
            }
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Tag Name");

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        if (mN01.getSelectedItem() != null) {
                            Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                            startActivity(oF);
                        } else {
                            Toast.makeText(getApplicationContext(), "First click on Download Data", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }


    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    public void openC(View v) {
        Intent iC = new Intent(this, SectionBActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionBActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        Intent iD = new Intent(this, SectionBActivity.class);
        startActivity(iD);
    }

    public void openF(View v) {
        Intent iD = new Intent(this, SectionFActivity.class);
        startActivity(iD);
    }

   /* public void openIM(View v) {
        Intent iIM = new Intent(this, SectionIMActivity.class);
        startActivity(iIM);
    }*/

    public void openG(View v) {
        Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);
    }

    public void openH(View v) {
        Intent iH = new Intent(this, SectionHActivity.class);
        startActivity(iH);
    }

    public void openK(View v) {
        Intent iK = new Intent(this, SectionKActivity.class);
        startActivity(iK);
    }

    public void openL(View v) {
        Intent iL = new Intent(this, SectionLActivity.class);
        startActivity(iL);
    }

    public void openM(View v) {
        Intent iM = new Intent(this, SectionMActivity.class);
        startActivity(iM);
    }

    public void openEnd(View v) {
        Intent iEnd = new Intent(this, EndingActivity.class);
        startActivity(iEnd);
    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void syncServer(View view) {

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();


            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {

        if (isNetworkAvailable()) {

            syncData sync = new syncData(this);
            sync.execute();
        }

    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    public class syncData extends AsyncTask<String, String, String> {

        private Context mContext;

        public syncData(Context mContext) {
            this.mContext = mContext;
        }

        @Override
        protected String doInBackground(String... strings) {
            runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    GetUsers us = new GetUsers(mContext);
                    Toast.makeText(mContext, "Syncing Users", Toast.LENGTH_SHORT).show();
                    us.execute();

                    GetTehsil gt = new GetTehsil(mContext);
                    Toast.makeText(mContext, "Syncing Tehsils", Toast.LENGTH_SHORT).show();
                    gt.execute();

                    GetVillages gv = new GetVillages(mContext);
                    Toast.makeText(mContext, "Syncing Villages", Toast.LENGTH_SHORT).show();
                    gv.execute();

                    GetUCs gu = new GetUCs(mContext);
                    Toast.makeText(mContext, "Syncing Ucs", Toast.LENGTH_SHORT).show();
                    gu.execute();

                    GetHFacilities gh = new GetHFacilities(mContext);
                    Toast.makeText(mContext, "Syncing Health Facilities", Toast.LENGTH_SHORT).show();
                    gh.execute();

                    GetLHWs gp = new GetLHWs(mContext);
                    Toast.makeText(mContext, "Syncing LHWs", Toast.LENGTH_SHORT).show();
                    gp.execute();

                    GetSources sr = new GetSources(mContext);
                    Toast.makeText(mContext, "Syncing NGOs", Toast.LENGTH_SHORT).show();
                    sr.execute();

                    SharedPreferences syncPref = getSharedPreferences("SyncInfo(DOWN)", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = syncPref.edit();

                    editor.putString("LastSyncDevice", dtToday);

                    editor.apply();
                }
            });


            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    //        Sync Spinners

                    AppMain.fc = null;

                    // Spinner Drop down elements
                    tehsils = new HashMap<>();
                    final List<String> Tname = new ArrayList<>();
                    Collection<TehsilsContract> Tc = db.getAllTehsil();
                    Log.d(TAG, "onCreate: " + Tc.size());
                    for (TehsilsContract hf : Tc) {
                        tehsils.put(hf.getTehsil_name(), hf.getTehsil_code());
                        Tname.add(hf.getTehsil_name());
                    }

                    mN01.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, Tname));

                    mN01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            // Spinner Drop down elements
                            List<String> hfNames = new ArrayList<>();

                            hfCodes = new ArrayList<>();

                            AppMain.tehsilCode = tehsils.get(Tname.get(position));

                            Collection<HFacilitiesContract> hfc = db.getAllHFacilitiesByTehsil(AppMain.tehsilCode);
                            Log.d(TAG, "onCreate: " + hfc.size());
                            for (HFacilitiesContract hf : hfc) {
                                hfNames.add(hf.gethFacilityName());
                                hfCodes.add(hf.gethFacilityCode());
                            }

                            // attaching data adapter to spinner
                            mN02.setAdapter(new ArrayAdapter<>(getBaseContext(),
                                    android.R.layout.simple_spinner_dropdown_item, hfNames));

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    mN02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            AppMain.hfCode = hfCodes.get(position);

                            lhwName = new ArrayList<String>();
                            lhws = new HashMap<String, String>();
                            Collection<LHWsContract> lhwc = db.getAllLhwsByHf(hfCodes.get(position));
                            for (LHWsContract lhw : lhwc) {
                                lhws.put("" + (lhw.getLHWName() + " (" + lhw.getLHWCode() + ")"), lhw.getLHWCode());
                                lhwName.add(lhw.getLHWName() + " (" + lhw.getLHWCode() + ")");
                            }
                            ArrayAdapter<String> psuAdapter = new ArrayAdapter<String>(MainActivity.this,
                                    android.R.layout.simple_spinner_item, lhwName);

                            psuAdapter
                                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            mN03.setAdapter(psuAdapter);

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    mN03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            AppMain.lhwCode = lhws.get(lhwName.get(position));
                /*Collection<LHWsContract> lhwc = db.getAllLhwsByHf(AppMain.hh01txt);
                for (LHWsContract l : lhwc) {
                    Log.d(TAG, "onItemSelected: " + l.getLHWCode() + " -" + AppMain.hh02txt);

                    if (l.getLHWCode().equals(AppMain.hh02txt)) {
                        Log.d(TAG, "onItemSelected: " + l.getLHWName());
                        String[] psuNameS = l.getLHWName().toString().split("\\|");
                        districtN.setText(psuNameS[0]);
                        Log.d(TAG, "onItemSelected: " + psuNameS[0]);
                        ucN.setText(psuNameS[1]);
                        Log.d(TAG, "onItemSelected: " + psuNameS[1]);
                        psuN.setText(psuNameS[2]);
                        Log.d(TAG, "onItemSelected: " + psuNameS[2]);

                    }
                }*/
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
            }, 1200);
        }
    }
}
