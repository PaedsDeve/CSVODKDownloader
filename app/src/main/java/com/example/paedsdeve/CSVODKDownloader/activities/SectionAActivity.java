package com.example.paedsdeve.CSVODKDownloader.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;
import com.example.paedsdeve.CSVODKDownloader.contracts.FormsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.UCsContract;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getSimpleName();
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.crauc)
    Spinner crauc;
    @BindView(R.id.btnChangeVillage)
    ToggleButton btnChangeVillage;
    @BindView(R.id.cravillage)
    EditText cravillage;
    @BindView(R.id.cra03)
    EditText cra03;
    @BindView(R.id.cra25)
    EditText cra25;
    @BindView(R.id.cra01)
    RadioGroup cra01;
    @BindView(R.id.cra0101)
    RadioButton cra0101;
    @BindView(R.id.cra0102)
    RadioButton cra0102;
    @BindView(R.id.fldGrpcra01bnf)
    LinearLayout fldGrpcra01bnf;
    @BindView(R.id.cra01bnf)
    EditText cra01bnf;
    @BindView(R.id.cra26)
    EditText cra26;
    @BindView(R.id.fldGrpcra02)
    LinearLayout fldGrpcra02;
    @BindView(R.id.cra02)
    RadioGroup cra02;
    @BindView(R.id.cra0201)
    RadioButton cra0201;
    @BindView(R.id.cra0202)
    RadioButton cra0202;
    @BindView(R.id.fldGrpcra02res)
    LinearLayout fldGrpcra02res;
    @BindView(R.id.cra02res)
    EditText cra02res;
    @BindView(R.id.fldGrpcra03)
    LinearLayout fldGrpcra03;
    @BindView(R.id.cra04)
    RadioGroup cra04;
    @BindView(R.id.cra0401)
    RadioButton cra0401;
    @BindView(R.id.cra0402)
    RadioButton cra0402;
    @BindView(R.id.cra0403)
    RadioButton cra0403;
    @BindView(R.id.cra0404)
    RadioButton cra0404;
    @BindView(R.id.cra0405)
    RadioButton cra0405;
    @BindView(R.id.cra05)
    EditText cra05;
    @BindView(R.id.cra06)
    EditText cra06;
    @BindView(R.id.cra07)
    EditText cra07;
    @BindView(R.id.cra08)
    RadioGroup cra08;
    @BindView(R.id.cra0801)
    RadioButton cra0801;
    @BindView(R.id.cra0802)
    RadioButton cra0802;
    @BindView(R.id.cra0803)
    RadioButton cra0803;
    @BindView(R.id.cra0804)
    RadioButton cra0804;
    @BindView(R.id.cra0805)
    RadioButton cra0805;
    @BindView(R.id.cra0806)
    RadioButton cra0806;
    @BindView(R.id.cra0807)
    RadioButton cra0807;
    @BindView(R.id.cra0808)
    RadioButton cra0808;
    @BindView(R.id.cra0809)
    RadioButton cra0809;
    @BindView(R.id.cra0810)
    RadioButton cra0810;
    @BindView(R.id.cra0811)
    RadioButton cra0811;
    @BindView(R.id.cra0812)
    RadioButton cra0812;
    @BindView(R.id.cra0896)
    RadioButton cra0896;
    @BindView(R.id.cra0896x)
    EditText cra0896x;
    @BindView(R.id.cra09)
    EditText cra09;
    @BindView(R.id.cra10)
    EditText cra10;
    @BindView(R.id.cra11)
    EditText cra11;
    @BindView(R.id.cra12)
    EditText cra12;
    @BindView(R.id.cra13)
    RadioGroup cra13;
    @BindView(R.id.cra1301)
    RadioButton cra1301;
    @BindView(R.id.cra1302)
    RadioButton cra1302;
    @BindView(R.id.cra14)
    EditText cra14;
    @BindView(R.id.cra15)
    EditText cra15;
    @BindView(R.id.cra16)
    RadioGroup cra16;
    @BindView(R.id.cra1601)
    RadioButton cra1601;
    @BindView(R.id.cra1602)
    RadioButton cra1602;
    @BindView(R.id.cra1603)
    RadioButton cra1603;
    @BindView(R.id.cra17)
    EditText cra17;
    @BindView(R.id.cra18)
    EditText cra18;
    @BindView(R.id.cra19)
    EditText cra19;
    @BindView(R.id.cra20)
    EditText cra20;
    @BindView(R.id.cra22)
    EditText cra22;
    @BindView(R.id.cra23)
    EditText cra23;
    @BindView(R.id.cra24)
    EditText cra24;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.btnNext)
    Button btnNext;


    String deviceId;
    DatabaseHelper db;

    Map<String, String> getAllUCs, getAllVillages;
    List<String> UCs, VillagesName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);


        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);

        //dtToday = new SimpleDateFormat("dd-MM-yy HH:mm");

        ///================ Q1 Skip pattern================

        cra01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cra0101.isChecked()) {
                    fldGrpcra01bnf.setVisibility(View.VISIBLE);
                    cra0401.setEnabled(false);
                    cra0401.setChecked(false);
                    cra0402.setEnabled(true);
                    cra0403.setEnabled(true);
                    cra0404.setEnabled(true);
                    cra0405.setEnabled(true);
                } else {
                    fldGrpcra01bnf.setVisibility(View.GONE);
                    cra01bnf.setText(null);
                    cra0401.setEnabled(true);
                    cra0402.setEnabled(false);
                    cra0402.setChecked(false);
                    cra0403.setEnabled(false);
                    cra0403.setChecked(false);
                    cra0404.setEnabled(false);
                    cra0404.setChecked(false);
                    cra0405.setEnabled(false);
                    cra0405.setChecked(false);

                }
            }
        });

        //============== Q2 Skip Pattern // Verbal Consent====

        cra02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cra0201.isChecked()) {
                    fldGrpcra02res.setVisibility(View.GONE);
                    fldGrpcra03.setVisibility(View.VISIBLE);
                    btnNext.setVisibility(View.VISIBLE);
                    cra02res.setText(null);
                } else {
                    fldGrpcra02res.setVisibility(View.VISIBLE);
                    fldGrpcra03.setVisibility(View.GONE);
                    btnNext.setVisibility(View.GONE);
                    //cra03.setText(null);
                    cra04.clearCheck();
                    cra05.setText(null);
                    cra06.setText(null);
                    cra07.setText(null);
                    cra08.clearCheck();
                    cra0896x.setText(null);
                    cra09.setText(null);
                    cra10.setText(null);
                    cra11.setText(null);
                    cra12.setText(null);
                    cra13.clearCheck();
                    cra14.setText(null);
                    cra15.setText(null);
                    cra16.clearCheck();
                    cra17.setText(null);
                    cra18.setText(null);
                    cra19.setText(null);
                    cra20.setText(null);
                    //cra21.setText(null);
                    cra22.setText(null);
                    cra23.setText(null);
                    cra24.setText(null);
                }
            }
        });

