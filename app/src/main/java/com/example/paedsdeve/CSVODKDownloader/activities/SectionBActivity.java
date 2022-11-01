package com.example.paedsdeve.CSVODKDownloader.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
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

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionBActivity extends AppCompatActivity {

    private static final String TAG = SectionBActivity.class.getSimpleName();

    @BindView(R.id.activity_section_b)
    ScrollView activitySectionB;
    @BindView(R.id.crb01)
    EditText crb01;
    @BindView(R.id.crb02)
    RadioGroup crb02;
    @BindView(R.id.crb0201)
    RadioButton crb0201;
    @BindView(R.id.crb0202)
    RadioButton crb0202;
    @BindView(R.id.crbdob)
    RadioGroup crbdob;
    @BindView(R.id.crbdob01)
    RadioButton crbdob01;
    @BindView(R.id.crbAge02)
    RadioButton crbAge02;
    @BindView(R.id.fldGrpcrbdob)
    LinearLayout fldGrpcrbdob;
    @BindView(R.id.crb03)
    DatePickerInputEditText crb03;
    @BindView(R.id.fldGrpcrbAge)
    LinearLayout fldGrpcrbAge;
    @BindView(R.id.crb0401)
    EditText crb0401;
    @BindView(R.id.crb0402)
    EditText crb0402;
    @BindView(R.id.crb05)
    RadioGroup crb05;
    @BindView(R.id.crb0501)
    RadioButton crb0501;
    @BindView(R.id.crb0502)
    RadioButton crb0502;
    @BindView(R.id.crb0601)
    EditText crb0601;
    @BindView(R.id.crb07)
    RadioGroup crb07;
    @BindView(R.id.crb0701)
    RadioButton crb0701;
    @BindView(R.id.crb0702)
    RadioButton crb0702;
    @BindView(R.id.crb0799)
    RadioButton crb0799;
    @BindView(R.id.crbGrp07)
    LinearLayout crbGrp07;
    @BindView(R.id.crb0801)
    EditText crb0801;
    @BindView(R.id.crb0899)
    CheckBox crb0899;
    @BindView(R.id.crc01m3)
    EditText crc01m3;
    @BindView(R.id.crc01m2)
    EditText crc01m2;
    @BindView(R.id.crc01m1)
    EditText crc01m1;
    @BindView(R.id.crc02m3)
    EditText crc02m3;
    @BindView(R.id.crc02m2)
    EditText crc02m2;
    @BindView(R.id.crc02m1)
    EditText crc02m1;
    @BindView(R.id.crd0101)
    CheckBox crd0101;
    @BindView(R.id.crd0102)
    CheckBox crd0102;
    @BindView(R.id.crd0103)
    CheckBox crd0103;
    @BindView(R.id.crd0104)
    CheckBox crd0104;
    @BindView(R.id.crd0105)
    CheckBox crd0105;
    @BindView(R.id.crd0106)
    CheckBox crd0106;
    @BindView(R.id.crd0107)
    CheckBox crd0107;
    @BindView(R.id.crd0108)
    CheckBox crd0108;
    @BindView(R.id.crd0109)
    CheckBox crd0109;
    @BindView(R.id.crd0196)
    CheckBox crd0196;
    @BindView(R.id.crd0196x)
    EditText crd0196x;
    @BindView(R.id.crdGrp01)
    LinearLayout crdGrp01;
    @BindView(R.id.crd02)
    RadioGroup crd02;
    @BindView(R.id.crd0201)
    RadioButton crd0201;
    @BindView(R.id.crd0202)
    RadioButton crd0202;
    @BindView(R.id.crdGrp02)
    LinearLayout crdGrp02;
    @BindView(R.id.crd0301)
    CheckBox crd0301;
    @BindView(R.id.crd0302)
    CheckBox crd0302;
    @BindView(R.id.crd0303)
    CheckBox crd0303;
    @BindView(R.id.crd0304)
    CheckBox crd0304;
    @BindView(R.id.crd0305)
    CheckBox crd0305;
    @BindView(R.id.crd0306)
    CheckBox crd0306;
    @BindView(R.id.crd0307)
    CheckBox crd0307;
    @BindView(R.id.crd0308)
    CheckBox crd0308;
    @BindView(R.id.crd0396)
    CheckBox crd0396;
    @BindView(R.id.crd0396x)
    EditText crd0396x;
    @BindView(R.id.cre01)
    RadioGroup cre01;
    @BindView(R.id.cre0101)
    RadioButton cre0101;
    @BindView(R.id.cre0102)
    RadioButton cre0102;
    @BindView(R.id.fldGrpcre01)
    LinearLayout fldGrpcre01;
    @BindView(R.id.cre01a)
    RadioGroup cre01a;
    @BindView(R.id.cre01a01)
    RadioButton cre01a01;
    @BindView(R.id.cre01a02)
    RadioButton cre01a02;
    @BindView(R.id.fldGrpBcgM)
    LinearLayout fldGrpBcgM;
    @BindView(R.id.cre0201b)
    RadioGroup cre0201b;
    @BindView(R.id.cre0201b01)
    RadioButton cre0201b01;
    @BindView(R.id.cre0201b02)
    RadioButton cre0201b02;
    @BindView(R.id.fldGrpBcg)
    LinearLayout fldGrpBcg;
    @BindView(R.id.cre0201a)
    RadioGroup cre0201a;
    @BindView(R.id.cre0201a01)
    RadioButton cre0201a01;
    @BindView(R.id.cre0201a02)
    RadioButton cre0201a02;
    @BindView(R.id.fldGrpPolioM)
    LinearLayout fldGrpPolioM;
    @BindView(R.id.cre0202b)
    RadioGroup cre0202b;
    @BindView(R.id.cre0202b01)
    RadioButton cre0202b01;
    @BindView(R.id.cre0202b02)
    RadioButton cre0202b02;
    @BindView(R.id.fldGrpPolio)
    LinearLayout fldGrpPolio;
    @BindView(R.id.cre0202a)
    RadioGroup cre0202a;
    @BindView(R.id.cre0202a01)
    RadioButton cre0202a01;
    @BindView(R.id.cre0202a02)
    RadioButton cre0202a02;
    @BindView(R.id.fldGrpPenta1M)
    LinearLayout fldGrpPenta1M;
    @BindView(R.id.cre0301b)
    RadioGroup cre0301b;
    @BindView(R.id.cre0301b01)
    RadioButton cre0301b01;
    @BindView(R.id.cre0301b02)
    RadioButton cre0301b02;
    @BindView(R.id.fldGrpPenta1)
    LinearLayout fldGrpPenta1;
    @BindView(R.id.cre0301a)
    RadioGroup cre0301a;
    @BindView(R.id.cre0301a01)
    RadioButton cre0301a01;
    @BindView(R.id.cre0301a02)
    RadioButton cre0301a02;
    @BindView(R.id.fldGrppcv1M)
    LinearLayout fldGrppcv1M;
    @BindView(R.id.cre0302b)
    RadioGroup cre0302b;
    @BindView(R.id.cre0302b01)
    RadioButton cre0302b01;
    @BindView(R.id.cre0302b02)
    RadioButton cre0302b02;
    @BindView(R.id.fldGrppcv1)
    LinearLayout fldGrppcv1;
    @BindView(R.id.cre0302a)
    RadioGroup cre0302a;
    @BindView(R.id.cre0302a01)
    RadioButton cre0302a01;
    @BindView(R.id.cre0302a02)
    RadioButton cre0302a02;
    @BindView(R.id.fldGrpopv1M)
    LinearLayout fldGrpopv1M;
    @BindView(R.id.cre0303b)
    RadioGroup cre0303b;
    @BindView(R.id.cre0303b01)
    RadioButton cre0303b01;
    @BindView(R.id.cre0303b02)
    RadioButton cre0303b02;
    @BindView(R.id.fldGrpopv1)
    LinearLayout fldGrpopv1;
    @BindView(R.id.cre0303a)
    RadioGroup cre0303a;
    @BindView(R.id.cre0303a01)
    RadioButton cre0303a01;
    @BindView(R.id.cre0303a02)
    RadioButton cre0303a02;
    @BindView(R.id.fldGrppenta2M)
    LinearLayout fldGrppenta2M;
    @BindView(R.id.cre0401b)
    RadioGroup cre0401b;
    @BindView(R.id.cre0401b01)
    RadioButton cre0401b01;
    @BindView(R.id.cre0401b02)
    RadioButton cre0401b02;
    @BindView(R.id.fldGrppenta2)
    LinearLayout fldGrppenta2;
    @BindView(R.id.cre0401a)
    RadioGroup cre0401a;
    @BindView(R.id.cre0401a01)
    RadioButton cre0401a01;
    @BindView(R.id.cre0401a02)
    RadioButton cre0401a02;
    @BindView(R.id.fldGrppcv2M)
    LinearLayout fldGrppcv2M;
    @BindView(R.id.cre0402b)
    RadioGroup cre0402b;
    @BindView(R.id.cre0402b01)
    RadioButton cre0402b01;
    @BindView(R.id.cre0402b02)
    RadioButton cre0402b02;
    @BindView(R.id.fldGrppcv2)
    LinearLayout fldGrppcv2;
    @BindView(R.id.cre0402a)
    RadioGroup cre0402a;
    @BindView(R.id.cre0402a01)
    RadioButton cre0402a01;
    @BindView(R.id.cre0402a02)
    RadioButton cre0402a02;
    @BindView(R.id.fldGrpopv2M)
    LinearLayout fldGrpopv2M;
    @BindView(R.id.cre0403b)
    RadioGroup cre0403b;
    @BindView(R.id.cre0403b01)
    RadioButton cre0403b01;
    @BindView(R.id.cre0403b02)
    RadioButton cre0403b02;
    @BindView(R.id.fldGrpopv2)
    LinearLayout fldGrpopv2;
    @BindView(R.id.cre0403a)
    RadioGroup cre0403a;
    @BindView(R.id.cre0403a01)
    RadioButton cre0403a01;
    @BindView(R.id.cre0403a02)
    RadioButton cre0403a02;
    @BindView(R.id.fldGrpPenta3M)
    LinearLayout fldGrpPenta3M;
    @BindView(R.id.cre0501b)
    RadioGroup cre0501b;
    @BindView(R.id.cre0501b01)
    RadioButton cre0501b01;
    @BindView(R.id.cre0501b02)
    RadioButton cre0501b02;
    @BindView(R.id.fldGrpenta3)
    LinearLayout fldGrpenta3;
    @BindView(R.id.cre0501a)
    RadioGroup cre0501a;
    @BindView(R.id.cre0501a01)
    RadioButton cre0501a01;
    @BindView(R.id.cre0501a02)
    RadioButton cre0501a02;
    @BindView(R.id.fldGrppcv3M)
    LinearLayout fldGrppcv3M;
    @BindView(R.id.cre0502b)
    RadioGroup cre0502b;
    @BindView(R.id.cre0502b01)
    RadioButton cre0502b01;
    @BindView(R.id.cre0502b02)
    RadioButton cre0502b02;
    @BindView(R.id.fldGrppcv3)
    LinearLayout fldGrppcv3;
    @BindView(R.id.cre0502a)
    RadioGroup cre0502a;
    @BindView(R.id.cre0502a01)
    RadioButton cre0502a01;
    @BindView(R.id.cre0502a02)
    RadioButton cre0502a02;
    @BindView(R.id.fldGrpopv3M)
    LinearLayout fldGrpopv3M;
    @BindView(R.id.cre0503b)
    RadioGroup cre0503b;
    @BindView(R.id.cre0503b01)
    RadioButton cre0503b01;
    @BindView(R.id.cre0503b02)
    RadioButton cre0503b02;
    @BindView(R.id.fldGrpopv3)
    LinearLayout fldGrpopv3;
    @BindView(R.id.cre0503a)
    RadioGroup cre0503a;
    @BindView(R.id.cre0503a01)
    RadioButton cre0503a01;
    @BindView(R.id.cre0503a02)
    RadioButton cre0503a02;
    @BindView(R.id.fldGrpipvM)
    LinearLayout fldGrpipvM;
    @BindView(R.id.cre0504b)
    RadioGroup cre0504b;
    @BindView(R.id.cre0504b01)
    RadioButton cre0504b01;
    @BindView(R.id.cre0504b02)
    RadioButton cre0504b02;
    @BindView(R.id.fldGrpipv)
    LinearLayout fldGrpipv;
    @BindView(R.id.cre0504a)
    RadioGroup cre0504a;
    @BindView(R.id.cre0504a01)
    RadioButton cre0504a01;
    @BindView(R.id.cre0504a02)
    RadioButton cre0504a02;
    @BindView(R.id.fldGrpVitaminAM)
    LinearLayout fldGrpVitaminAM;
    @BindView(R.id.cre0601b)
    RadioGroup cre0601b;
    @BindView(R.id.cre0601b01)
    RadioButton cre0601b01;
    @BindView(R.id.cre0601b02)
    RadioButton cre0601b02;
    @BindView(R.id.fldGrpVitaminA)
    LinearLayout fldGrpVitaminA;
    @BindView(R.id.cre0601a)
    RadioGroup cre0601a;
    @BindView(R.id.cre0601a01)
    RadioButton cre0601a01;
    @BindView(R.id.cre0601a02)
    RadioButton cre0601a02;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;


    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH);
    int day = now.get(Calendar.DATE);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String maxDate6Months = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((AppMain.MILLISECONDS_IN_6_MONTHS) + (AppMain.MILLISECONDS_IN_DAY)));

        crb03.setManager(getSupportFragmentManager());
        crb03.setMaxDate(dateToday);
        crb03.setMinDate(maxDate6Months);

        crb03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crb03.onFocusChange(v, true);
            }
        });

