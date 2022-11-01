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

public class SectionKActivity extends Activity {

    private static final String TAG = SectionKActivity.class.getSimpleName();

    @BindView(R.id.activity_section_k)
    ScrollView activitySectionK;
    @BindView(R.id.crk01)
    RadioGroup crk01;
    @BindView(R.id.crk0101)
    RadioButton crk0101;
    @BindView(R.id.crk0102)
    RadioButton crk0102;
    @BindView(R.id.crk0199)
    RadioButton crk0199;
    @BindView(R.id.fldGrpcrk01)
    LinearLayout fldGrpcrk01;
    @BindView(R.id.crk0201)
    CheckBox crk0201;
    @BindView(R.id.crk0202)
    CheckBox crk0202;
    @BindView(R.id.crk0203)
    CheckBox crk0203;
    @BindView(R.id.crk0204)
    CheckBox crk0204;
    @BindView(R.id.crk0205)
    CheckBox crk0205;
    @BindView(R.id.crk0299)
    CheckBox crk0299;
    @BindView(R.id.crk0296)
    CheckBox crk0296;
    @BindView(R.id.crk0296x)
    EditText crk0296x;
    @BindView(R.id.crk03)
    RadioGroup crk03;
    @BindView(R.id.crk0301)
    RadioButton crk0301;
    @BindView(R.id.crk0302)
    RadioButton crk0302;
    @BindView(R.id.crk0399)
    RadioButton crk0399;
    @BindView(R.id.crkGrp03)
    LinearLayout crkGrp03;
    @BindView(R.id.crk0401)
    CheckBox crk0401;
    @BindView(R.id.crk0402)
    CheckBox crk0402;
    @BindView(R.id.crk0499)
    CheckBox crk0499;
    @BindView(R.id.crk0496)
    CheckBox crk0496;
    @BindView(R.id.crk0496x)
    EditText crk0496x;
    @BindView(R.id.crk05)
    RadioGroup crk05;
    @BindView(R.id.crk0501)
    RadioButton crk0501;
    @BindView(R.id.crk0502)
    RadioButton crk0502;
    @BindView(R.id.crk0599)
    RadioButton crk0599;
    @BindView(R.id.crk0601)
    CheckBox crk0601;
    @BindView(R.id.crk0602)
    CheckBox crk0602;
    @BindView(R.id.crk0603)
    CheckBox crk0603;
    @BindView(R.id.crk0604)
    CheckBox crk0604;
    @BindView(R.id.crk0701)
    CheckBox crk0701;
    @BindView(R.id.crk0702)
    CheckBox crk0702;
    @BindView(R.id.crk0703)
    CheckBox crk0703;
    @BindView(R.id.crk0704)
    CheckBox crk0704;
    @BindView(R.id.crk0799)
    CheckBox crk0799;
    @BindView(R.id.crk0796)
    CheckBox crk0796;
    @BindView(R.id.crk0796x)
    EditText crk0796x;
    @BindView(R.id.crk08)
    RadioGroup crk08;
    @BindView(R.id.crk0801)
    RadioButton crk0801;
    @BindView(R.id.crk0802)
    RadioButton crk0802;
    @BindView(R.id.crk0899)
    RadioButton crk0899;
    @BindView(R.id.fldGrpcrk09)
    LinearLayout fldGrpcrk09;
    @BindView(R.id.crk0901)
    CheckBox crk0901;
    @BindView(R.id.crk0902)
    CheckBox crk0902;
    @BindView(R.id.crk0903)
    CheckBox crk0903;
    @BindView(R.id.crk0904)
    CheckBox crk0904;
    @BindView(R.id.crk0905)
    CheckBox crk0905;
    @BindView(R.id.crk0906)
    CheckBox crk0906;
    @BindView(R.id.crk0996)
    CheckBox crk0996;
    @BindView(R.id.crk0996x)
    EditText crk0996x;
    @BindView(R.id.crk10)
    RadioGroup crk10;
    @BindView(R.id.crk1001)
    RadioButton crk1001;
    @BindView(R.id.crk1002)
    RadioButton crk1002;
    @BindView(R.id.crk1099)
    RadioButton crk1099;
    @BindView(R.id.fldGrpcrk11)
    LinearLayout fldGrpcrk11;
    @BindView(R.id.crk1101)
    CheckBox crk1101;
    @BindView(R.id.crk1102)
    CheckBox crk1102;
    @BindView(R.id.crk1103)
    CheckBox crk1103;
    @BindView(R.id.crk1104)
    CheckBox crk1104;
    @BindView(R.id.crk1105)
    CheckBox crk1105;
    @BindView(R.id.crk1106)
    CheckBox crk1106;
    @BindView(R.id.crk1196)
    CheckBox crk1196;
    @BindView(R.id.crk1196x)
    EditText crk1196x;
    @BindView(R.id.crk12)
    RadioGroup crk12;
    @BindView(R.id.crk1201)
    RadioButton crk1201;
    @BindView(R.id.crk1202)
    RadioButton crk1202;
    @BindView(R.id.fldGrpcrk13)
    LinearLayout fldGrpcrk13;
    @BindView(R.id.crk13)
    EditText crk13;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_k);
        ButterKnife.bind(this);

        crk01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk0101.isChecked()) {
                    fldGrpcrk01.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrk01.setVisibility(View.GONE);
                    crk0201.setChecked(false);
                    crk0202.setChecked(false);
                    crk0203.setChecked(false);
                    crk0204.setChecked(false);
                    crk0205.setChecked(false);
                    crk0299.setChecked(false);
                    crk0296.setChecked(false);
                    crk0296x.setText(null);
                    crk03.clearCheck();
                    crk0401.setChecked(false);
                    crk0402.setChecked(false);
                    crk0496.setChecked(false);
                    crk0499.setChecked(false);
                    crk0496x.setText(null);
                }
            }
        });

        crk0296.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0296x.setVisibility(View.VISIBLE);
                } else {
                    crk0296x.setVisibility(View.GONE);
                    crk0296x.setText(null);
                }
            }
        });

        // ====================== Q3 Skip Pattern ========================
        crk03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk0301.isChecked()) {
                    crkGrp03.setVisibility(View.VISIBLE);
                } else {
                    crkGrp03.setVisibility(View.GONE);
                    crk0401.setChecked(false);
                    crk0402.setChecked(false);
                    crk0496.setChecked(false);
                    crk0499.setChecked(false);
                    crk0496x.setText(null);
                }
            }
        });

        crk08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk0801.isChecked()) {
                    fldGrpcrk09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrk09.setVisibility(View.GONE);
                    crk0901.setChecked(false);
                    crk0902.setChecked(false);
                    crk0903.setChecked(false);
                    crk0904.setChecked(false);
                    crk0905.setChecked(false);
                    crk0906.setChecked(false);
                    crk0996.setChecked(false);
                    crk0996x.setText(null);
                }
            }
        });

        crk10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk1001.isChecked()) {
                    fldGrpcrk11.setVisibility(View.GONE);
                    crk1101.setChecked(false);
                    crk1102.setChecked(false);
                    crk1103.setChecked(false);
                    crk1104.setChecked(false);
                    crk1105.setChecked(false);
                    crk1106.setChecked(false);
                    crk1196.setChecked(false);
                    crk1196x.setText(null);
                } else {
                    fldGrpcrk11.setVisibility(View.VISIBLE);
                }
            }
        });

        // =================== Q11 Others ====================

        crk1196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk1196x.setVisibility(View.VISIBLE);
                } else {
                    crk1196x.setVisibility(View.GONE);
                    crk1196x.setText(null);
                }
            }
        });

        crk0496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0496x.setVisibility(View.VISIBLE);
                } else {
                    crk0496x.setVisibility(View.GONE);
                    crk0496x.setText(null);
                }
            }
        });


        crk0796.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0796x.setVisibility(View.VISIBLE);
                } else {
                    crk0796x.setVisibility(View.GONE);
                    crk0796x.setText(null);
                }
            }
        });
        crk0996.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0996x.setVisibility(View.VISIBLE);

                } else {
                    crk0996x.setVisibility(View.GONE);
                    crk0996x.setText(null);
                }
            }
        });

        crk12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crk1201.isChecked()) {
                    fldGrpcrk13.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrk13.setVisibility(View.GONE);
                    crk13.setText(null);
                }
            }
        });

        crk0299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0201.setEnabled(false);
                    crk0201.setChecked(false);
                    crk0202.setEnabled(false);
                    crk0202.setChecked(false);
                    crk0203.setEnabled(false);
                    crk0203.setChecked(false);
                    crk0204.setEnabled(false);
                    crk0204.setChecked(false);
                    crk0205.setEnabled(false);
                    crk0205.setChecked(false);
                    crk0296.setEnabled(false);
                    crk0296.setChecked(false);
                    crk0296x.setText(null);
                } else {
                    crk0201.setEnabled(true);
                    crk0202.setEnabled(true);
                    crk0203.setEnabled(true);
                    crk0204.setEnabled(true);
                    crk0205.setEnabled(true);
                    crk0296.setEnabled(true);
                }
            }
        });

        crk0499.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0401.setEnabled(false);
                    crk0401.setChecked(false);
                    crk0402.setEnabled(false);
                    crk0402.setChecked(false);
                    crk0496.setEnabled(false);
                    crk0496.setChecked(false);
                    crk0496x.setText(null);
                } else {
                    crk0401.setEnabled(true);
                    crk0402.setEnabled(true);
                    crk0496.setEnabled(true);
                }
            }
        });

        crk0799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crk0701.setEnabled(false);
                    crk0701.setChecked(false);
                    crk0702.setEnabled(false);
                    crk0702.setChecked(false);
                    crk0703.setEnabled(false);
                    crk0703.setChecked(false);
                    crk0704.setEnabled(false);
                    crk0704.setChecked(false);
                    crk0796.setEnabled(false);
                    crk0796.setChecked(false);
                    crk0796x.setText(null);
                } else {
                    crk0701.setEnabled(true);
                    crk0702.setEnabled(true);
                    crk0703.setEnabled(true);
                    crk0704.setEnabled(true);
                    crk0796.setEnabled(true);
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
                Intent secL = new Intent(this, SectionLActivity.class);
                startActivity(secL);

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

        int updcount = db.updateSK();

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

        JSONObject sk = new JSONObject();

        //sk.put("crka", crka.getText().toString());
        sk.put("crk01", crk0101.isChecked() ? "1" : crk0102.isChecked() ? "2" : crk0199.isChecked() ? "99" : "0");
        sk.put("crk0201", crk0201.isChecked() ? "1" : "2");
        sk.put("crk0202", crk0202.isChecked() ? "1" : "2");
        sk.put("crk0203", crk0203.isChecked() ? "1" : "2");
        sk.put("crk0204", crk0204.isChecked() ? "1" : "2");
        sk.put("crk0205", crk0205.isChecked() ? "1" : "2");
        sk.put("crk0299", crk0299.isChecked() ? "1" : "2");
        sk.put("crk0296", crk0296.isChecked() ? "1" : "2");
        sk.put("crk0296x", crk0296x.getText().toString());
        sk.put("crk03", crk0301.isChecked() ? "1" : crk0302.isChecked() ? "2" : crk0399.isChecked() ? "99" : "0");
        sk.put("crk0401", crk0401.isChecked() ? "1" : "2");
        sk.put("crk0402", crk0402.isChecked() ? "1" : "2");
        sk.put("crk0496", crk0496.isChecked() ? "1" : "2");
        sk.put("crk0496x", crk0496x.getText().toString());
        sk.put("crk05", crk0501.isChecked() ? "1" : crk0502.isChecked() ? "2" : crk0599.isChecked() ? "99" : "0");
        sk.put("crk0601", crk0601.isChecked() ? "1" : "2");
        sk.put("crk0602", crk0602.isChecked() ? "1" : "2");
        sk.put("crk0603", crk0603.isChecked() ? "1" : "2");
        sk.put("crk0604", crk0604.isChecked() ? "1" : "2");
        sk.put("crk0701", crk0701.isChecked() ? "1" : "2");
        sk.put("crk0702", crk0702.isChecked() ? "1" : "2");
        sk.put("crk0703", crk0703.isChecked() ? "1" : "2");
        sk.put("crk0704", crk0704.isChecked() ? "1" : "2");
        sk.put("crk0796", crk0796.isChecked() ? "1" : "2");
        sk.put("crk0796x", crk0796x.getText().toString());
        sk.put("crk0799", crk0799.isChecked() ? "1" : "2");
        sk.put("crk08", crk0801.isChecked() ? "1" : crk0802.isChecked() ? "2" : crk0899.isChecked() ? "99" : "0");
        sk.put("crk0901", crk0901.isChecked() ? "1" : "2");
        sk.put("crk0902", crk0902.isChecked() ? "1" : "2");
        sk.put("crk0903", crk0903.isChecked() ? "1" : "2");
        sk.put("crk0904", crk0904.isChecked() ? "1" : "2");
        sk.put("crk0905", crk0901.isChecked() ? "1" : "2");
        sk.put("crk0906", crk0906.isChecked() ? "1" : "2");
        sk.put("crk0996", crk0996.isChecked() ? "1" : "2");
        sk.put("crk0996x", crk0996x.getText().toString());
        sk.put("crk10", crk1001.isChecked() ? "1" : crk1002.isChecked() ? "2" : crk1099.isChecked() ? "99" : "0");
        sk.put("crk1101", crk1101.isChecked() ? "1" : "0");
        sk.put("crk1102", crk1102.isChecked() ? "1" : "0");
        sk.put("crk1103", crk1103.isChecked() ? "1" : "0");
        sk.put("crk1104", crk1104.isChecked() ? "1" : "0");
        sk.put("crk1105", crk1105.isChecked() ? "1" : "0");
        sk.put("crk1106", crk1106.isChecked() ? "1" : "0");
        sk.put("crk1196", crk1196.isChecked() ? "1" : "0");
        sk.put("crk1196x", crk1196x.getText().toString());
        sk.put("crk12", crk1201.isChecked() ? "1" : crk1202.isChecked() ? "2" : "0");
        sk.put("crk13", crk13.getText().toString());

        AppMain.fc.setsK(String.valueOf(sk));

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {


        // =================== Q1 ====================
        if (crk01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk01), Toast.LENGTH_SHORT).show();
            crk0199.setError("This Data is Required");
            Log.d(TAG, "crk01 :This Data is Required");
            return false;
        } else {
            crk0199.setError(null);
        }

        if (crk0101.isChecked()) {
            // =================== Q2 ====================
            if (!(crk0201.isChecked() || crk0202.isChecked() || crk0203.isChecked() || crk0204.isChecked()
                    || crk0205.isChecked() || crk0296.isChecked() || crk0299.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk02), Toast.LENGTH_SHORT).show();
                crk0296.setError("This Data is Required");
                Log.d(TAG, "crk02 :This Data is Required");
            } else {
                crk0296.setError(null);
            }

            if (!crk0299.isChecked()) {
                if (!(crk0201.isChecked() || crk0202.isChecked() || crk0203.isChecked() || crk0204.isChecked()
                        || crk0205.isChecked() || crk0296.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk02), Toast.LENGTH_SHORT).show();
                    crk0296.setError("This Data is Required");
                    Log.d(TAG, "crk02 :This Data is Required");
                } else {
                    crk0296.setError(null);
                }
            }

            if (crk0296.isChecked() && crk0296x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crk0296x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crk0296x: This data is Required!");
                return false;
            } else {
                crk0296x.setError(null);
            }
            // =================== Q3 ====================
            if (crk03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk03), Toast.LENGTH_SHORT).show();
                crk0399.setError("This Data is Required");
                Log.d(TAG, "crk03 :This Data is Required");
                return false;
            } else {
                crk0399.setError(null);
            }

            if (crk0301.isChecked()) {
                // =================== Q4a ====================

                if (!(crk0401.isChecked() || crk0402.isChecked() || crk0496.isChecked() || crk0499.isChecked())) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk04), Toast.LENGTH_SHORT).show();
                    crk0496.setError("This Data is Required");
                    Log.d(TAG, "crk04 :This Data is Required");
                } else {
                    crk0496.setError(null);
                }

                if (!crk0499.isChecked()) {
                    if (!(crk0401.isChecked() || crk0402.isChecked() || crk0296.isChecked())) {
                        Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk04), Toast.LENGTH_SHORT).show();
                        crk0496.setError("This Data is Required");
                        Log.d(TAG, "crk04 :This Data is Required");
                    } else {
                        crk0496.setError(null);
                    }
                }

                if (crk0496.isChecked() && crk0496x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    crk0496x.setError("This data is Required!");    // Set Error on last radio button
                    Log.d(TAG, "crk0496x: This data is Required!");
                    return false;
                } else {
                    crk0496x.setError(null);
                }
            }
        }

        // =================== Q5 ====================
        if (crk05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk05), Toast.LENGTH_SHORT).show();
            crk0599.setError("This Data is Required");
            Log.d(TAG, " crk05 :This Data is Required");
            return false;
        } else {
            crk0599.setError(null);
        }

        // =================== Q6a ====================
        if (!(crk0601.isChecked() || crk0602.isChecked() || crk0603.isChecked() || crk0604.isChecked())) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk06), Toast.LENGTH_SHORT).show();
            crk0604.setError("This Data is Required");
            Log.d(TAG, "crk06 :This Data is Required");
        } else {
            crk0604.setError(null);
        }


        // =================== Q7a ====================
        if (!(crk0701.isChecked() || crk0702.isChecked() || crk0703.isChecked() || crk0704.isChecked()
                || crk0796.isChecked() || crk0799.isChecked())) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk07), Toast.LENGTH_SHORT).show();
            crk0796.setError("This Data is Required");
            Log.d(TAG, "crk07 :This Data is Required");
        } else {
            crk0796.setError(null);
        }

        if (!crk0799.isChecked()) {
            if (!(crk0701.isChecked() || crk0702.isChecked() || crk0703.isChecked() || crk0704.isChecked()
                    || crk0796.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk07), Toast.LENGTH_SHORT).show();
                crk0796.setError("This Data is Required");
                Log.d(TAG, "crk07 :This Data is Required");
            } else {
                crk0796.setError(null);
            }
        }

        if (crk0796.isChecked() && crk0796x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk07) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crk0796x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crk0796x: This data is Required!");
            return false;
        } else {
            crk0796x.setError(null);
        }

        // =================== Q8 ====================
        if (crk08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk08), Toast.LENGTH_SHORT).show();
            crk0899.setError("This Data is Required");
            Log.d(TAG, " crk08 : This Data is Required");
            return false;
        } else {
            crk0899.setError(null);
        }

        if (crk0801.isChecked()) {
            // =================== Q9a ====================
            if (!(crk0901.isChecked() || crk0902.isChecked() || crk0903.isChecked() || crk0904.isChecked()
                    || crk0905.isChecked() || crk0906.isChecked() || crk0996.isChecked())) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk09), Toast.LENGTH_SHORT).show();
                crk0996.setError("This Data is Required");
                Log.d(TAG, "crk09 :This Data is Required");
            } else {
                crk0996.setError(null);
            }

            if (crk0996.isChecked() && crk0996x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crk0996x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crk0996x: This data is Required!");
                return false;
            } else {
                crk0996x.setError(null);
            }
        }

        // =================== Q10 ====================
        if (crk10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crk10), Toast.LENGTH_SHORT).show();
            crk1099.setError("This Data is Required");
            Log.d(TAG, "crk10 : This Data is Required ");
            return false;
        } else {
            crk1099.setError(null);
        }

        if (crk1002.isChecked()) {
            // =================== Q11 ====================
            if (!(crk1101.isChecked() || crk1102.isChecked() || crk1103.isChecked() || crk1104.isChecked()
                    || crk1105.isChecked() || crk1106.isChecked() || crk1196.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk11), Toast.LENGTH_LONG).show();
                crk1196.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "crk11: This data is Required!");
                return false;
            } else {
                crk1196.setError(null);
            }

            if (crk1196.isChecked() && crk1196x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crk11) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crk1196x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crk1196: This data is Required!");
                return false;
            } else {
                crk1196x.setError(null);
            }
        }

        // =================== Q12 ====================
        if (crk12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crk12), Toast.LENGTH_SHORT).show();
            crk1202.setError("This Data is Required");
            Log.d(TAG, "crk12: This Data is Required ");
            return false;
        } else {
            crk1202.setError(null);
        }

        if (crk1201.isChecked()) {
            if (crk13.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.crk13), Toast.LENGTH_SHORT).show();
                crk13.setError("This Data is Required");
                Log.d(TAG, "crk13: This Data is Required ");
                return false;
            } else {
                crk13.setError(null);
            }
        }


        return true;
    }
}