//        Spinner Fill

        db = new DatabaseHelper(this);

        UCs = new ArrayList<>();
        getAllUCs = new HashMap<>();

        Collection<UCsContract> allUcs = db.getAllUCsByTehsil(AppMain.tehsilCode);

        for (UCsContract aUCs : allUcs) {
            getAllUCs.put(aUCs.getUcName(), aUCs.getUcCode());
            UCs.add(aUCs.getUcName());
        }

        crauc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, UCs));

        crauc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//                VillagesName = new ArrayList<>();
//                getAllVillages = new HashMap<>();
//                Collection<VillagesContract> allVillages = db.getAllVillagesByUc(getAllUCs.get(UCs.get(position)));
//                for (VillagesContract aVillages : allVillages) {
//                    getAllVillages.put(aVillages.getVillageName(), aVillages.getVillageCode());
//                    VillagesName.add(aVillages.getVillageName());
//                }
//                cravillage.setAdapter(new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, VillagesName));

                if (AppMain.UCsCodeFlag) {
                    AppMain.UCsCode = position;
                }

                if (!AppMain.UCsCodeFlag) {
                    crauc.setSelection(AppMain.UCsCode);

                    btnChangeVillage.setChecked(false);
                    crauc.setEnabled(false);
                    cravillage.setEnabled(false);

                    cravillage.setText(AppMain.VillageName);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


//        cravillage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                if (AppMain.VillageCodeFlag) {
//                    AppMain.VillageName = position;
//                }
//
//                if (!AppMain.VillageCodeFlag) {
//                    cravillage.setSelection(AppMain.VillageName);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

        if (crauc.getItemAtPosition(0) == "...") {
            btnChangeVillage.setChecked(true);
            crauc.setEnabled(true);
            cravillage.setEnabled(true);
        } else {
            btnChangeVillage.setChecked(false);
            crauc.setEnabled(false);
            cravillage.setEnabled(false);
        }

        btnChangeVillage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btnChangeVillage.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Edit mode", Toast.LENGTH_SHORT).show();

                    crauc.setEnabled(true);
                    cravillage.setEnabled(true);

                    AppMain.UCsCodeFlag = true;
                    AppMain.VillageCodeFlag = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();

                    crauc.setEnabled(false);
                    cravillage.setEnabled(false);

                    AppMain.UCsCodeFlag = false;
                    AppMain.VillageCodeFlag = false;
                }

            }
        });

        cra0896.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    cra0896x.setVisibility(View.VISIBLE);
                } else {
                    cra0896x.setVisibility(View.GONE);
                    cra0896x.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionBActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                finish();
                Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        long updcount = db.addForm(AppMain.fc);

        AppMain.fc.setID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            AppMain.fc.setUID(
                    (AppMain.fc.getDeviceID() + AppMain.fc.getID()));
            db.updateFormID();

        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        }
        return true;

    }


    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section A", Toast.LENGTH_SHORT).show();

        if (crauc.getSelectedItem() == "...") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
            ((TextView) crauc.getSelectedView()).setError("This Data is Required");

            Log.i(TAG, "cra01: This Data is Required!");
            return false;
        } else {
            ((TextView) crauc.getSelectedView()).setError(null);
        }

        if (cravillage.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crvillage), Toast.LENGTH_SHORT).show();
            cravillage.setError("This data is Required!");

            Log.i(TAG, "cravillage: This Data is Required!");
            return false;
        } else {
            cravillage.setError(null);
        }

        //================ Q 3==================
        if (cra03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra03), Toast.LENGTH_SHORT).show();
            cra03.setError("This data is Required!");

            Log.i(TAG, "cra03: This Data is Required!");
            return false;
        } else {
            cra03.setError(null);
        }

        //================ Q25===============
        if (cra25.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty) " + getString(R.string.cra25), Toast.LENGTH_SHORT).show();
            cra25.setError("This data is Required!");

            Log.i(TAG, "cra25: This Data is Required!");
            return false;
        } else {
            cra25.setError(null);
        }

        //======================= Q 1 ===============
        if (cra01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra01), Toast.LENGTH_SHORT).show();
            cra0102.setError("This data is Required!");

            Log.i(TAG, "cra01: This Data is Required!");
            return false;
        } else {
            cra0102.setError(null);
        }

        //================ Q26===============
        if (cra26.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty) " + getString(R.string.cra26), Toast.LENGTH_SHORT).show();
            cra26.setError("This data is Required!");

            Log.i(TAG, "cra26: This Data is Required!");
            return false;
        } else {
            cra26.setError(null);
        }

        if (cra0101.isChecked()) {
            if (cra01bnf.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra01bnf), Toast.LENGTH_SHORT).show();
                cra01bnf.setError("This data is Required!");

                Log.i(TAG, "cra01bnf: This Data is Required!");
                return false;
            } else {
                cra01bnf.setError(null);
            }

            if (Integer.valueOf(cra01bnf.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra01bnf), Toast.LENGTH_SHORT).show();
                cra01bnf.setError("Zero not allowed...");

                Log.i(TAG, "cra01bnf: zero not allowed...");
                return false;
            } else {
                cra01bnf.setError(null);
            }

            if (Integer.valueOf(cra01bnf.getText().toString()) > 9) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra01bnf), Toast.LENGTH_SHORT).show();
                cra01bnf.setError("Range is 1 - 9 ");

                Log.i(TAG, "cra01bnf: Range is 1 - 9 ");
                return false;
            } else {
                cra01bnf.setError(null);
            }


            if (Double.parseDouble(cra26.getText().toString()) < 0.01 || Double.parseDouble(cra26.getText().toString()) > 16.17) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra26), Toast.LENGTH_SHORT).show();
                cra26.setError("Range 0.01 - 16.17");

                Log.i(TAG, "cra26: Range 0.01 - 16.17!");
                return false;
            } else {
                cra26.setError(null);
            }
        } else {
            if (Double.parseDouble(cra26.getText().toString()) < 16.18 || Double.parseDouble(cra26.getText().toString()) > 20.00) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra26), Toast.LENGTH_SHORT).show();
                cra26.setError("Range 16.18 - 20.00");

                Log.i(TAG, "cra26: Range 16.18 - 20.00!");
                return false;
            } else {
                cra26.setError(null);
            }
        }


        //========== Q2==============
        if (cra02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra02), Toast.LENGTH_SHORT).show();
            cra0202.setError("This data is Required!");

            Log.i(TAG, "cra02: This Data is Required!");
            return false;
        } else {
            cra0202.setError(null);
        }

        if (cra0201.isChecked()) {


            //================= Q4================
            if (cra04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra04), Toast.LENGTH_SHORT).show();
                cra0405.setError("This data is Required!");

                Log.i(TAG, "cra04: This Data is Required!");
                return false;
            } else {
                cra0405.setError(null);
            }

            //======================= Q5==================
            if (cra05.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra05), Toast.LENGTH_SHORT).show();
                cra05.setError("This data is Required!");

                Log.i(TAG, "cra05: This Data is Required!");
                return false;
            } else {
                cra05.setError(null);
            }
            //======================= Q6==================
            if (cra06.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra06), Toast.LENGTH_SHORT).show();
                cra06.setError("This data is Required!");

                Log.i(TAG, "cra06: This Data is Required!");
                return false;
            } else {
                cra06.setError(null);
            }

            //==================== Q7====================
            if (cra07.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra07), Toast.LENGTH_SHORT).show();
                cra07.setError("This data is Required!");

                Log.i(TAG, "cra07: This Data is Required!");
                return false;
            } else {
                cra07.setError(null);
            }

            //============== Check on Education=============
            if ((Integer.valueOf(cra07.getText().toString()) < 0)
                    || (Integer.valueOf(cra07.getText().toString()) > 16)) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra07), Toast.LENGTH_LONG).show();
                cra07.setError("Range is 1-16");
                Log.i(TAG, "cra07: Range is 1-16");
                return false;
            } else {
                cra07.setError(null);
            }


            //=================== Q8==============
            if (cra08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra08), Toast.LENGTH_SHORT).show();
                cra0896.setError("This data is Required!");

                Log.i(TAG, "cra08: This Data is Required!");
                return false;
            } else {
                cra0896.setError(null);
            }

            //=================== Q8 Others ==============
            if (cra0896.isChecked() && cra0896x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra08) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                cra0896x.setError("This data is Required!");

                Log.i(TAG, "cra0896x: This Data is Required!");
                return false;
            } else {
                cra0896x.setError(null);
            }


            //================== Q9=====================
            if (cra09.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra09), Toast.LENGTH_SHORT).show();
                cra09.setError("This data is Required!");

                Log.i(TAG, "cra09: This Data is Required!");
                return false;
            } else {
                cra09.setError(null);
            }


            //======================= Q10===============
            if (cra10.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra10), Toast.LENGTH_SHORT).show();
                cra10.setError("This data is Required!");

                Log.i(TAG, "cra10: This Data is Required!");
                return false;
            } else {
                cra10.setError(null);
            }
            //================== Check on age of mother===============
            if ((Integer.valueOf(cra10.getText().toString()) < 15)
                    || (Integer.valueOf(cra10.getText().toString()) > 49)) {
                Toast.makeText(this, "ERROR(Invali d) " + getString(R.string.cra10), Toast.LENGTH_LONG).show();
                cra10.setError("Range is 15-49 years");
                Log.i(TAG, "cra07: Range is 15-49");
                return false;
            } else {
                cra10.setError(null);
            }
            //==================== Q11=================
            if (cra11.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra11), Toast.LENGTH_SHORT).show();
                cra11.setError("This data is Required!");

                Log.i(TAG, "cra11: This Data is Required!");
                return false;
            } else {
                cra11.setError(null);
            }

            //=============== Check on Education of Mother================
            if ((Integer.valueOf(cra11.getText().toString()) < 0)
                    || (Integer.valueOf(cra11.getText().toString()) > 16)) {
                Toast.makeText(this, "ERROR(Invalid) " + getString(R.string.cra11), Toast.LENGTH_LONG).show();
                cra11.setError("Range is 1-16");
                Log.i(TAG, "cra11: Range is 1-16");
                return false;
            } else {
                cra11.setError(null);
            }
            //================= Q12===================
            if (cra12.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra12), Toast.LENGTH_SHORT).show();
                cra12.setError("This data is Required!");

                Log.i(TAG, "cra12: This Data is Required!");
                return false;
            } else {
                cra12.setError(null);
            }
            //===================== Check on age of mother at time of marriage===================
            if ((Integer.valueOf(cra12.getText().toString()) < 15)
                    || (Integer.valueOf(cra12.getText().toString()) > 49)) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.cra12), Toast.LENGTH_LONG).show();
                cra12.setError("Range is 15-49 years");
                Log.i(TAG, "cra12: Range is 15-49");
                return false;
            } else {
                cra12.setError(null);
            }

            if ((Integer.valueOf(cra12.getText().toString())
                    > (Integer.valueOf(cra10.getText().toString())))) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.cra12), Toast.LENGTH_LONG).show();
                cra12.setError("Can not be greater than current age");
                Log.i(TAG, "Can not be greater than current age");
                return false;
            } else {
                cra12.setError(null);
            }


            //======================= Q13================
            if (cra13.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra13), Toast.LENGTH_SHORT).show();
                cra1302.setError("This data is Required!");

                Log.i(TAG, "cra13: This Data is Required!");
                return false;
            } else {
                cra1302.setError(null);
            }

            //================ Q14===============
            if (cra14.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra14), Toast.LENGTH_SHORT).show();
                cra14.setError("This is data is Required!");

                Log.i(TAG, "cra14: This Data is Required!");
                return false;
            } else {
                cra14.setError(null);
            }

            if (Integer.valueOf(cra14.getText().toString()) < 1
                    || Integer.valueOf(cra14.getText().toString()) > 15) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra14), Toast.LENGTH_SHORT).show();
                cra14.setError("Range is 1 - 15");

                Log.i(TAG, "cra14: Range is 1 - 15");
                return false;
            } else {
                cra14.setError(null);
            }

            //================ Q15===============
            if (cra15.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra15), Toast.LENGTH_SHORT).show();
                cra15.setError("This data is Required!");

                Log.i(TAG, "cra15: This Data is Required!");
                return false;
            } else {
                cra15.setError(null);
            }

            if (Integer.valueOf(cra15.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra15), Toast.LENGTH_SHORT).show();
                cra15.setError("Can not be zero!");

                Log.i(TAG, "cra15: Can not be zero");
                return false;
            } else {
                cra15.setError(null);
            }

            if (Integer.valueOf(cra15.getText().toString())
                    > (Integer.valueOf(cra14.getText().toString()) + 1)) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra14), Toast.LENGTH_SHORT).show();
                cra14.setError("Check pregnancies and live births again");

                Log.i(TAG, "cra14: Check pregnancies and live births again");
                return false;
            } else {
                cra14.setError(null);
            }

            //================ Q16===============
            if (cra16.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra16), Toast.LENGTH_SHORT).show();
                cra1603.setError("This data is Required!");

                Log.i(TAG, "cra16: This Data is Required!");
                return false;
            } else {
                cra1603.setError(null);
            }

            //================ Q17===============
            if (cra17.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra17), Toast.LENGTH_SHORT).show();
                cra17.setError("This data is Required!");

                Log.i(TAG, "cra17: This Data is Required!");
                return false;
            } else {
                cra17.setError(null);
            }


            //================ Q18===============
            if (cra18.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra18), Toast.LENGTH_SHORT).show();
                cra18.setError("This data is Required!");

                Log.i(TAG, "cra18: This Data is Required!");
                return false;
            } else {
                cra18.setError(null);
            }

            if (Integer.valueOf(cra18.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra18), Toast.LENGTH_SHORT).show();
                cra18.setError("Can not be zero!");

                Log.i(TAG, "cra18: Can not be zero");
                return false;
            } else {
                cra18.setError(null);
            }


            //================ Q19===============
            if (cra19.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra19), Toast.LENGTH_SHORT).show();
                cra19.setError("This data is Required!");

                Log.i(TAG, "cra19: This Data is Required!");
                return false;
            } else {
                cra19.setError(null);
            }

            //================ Q20===============
            if (cra20.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra20), Toast.LENGTH_SHORT).show();
                cra20.setError("This data is Required!");

                Log.i(TAG, "cra20: This Data is Required!");
                return false;
            } else {
                cra20.setError(null);
            }

            //================ Q21===============

                /*if (cra21.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra21), Toast.LENGTH_SHORT).show();
                    cra21.setError("This data is Required!");

                    Log.i(TAG, "cra21: This Data is Required!");
                    return false;
                } else {
                    cra21.setError(null);
                }*/

            //================ Q22===============
            if (cra22.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra22), Toast.LENGTH_SHORT).show();
                cra22.setError("This data is Required!");

                Log.i(TAG, "cra22: This Data is Required!");
                return false;
            } else {
                cra22.setError(null);
            }

            //================ Q23===============
            if (cra23.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra23), Toast.LENGTH_SHORT).show();
                cra23.setError("This data is Required!");

                Log.i(TAG, "cra23: This Data is Required!");
                return false;
            } else {
                cra23.setError(null);
            }

            //================ Q24===============
            if (cra24.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cra24), Toast.LENGTH_SHORT).show();
                cra24.setError("This data is Required!");

                Log.i(TAG, "cra24: This Data is Required!");
                return false;
            } else {
                cra24.setError(null);
            }

            if ((Integer.valueOf(cra17.getText().toString()) + Integer.valueOf(cra18.getText().toString())
                    + Integer.valueOf(cra19.getText().toString()) + Integer.valueOf(cra22.getText().toString())
                    + Integer.valueOf(cra23.getText().toString()))
                    > Integer.valueOf(cra24.getText().toString())) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra17), Toast.LENGTH_SHORT).show();
                cra17.setError("Can not be greater than total members!");

                Log.i(TAG, "cra17: Can not be greater than total members");
                return false;
            } else {
                cra17.setError(null);
            }

            if ((Integer.valueOf(cra20.getText().toString()))
                    > Integer.valueOf(cra23.getText().toString())) {
                Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra23), Toast.LENGTH_SHORT).show();
                cra23.setError("Can not be greater than adult females!");

                Log.i(TAG, "cra20: Can not be greater than adult females");
                return false;
            } else {
                cra23.setError(null);
            }


            //================== Check on Total members in HH=============