//************************************Section B*********************************************************************
        crbdob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (crbdob01.isChecked()) {
                    fldGrpcrbdob.setVisibility(View.VISIBLE);
                    fldGrpcrbAge.setVisibility(View.GONE);
                    crb0401.setText(null);
                    crb0402.setText(null);
                } else {
                    fldGrpcrbAge.setVisibility(View.VISIBLE);
                    fldGrpcrbdob.setVisibility(View.GONE);
                    crb03.setText(null);
                }
            }
        });

        // ====================== Q7 Skip Pattern =========================
        crb07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (crb0701.isChecked()) {
                    crbGrp07.setVisibility(View.VISIBLE);
                } else {
                    crbGrp07.setVisibility(View.GONE);
                    crb0801.setText(null);
                    crb0899.setChecked(false);

                }
            }
        });

        crb0899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crb0801.setVisibility(View.GONE);
                    crb0801.setText(null);
                } else {
                    crb0801.setVisibility(View.VISIBLE);
                }
            }
        });


        /*crb0401.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int currentAge = (year - (crb03.getYear())) * 12 + (month - (crb03.getMonth())) + (day - (crb03.getDayOfMonth()));
                int enteredAge = Integer.parseInt(crb0401.getText().toString().isEmpty() ? "0" : crb0401.getText().toString());

                if (currentAge != enteredAge) {
                    crb0401.setError("Check months");
                } else {
                    crb0401.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
*/
        /*crb0402.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int currentAge = (month - (crb03.getMonth())) + (day - (crb03.getDayOfMonth()));
                int enteredAge = Integer.parseInt(crb0402.getText().toString().isEmpty() ? "0" : crb0402.getText().toString());

                if(currentAge != enteredAge)
                {
                    crb0402.setError("Check days");
                }else{
                    crb0402.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
*/

