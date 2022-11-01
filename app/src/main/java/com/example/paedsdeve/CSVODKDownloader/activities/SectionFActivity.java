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

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;

public class SectionFActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    private static final String TAG = SectionFActivity.class.getSimpleName();

    @BindView(R.id.activity_section_f)
    ScrollView activitySectionF;
    @BindView(R.id.crf01)
    RadioGroup crf01;
    @BindView(R.id.crf0101)
    RadioButton crf0101;
    @BindView(R.id.crf0102)
    RadioButton crf0102;
    @BindView(R.id.crf0199)
    RadioButton crf0199;
    @BindView(R.id.crf01a)
    RadioGroup crf01a;
    @BindView(R.id.crf01a01)
    RadioButton crf01a01;
    @BindView(R.id.crf01a02)
    RadioButton crf01a02;
    @BindView(R.id.crf01a99)
    RadioButton crf01a99;
    @BindView(R.id.crf02h)
    EditText crf02h;
    @BindView(R.id.crf02d)
    EditText crf02d;
    @BindView(R.id.crf03)
    RadioGroup crf03;
    @BindView(R.id.crf0301)
    RadioButton crf0301;
    @BindView(R.id.crf0302)
    RadioButton crf0302;
    @BindView(R.id.crf0399)
    RadioButton crf0399;
    @BindView(R.id.crf04)
    RadioGroup crf04;
    @BindView(R.id.crf0401)
    RadioButton crf0401;
    @BindView(R.id.crf0402)
    RadioButton crf0402;
    @BindView(R.id.crf0499)
    RadioButton crf0499;
    @BindView(R.id.crf05)
    RadioGroup crf05;
    @BindView(R.id.crf0501)
    RadioButton crf0501;
    @BindView(R.id.crf0502)
    RadioButton crf0502;
    @BindView(R.id.crf0599)
    RadioButton crf0599;
    @BindView(R.id.crf06a)
    RadioGroup crf06a;
    @BindView(R.id.crf06a01)
    RadioButton crf06a01;
    @BindView(R.id.crf06a02)
    RadioButton crf06a02;
    @BindView(R.id.crf06a99)
    RadioButton crf06a99;
    @BindView(R.id.crf06b)
    RadioGroup crf06b;
    @BindView(R.id.crf06b01)
    RadioButton crf06b01;
    @BindView(R.id.crf06b02)
    RadioButton crf06b02;
    @BindView(R.id.crf06b99)
    RadioButton crf06b99;
    @BindView(R.id.crf06btime)
    EditText crf06btime;
    @BindView(R.id.crf06c)
    RadioGroup crf06c;
    @BindView(R.id.crf06c01)
    RadioButton crf06c01;
    @BindView(R.id.crf06c02)
    RadioButton crf06c02;
    @BindView(R.id.crf06c99)
    RadioButton crf06c99;
    @BindView(R.id.crf06ctime)
    EditText crf06ctime;
    @BindView(R.id.crf06d)
    RadioGroup crf06d;
    @BindView(R.id.crf06d01)
    RadioButton crf06d01;
    @BindView(R.id.crf06d02)
    RadioButton crf06d02;
    @BindView(R.id.crf06d99)
    RadioButton crf06d99;
    @BindView(R.id.crf06e)
    RadioGroup crf06e;
    @BindView(R.id.crf06e01)
    RadioButton crf06e01;
    @BindView(R.id.crf06e02)
    RadioButton crf06e02;
    @BindView(R.id.crf06e99)
    RadioButton crf06e99;
    @BindView(R.id.crf06f)
    RadioGroup crf06f;
    @BindView(R.id.crf06f01)
    RadioButton crf06f01;
    @BindView(R.id.crf06f02)
    RadioButton crf06f02;
    @BindView(R.id.crf06f99)
    RadioButton crf06f99;
    @BindView(R.id.crf06ftime)
    EditText crf06ftime;
    @BindView(R.id.crf06g)
    RadioGroup crf06g;
    @BindView(R.id.crf06g01)
    RadioButton crf06g01;
    @BindView(R.id.crf06g02)
    RadioButton crf06g02;
    @BindView(R.id.crf06g99)
    RadioButton crf06g99;
    @BindView(R.id.crf06h)
    RadioGroup crf06h;
    @BindView(R.id.crf06h01)
    RadioButton crf06h01;
    @BindView(R.id.crf06h02)
    RadioButton crf06h02;
    @BindView(R.id.crf06h99)
    RadioButton crf06h99;
    @BindView(R.id.crf06i)
    RadioGroup crf06i;
    @BindView(R.id.crf06i01)
    RadioButton crf06i01;
    @BindView(R.id.crf06i02)
    RadioButton crf06i02;
    @BindView(R.id.crf06i99)
    RadioButton crf06i99;
    @BindView(R.id.crf07a)
    RadioGroup crf07a;
    @BindView(R.id.crf07a01)
    RadioButton crf07a01;
    @BindView(R.id.crf07a02)
    RadioButton crf07a02;
    @BindView(R.id.crf07a99)
    RadioButton crf07a99;
    @BindView(R.id.crf07b)
    RadioGroup crf07b;
    @BindView(R.id.crf07b01)
    RadioButton crf07b01;
    @BindView(R.id.crf07b02)
    RadioButton crf07b02;
    @BindView(R.id.crf07b99)
    RadioButton crf07b99;
    @BindView(R.id.crf07c)
    RadioGroup crf07c;
    @BindView(R.id.crf07c01)
    RadioButton crf07c01;
    @BindView(R.id.crf07c02)
    RadioButton crf07c02;
    @BindView(R.id.crf07c99)
    RadioButton crf07c99;
    @BindView(R.id.crf07d)
    RadioGroup crf07d;
    @BindView(R.id.crf07d01)
    RadioButton crf07d01;
    @BindView(R.id.crf07d02)
    RadioButton crf07d02;
    @BindView(R.id.crf07d99)
    RadioButton crf07d99;
    @BindView(R.id.crf07e)
    RadioGroup crf07e;
    @BindView(R.id.crf07e01)
    RadioButton crf07e01;
    @BindView(R.id.crf07e02)
    RadioButton crf07e02;
    @BindView(R.id.crf07e99)
    RadioButton crf07e99;
    @BindView(R.id.crf07f)
    RadioGroup crf07f;
    @BindView(R.id.crf07f01)
    RadioButton crf07f01;
    @BindView(R.id.crf07f02)
    RadioButton crf07f02;
    @BindView(R.id.crf07f99)
    RadioButton crf07f99;
    @BindView(R.id.crf07g)
    RadioGroup crf07g;
    @BindView(R.id.crf07g01)
    RadioButton crf07g01;
    @BindView(R.id.crf07g02)
    RadioButton crf07g02;
    @BindView(R.id.crf07g99)
    RadioButton crf07g99;
    @BindView(R.id.crf07h)
    RadioGroup crf07h;
    @BindView(R.id.crf07h01)
    RadioButton crf07h01;
    @BindView(R.id.crf07h02)
    RadioButton crf07h02;
    @BindView(R.id.crf07h99)
    RadioButton crf07h99;
    @BindView(R.id.crf07i)
    RadioGroup crf07i;
    @BindView(R.id.crf07i01)
    RadioButton crf07i01;
    @BindView(R.id.crf07i02)
    RadioButton crf07i02;
    @BindView(R.id.crf07i99)
    RadioButton crf07i99;
    @BindView(R.id.crf07j)
    RadioGroup crf07j;
    @BindView(R.id.crf07j01)
    RadioButton crf07j01;
    @BindView(R.id.crf07j02)
    RadioButton crf07j02;
    @BindView(R.id.crf07j99)
    RadioButton crf07j99;
    @BindView(R.id.crf07k)
    RadioGroup crf07k;
    @BindView(R.id.crf07k01)
    RadioButton crf07k01;
    @BindView(R.id.crf07k02)
    RadioButton crf07k02;
    @BindView(R.id.crf07k99)
    RadioButton crf07k99;
    @BindView(R.id.crf07l)
    RadioGroup crf07l;
    @BindView(R.id.crf07l01)
    RadioButton crf07l01;
    @BindView(R.id.crf07l02)
    RadioButton crf07l02;
    @BindView(R.id.crf07l99)
    RadioButton crf07l99;
    @BindView(R.id.crf07m)
    RadioGroup crf07m;
    @BindView(R.id.crf07m01)
    RadioButton crf07m01;
    @BindView(R.id.crf07m02)
    RadioButton crf07m02;
    @BindView(R.id.crf07m99)
    RadioButton crf07m99;
    @BindView(R.id.crf07n)
    RadioGroup crf07n;
    @BindView(R.id.crf07n01)
    RadioButton crf07n01;
    @BindView(R.id.crf07n02)
    RadioButton crf07n02;
    @BindView(R.id.crf07n99)
    RadioButton crf07n99;
    @BindView(R.id.crf07o)
    RadioGroup crf07o;
    @BindView(R.id.crf07o01)
    RadioButton crf07o01;
    @BindView(R.id.crf07o02)
    RadioButton crf07o02;
    @BindView(R.id.crf07o99)
    RadioButton crf07o99;
    @BindView(R.id.crf07p)
    RadioGroup crf07p;
    @BindView(R.id.crf07p01)
    RadioButton crf07p01;
    @BindView(R.id.crf07p02)
    RadioButton crf07p02;
    @BindView(R.id.crf07p99)
    RadioButton crf07p99;
    @BindView(R.id.crf07q)
    RadioGroup crf07q;
    @BindView(R.id.crf07q01)
    RadioButton crf07q01;
    @BindView(R.id.crf07q02)
    RadioButton crf07q02;
    @BindView(R.id.crf07q99)
    RadioButton crf07q99;
    @BindView(R.id.crf08)
    RadioGroup crf08;
    @BindView(R.id.crf0801)
    RadioButton crf0801;
    @BindView(R.id.crf0802)
    RadioButton crf0802;
    @BindView(R.id.crf0899)
    RadioButton crf0899;
    @BindView(R.id.crf0999)
    CheckBox crf0999;
    @BindView(R.id.crf09num)
    EditText crf09num;
    @BindView(R.id.crf10)
    RadioGroup crf10;
    @BindView(R.id.crf1001)
    RadioButton crf1001;
    @BindView(R.id.crf1002)
    RadioButton crf1002;
    @BindView(R.id.crf1099)
    RadioButton crf1099;
    @BindView(R.id.crf11)
    RadioGroup crf11;
    @BindView(R.id.crf1101)
    RadioButton crf1101;
    @BindView(R.id.crf1102)
    RadioButton crf1102;
    @BindView(R.id.crf1199)
    RadioButton crf1199;
    @BindView(R.id.crf12)
    RadioGroup crf12;
    @BindView(R.id.crf1201)
    RadioButton crf1201;
    @BindView(R.id.crf1202)
    RadioButton crf1202;
    @BindView(R.id.crf1299)
    RadioButton crf1299;
    @BindView(R.id.crf13)
    RadioGroup crf13;
    @BindView(R.id.crf1301)
    RadioButton crf1301;
    @BindView(R.id.crf1302)
    RadioButton crf1302;
    @BindView(R.id.crf1399)
    RadioButton crf1399;
    @BindView(R.id.crf14)
    RadioGroup crf14;
    @BindView(R.id.crf1401)
    RadioButton crf1401;
    @BindView(R.id.crf1402)
    RadioButton crf1402;
    @BindView(R.id.crf1499)
    RadioButton crf1499;
    @BindView(R.id.crf1501)
    EditText crf1501;
    @BindView(R.id.crf1502)
    EditText crf1502;
    @BindView(R.id.crf1503)
    CheckBox crf1503;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.fldGrpcrf01a)
    LinearLayout fldGrpcrf01a;
    @BindView(R.id.fldGrp06b)
    LinearLayout fldGrpcrf06b;
    @BindView(R.id.fldGrp06c)
    LinearLayout fldGrpcrf06c;
    @BindView(R.id.fldGrp06f)
    LinearLayout fldGrpcrf06f;
    @BindView(R.id.fldGrpcrf09)
    LinearLayout fldGrpcrf09;
    @BindView(R.id.crf02)
    RadioGroup crf02;
    @BindView(R.id.crf0200)
    RadioButton crf0200;
    @BindView(R.id.crf0201)
    RadioButton crf0201;
    @BindView(R.id.crf0202)
    RadioButton crf0202;
    @BindView(R.id.fldGrpcrf08)
    LinearLayout fldGrpcrf08;


    @BindViews({R.id.crf07a, R.id.crf07b, R.id.crf07c, R.id.crf07d, R.id.crf07e, R.id.crf07f, R.id.crf07g,
            R.id.crf07h, R.id.crf07i, R.id.crf07j, R.id.crf07k, R.id.crf07l, R.id.crf07m, R.id.crf07n, R.id.crf07o,
            R.id.crf07p, R.id.crf07q})
    List<RadioGroup> crf07;

    @BindViews({R.id.crf07a02, R.id.crf07b02, R.id.crf07c02, R.id.crf07d02, R.id.crf07e02, R.id.crf07f02, R.id.crf07g02,
            R.id.crf07h02, R.id.crf07i02, R.id.crf07j02, R.id.crf07k02, R.id.crf07l02, R.id.crf07m02, R.id.crf07n02, R.id.crf07o02,
            R.id.crf07p02, R.id.crf07q02})
    List<RadioButton> crf0702;

    @BindViews({R.id.crf07a99, R.id.crf07b99, R.id.crf07c99, R.id.crf07d99, R.id.crf07e99, R.id.crf07f99, R.id.crf07g99,
            R.id.crf07h99, R.id.crf07i99, R.id.crf07j99, R.id.crf07k99, R.id.crf07l99, R.id.crf07m99, R.id.crf07n99, R.id.crf07o99,
            R.id.crf07p99, R.id.crf07q99})
    List<RadioButton> crf0799;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

        crf1503.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crf1501.setVisibility(View.GONE);
                    crf1502.setVisibility(View.GONE);
                    crf1501.setText(null);
                    crf1502.setText(null);
                } else {
                    crf1501.setVisibility(View.VISIBLE);
                    crf1502.setVisibility(View.VISIBLE);
                }
            }
        });

        //================ Q1 Skip pattern ==============
        crf01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf0101.isChecked()) {
                    fldGrpcrf01a.setVisibility(View.GONE);
                    crf01a.clearCheck();
                } else {
                    fldGrpcrf01a.setVisibility(View.VISIBLE);
                }
            }
        });

        crf06b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf06b01.isChecked()) {
                    fldGrpcrf06b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06b.setVisibility(View.GONE);
                    crf06btime.setText(null);
                }
            }
        });

        crf06c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf06c01.isChecked()) {
                    fldGrpcrf06c.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06c.setVisibility(View.GONE);
                    crf06ctime.setText(null);
                }
            }
        });


        crf06f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf06f01.isChecked()) {
                    fldGrpcrf06f.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf06f.setVisibility(View.GONE);
                    crf06ftime.setText(null);
                }
            }
        });


        //=============== Q8 Skip Pattern===============

        /*crf08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crf0801.isChecked()) {
                    fldGrpcrf09.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrf09.setVisibility(View.GONE);
                    crf09num.setText(null);
                    crf0999.setChecked(false);
                }
            }
        });*/

        crf0999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crf09num.setVisibility(View.GONE);
                    crf09num.setText(null);
                } else {
                    crf09num.setVisibility(View.VISIBLE);
                }
            }
        });

        //================== Q7 Skip Pattern ===========
        for (RadioGroup rg : crf07) {
            rg.setOnCheckedChangeListener(this);
        }

        //========== Q2 Skip pattern=============

        crf0200.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crf02h.setVisibility(View.GONE);
                    crf02d.setVisibility(View.GONE);
                    crf02h.setText(null);
                    crf02d.setText(null);
                }
            }
        });


        crf0201.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crf02h.setVisibility(View.VISIBLE);
                    crf02d.setVisibility(View.GONE);
                    crf02d.setText(null);
                } else {
                    crf02h.setVisibility(View.GONE);
                    crf02h.setText(null);
                }
            }
        });


        crf0202.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crf02d.setVisibility(View.VISIBLE);
                    crf02h.setVisibility(View.GONE);
                    crf02h.setText(null);
                } else {
                    crf02d.setVisibility(View.GONE);
                    crf02d.setText(null);
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

                startActivity(new Intent(this, SectionGActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//        } else {
//            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//        }
//        }
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }


    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section F", Toast.LENGTH_SHORT).show();

        //======================= Q 1 ===============
        if (crf01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf01), Toast.LENGTH_SHORT).show();
            crf0199.setError("This data is Required!");
            Log.i(TAG, "crf01: This data is Required!");
            return false;
        } else {
            crf0199.setError(null);
        }
        //=======  Q1 Skip Check===========
        if (crf0102.isChecked() || crf0199.isChecked()) {
            //============ Q 1.1=============
            if (crf01a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf01a), Toast.LENGTH_SHORT).show();
                crf01a99.setError("This data is Required!");
                Log.i(TAG, "crf01a: This data is Required!");
                return false;
            } else {
                crf01a99.setError(null);
            }
        }
        //================ Q2 ==============
        if (crf02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf02), Toast.LENGTH_SHORT).show();
            crf0202.setError("This data is Required!");
            Log.i(TAG, "crf02: This data is Required!");
            return false;
        } else {
            crf0202.setError(null);
        }

        if (crf0201.isChecked()) {
            if (crf02h.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf0201), Toast.LENGTH_SHORT).show();
                crf02h.setError("This data is Required!");
                Log.i(TAG, "crf02h: This data is Required!");
                return false;
            } else {
                crf02h.setError(null);
            }

            if (Integer.valueOf(crf02h.getText().toString()) < 0
                    || Integer.valueOf(crf02h.getText().toString()) > 23) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crf0201), Toast.LENGTH_SHORT).show();
                crf02h.setError("Range is 0 to 23 Hours");
                Log.i(TAG, "crf02h: Range is 0 to 23 Hours");
                return false;
            } else {
                crf02h.setError(null);
            }

        }

        if (crf0202.isChecked()) {
            if (crf02d.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf0202), Toast.LENGTH_SHORT).show();
                crf02d.setError("This data is Required!");
                Log.i(TAG, "crf02d: This data is Required!");
                return false;
            } else {
                crf02d.setError(null);
            }

            if (Integer.valueOf(crf02d.getText().toString()) < 1
                    || Integer.valueOf(crf02d.getText().toString()) > 29) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crf0202), Toast.LENGTH_SHORT).show();
                crf02d.setError("Range is 1 to 29 Days");
                Log.i(TAG, "crf02d: Range is 1 to 29 Days");
                return false;
            } else {
                crf02d.setError(null);
            }
        }


        //=============== Q3==================
        if (crf03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf03), Toast.LENGTH_SHORT).show();
            crf0399.setError("This data is Required!");
            Log.i(TAG, "crf03a: This data is Required!");
            return false;
        } else {
            crf0399.setError(null);
        }


        //================= Q4================
        if (crf04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf04), Toast.LENGTH_SHORT).show();
            crf0499.setError("This data is Required!");
            Log.i(TAG, "crf04: This data is Required!");
            return false;
        } else {
            crf0499.setError(null);
        }
        //=============== Q5===============
        if (crf05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf05), Toast.LENGTH_SHORT).show();
            crf0599.setError("This data is Required!");
            Log.i(TAG, "crf05: This data is Required!");
            return false;
        } else {
            crf0599.setError(null);
        }

        //============ Q 6A ==========
        if (crf06a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06a), Toast.LENGTH_SHORT).show();
            crf06a99.setError("This data is Required!");
            Log.i(TAG, "crf06a: This data is Required!");
            return false;
        } else {
            crf06a99.setError(null);
        }

        //============ Q 6B ==========
        if (crf06b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06b), Toast.LENGTH_SHORT).show();
            crf06b99.setError("This data is Required!");
            Log.i(TAG, "crf06b: This data is Required!");
            return false;
        } else {
            crf06b99.setError(null);
        }

        if (crf06b01.isChecked()) {
            if (crf06btime.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06btime.setError("This data is Required!");
                Log.i(TAG, "crf06btime: This data is Required!");
                return false;
            } else {
                crf06btime.setError(null);
            }

            if (Integer.valueOf(crf06btime.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06btime.setError("Zero not allowed...");
                Log.i(TAG, "crf06btime: Zero not allowed..");
                return false;
            } else {
                crf06btime.setError(null);
            }

            if (Integer.valueOf(crf06btime.getText().toString()) < 1 || Integer.valueOf(crf06btime.getText().toString()) > 10) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06btime.setError("Range is 1 to 10 times...");
                Log.i(TAG, "crf06btime: Range is 1 to 10 times...");
                return false;
            } else {
                crf06btime.setError(null);
            }
        }

        //============ Q 6c ==========
        if (crf06c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06c), Toast.LENGTH_SHORT).show();
            crf06c99.setError("This data is Required!");
            Log.i(TAG, "crf06c: This data is Required!");
            return false;
        } else {
            crf06c99.setError(null);
        }

        if (crf06c01.isChecked()) {
            if (crf06ctime.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ctime.setError("This data is Required!");
                Log.i(TAG, "crf06ctime: This data is Required!");
                return false;
            } else {
                crf06ctime.setError(null);
            }

            if (Integer.valueOf(crf06ctime.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ctime.setError("Zero not allowed...");
                Log.i(TAG, "crf06ctime: Zero not allowed..");
                return false;
            } else {
                crf06ctime.setError(null);
            }

            if (Integer.valueOf(crf06ctime.getText().toString()) < 1 || Integer.valueOf(crf06ctime.getText().toString()) > 10) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ctime.setError("Range is 1 to 10 times...");
                Log.i(TAG, "crf06ctime: Range is 1 to 10 times...");
                return false;
            } else {
                crf06ctime.setError(null);
            }
        }

        //============ Q 6d ==========
        if (crf06d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06d), Toast.LENGTH_SHORT).show();
            crf06d99.setError("This data is Required!");
            Log.i(TAG, "crf06d: This data is Required!");
            return false;
        } else {
            crf06d99.setError(null);
        }

        //============ Q 6e ==========
        if (crf06e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06e), Toast.LENGTH_SHORT).show();
            crf06e99.setError("This data is Required!");
            Log.i(TAG, "crf06e: This data is Required!");
            return false;
        } else {
            crf06e99.setError(null);
        }


        //============ Q 6f ==========
        if (crf06f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06f), Toast.LENGTH_SHORT).show();
            crf06f99.setError("This data is Required!");
            Log.i(TAG, "crf06f: This data is Required!");
            return false;
        } else {
            crf06f99.setError(null);
        }

        if (crf06f01.isChecked()) {
            if (crf06ftime.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ftime.setError("This data is Required!");
                Log.i(TAG, "crf06ftime: This data is Required!");
                return false;
            } else {
                crf06ftime.setError(null);
            }

            if (Integer.valueOf(crf06ftime.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ftime.setError("Zero not allowed...");
                Log.i(TAG, "crf06ftime: Zero not allowed..");
                return false;
            } else {
                crf06ftime.setError(null);
            }

            if (Integer.valueOf(crf06ftime.getText().toString()) < 1 || Integer.valueOf(crf06ftime.getText().toString()) > 10) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                crf06ftime.setError("Range is 1 to 10 times...");
                Log.i(TAG, "crf06ftime: Range is 1 to 10 times...");
                return false;
            } else {
                crf06ftime.setError(null);
            }
        }
        //============ Q 6g ==========
        if (crf06g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06g), Toast.LENGTH_SHORT).show();
            crf06g99.setError("This data is Required!");
            Log.i(TAG, "crf06g: This data is Required!");
            return false;
        } else {
            crf06g99.setError(null);
        }

        //============ Q 6h ==========
        if (crf06h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06h), Toast.LENGTH_SHORT).show();
            crf06h99.setError("This data is Required!");
            Log.i(TAG, "crf06h: This data is Required!");
            return false;
        } else {
            crf06h99.setError(null);
        }

        //============ Q 6i ==========
        if (crf06i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf06i), Toast.LENGTH_SHORT).show();
            crf06i99.setError("This data is Required!");
            Log.i(TAG, "crf06i: This data is Required!");
            return false;
        } else {
            crf06i99.setError(null);
        }

        //============ Q 7a ==========
        if (crf07a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07a), Toast.LENGTH_SHORT).show();
            crf07a99.setError("This data is Required!");
            Log.i(TAG, "crf07a: This data is Required!");
            return false;
        } else {
            crf07a99.setError(null);
        }

        //============ Q 7b ==========
        if (crf07b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07b), Toast.LENGTH_SHORT).show();
            crf07b99.setError("This data is Required!");
            Log.i(TAG, "crf07b: This data is Required!");
            return false;
        } else {
            crf07b99.setError(null);
        }

        //============ Q 7c ==========
        if (crf07c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07c), Toast.LENGTH_SHORT).show();
            crf07c99.setError("This data is Required!");
            Log.i(TAG, "crf07c: This data is Required!");
            return false;
        } else {
            crf07c99.setError(null);
        }

        //============ Q 7d ==========
        if (crf07d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07d), Toast.LENGTH_SHORT).show();
            crf07d99.setError("This data is Required!");
            Log.i(TAG, "crf07d: This data is Required!");
            return false;
        } else {
            crf07d99.setError(null);
        }

        //============ Q 7e ==========
        if (crf07e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07e), Toast.LENGTH_SHORT).show();
            crf07e99.setError("This data is Required!");
            Log.i(TAG, "crf07e: This data is Required!");
            return false;
        } else {
            crf07e99.setError(null);
        }

        //============ Q 7f ==========
        if (crf07f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07f), Toast.LENGTH_SHORT).show();
            crf07f99.setError("This data is Required!");
            Log.i(TAG, "crf07f: This data is Required!");
            return false;
        } else {
            crf07f99.setError(null);
        }

        //============ Q 7g ==========
        if (crf07g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07g), Toast.LENGTH_SHORT).show();
            crf07g99.setError("This data is Required!");
            Log.i(TAG, "crf07g: This data is Required!");
            return false;
        } else {
            crf07g99.setError(null);
        }

        //============ Q 7h ==========
        if (crf07h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07h), Toast.LENGTH_SHORT).show();
            crf07h99.setError("This data is Required!");
            Log.i(TAG, "crf07h: This data is Required!");
            return false;
        } else {
            crf07h99.setError(null);
        }

        //============ Q 7i ==========
        if (crf07i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07i), Toast.LENGTH_SHORT).show();
            crf07i99.setError("This data is Required!");
            Log.i(TAG, "crf07i: This data is Required!");
            return false;
        } else {
            crf07i99.setError(null);
        }

        //============ Q 7j ==========
        if (crf07j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07j), Toast.LENGTH_SHORT).show();
            crf07j99.setError("This data is Required!");
            Log.i(TAG, "crf07j: This data is Required!");
            return false;
        } else {
            crf07j99.setError(null);
        }

        //============ Q 7k ==========
        if (crf07k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07k), Toast.LENGTH_SHORT).show();
            crf07k99.setError("This data is Required!");
            Log.i(TAG, "crf07k: This data is Required!");
            return false;
        } else {
            crf07k99.setError(null);
        }

        //============ Q 7l ==========
        if (crf07l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07l), Toast.LENGTH_SHORT).show();
            crf07l99.setError("This data is Required!");
            Log.i(TAG, "crf07l: This data is Required!");
            return false;
        } else {
            crf07l99.setError(null);
        }

        //============ Q 7m ==========
        if (crf07m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07m), Toast.LENGTH_SHORT).show();
            crf07m99.setError("This data is Required!");
            Log.i(TAG, "crf07m: This data is Required!");
            return false;
        } else {
            crf07m99.setError(null);
        }

        //============ Q 7n ==========
        if (crf07n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07n), Toast.LENGTH_SHORT).show();
            crf07n99.setError("This data is Required!");
            Log.i(TAG, "crf07n: This data is Required!");
            return false;
        } else {
            crf07n99.setError(null);
        }

        //============ Q 7o ==========
        if (crf07o.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07o), Toast.LENGTH_SHORT).show();
            crf07o99.setError("This data is Required!");
            Log.i(TAG, "crf07o: This data is Required!");
            return false;
        } else {
            crf07o99.setError(null);
        }

        //============ Q 7p ==========
        if (crf07p.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07p), Toast.LENGTH_SHORT).show();
            crf07p99.setError("This data is Required!");
            Log.i(TAG, "crf07p: This data is Required!");
            return false;
        } else {
            crf07p99.setError(null);
        }

        //============ Q 7q ==========
        if (crf07q.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf07q), Toast.LENGTH_SHORT).show();
            crf07q99.setError("This data is Required!");
            Log.i(TAG, "crf07q: This data is Required!");
            return false;
        } else {
            crf07q99.setError(null);
        }


        //================ Q 7-8 Skip check===========

        if (is07AllNo()) {
            //============ Q 8 ==========
            if (crf08.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf08), Toast.LENGTH_SHORT).show();
                crf0899.setError("This data is Required!");
                Log.i(TAG, "crf08: This data is Required!");
                return false;
            } else {
                crf0899.setError(null);
            }

            if (is07AllNo() && crf0801.isChecked()) {
                Toast.makeText(this, "ERROR: " + getString(R.string.crf07a) + "Atleast one should be Yes", Toast.LENGTH_SHORT).show();
                crf0801.setError("Atlease one should be yes Other wise Select no in " + getString(R.string.crf08));
                Log.i(TAG, "crf07: This data is Required!");
                return false;
            } else {
                crf0801.setError(null);
            }

            if (!is07AllNo() && crf0802.isChecked()) {
                Toast.makeText(this, "ERROR: " + getString(R.string.crf08) + "Can not be no", Toast.LENGTH_SHORT).show();
                crf0801.setError("Can not be no in " + getString(R.string.crf08));
                Log.i(TAG, "crf08: This data is Required!");
                return false;
            } else {
                crf0801.setError(null);
            }
        }


        if (!is07AllNo()) {
            //============ Q 9 ==========

//            if (crf0801.isChecked()) {
            if (crf09num.getText().toString().isEmpty() && !crf0999.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf09), Toast.LENGTH_SHORT).show();
                crf0999.setError("This data is Required!");
                Log.i(TAG, "crf09: This data is Required!");
                return false;
            } else {
                crf0999.setError(null);
            }

            if (!crf0999.isChecked()) {
                if (Integer.valueOf(crf09num.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf09), Toast.LENGTH_SHORT).show();
                    crf09num.setError("Can not be zero");
                    Log.i(TAG, "crf09num: Can not be zero");
                    return false;
                } else {
                    crf09num.setError(null);
                }

                if (Integer.valueOf(crf09num.getText().toString()) < 1 || Integer.valueOf(crf09num.getText().toString()) > 10) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.times), Toast.LENGTH_SHORT).show();
                    crf09num.setError("Range is 1 to 10 times...");
                    Log.i(TAG, "crf0609num: Range is 1 to 10 times...");
                    return false;
                } else {
                    crf09num.setError(null);
                }
            }
        }