//                if (Integer.parseInt(cra24.getText().toString().isEmpty() ? "0" : cra24.getText().toString())
//                        != ((Integer.parseInt(cra17.getText().toString().isEmpty() ? "0" : cra17.getText().toString()))
//                        + (Integer.parseInt(cra18.getText().toString().isEmpty() ? "0" : cra18.getText().toString()))
//                        + (Integer.parseInt(cra19.getText().toString().isEmpty() ? "0" : cra19.getText().toString()))
//                        + (Integer.parseInt(cra20.getText().toString().isEmpty() ? "0" : cra20.getText().toString()))
//                        //+ (Integer.parseInt(cra21.getText().toString().isEmpty() ? "0" : cra21.getText().toString()))
//                        + (Integer.parseInt(cra22.getText().toString().isEmpty() ? "0" : cra22.getText().toString()))
//                        + (Integer.parseInt(cra23.getText().toString().isEmpty() ? "0" : cra23.getText().toString())))) {
//                    Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.cra17), Toast.LENGTH_SHORT).show();
//                    cra17.setError("Invalid: Check all members again");
//
//                    Log.i(TAG, "cra17: Check All members again!");
//                    return false;
//                } else {
//                    cra17.setError(null);
//                }


//                if (cra26.getText().toString().indexOf(".") < -1) {
//                    Toast.makeText(this, "ERROR(Must have a decimal point) " + getString(R.string.cra26), Toast.LENGTH_SHORT).show();
//                    Log.i(TAG, "cra26: This Data is Required!");
//                    return false;
//                } else {
//
//                    if (cra26.getText().toString().length() != 5) {
//                        Toast.makeText(this, "ERROR(Invalid Format) " + getString(R.string.cra26), Toast.LENGTH_SHORT).show();
//                        Log.i(TAG, "cra26: This Data is Required!");
//                        return false;
//                    }
//                }


        }


        return true;

    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