//************************************Section D*********************************************************************
        // =================== Q1 Others ====================

        crd0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crd0196x.setVisibility(View.VISIBLE);
                } else {
                    crd0196x.setVisibility(View.GONE);
                    crd0196x.setText(null);
                }
            }
        });

        // =================== Q3 Others ====================

        crd0396.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crd0396x.setVisibility(View.VISIBLE);
                } else {
                    crd0396x.setVisibility(View.GONE);
                    crd0396x.setText(null);
                }
            }
        });

        // ====================== Q 1 Skip Pattern =========================

        crd0109.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crdGrp01.setVisibility(View.GONE);
                    crd02.clearCheck();
                    crd0301.setChecked(false);
                    crd0302.setChecked(false);
                    crd0303.setChecked(false);
                    crd0304.setChecked(false);
                    crd0305.setChecked(false);
                    crd0306.setChecked(false);
                    crd0307.setChecked(false);
                    crd0308.setChecked(false);
                    crd0396.setChecked(false);
                    crd0396x.setText(null);
                    crdGrp02.setVisibility(View.GONE);
                    crd0101.setEnabled(false);
                    crd0101.setChecked(false);
                    crd0102.setEnabled(false);
                    crd0102.setChecked(false);
                    crd0103.setEnabled(false);
                    crd0103.setChecked(false);
                    crd0104.setEnabled(false);
                    crd0104.setChecked(false);
                    crd0105.setEnabled(false);
                    crd0105.setChecked(false);
                    crd0106.setEnabled(false);
                    crd0106.setChecked(false);
                    crd0107.setEnabled(false);
                    crd0107.setChecked(false);
                    crd0108.setEnabled(false);
                    crd0108.setChecked(false);
                    crd0196.setEnabled(false);
                    crd0196.setChecked(false);
                    crd0196x.setText(null);

                } else {
                    crdGrp01.setVisibility(View.VISIBLE);
                    crdGrp02.setVisibility(View.VISIBLE);
                    crd0101.setEnabled(true);
                    crd0102.setEnabled(true);
                    crd0103.setEnabled(true);
                    crd0104.setEnabled(true);
                    crd0105.setEnabled(true);
                    crd0106.setEnabled(true);
                    crd0107.setEnabled(true);
                    crd0108.setEnabled(true);
                    crd0196.setEnabled(true);

                }
            }
        });

        // ====================== Q 2 Skip Pattern =========================

        crd0202.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    crdGrp02.setVisibility(View.GONE);
                    crd0301.setChecked(false);
                    crd0302.setChecked(false);
                    crd0303.setChecked(false);
                    crd0304.setChecked(false);
                    crd0305.setChecked(false);
                    crd0306.setChecked(false);
                    crd0307.setChecked(false);
                    crd0308.setChecked(false);
                    crd0396.setChecked(false);
                    crd0396x.setText(null);

                } else {
                    crdGrp02.setVisibility(View.VISIBLE);

                }
            }
        });
