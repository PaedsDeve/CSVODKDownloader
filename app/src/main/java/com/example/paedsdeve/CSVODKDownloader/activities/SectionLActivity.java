package com.example.paedsdeve.CSVODKDownloader.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;

public class SectionLActivity extends Activity {

    private static final String TAG = SectionLActivity.class.getSimpleName();

    @BindView(R.id.activity_section_l)
    ScrollView activitySectionL;
    @BindView(R.id.crl01)
    RadioGroup crl01;
    @BindView(R.id.crl0101)
    RadioButton crl0101;
    @BindView(R.id.crl0102)
    RadioButton crl0102;
    @BindView(R.id.crl0103)
    RadioButton crl0103;
    @BindView(R.id.crlGrp01)
    LinearLayout crlGrp01;
    @BindView(R.id.crl02)
    EditText crl02;
    @BindView(R.id.crl03)
    RadioGroup crl03;
    @BindView(R.id.crl0301)
    RadioButton crl0301;
    @BindView(R.id.crl0302)
    RadioButton crl0302;
    @BindView(R.id.crl0399)
    RadioButton crl0399;
    @BindView(R.id.crlGrp03)
    LinearLayout crlGrp03;
    @BindView(R.id.crl0501)
    EditText crl0501;
    @BindView(R.id.crl0599)
    CheckBox crl0599;
    @BindView(R.id.crl0401)
    CheckBox crl0401;
    @BindView(R.id.crl0402)
    CheckBox crl0402;
    @BindView(R.id.crl0403)
    CheckBox crl0403;
    @BindView(R.id.crl0404)
    CheckBox crl0404;
    @BindView(R.id.crl0405)
    CheckBox crl0405;
    @BindView(R.id.crl0406)
    CheckBox crl0406;
    @BindView(R.id.crl0407)
    CheckBox crl0407;
    @BindView(R.id.crl0408)
    CheckBox crl0408;
    @BindView(R.id.crl0496)
    CheckBox crl0496;
    @BindView(R.id.crl0496x)
    EditText crl0496x;
    @BindView(R.id.crl0601)
    CheckBox crl0601;
    @BindView(R.id.crl0602)
    CheckBox crl0602;
    @BindView(R.id.crl0603)
    CheckBox crl0603;
    @BindView(R.id.crl0604)
    CheckBox crl0604;
    @BindView(R.id.crl0605)
    CheckBox crl0605;
    @BindView(R.id.crl0606)
    CheckBox crl0606;
    @BindView(R.id.crl0696)
    CheckBox crl0696;
    @BindView(R.id.crl0696x)
    EditText crl0696x;
    @BindView(R.id.crl0701)
    EditText crl0701;
    @BindView(R.id.crl0799)
    CheckBox crl0799;
    @BindView(R.id.crl08)
    RadioGroup crl08;
    @BindView(R.id.crl0801)
    RadioButton crl0801;
    @BindView(R.id.crl0802)
    RadioButton crl0802;
    @BindView(R.id.crl0899)
    RadioButton crl0899;
    @BindView(R.id.crlGrp08)
    LinearLayout crlGrp08;
    @BindView(R.id.crl0901)
    EditText crl0901;
    @BindView(R.id.crl0902)
    EditText crl0902;
    @BindView(R.id.crl0997)
    CheckBox crl0997;
    @BindView(R.id.crl0998)
    CheckBox crl0998;
    @BindView(R.id.crl10)
    RadioGroup crl10;
    @BindView(R.id.crl1001)
    RadioButton crl1001;
    @BindView(R.id.crl1002)
    RadioButton crl1002;
    @BindView(R.id.crl1003)
    RadioButton crl1003;
    @BindView(R.id.crl1004)
    RadioButton crl1004;
    @BindView(R.id.crl1005)
    RadioButton crl1005;
    @BindView(R.id.crl1006)
    RadioButton crl1006;
    @BindView(R.id.crl1096)
    RadioButton crl1096;
    @BindView(R.id.crl1096x)
    EditText crl1096x;
    @BindView(R.id.crl11)
    RadioGroup crl11;
    @BindView(R.id.crl1101)
    RadioButton crl1101;
    @BindView(R.id.crl1102)
    RadioButton crl1102;
    @BindView(R.id.crl1103)
    RadioButton crl1103;
    @BindView(R.id.crl1196)
    RadioButton crl1196;
    @BindView(R.id.crl1196x)
    EditText crl1196x;
    @BindView(R.id.crl1201)
    EditText crl1201;
    @BindView(R.id.crl1202)
    EditText crl1202;
    @BindView(R.id.crl1203)
    EditText crl1203;
    @BindView(R.id.crl1204)
    CheckBox crl1204;
    @BindView(R.id.crlGrp12)
    LinearLayout crlGrp12;
    @BindView(R.id.crl13)
    RadioGroup crl13;
    @BindView(R.id.crl1301)
    RadioButton crl1301;
    @BindView(R.id.crl1302)
    RadioButton crl1302;
    @BindView(R.id.crl1303)
    RadioButton crl1303;
    @BindView(R.id.crl1304)
    RadioButton crl1304;
    @BindView(R.id.crl1305)
    RadioButton crl1305;
    @BindView(R.id.crl1306)
    RadioButton crl1306;
    @BindView(R.id.crl1307)
    RadioButton crl1307;
    @BindView(R.id.crl1308)
    RadioButton crl1308;
    @BindView(R.id.crl1396)
    RadioButton crl1396;
    @BindView(R.id.crl1396x)
    EditText crl1396x;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l);
        ButterKnife.bind(this);

        // ====================== Q1 Skip Pattern =========================
        crl01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0101.isChecked()) {
                    crlGrp01.setVisibility(View.VISIBLE);
                } else {
                    crlGrp01.setVisibility(View.GONE);
                    crl02.setText(null);
                }
            }
        });


        // ====================== Q3 Skip Pattern =========================
        crl03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0301.isChecked()) {
                    crlGrp03.setVisibility(View.VISIBLE);
                } else {
                    crlGrp03.setVisibility(View.GONE);
                    crl0401.setChecked(false);
                    crl0402.setChecked(false);
                    crl0403.setChecked(false);
                    crl0404.setChecked(false);
                    crl0405.setChecked(false);
                    crl0406.setChecked(false);
                    crl0407.setChecked(false);
                    crl0408.setChecked(false);
                    crl0496.setChecked(false);
                    crl0496x.setText(null);
                    crl0501.setText(null);
                    crl0599.setChecked(false);
                    crl0601.setChecked(false);
                    crl0602.setChecked(false);
                    crl0603.setChecked(false);
                    crl0604.setChecked(false);
                    crl0605.setChecked(false);
                    crl0606.setChecked(false);
                    crl0696.setChecked(false);
                    crl0696.setChecked(false);
                    crl0696x.setText(null);
                    crl0701.setText(null);
                    crl0799.setChecked(false);
                    crl08.clearCheck();

                }
            }
        });

        crl0496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0496x.setVisibility(View.VISIBLE);
                } else {
                    crl0496x.setVisibility(View.GONE);
                    crl0496x.setText(null);
                }
            }
        });

        crl0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0696x.setVisibility(View.VISIBLE);
                } else {
                    crl0696x.setVisibility(View.GONE);
                    crl0696x.setText(null);
                }
            }
        });

        crl0997.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0901.setVisibility(View.GONE);
                    crl0901.setText(null);
                    crl0902.setVisibility(View.GONE);
                    crl0902.setText(null);
                    crl0998.setChecked(false);

                } else if (!crl0998.isChecked()) {
                    crl0901.setVisibility(View.VISIBLE);
                    crl0902.setVisibility(View.VISIBLE);
                }
            }
        });

        crl0998.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0901.setVisibility(View.GONE);
                    crl0901.setText(null);
                    crl0902.setVisibility(View.GONE);
                    crl0902.setText(null);
                    crl0997.setChecked(false);
                } else if (!crl0997.isChecked()) {
                    crl0901.setVisibility(View.VISIBLE);
                    crl0902.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q8 Skip Pattern =========================
        crl08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crl0801.isChecked()) {
                    crlGrp08.setVisibility(View.VISIBLE);
                } else {
                    crlGrp08.setVisibility(View.GONE);
                    crl0901.setText(null);
                    crl0902.setText(null);
                    crl0998.setChecked(false);
                    crl0997.setChecked(false);
                }
            }
        });

        // ====================== Q12 Skip Pattern =========================
        crl1204.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1201.setVisibility(View.GONE);
                    crl1201.setText(null);
                    crl1202.setVisibility(View.GONE);
                    crl1202.setText(null);
                    crl1203.setVisibility(View.GONE);
                    crl1203.setText(null);
                    crlGrp12.setVisibility(View.GONE);
                    crl13.clearCheck();
                    crl1396x.setText(null);
                } else {
                    crl1201.setVisibility(View.VISIBLE);
                    crl1202.setVisibility(View.VISIBLE);
                    crl1203.setVisibility(View.VISIBLE);
                    crlGrp12.setVisibility(View.VISIBLE);
                }

            }
        });

        crl0799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0701.setVisibility(View.GONE);
                    crl0701.setText(null);
                } else {
                    crl0701.setVisibility(View.VISIBLE);
                }
            }
        });

        crl0599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl0501.setVisibility(View.GONE);
                    crl0501.setText(null);
                } else {
                    crl0501.setVisibility(View.VISIBLE);
                }
            }
        });

        crl1096.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1096x.setVisibility(View.VISIBLE);
                } else {
                    crl1096x.setVisibility(View.GONE);
                    crl1096x.setText(null);
                }
            }
        });

        crl1196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1196x.setVisibility(View.VISIBLE);
                } else {
                    crl1196x.setVisibility(View.GONE);
                    crl1196x.setText(null);
                }
            }
        });

        crl1196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1196x.setVisibility(View.VISIBLE);
                } else {
                    crl1196x.setVisibility(View.GONE);
                    crl1196x.setText(null);
                }
            }
        });

        crl1396.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crl1396x.setVisibility(View.VISIBLE);
                } else {
                    crl1396x.setVisibility(View.GONE);
                    crl1396x.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btnNext)
    void onBtnNextClick() {
        Toast.makeText(this, "Processing this section", Toast.LENGTH_SHORT).show();
        if (validateForm()) {
            try {
                saveDrafts();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (updateDb()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secM = new Intent(this, SectionMActivity.class);
                startActivity(secM);

            } else {
                Toast.makeText(this, "Failed to update Database", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        finish();
        Toast.makeText(this, "complete Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
    }

    private boolean updateDb() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSL();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void saveDrafts() throws JSONException {
        Toast.makeText(this, "saving Drafts", Toast.LENGTH_SHORT).show();

        JSONObject sl = new JSONObject();

        sl.put("crl01", crl0101.isChecked() ? "1" : crl0102.isChecked() ? "2" : crl0103.isChecked() ? "3" : "0");
        sl.put("crl02", crl02.getText().toString());
        sl.put("crl03", crl0301.isChecked() ? "1" : crl0302.isChecked() ? "2" : crl0399.isChecked() ? "3" : "0");
        sl.put("crl0401", crl0401.isChecked() ? "1" : "0");
        sl.put("crl0402", crl0402.isChecked() ? "1" : "0");
        sl.put("crl0403", crl0403.isChecked() ? "1" : "0");
        sl.put("crl0404", crl0404.isChecked() ? "1" : "0");
        sl.put("crl0405", crl0405.isChecked() ? "1" : "0");
        sl.put("crl0406", crl0406.isChecked() ? "1" : "0");
        sl.put("crl0407", crl0407.isChecked() ? "1" : "0");
        sl.put("crl0408", crl0408.isChecked() ? "1" : "0");
        sl.put("crl0496", crl0496.isChecked() ? "1" : "0");
        sl.put("crl0496x", crl0496x.getText().toString());
        sl.put("crl0501", crl0501.getText().toString());
        sl.put("crl0599", crl0599.isChecked() ? "1" : "0");
        sl.put("crl0601", crl0601.isChecked() ? "1" : "0");
        sl.put("crl0602", crl0602.isChecked() ? "1" : "0");
        sl.put("crl0603", crl0603.isChecked() ? "1" : "0");
        sl.put("crl0604", crl0604.isChecked() ? "1" : "0");
        sl.put("crl0605", crl0605.isChecked() ? "1" : "0");
        sl.put("crl0606", crl0606.isChecked() ? "1" : "0");
        sl.put("crl0696", crl0696.isChecked() ? "1" : "0");
        sl.put("crl0696x", crl0696x.getText().toString());
        sl.put("crl0701", crl0701.getText().toString());
        sl.put("crl0799", crl0799.isChecked() ? "1" : "0");
        sl.put("crl08", crl0801.isChecked() ? "1" : crl0802.isChecked() ? "2" : crl0899.isChecked() ? "99" : "0");
        sl.put("crl0901", crl0901.getText().toString());
        sl.put("crl0902", crl0902.getText().toString());
        sl.put("crl0997", crl0997.isChecked() ? "1" : "0");
        sl.put("crl0998", crl0998.isChecked() ? "1" : "0");
        sl.put("crl10", crl1001.isChecked() ? "1" : crl1002.isChecked() ? "2" : crl1003.isChecked() ? "3"
                : crl1004.isChecked() ? "4" : crl1005.isChecked() ? "5" : crl1006.isChecked() ? "6"
                : crl1096.isChecked() ? "96" : "0");
        sl.put("crl1096x", crl1096x.getText().toString());
        sl.put("crl11", crl1101.isChecked() ? "1" : crl1102.isChecked() ? "2" : crl1103.isChecked() ? "3"
                : crl1196.isChecked() ? "96" : "0");
        sl.put("crl1201", crl1201.getText().toString());
        sl.put("crl1202", crl1202.getText().toString());
        sl.put("crl1203", crl1203.getText().toString());
        sl.put("crl1204", crl1204.isChecked() ? "1" : "0");
        sl.put("crl13", crl1301.isChecked() ? "1" : crl1302.isChecked() ? "2" : crl1303.isChecked() ? "3" : crl1304.isChecked() ? "4"
                : crl1305.isChecked() ? "5" : crl1306.isChecked() ? "6" : crl1307.isChecked() ? "7" : crl1308.isChecked() ? "8"
                : crl1396.isChecked() ? "96" : "0");

        AppMain.fc.setsL(String.valueOf(sl));

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {


        // =================== Q1 ====================
        if (crl01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl01), Toast.LENGTH_SHORT).show();
            crl0103.setError("This Data is Required");
            Log.d(TAG, "crl01:This Data is Required");
            return false;
        } else {
            crl0103.setError(null);
        }

        if (crl0101.isChecked()) {
            // =================== Q2 ====================
            if (crl02.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl02), Toast.LENGTH_SHORT).show();
                crl02.setError("This Data is Required");
                Log.d(TAG, "crl02 : This Data is Required");
                return false;
            } else {
                crl02.setError(null);
            }

            if ((Integer.parseInt(crl02.getText().toString().isEmpty() ? "0" : crl02.getText().toString()) < 1)
                    || (Integer.parseInt(crl02.getText().toString().isEmpty() ? "0" : crl02.getText().toString()) > 9)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.crl02) + getString(R.string.months), Toast.LENGTH_LONG).show();
                crl02.setError("Range is 1-9 months");
                Log.i(TAG, "crl02: Range is 1-9 months");
                return false;
            } else {
                crl02.setError(null);
            }
        }
        // =================== Q3 ====================
        if (crl03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl03), Toast.LENGTH_SHORT).show();
            crl0399.setError("This Data is Required");
            Log.d(TAG, "crl03: This Data is Required ");
            return false;
        } else {
            crl0399.setError(null);
        }

        if (crl0301.isChecked()) {
            // =================== Q4 ====================
            if (!(crl0401.isChecked() || crl0402.isChecked() || crl0403.isChecked() || crl0404.isChecked()
                    || crl0405.isChecked() || crl0406.isChecked() || crl0407.isChecked() || crl0408.isChecked()
                    || crl0496.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl04), Toast.LENGTH_SHORT).show();
                crl0496.setError("This Data is Required");
                Log.d(TAG, "crk04 :This Data is Required");
            } else {
                crl0496.setError(null);
            }
            if (crl0496.isChecked() && crl0496x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crl04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crl0496x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "cr0496x: This data is Required!");
                return false;
            } else {
                crl0496x.setError(null);
            }

            if (!crl0599.isChecked()) {
                // =================== Q5 ====================
                if (crl0501.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl05), Toast.LENGTH_SHORT).show();
                    crl0599.setError("This Data is Required");
                    Log.d(TAG, "crl05 :This Data is Required");
                    return false;
                } else {
                    crl0599.setError(null);
                }


                // =================== Q5 ====================
                if (Integer.valueOf(crl0501.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl05), Toast.LENGTH_SHORT).show();
                    crl0501.setError("Zero not allowed..");
                    Log.d(TAG, "crl05 :Zero not allowed");
                    return false;
                } else {
                    crl0501.setError(null);
                }
            }


            // =================== Q6 ====================

            if (!(crl0601.isChecked() || crl0602.isChecked() || crl0603.isChecked() || crl0604.isChecked()
                    || crl0605.isChecked() || crl0606.isChecked() || crl0696.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl06), Toast.LENGTH_SHORT).show();
                crl0696.setError("This Data is Required");
                Log.d(TAG, "crk06 :This Data is Required");
            } else {
                crl0696.setError(null);
            }

            if (crl0696.isChecked() && crl0696x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crl06) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crl0696x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "cr0696x: This data is Required!");
                return false;
            } else {
                crl0696x.setError(null);
            }

            // =================== Q7 ====================
            if (crl0701.getText().toString().isEmpty() && !crl0799.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.crl07), Toast.LENGTH_SHORT).show();
                crl0799.setError("This Data is Required");
                Log.d(TAG, "crl07 :This Data is Required");
                return false;
            } else {
                crl0799.setError(null);
            }


            // =================== Q8 ====================
            if (crl08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl08), Toast.LENGTH_SHORT).show();
                crl0899.setError("This Data is Required");
                Log.d(TAG, " crl08 :This Data is Required");
                return false;
            } else {
                crl0899.setError(null);
            }


            if (crl0801.isChecked()) {
                // =================== Q9 ====================
                if ((crl0901.getText().toString().isEmpty() && crl0902.getText().toString().isEmpty())
                        && !crl0997.isChecked() && !crl0998.isChecked()) {
                    Toast.makeText(this, "ERROR(empty)" + getString(R.string.crl09), Toast.LENGTH_SHORT).show();
                    crl0901.setError("This data is required");
                    Log.d(TAG, "crl09: This data is required  ");
                    return false;
                } else {
                    crl0901.setError(null);
                }

                if (!crl0997.isChecked() || !crl0998.isChecked()) {
                    if ((Integer.parseInt(crl0901.getText().toString().isEmpty() ? "0" : crl0901.getText().toString()) < 1)
                            && Integer.parseInt(crl0902.getText().toString().isEmpty() ? "0" : crl0902.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crl09), Toast.LENGTH_SHORT).show();
                        crl0901.setError("Zero not allowed");
                        Log.i(TAG, "crl09: Zero not allowed");
                        return false;
                    } else {
                        crl0901.setError(null);
                    }
                }
            }
        }
        // =================== Q10 ====================
        if (crl10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl10), Toast.LENGTH_SHORT).show();
            crl1096.setError("This Data is Required");
            Log.d(TAG, "crl10 : This Data is Required");
            return false;
        } else {
            crl1096.setError(null);
        }

        if (crl1096.isChecked() && crl1096x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crl10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crl1096x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crl1096x: This data is Required!");
            return false;
        } else {
            crl1096x.setError(null);
        }


        // =================== Q11 ====================
        if (crl11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl11), Toast.LENGTH_SHORT).show();
            crl1196.setError("This Data is Required");
            Log.d(TAG, "crl11 : This Data is Required ");
            return false;
        } else {
            crl1196.setError(null);
        }

        if (crl1196.isChecked() && crl1196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crl11) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crl1196x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crl1196x: This data is Required!");
            return false;
        } else {
            crl1196x.setError(null);
        }


        // =================== Q12 ====================

        if ((crl1201.getText().toString().isEmpty() && crl1202.getText().toString().isEmpty()
                && crl1203.getText().toString().isEmpty()) && !crl1204.isChecked()) {
            Toast.makeText(this, "" + getString(R.string.crl12), Toast.LENGTH_SHORT).show();
            crl1204.setError("This Data is Required");
            Log.d(TAG, "crl12 :This Data is Required");
            return false;
        } else {
            crl1204.setError(null);
        }


        if ((Integer.parseInt(crl1201.getText().toString().isEmpty() ? "0" : crl1201.getText().toString()) < 0)
                || (Integer.parseInt(crl1201.getText().toString().isEmpty() ? "0" : crl1201.getText().toString()) > 11)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.crl12) + getString(R.string.crl1201), Toast.LENGTH_LONG).show();
            crl1201.setError("Range is 1-12 Hours");
            Log.i(TAG, "crl1201: Range is 1-12 hours");
            return false;
        } else {
            crl1201.setError(null);
        }


        if ((Integer.parseInt(crl1202.getText().toString().isEmpty() ? "0" : crl1202.getText().toString()) < 0)
                || (Integer.parseInt(crl1202.getText().toString().isEmpty() ? "0" : crl1202.getText().toString()) > 29)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.crl12) + getString(R.string.crl1202), Toast.LENGTH_LONG).show();
            crl1202.setError("Range is 1-30 days");
            Log.i(TAG, "crl1202: Range is 1-30 days");
            return false;
        } else {
            crl1202.setError(null);
        }


        if ((Integer.parseInt(crl1203.getText().toString().isEmpty() ? "0" : crl1203.getText().toString()) < 0)
                || (Integer.parseInt(crl1203.getText().toString().isEmpty() ? "0" : crl1203.getText().toString()) > 20)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.crl12) + getString(R.string.crl1203), Toast.LENGTH_LONG).show();
            crl1203.setError("Range is 1-20 weeks");
            Log.i(TAG, "crl1203: Range is 1-20 weeks");
            return false;
        } else {
            crl1203.setError(null);
        }


        if (!(crl1204.isChecked())) {
            // =================== Q13 ====================
            if (crl13.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crl13), Toast.LENGTH_SHORT).show();
                crl1396.setError("This Data is Required");
                Log.d(TAG, "crl13 :This Data is Required ");
                return false;
            } else {
                crl1396.setError(null);
            }

            if (crl1396.isChecked() && crl1396x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crl13) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crl1396x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crl1396x: This data is Required!");
                return false;
            } else {
                crl1396x.setError(null);
            }

        }


        return true;
    }

}
    

   