//        }
        //============ Q 10 ==========
        if (crf10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf10), Toast.LENGTH_SHORT).show();
            crf1099.setError("This data is Required!");
            Log.i(TAG, "crf10: This data is Required!");
            return false;
        } else {
            crf1099.setError(null);
        }


        //============ Q 11 ==========
        if (crf11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf11), Toast.LENGTH_SHORT).show();
            crf1199.setError("This data is Required!");
            Log.i(TAG, "crf11: This data is Required!");
            return false;
        } else {
            crf1199.setError(null);
        }

        //============ Q 12 ==========
        if (crf12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf12), Toast.LENGTH_SHORT).show();
            crf1299.setError("This data is Required!");
            Log.i(TAG, "crf12: This data is Required!");
            return false;
        } else {
            crf1299.setError(null);
        }

        //============ Q 13 ==========
        if (crf13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf13), Toast.LENGTH_SHORT).show();
            crf1399.setError("This data is Required!");
            Log.i(TAG, "crf13: This data is Required!");
            return false;
        } else {
            crf1399.setError(null);
        }

        if (crf14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf14), Toast.LENGTH_SHORT).show();
            crf1499.setError("This data is Required!");
            Log.i(TAG, "crf14: This data is Required!");
            return false;
        } else {
            crf1499.setError(null);
        }