//************************************Section E*********************************************************************
        // Section E Skip Pattern

        cre01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cre0101.isChecked()) {
                    fldGrpcre01.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcre01.setVisibility(View.GONE);
                    cre01a.clearCheck();
                    cre0201a.clearCheck();
                    cre0201b.clearCheck();
                    cre0202a.clearCheck();
                    cre0202b.clearCheck();
                    cre0301a.clearCheck();
                    cre0301b.clearCheck();
                    cre0302a.clearCheck();
                    cre0302b.clearCheck();
                    cre0303a.clearCheck();
                    cre0303b.clearCheck();
                    cre0401a.clearCheck();
                    cre0401b.clearCheck();
                    cre0402a.clearCheck();
                    cre0402b.clearCheck();
                    cre0403a.clearCheck();
                    cre0403b.clearCheck();
                    cre0501a.clearCheck();
                    cre0501b.clearCheck();
                    cre0502a.clearCheck();
                    cre0502b.clearCheck();
                    cre0503a.clearCheck();
                    cre0503b.clearCheck();
                    cre0504a.clearCheck();
                    cre0504b.clearCheck();
                    cre0601a.clearCheck();
                    cre0601b.clearCheck();

                }
            }
        });

        cre01a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (cre01a01.isChecked()) {
                    fldGrpBcg.setVisibility(View.VISIBLE);
                    fldGrpBcgM.setVisibility(View.VISIBLE);
                    fldGrpPolio.setVisibility(View.VISIBLE);
                    fldGrpPolioM.setVisibility(View.VISIBLE);
                    fldGrpPenta1.setVisibility(View.VISIBLE);
                    fldGrpPenta1M.setVisibility(View.VISIBLE);
                    fldGrppcv1.setVisibility(View.VISIBLE);
                    fldGrppcv1M.setVisibility(View.VISIBLE);
                    fldGrpopv1.setVisibility(View.VISIBLE);
                    fldGrpopv1M.setVisibility(View.VISIBLE);
                    fldGrppenta2.setVisibility(View.VISIBLE);
                    fldGrppenta2M.setVisibility(View.VISIBLE);
                    fldGrppcv2.setVisibility(View.VISIBLE);
                    fldGrppcv2M.setVisibility(View.VISIBLE);
                    fldGrpopv2.setVisibility(View.VISIBLE);
                    fldGrpopv2M.setVisibility(View.VISIBLE);
                    fldGrpenta3.setVisibility(View.VISIBLE);
                    fldGrpPenta3M.setVisibility(View.VISIBLE);
                    fldGrppcv3.setVisibility(View.VISIBLE);
                    fldGrppcv3M.setVisibility(View.VISIBLE);
                    fldGrpopv3.setVisibility(View.VISIBLE);
                    fldGrpopv3M.setVisibility(View.VISIBLE);
                    fldGrpipv.setVisibility(View.VISIBLE);
                    fldGrpipvM.setVisibility(View.VISIBLE);
                    fldGrpVitaminA.setVisibility(View.VISIBLE);
                    fldGrpVitaminAM.setVisibility(View.VISIBLE);
                } else {
                    fldGrpBcg.setVisibility(View.GONE);
                    fldGrpBcgM.setVisibility(View.VISIBLE);
                    cre0201a.clearCheck();
                    fldGrpPolio.setVisibility(View.GONE);
                    fldGrpPolioM.setVisibility(View.VISIBLE);
                    cre0202a.clearCheck();
                    fldGrpPenta1.setVisibility(View.GONE);
                    fldGrpPenta1M.setVisibility(View.VISIBLE);
                    cre0301a.clearCheck();
                    fldGrppcv1.setVisibility(View.GONE);
                    fldGrppcv1M.setVisibility(View.VISIBLE);
                    cre0302a.clearCheck();
                    fldGrpopv1.setVisibility(View.GONE);
                    fldGrpopv1M.setVisibility(View.VISIBLE);
                    cre0303a.clearCheck();
                    fldGrppenta2.setVisibility(View.GONE);
                    fldGrppenta2M.setVisibility(View.VISIBLE);
                    cre0401a.clearCheck();
                    fldGrppcv2.setVisibility(View.GONE);
                    fldGrppcv2M.setVisibility(View.VISIBLE);
                    cre0402a.clearCheck();
                    fldGrpopv2.setVisibility(View.GONE);
                    fldGrpopv2M.setVisibility(View.VISIBLE);
                    cre0403a.clearCheck();
                    fldGrpenta3.setVisibility(View.GONE);
                    fldGrpPenta3M.setVisibility(View.VISIBLE);
                    cre0501a.clearCheck();
                    fldGrppcv3.setVisibility(View.GONE);
                    fldGrppcv3M.setVisibility(View.VISIBLE);
                    cre0502a.clearCheck();
                    fldGrpopv3.setVisibility(View.GONE);
                    fldGrpopv3M.setVisibility(View.VISIBLE);
                    cre0503a.clearCheck();
                    fldGrpipv.setVisibility(View.GONE);
                    fldGrpipvM.setVisibility(View.VISIBLE);
                    cre0504a.clearCheck();
                    fldGrpVitaminA.setVisibility(View.GONE);
                    fldGrpVitaminAM.setVisibility(View.VISIBLE);
                    cre0601a.clearCheck();
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
            if (updateDB()) {
                Toast.makeText(this, "starting next section", Toast.LENGTH_SHORT).show();

                finish();
                Intent secF = new Intent(this, SectionFActivity.class);
                startActivity(secF);

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

    private boolean updateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount;
//        updcount = db.updateSB();
//        updcount = db.updateSC();
//        updcount = db.updateSD();
//        updcount = db.updateSE();

        int updcount = db.updateSB() == 1 ?
                (db.updateSC() == 1 ? (db.updateSD() == 1 ? (db.updateSE() == 1 ? 1 : db.updateSE()) : db.updateSD()) : db.updateSC()) : db.updateSB();

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

        JSONObject sb = new JSONObject();
        JSONObject sc = new JSONObject();
        JSONObject sd = new JSONObject();
        JSONObject se = new JSONObject();

//************************************Section B*********************************************************************
        sb.put("crb01", crb01.getText().toString());
        sb.put("crb02", crb0201.isChecked() ? "1" : crb0202.isChecked() ? "2" : "0");
        sb.put("crb03", crb03.getText().toString());
        sb.put("crb0401", crb0401.getText().toString());
        sb.put("crb0402", crb0402.getText().toString());
        sb.put("crb05", crb0501.isChecked() ? "1" : crb0502.isChecked() ? "2" : "0");
        sb.put("crb0601", crb0601.getText().toString());
        sb.put("crb07", crb0701.isChecked() ? "1" : crb0702.isChecked() ? "2" : crb0799.isChecked() ? "99" : "0");
        sb.put("crb08", crb0801.getText().toString());
        sb.put("crb0899", crb0899.isChecked() ? "99" : "0");
//************************************Section C*********************************************************************
        sc.put("crc01m1", crc01m1.getText().toString());
        sc.put("crc01m2", crc01m2.getText().toString());
        sc.put("crc01m3", crc01m3.getText().toString());
        sc.put("crc02m1 ", crc02m1.getText().toString());
        sc.put("crc02m2 ", crc02m2.getText().toString());
        sc.put("crc02m3 ", crc02m3.getText().toString());
        /*sc.put("crc03m1 ", crc03m1.getText().toString());
        sc.put("crc03m2 ", crc03m2.getText().toString());
        sc.put("crc03m3 ", crc03m3.getText().toString());*/
//************************************Section D*********************************************************************
        sd.put("crd0101", crd0101.isChecked() ? "1" : "0");
        sd.put("crd0102", crd0102.isChecked() ? "2" : "0");
        sd.put("crd0103", crd0103.isChecked() ? "3" : "0");
        sd.put("crd0104", crd0104.isChecked() ? "4" : "0");
        sd.put("crd0105", crd0105.isChecked() ? "5" : "0");
        sd.put("crd0106", crd0106.isChecked() ? "6" : "0");
        sd.put("crd0107", crd0107.isChecked() ? "7" : "0");
        sd.put("crd0108", crd0108.isChecked() ? "8" : "0");
        sd.put("crd0109", crd0109.isChecked() ? "9" : "0");
        sd.put("crd0196", crd0196.isChecked() ? "88" : "0");
        sd.put("crd0196x", crd0196x.getText().toString());
        sd.put("crd02", crd0201.isChecked() ? "1" : crd0202.isChecked() ? "2" : "0");
        sd.put("crd0301", crd0301.isChecked() ? "1" : "0");
        sd.put("crd0302", crd0302.isChecked() ? "1" : "0");
        sd.put("crd0303", crd0303.isChecked() ? "1" : "0");
        sd.put("crd0304", crd0304.isChecked() ? "1" : "0");
        sd.put("crd0305", crd0305.isChecked() ? "1" : "0");
        sd.put("crd0306", crd0306.isChecked() ? "1" : "0");
        sd.put("crd0307", crd0307.isChecked() ? "1" : "0");
        sd.put("crd0308", crd0308.isChecked() ? "1" : "0");
        sd.put("crd0396x", crd0396x.getText().toString());
//************************************Section E*********************************************************************
        se.put("cre01", cre0101.isChecked() ? "1" : cre0102.isChecked() ? "2" : "0");
        se.put("cre01a", cre01a01.isChecked() ? "1" : cre01a02.isChecked() ? "2" : "0");
        // BCG At Birth
        se.put("cre0201a", cre0201a01.isChecked() ? "1" : cre0201a02.isChecked() ? "2" : "0");
        se.put("cre0201b", cre0201b01.isChecked() ? "1" : cre0201b02.isChecked() ? "2" : "0");
        //Polio At Birth
        se.put("cre0202a", cre0202a01.isChecked() ? "1" : cre0202a02.isChecked() ? "2" : "0");
        se.put("cre0202b", cre0202b01.isChecked() ? "1" : cre0202b02.isChecked() ? "2" : "0");
        // Penta 1 at 6 weeks
        se.put("cre0301a", cre0301a01.isChecked() ? "1" : cre0301a02.isChecked() ? "2" : "0");
        se.put("cre0301b", cre0301b01.isChecked() ? "1" : cre0301b02.isChecked() ? "2" : "0");
        //PCV 1 at 6 weeks
        se.put("cre0302a", cre0302a01.isChecked() ? "1" : cre0302a02.isChecked() ? "2" : "0");
        se.put("cre0302b", cre0302b01.isChecked() ? "1" : cre0302b02.isChecked() ? "2" : "0");
        // OPV 1 at 6 weeks
        se.put("cre0303a", cre0303a01.isChecked() ? "1" : cre0303a02.isChecked() ? "2" : "0");
        se.put("cre0303b", cre0303b01.isChecked() ? "1" : cre0303b02.isChecked() ? "2" : "0");
        // Penta 2 at 10 weeks
        se.put("cre0401a", cre0401a01.isChecked() ? "1" : cre0401a02.isChecked() ? "2" : "0");
        se.put("cre0401b", cre0401b01.isChecked() ? "1" : cre0401b02.isChecked() ? "2" : "0");
        // PCV 2 at 6 weeks
        se.put("cre0402a", cre0402a01.isChecked() ? "1" : cre0402a02.isChecked() ? "2" : "0");
        se.put("cre0402b", cre0402b01.isChecked() ? "1" : cre0402b02.isChecked() ? "2" : "0");
        // OPV 2 at 6 weeks
        se.put("cre0403a", cre0403a01.isChecked() ? "1" : cre0403a02.isChecked() ? "2" : "0");
        se.put("cre0403b", cre0403b01.isChecked() ? "1" : cre0403b02.isChecked() ? "2" : "0");
        // Penta 3 at 14 weeks
        se.put("cre0501a", cre0501a01.isChecked() ? "1" : cre0501a02.isChecked() ? "2" : "0");
        se.put("cre0501b", cre0501b01.isChecked() ? "1" : cre0501b02.isChecked() ? "2" : "0");
        // PCV 3 at 14 weeks
        se.put("cre0502a", cre0502a01.isChecked() ? "1" : cre0502a02.isChecked() ? "2" : "0");
        se.put("cre0502b", cre0502b01.isChecked() ? "1" : cre0502b02.isChecked() ? "2" : "0");
        // OPV 3 at 14 weeks
        se.put("cre0503a", cre0503a01.isChecked() ? "1" : cre0503a02.isChecked() ? "2" : "0");
        se.put("cre0503b", cre0503b01.isChecked() ? "1" : cre0503b02.isChecked() ? "2" : "0");
        // IPV at 14 weeks
        se.put("cre0504a", cre0504a01.isChecked() ? "1" : cre0504a02.isChecked() ? "2" : "0");
        se.put("cre0504b", cre0504b01.isChecked() ? "1" : cre0504b02.isChecked() ? "2" : "0");

        se.put("cre601a", cre0601a01.isChecked() ? "1" : cre0601a02.isChecked() ? "2" : "0");
        se.put("cre0601b", cre0601b01.isChecked() ? "1" : cre0601b02.isChecked() ? "2" : "0");

        AppMain.fc.setsB(String.valueOf(sb));
        AppMain.fc.setsC(String.valueOf(sc));
        AppMain.fc.setsD(String.valueOf(sd));
        AppMain.fc.setsE(String.valueOf(se));

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();

    }

    public boolean validateForm() {

//************************************Section B*********************************************************************
        // =================== Q1 ====================
        if (crb01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb01), Toast.LENGTH_SHORT).show();
            crb01.setError("This data is required");
            Log.d(TAG, " crb01 :empty ");
            return false;
        } else {
            crb01.setError(null);
        }

        // =================== Q2 ====================
        if (crb02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb02), Toast.LENGTH_SHORT).show();
            crb0202.setError("This Data is required");
            Log.d(TAG, " crb02 : not selected ");
            return false;
        } else {
            crb0202.setError(null);
        }


        if (crbAge02.isChecked()) {
            // =================== Q4 ====================
            if (crb0401.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb04), Toast.LENGTH_SHORT).show();
                crb0401.setError("This data is required");
                Log.d(TAG, "empty: crb0401  ");
                return false;
            } else {
                crb0401.setError(null);
            }

            if (Integer.parseInt(crb0401.getText().toString()) < 0 || Integer.parseInt(crb0401.getText().toString()) > 6) {
                Toast.makeText(this, "ERROR: " + getString(R.string.crb04) + getString(R.string.months), Toast.LENGTH_LONG).show();
                crb0401.setError("Range is 0-6 Months");
                Log.i(TAG, "crb0401: Range is 0-6 Months");
                return false;
            } else {
                crb0401.setError(null);
            }

            if (crb0402.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb04), Toast.LENGTH_SHORT).show();
                crb0402.setError("This data is required");
                Log.d(TAG, "empty: crb0402");
                return false;
            } else {
                crb0402.setError(null);
            }

            if ((Integer.parseInt(crb0402.getText().toString()) < 0) || (Integer.parseInt(crb0402.getText().toString()) > 29)) {
                Toast.makeText(this, "ERROR: " + getString(R.string.crb04) + getString(R.string.crb0402), Toast.LENGTH_LONG).show();
                crb0402.setError("Range is 1-29 days");
                Log.i(TAG, "crb0402: Range is 1-29 days");
                return false;
            } else {
                crb0402.setError(null);
            }
        } else {
            // =================== Q4 ====================
            if (crb03.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb03), Toast.LENGTH_SHORT).show();
                crb03.setError("This data is required");
                Log.d(TAG, "empty: crb03  ");
                return false;
            } else {
                crb03.setError(null);
            }
        }

        // =================== Q5 ====================
        if (crb05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb05), Toast.LENGTH_SHORT).show();
            crb0502.setError("This Data is required");
            Log.d(TAG, "not selected: crb05 ");
            return false;
        } else {
            crb0502.setError(null);
        }

        // =================== Q6 ====================
        if (crb0601.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb06), Toast.LENGTH_SHORT).show();
            crb0601.setError("This data is required");
            Log.d(TAG, "empty: crb0601  ");
            return false;
        } else {
            crb0601.setError(null);
        }

        // =================== Q6 ====================
        if (Integer.parseInt(crb0601.getText().toString()) < 4 || Integer.parseInt(crb0601.getText().toString()) > 44) {
            Toast.makeText(this, "ERROR(Invalid)" + getString(R.string.crb06), Toast.LENGTH_SHORT).show();
            crb0601.setError("Range is 4 - 44 weeks");
            Log.d(TAG, "crb0601: Range is 4 to 44 weeks  ");
            return false;
        } else {
            crb0601.setError(null);
        }

        // =================== Q7 ====================
        if (crb07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crb07), Toast.LENGTH_SHORT).show();
            crb0702.setError("This Data is required");
            Log.d(TAG, "not selected: crb07 ");
            return false;
        } else {
            crb0702.setError(null);
        }

        if (crb0701.isChecked()) {

            // =================== Q8 ====================
            if (crb0801.getText().toString().isEmpty() && !crb0899.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                crb0801.setError("This data is Required!");
                Log.i(TAG, "crb0801: This data is Required!");
                return false;
            } else {
                crb0801.setError(null);
                if (!crb0899.isChecked()) {
                    if (Double.parseDouble(crb0801.getText().toString()) == 0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                        crb0801.setError("Invalid: Data cannot be Zero");
                        Log.i(TAG, "crb0801: Invalid data is 0");
                        return false;
                    } else {
                        crb0801.setError(null);
                        if (Double.parseDouble(crb0801.getText().toString()) < 0.9 || Double.parseDouble(crb0801.getText().toString()) > 6.0) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crb08), Toast.LENGTH_SHORT).show();
                            crb0801.setError("Invalid: Range is 0.9 - 6.0");
                            Log.i(TAG, "crb0801: Invalid Range is 0.9 - 6.0 kg");
                            return false;
                        } else {
                            crb0801.setError(null);
                        }
                    }

                }
            }

        }