//        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            AppMain.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            AppMain.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            AppMain.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            AppMain.fc.setGpsTime(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for this Section", Toast.LENGTH_SHORT).show();

        AppMain.VillageName = cravillage.getText().toString();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        AppMain.fc = new FormsContract();

        AppMain.fc.setUserName(AppMain.username);
        AppMain.fc.setDeviceID(deviceId);
        AppMain.fc.setHhDT(dtToday);
        AppMain.fc.setTehsil(AppMain.tehsilCode);
        AppMain.fc.sethFacility(AppMain.hfCode);
        AppMain.fc.setLhwCode(AppMain.lhwCode);
        AppMain.fc.setUccode(getAllUCs.get(crauc.getSelectedItem().toString()));
        AppMain.fc.setVillagename(AppMain.VillageName);
        AppMain.fc.setChildId(cra03.getText().toString());
        AppMain.fc.setTagId(sharedPref.getString("tagName", ""));

        JSONObject sa = new JSONObject();

        sa.put("cra01", cra0101.isChecked() ? "1" : cra0102.isChecked() ? "2" : "0");
        sa.put("cra01bnf", cra01bnf.getText().toString());
        sa.put("cra02", cra0201.isChecked() ? "1" : cra0202.isChecked() ? "2" : "0");
        sa.put("cra02res", cra02res.getText().toString());
        sa.put("cra03", cra03.getText().toString());
        sa.put("cra04", cra0401.isChecked() ? "1" : cra0402.isChecked() ? "2" : cra0403.isChecked() ? "3"
                : cra0404.isChecked() ? "4" : cra0405.isChecked() ? "5" : "0");
        sa.put("cra05", cra05.getText().toString());
        sa.put("cra06", cra06.getText().toString());
        sa.put("cra07", cra07.getText().toString());
        sa.put("cra08", cra0801.isChecked() ? "1" : cra0802.isChecked() ? "2" : cra0803.isChecked() ? "3"
                : cra0804.isChecked() ? "4" : cra0805.isChecked() ? "5" : cra0806.isChecked() ? "6" : cra0807.isChecked() ? "7"
                : cra0808.isChecked() ? "8" : cra0809.isChecked() ? "9" : cra0810.isChecked() ? "10" : cra0811.isChecked() ? "11"
                : cra0812.isChecked() ? "12" : cra0896.isChecked() ? "96" : "0");
        sa.put("cra0896x", cra0896x.getText().toString());
        sa.put("cra09", cra09.getText().toString());
        sa.put("cra10", cra10.getText().toString());
        sa.put("cra11", cra11.getText().toString());
        sa.put("cra12", cra12.getText().toString());
        sa.put("cra13", cra1301.isChecked() ? "1" : cra1302.isChecked() ? "2" : "0");
        sa.put("cra14", cra14.getText().toString());
        sa.put("cra15", cra15.getText().toString());
        sa.put("cra16", cra1601.isChecked() ? "1" : cra1602.isChecked() ? "2" : cra1603.isChecked() ? "3" : "0");
        sa.put("cra17", cra17.getText().toString());
        sa.put("cra18", cra18.getText().toString());
        sa.put("cra19", cra19.getText().toString());
        sa.put("cra20", cra20.getText().toString());
        //sa.put("cra21", cra21.getText().toString());
        sa.put("cra22", cra22.getText().toString());
        sa.put("cra23", cra23.getText().toString());
        sa.put("cra24", cra24.getText().toString());
        sa.put("cra25", cra25.getText().toString());
        sa.put("cra26", cra26.getText().toString());

        setGPS();

        AppMain.fc.setsA(String.valueOf(sa));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


}