//============ Q 15 ==========
        if (!crf1503.isChecked()) {
            if ((crf1501.getText().toString().isEmpty() || crf1502.getText().toString().isEmpty())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crf15), Toast.LENGTH_SHORT).show();
                crf1503.setError("This data is Required!");
                Log.i(TAG, "crf15: This data is Required!");
                return false;
            } else {
                crf1503.setError(null);
            }


            if ((Integer.valueOf(crf1501.getText().toString()) < 1)
                    && Integer.valueOf(crf1502.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crf15), Toast.LENGTH_SHORT).show();
                crf1501.setError("Both Zero not allowed");
                Log.i(TAG, "crf15: Both Zero not allowed");
                return false;
            } else {
                crf1501.setError(null);
            }

            if (Integer.valueOf(crf1501.getText().toString()) > 11) {
                Toast.makeText(this, "ERROR(Range): " + getString(R.string.crf1501), Toast.LENGTH_SHORT).show();
                crf1501.setError("Range is 0 - 11 months");
                Log.i(TAG, "crf1501: Range is 0 - 11 months");
                return false;
            } else {
                crf1501.setError(null);
            }

            if ((Integer.valueOf(crf1502.getText().toString()) > 29)) {
                Toast.makeText(this, "ERROR(Range): " + getString(R.string.crf1502), Toast.LENGTH_SHORT).show();
                crf1502.setError("Range is 0 - 29 days");
                Log.i(TAG, "crf1502: Range is 0 - 29 days");
                return false;
            } else {
                crf1502.setError(null);
            }
        }

        return true;

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sf = new JSONObject();

        sf.put("crf01", crf0101.isChecked() ? "1" : crf0102.isChecked() ? "2" : crf0199.isChecked() ? "99" : "0");
        sf.put("crf01a", crf01a01.isChecked() ? "1" : crf01a02.isChecked() ? "2" : crf01a99.isChecked() ? "99" : "0");
        sf.put("crf02h", crf02h.getText().toString());
        sf.put("crf02d", crf02d.getText().toString());
        sf.put("crf02", crf0200.isChecked() ? "000" : crf0201.isChecked() ? "1" : crf0202.isChecked() ? "2" : "0");
        sf.put("crf03", crf0301.isChecked() ? "1" : crf0302.isChecked() ? "2" : crf0399.isChecked() ? "99" : "0");
        sf.put("crf04", crf0401.isChecked() ? "1" : crf0402.isChecked() ? "2" : crf0499.isChecked() ? "99" : "0");
        sf.put("crf05", crf0501.isChecked() ? "1" : crf0502.isChecked() ? "2" : crf0599.isChecked() ? "99" : "0");
        sf.put("crf06a", crf06a01.isChecked() ? "1" : crf06a02.isChecked() ? "2" : crf06a99.isChecked() ? "99" : "0");
        sf.put("crf06b", crf06b01.isChecked() ? "1" : crf06b02.isChecked() ? "2" : crf06b99.isChecked() ? "99" : "0");
        sf.put("crf06btime", crf06btime.getText().toString());
        sf.put("crf06c", crf06c01.isChecked() ? "1" : crf06c02.isChecked() ? "2" : crf06c99.isChecked() ? "99" : "0");
        sf.put("crf06ctime", crf06ctime.getText().toString());
        sf.put("crf06d", crf06d01.isChecked() ? "1" : crf06d02.isChecked() ? "2" : crf06d99.isChecked() ? "99" : "0");
        sf.put("crf06e", crf06e01.isChecked() ? "1" : crf06e02.isChecked() ? "2" : crf06e99.isChecked() ? "99" : "0");
        sf.put("crf06f", crf06f01.isChecked() ? "1" : crf06f02.isChecked() ? "2" : crf06f99.isChecked() ? "99" : "0");
        sf.put("crf06ftime", crf06ftime.getText().toString());
        sf.put("crf06g", crf06g01.isChecked() ? "1" : crf06g02.isChecked() ? "2" : crf06g99.isChecked() ? "99" : "0");
        sf.put("crf06h", crf06h01.isChecked() ? "1" : crf06h02.isChecked() ? "2" : crf06h99.isChecked() ? "99" : "0");
        sf.put("crf06f", crf06i01.isChecked() ? "1" : crf06i02.isChecked() ? "2" : crf06i99.isChecked() ? "99" : "0");
        sf.put("crf07a", crf07a01.isChecked() ? "1" : crf07a02.isChecked() ? "2" : crf07a99.isChecked() ? "99" : "0");
        sf.put("crf07b", crf07b01.isChecked() ? "1" : crf07b02.isChecked() ? "2" : crf07b99.isChecked() ? "99" : "0");
        sf.put("crf07c", crf07c01.isChecked() ? "1" : crf07c02.isChecked() ? "2" : crf07c99.isChecked() ? "99" : "0");
        sf.put("crf07d", crf07d01.isChecked() ? "1" : crf07d02.isChecked() ? "2" : crf07d99.isChecked() ? "99" : "0");
        sf.put("crf07e", crf07e01.isChecked() ? "1" : crf07e02.isChecked() ? "2" : crf07e99.isChecked() ? "99" : "0");
        sf.put("crf07f", crf07f01.isChecked() ? "1" : crf07f02.isChecked() ? "2" : crf07f99.isChecked() ? "99" : "0");
        sf.put("crf07g", crf07g01.isChecked() ? "1" : crf07g02.isChecked() ? "2" : crf07g99.isChecked() ? "99" : "0");
        sf.put("crf07h", crf07h01.isChecked() ? "1" : crf07h02.isChecked() ? "2" : crf07h99.isChecked() ? "99" : "0");
        sf.put("crf07i", crf07i01.isChecked() ? "1" : crf07i02.isChecked() ? "2" : crf07i99.isChecked() ? "99" : "0");
        sf.put("crf07j", crf07j01.isChecked() ? "1" : crf07j02.isChecked() ? "2" : crf07j99.isChecked() ? "99" : "0");
        sf.put("crf07k", crf07k01.isChecked() ? "1" : crf07k02.isChecked() ? "2" : crf07k99.isChecked() ? "99" : "0");
        sf.put("crf07l", crf07l01.isChecked() ? "1" : crf07l02.isChecked() ? "2" : crf07l99.isChecked() ? "99" : "0");
        sf.put("crf07m", crf07m01.isChecked() ? "1" : crf07m02.isChecked() ? "2" : crf07m99.isChecked() ? "99" : "0");
        sf.put("crf07n", crf07n01.isChecked() ? "1" : crf07n02.isChecked() ? "2" : crf07n99.isChecked() ? "99" : "0");
        sf.put("crf07o", crf07o01.isChecked() ? "1" : crf07o02.isChecked() ? "2" : crf07o99.isChecked() ? "99" : "0");
        sf.put("crf07p", crf07p01.isChecked() ? "1" : crf07p02.isChecked() ? "2" : crf07p99.isChecked() ? "99" : "0");
        sf.put("crf07q", crf07q01.isChecked() ? "1" : crf07q02.isChecked() ? "2" : crf07q99.isChecked() ? "99" : "0");
        sf.put("crf08", crf0801.isChecked() ? "1" : crf0802.isChecked() ? "2" : crf0899.isChecked() ? "99" : "0");
        sf.put("crf09num", crf09num.getText().toString());
        sf.put("crf0999", crf0999.isChecked() ? "99" : "0");
        sf.put("crf10", crf1001.isChecked() ? "1" : crf1002.isChecked() ? "2" : crf1099.isChecked() ? "99" : "0");
        sf.put("crf11", crf1101.isChecked() ? "1" : crf1102.isChecked() ? "2" : crf1199.isChecked() ? "99" : "0");
        sf.put("crf12", crf1201.isChecked() ? "1" : crf1202.isChecked() ? "2" : crf1299.isChecked() ? "99" : "0");
        sf.put("crf13", crf1301.isChecked() ? "1" : crf1302.isChecked() ? "2" : crf1399.isChecked() ? "99" : "0");
        sf.put("crf14", crf1401.isChecked() ? "1" : crf1402.isChecked() ? "2" : crf1499.isChecked() ? "99" : "0");
        sf.put("crf1501", crf1501.getText().toString());
        sf.put("crf1502", crf1502.getText().toString());
        sf.put("crf1503", crf1503.isChecked() ? "3" : "0");

        AppMain.fc.setsF(String.valueOf(sf));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        if (is07AllNo()) {
            // Show answer here
            fldGrpcrf08.setVisibility(View.VISIBLE);
            fldGrpcrf09.setVisibility(View.GONE);
            crf09num.setText(null);
            crf0999.setChecked(false);

        } else {
            fldGrpcrf08.setVisibility(View.GONE);
            fldGrpcrf09.setVisibility(View.VISIBLE);
            crf08.clearCheck();
        }
    }

    public boolean is07AllNo() {

        int i = 0;
        for (RadioButton rg : crf0702) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == crf0702.size();
    }

    public boolean is07Alldontknow() {

        int i = 0;
        for (RadioButton rg : crf0799) {
            if (rg.isChecked())
                i++;
        }
        // Show answer here
        return i == crf0799.size();
    }

}