//************************************Section C*********************************************************************

        // =================== Q1 m1 ====================
        if (crc01m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m1.setError("This data is Required!");
            Log.i(TAG, "crc01m1: This data is Required!");
            return false;
        } else {
            crc01m1.setError(null);

            if (Double.parseDouble(crc01m1.getText().toString()) < 38.0 || Double.parseDouble(crc01m1.getText().toString()) > 80.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m1.setError("Invalid: Range 38.0 - 80.0");
                Log.i(TAG, "crc01m1: Invalid Range 38.0 - 80.0");
                return false;
            } else {
                crc01m1.setError(null);
            }
        }


        // =================== Q1 m2 ====================
        if (crc01m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m2.setError("This data is Required!");
            Log.i(TAG, "crc01m2: This data is Required!");
            return false;
        } else {
            crc01m2.setError(null);

            if (Double.parseDouble(crc01m2.getText().toString()) < 38.0 || Double.parseDouble(crc01m2.getText().toString()) > 80.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m2.setError("Invalid: Range 38.0 - 80.0");
                Log.i(TAG, "crc01m2: Invalid Range 38.0 - 80.0");
                return false;
            } else {
                crc01m2.setError(null);
            }
        }


        // =================== Q1 m3 ====================
        if (crc01m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
            crc01m3.setError("This data is Required!");
            Log.i(TAG, "crc01m3: This data is Required!");
            return false;
        } else {
            crc01m3.setError(null);

            if (Double.parseDouble(crc01m3.getText().toString()) < 38.0 || Double.parseDouble(crc01m3.getText().toString()) > 80.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc01), Toast.LENGTH_SHORT).show();
                crc01m3.setError("Invalid: Range 38.0 - 80.0");
                Log.i(TAG, "crc01m3: Invalid Range 38.0 - 80.0");
                return false;
            } else {
                crc01m3.setError(null);
            }
        }


        // =================== Q2 m1 ====================
        if (crc02m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m1.setError("This data is Required!");
            Log.i(TAG, "crc02m1: This data is Required!");
            return false;
        } else {
            crc02m1.setError(null);
            if (Double.parseDouble(crc02m1.getText().toString()) < 0.9 || Double.parseDouble(crc02m1.getText().toString()) > 25.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m1.setError("Invalid: Range 0.9 - 25.0 kg");
                Log.i(TAG, "crc02m1: Invalid Range 0.9 - 25.0 kg");
                return false;
            } else {
                crc02m1.setError(null);
            }
        }


        // =================== Q2 m2 ====================
        if (crc02m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m2.setError("This data is Required!");
            Log.i(TAG, "crc02m2: This data is Required!");
            return false;
        } else {
            crc02m2.setError(null);

            if (Double.parseDouble(crc02m2.getText().toString()) < 0.9 || Double.parseDouble(crc02m2.getText().toString()) > 25.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m2.setError("Invalid: Range 0.9 - 25.0 kg");
                Log.i(TAG, "crc02m2: Invalid Range 0.9 - 25.0");
                return false;
            } else {
                crc02m2.setError(null);
            }
        }


        // =================== Q2 m3 ====================
        if (crc02m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
            crc02m3.setError("This data is Required!");
            Log.i(TAG, "crc02m3: This data is Required!");
            return false;
        } else {
            crc02m3.setError(null);
            if (Double.parseDouble(crc02m3.getText().toString()) < 0.9 || Double.parseDouble(crc02m3.getText().toString()) > 25.0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc02), Toast.LENGTH_SHORT).show();
                crc02m3.setError("Invalid: Range 0.9 - 25.0");
                Log.i(TAG, "crc02m3: Invalid Range 0.9 - 25.0");
                return false;
            } else {
                crc02m3.setError(null);
            }
        }


        // =================== Q3 m1 ====================
        /*if (crc03m1.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m1.setError("This data is Required!");
            Log.i(TAG, "crc03m1: This data is Required!");
            return false;
        } else {
            crc03m1.setError(null);
            if (!crc03m1.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m1.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m1: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m1.setError(null);
                if (Double.parseDouble(crc03m1.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m1.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m1: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m1.setError(null);
                    if (Double.parseDouble(crc03m1.getText().toString()) < 8 || Double.parseDouble(crc03m1.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m1.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m1: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m1.setError(null);
                    }
                }
            }
        }

        // =================== Q3 m2 ====================
        if (crc03m2.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m2.setError("This data is Required!");
            Log.i(TAG, "crc03m2: This data is Required!");
            return false;
        } else {
            crc03m2.setError(null);
            if (!crc03m2.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m2.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m2: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m2.setError(null);
                if (Double.parseDouble(crc03m2.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m2.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m2: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m2.setError(null);
                    if (Double.parseDouble(crc03m2.getText().toString()) < 8 || Double.parseDouble(crc03m2.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m2.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m2: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m2.setError(null);
                    }
                }
            }
        }

        // =================== Q3 m3 ====================
        if (crc03m3.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
            crc03m3.setError("This data is Required!");
            Log.i(TAG, "crc03m3: This data is Required!");
            return false;
        } else {
            crc03m3.setError(null);
            if (!crc03m3.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                crc03m3.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "crc03m3: Invalid Decimal value is Required!");
                return false;
            } else {
                crc03m3.setError(null);
                if (Double.parseDouble(crc03m3.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                    crc03m3.setError("Invalid: Greater then 0");
                    Log.i(TAG, "crc03m3: Invalid Greater then 0");
                    return false;
                } else {
                    crc03m3.setError(null);
                    if (Double.parseDouble(crc03m3.getText().toString()) < 8 || Double.parseDouble(crc03m3.getText().toString()) > 99.9) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.crc03), Toast.LENGTH_SHORT).show();
                        crc03m3.setError("Invalid: Range 8.0-99.9");
                        Log.i(TAG, "crc03m3: Invalid Range 8.0-99.9");
                        return false;
                    } else {
                        crc03m3.setError(null);
                    }
                }
            }
        }
*/
//*****************************************Section-D****************************************************************

        // ====================== Q1 ===================
        if (!(crd0101.isChecked() || crd0102.isChecked() || crd0103.isChecked() || crd0104.isChecked()
                || crd0105.isChecked() || crd0106.isChecked() || crd0107.isChecked() || crd0108.isChecked() || crd0109.isChecked() || crd0196.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crd01), Toast.LENGTH_LONG).show();
            crd0196.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "crd01: This data is Required!");
            return false;
        } else {
            crd0196.setError(null);
        }

        if (crd0196.isChecked() && crd0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crd01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crd0196x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crd0196: This data is Required!");
            return false;
        } else {
            crd0196x.setError(null);
        }
        if (!(crd0109.isChecked())) {

            // ====================== Q 2 ===================
            if (crd02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.crd02), Toast.LENGTH_SHORT).show();
                crd0202.setError("This Data is required");
                Log.d(TAG, "not selected: crd02 ");
                return false;
            } else {
                crd0202.setError(null);
            }

            if (crd0201.isChecked()) {
                // ====================== Q 3 ===================

                if (!(crd0301.isChecked() || crd0302.isChecked() || crd0303.isChecked() || crd0304.isChecked()
                        || crd0305.isChecked() || crd0306.isChecked() || crd0307.isChecked() || crd0308.isChecked()
                        || crd0396.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crd01), Toast.LENGTH_LONG).show();
                    crd0396.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "crd01: This data is Required!");
                    return false;
                } else {
                    crd0396.setError(null);
                }
                if (crd0396.isChecked() && crd0396x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crd03) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                    crd0396x.setError("This data is Required!");    // Set Error on last radio button
                    Log.d(TAG, "crd0396: This data is Required!");
                    return false;
                } else {
                    crd0396x.setError(null);
                }
            }

        }
//*****************************************Section-E****************************************************************
        //============ Q 1 ==========
        if (cre01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre01), Toast.LENGTH_SHORT).show();
            cre0102.setError("This data is Required!");
            Log.i(TAG, "cre01: This data is Required!");
            return false;
        } else {
            cre0102.setError(null);
        }

        if (cre0101.isChecked()) {
            //============ Q 1a ==========
            if (cre01a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre01a), Toast.LENGTH_SHORT).show();
                cre01a02.setError("This data is Required!");
                Log.i(TAG, "cre01a: This data is Required!");
                return false;
            } else {
                cre01a02.setError(null);
            }

            if (cre01a01.isChecked()) {
                //============ BCG / Card Present ==========
                if (cre0201a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02bcg), Toast.LENGTH_SHORT).show();
                    cre0201a02.setError("This data is Required!");
                    Log.i(TAG, "cre0201a: This data is Required!");
                    return false;
                } else {
                    cre0201a02.setError(null);
                }

                //============ Polio 0 / Card Present ==========
                if (cre0202a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02polio), Toast.LENGTH_SHORT).show();
                    cre0202a02.setError("This data is Required!");
                    Log.i(TAG, "cre0202a: This data is Required!");
                    return false;
                } else {
                    cre0202a02.setError(null);
                }

                //============ Penta 1 / Card Present ==========
                if (cre0301a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03penta), Toast.LENGTH_SHORT).show();
                    cre0301a02.setError("This data is Required!");
                    Log.i(TAG, "cre0301a: This data is Required!");
                    return false;
                } else {
                    cre0301a02.setError(null);
                }

                //============ PCV 1 / Card Present ==========
                if (cre0302a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03pcv), Toast.LENGTH_SHORT).show();
                    cre0302a02.setError("This data is Required!");
                    Log.i(TAG, "cre0302a: This data is Required!");
                    return false;
                } else {
                    cre0302a02.setError(null);
                }

                //============ OPV 1 / Card Present ==========
                if (cre0303a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03opv), Toast.LENGTH_SHORT).show();
                    cre0303a02.setError("This data is Required!");
                    Log.i(TAG, "cre0303a: This data is Required!");
                    return false;
                } else {
                    cre0303a02.setError(null);
                }

                //============ Penta 2 / Card Present ==========
                if (cre0401a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04penta), Toast.LENGTH_SHORT).show();
                    cre0401a02.setError("This data is Required!");
                    Log.i(TAG, "cre0401a: This data is Required!");
                    return false;
                } else {
                    cre0401a02.setError(null);
                }

                //============ PCV 2 / Card Present ==========
                if (cre0402a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04pcv), Toast.LENGTH_SHORT).show();
                    cre0402a02.setError("This data is Required!");
                    Log.i(TAG, "cre0402a: This data is Required!");
                    return false;
                } else {
                    cre0402a02.setError(null);
                }

                //============ OPV 2 / Card Present ==========
                if (cre0403a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04opv), Toast.LENGTH_SHORT).show();
                    cre0403a02.setError("This data is Required!");
                    Log.i(TAG, "cre0403a: This data is Required!");
                    return false;
                } else {
                    cre0403a02.setError(null);
                }

                //============ Penta 3 / Card Present ==========
                if (cre0501a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05penta), Toast.LENGTH_SHORT).show();
                    cre0501a02.setError("This data is Required!");
                    Log.i(TAG, "cre0501a: This data is Required!");
                    return false;
                } else {
                    cre0501a02.setError(null);
                }

                //============ PCV 3 / Card Present ==========
                if (cre0502a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05pcv), Toast.LENGTH_SHORT).show();
                    cre0502a02.setError("This data is Required!");
                    Log.i(TAG, "cre0502a: This data is Required!");
                    return false;
                } else {
                    cre0502a02.setError(null);
                }


                //============ OPV 3 / Card Present ==========
                if (cre0503a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05opv), Toast.LENGTH_SHORT).show();
                    cre0503a02.setError("This data is Required!");
                    Log.i(TAG, "cre0503a: This data is Required!");
                    return false;
                } else {
                    cre0503a02.setError(null);
                }

                //============ IPV / Card Present ==========
                if (cre0504a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05ipv), Toast.LENGTH_SHORT).show();
                    cre0504a02.setError("This data is Required!");
                    Log.i(TAG, "cre0504a: This data is Required!");
                    return false;
                } else {
                    cre0504a02.setError(null);
                }

                //============ Vitamin / Card Present ==========
                if (cre0601a.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre06Vitamin), Toast.LENGTH_SHORT).show();
                    cre0601a02.setError("This data is Required!");
                    Log.i(TAG, "cre0601a: This data is Required!");
                    return false;
                } else {
                    cre0601a02.setError(null);
                }

            }
            //============ BCG / Mother ==========
            if (cre0201b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02bcg), Toast.LENGTH_SHORT).show();
                cre0201b02.setError("This data is Required!");
                Log.i(TAG, "cre0201b: This data is Required!");
                return false;
            } else {
                cre0201b02.setError(null);
            }

            //============ Polio 0 / Mother ==========
            if (cre0202b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre02polio), Toast.LENGTH_SHORT).show();
                cre0202b02.setError("This data is Required!");
                Log.i(TAG, "cre0202b: This data is Required!");
                return false;
            } else {
                cre0202b02.setError(null);
            }

            //============ Penta 1 / Mother ==========
            if (cre0301b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03penta), Toast.LENGTH_SHORT).show();
                cre0301b02.setError("This data is Required!");
                Log.i(TAG, "cre0301b: This data is Required!");
                return false;
            } else {
                cre0301b02.setError(null);
            }

            //============ PCV 1 / Mother ==========
            if (cre0302b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03pcv), Toast.LENGTH_SHORT).show();
                cre0302b02.setError("This data is Required!");
                Log.i(TAG, "cre0302b: This data is Required!");
                return false;
            } else {
                cre0302b02.setError(null);
            }

            //============ OPV 1 / Mother ==========
            if (cre0303b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre03opv), Toast.LENGTH_SHORT).show();
                cre0303b02.setError("This data is Required!");
                Log.i(TAG, "cre0303b: This data is Required!");
                return false;
            } else {
                cre0303b02.setError(null);
            }

            //============ Penta 2 / Mother ==========
            if (cre0401b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04penta), Toast.LENGTH_SHORT).show();
                cre0401b02.setError("This data is Required!");
                Log.i(TAG, "cre0401b: This data is Required!");
                return false;
            } else {
                cre0401b02.setError(null);
            }

            //============ PCV 2 / Mother ==========
            if (cre0402b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04pcv), Toast.LENGTH_SHORT).show();
                cre0402b02.setError("This data is Required!");
                Log.i(TAG, "cre0402b: This data is Required!");
                return false;
            } else {
                cre0402b02.setError(null);
            }

            //============ OPV 2 / Mother ==========
            if (cre0403b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre04opv), Toast.LENGTH_SHORT).show();
                cre0403b02.setError("This data is Required!");
                Log.i(TAG, "cre0403b: This data is Required!");
                return false;
            } else {
                cre0403b02.setError(null);
            }

            //============ Penta 3 / Mother ==========
            if (cre0501b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05penta), Toast.LENGTH_SHORT).show();
                cre0501b02.setError("This data is Required!");
                Log.i(TAG, "cre0501b: This data is Required!");
                return false;
            } else {
                cre0501b02.setError(null);
            }

            //============ PCV / Mother ==========
            if (cre0502b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05pcv), Toast.LENGTH_SHORT).show();
                cre0502b02.setError("This data is Required!");
                Log.i(TAG, "cre0502b: This data is Required!");
                return false;
            } else {
                cre0502b02.setError(null);
            }


            //============ OPV 3 / Mother ==========
            if (cre0503b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05opv), Toast.LENGTH_SHORT).show();
                cre0503b02.setError("This data is Required!");
                Log.i(TAG, "cre0503b: This data is Required!");
                return false;
            } else {
                cre0503b02.setError(null);
            }

            //============ IPV / Mother ==========
            if (cre0504b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre05ipv), Toast.LENGTH_SHORT).show();
                cre0504b02.setError("This data is Required!");
                Log.i(TAG, "cre0504b: This data is Required!");
                return false;
            } else {
                cre0504b02.setError(null);
            }

            //============ Vitamin A / Mother ==========
            if (cre0601b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.cre06Vitamin), Toast.LENGTH_SHORT).show();
                cre0601b02.setError("This data is Required!");
                Log.i(TAG, "cre0601b: This data is Required!");
                return false;
            } else {
                cre0601b02.setError(null);
            }

        }


        return true;
    }


}
