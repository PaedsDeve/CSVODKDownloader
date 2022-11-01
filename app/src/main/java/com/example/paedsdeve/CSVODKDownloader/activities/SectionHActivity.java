package com.example.paedsdeve.CSVODKDownloader.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;
import com.example.paedsdeve.CSVODKDownloader.contracts.SourceNGOContract;

public class SectionHActivity extends Activity {

    private static final String TAG = SectionHActivity.class.getSimpleName();

    @BindView(R.id.activity_section_h)
    ScrollView activitySectionH;
    @BindView(R.id.crh01)
    RadioGroup crh01;
    @BindView(R.id.crh0101)
    RadioButton crh0101;
    @BindView(R.id.crh0102)
    RadioButton crh0102;
    @BindView(R.id.crh0103)
    RadioButton crh0103;
    @BindView(R.id.crh0196)
    RadioButton crh0196;
    @BindView(R.id.crh0196x)
    EditText crh0196x;
    @BindView(R.id.fldGrpcrh02)
    LinearLayout fldGrpcrh02;
    @BindView(R.id.crh02)
    RadioGroup crh02;
    @BindView(R.id.crh0201)
    RadioButton crh0201;
    @BindView(R.id.crh0202)
    RadioButton crh0202;
    @BindView(R.id.crh03)
    RadioGroup crh03;
    @BindView(R.id.crh0301)
    RadioButton crh0301;
    @BindView(R.id.crh0302)
    RadioButton crh0302;
    @BindView(R.id.crh0303)
    RadioButton crh0303;
    @BindView(R.id.crh0304)
    RadioButton crh0304;
    @BindView(R.id.crh0305)
    RadioButton crh0305;
    @BindView(R.id.crh04)
    RadioGroup crh04;
    @BindView(R.id.crh0401)
    RadioButton crh0401;
    @BindView(R.id.crh0402)
    RadioButton crh0402;
    @BindView(R.id.fldGrpcrh05)
    LinearLayout fldGrpcrh05;
    @BindView(R.id.crh05)
    RadioGroup crh05;
    @BindView(R.id.crh0501)
    RadioButton crh0501;
    @BindView(R.id.crh0502)
    RadioButton crh0502;
    @BindView(R.id.crh0503)
    RadioButton crh0503;
    @BindView(R.id.crh0504)
    RadioButton crh0504;
    @BindView(R.id.crh0505)
    RadioButton crh0505;
    @BindView(R.id.crh0601)
    CheckBox crh0601;
    @BindView(R.id.crh0602)
    CheckBox crh0602;
    @BindView(R.id.crh0603)
    CheckBox crh0603;
    @BindView(R.id.crh0604)
    CheckBox crh0604;
    @BindView(R.id.crh0605)
    CheckBox crh0605;
    @BindView(R.id.crh0606)
    CheckBox crh0606;
    @BindView(R.id.crh0607)
    CheckBox crh0607;
    @BindView(R.id.crh0608)
    CheckBox crh0608;
    @BindView(R.id.crh0609)
    CheckBox crh0609;
    @BindView(R.id.crh0696)
    CheckBox crh0696;
    @BindView(R.id.crh0696x)
    EditText crh0696x;
    @BindView(R.id.cri01a)
    EditText cri01a;
    @BindView(R.id.cri01b)
    EditText cri01b;
    @BindView(R.id.cri01c)
    EditText cri01c;
    @BindView(R.id.cri01d)
    EditText cri01d;
    @BindView(R.id.cri01e)
    EditText cri01e;
    @BindView(R.id.cri01f)
    EditText cri01f;
    @BindView(R.id.cri01g)
    EditText cri01g;
    @BindView(R.id.cri01h)
    EditText cri01h;
    @BindView(R.id.cri01i)
    EditText cri01i;
    @BindView(R.id.cri01j)
    EditText cri01j;
    @BindView(R.id.cri01k)
    EditText cri01k;
    @BindView(R.id.cri01l)
    EditText cri01l;
    @BindView(R.id.cri01m)
    EditText cri01m;
    @BindView(R.id.cri02a)
    EditText cri02a;
    @BindView(R.id.cri02b)
    EditText cri02b;
    @BindView(R.id.cri02c)
    EditText cri02c;
    @BindView(R.id.cri02d)
    EditText cri02d;
    @BindView(R.id.cri02e)
    EditText cri02e;
    @BindView(R.id.cri02f)
    EditText cri02f;
    @BindView(R.id.cri02g)
    EditText cri02g;
    @BindView(R.id.cri02h)
    EditText cri02h;
    @BindView(R.id.cri02i)
    EditText cri02i;
    @BindView(R.id.cri02j)
    EditText cri02j;
    @BindView(R.id.cri02k)
    EditText cri02k;
    @BindView(R.id.cri02l)
    EditText cri02l;
    @BindView(R.id.cri03)
    EditText cri03;
    @BindView(R.id.cri04)
    RadioGroup cri04;
    @BindView(R.id.cri0401)
    RadioButton cri0401;
    @BindView(R.id.cri0402)
    RadioButton cri0402;
    @BindView(R.id.cri0499)
    RadioButton cri0499;

    @BindView(R.id.crj01a)
    RadioGroup crj01a;

    @BindView(R.id.crj01a01)
    RadioButton crj01a01;

    @BindView(R.id.crj01a02)
    RadioButton crj01a02;

    @BindView(R.id.fldGrpcrj01a)
    LinearLayout fldGrpcrj01a;

    @BindView(R.id.crj01anum)
    EditText crj01anum;

    @BindView(R.id.crj01asrc)
    Spinner crj01asrc;

    @BindView(R.id.crj01b)
    RadioGroup crj01b;

    @BindView(R.id.crj01b01)
    RadioButton crj01b01;

    @BindView(R.id.crj01b02)
    RadioButton crj01b02;

    @BindView(R.id.fldGrpcrj01b)
    LinearLayout fldGrpcrj01b;

    @BindView(R.id.crj01bnum)
    EditText crj01bnum;

    @BindView(R.id.crj01bsrc)
    Spinner crj01bsrc;

    @BindView(R.id.crj01c)
    RadioGroup crj01c;

    @BindView(R.id.crj01c01)
    RadioButton crj01c01;

    @BindView(R.id.crj01c02)
    RadioButton crj01c02;

    @BindView(R.id.fldGrpcrj01c)
    LinearLayout fldGrpcrj01c;

    @BindView(R.id.crj01cnum)
    EditText crj01cnum;

    @BindView(R.id.crj01csrc)
    Spinner crj01csrc;

    @BindView(R.id.crj01d)
    RadioGroup crj01d;

    @BindView(R.id.crj01d01)
    RadioButton crj01d01;

    @BindView(R.id.crj01d02)
    RadioButton crj01d02;

    @BindView(R.id.fldGrpcrj01d)
    LinearLayout fldGrpcrj01d;

    @BindView(R.id.crj01dnum)
    EditText crj01dnum;

    @BindView(R.id.crj01dsrc)
    Spinner crj01dsrc;

    @BindView(R.id.crj01e)
    RadioGroup crj01e;

    @BindView(R.id.crj01e01)
    RadioButton crj01e01;

    @BindView(R.id.crj01e02)
    RadioButton crj01e02;

    @BindView(R.id.fldGrpcrj01e)
    LinearLayout fldGrpcrj01e;

    @BindView(R.id.crj01enum)
    EditText crj01enum;

    @BindView(R.id.crj01esrc)
    Spinner crj01esrc;

    @BindView(R.id.crj01f)
    RadioGroup crj01f;

    @BindView(R.id.crj01f01)
    RadioButton crj01f01;

    @BindView(R.id.crj01f02)
    RadioButton crj01f02;

    @BindView(R.id.fldGrpcrj01f)
    LinearLayout fldGrpcrj01f;

    @BindView(R.id.crj01fnum)
    EditText crj01fnum;

    @BindView(R.id.crj01fsrc)
    Spinner crj01fsrc;

    @BindView(R.id.crj01g)
    RadioGroup crj01g;

    @BindView(R.id.crj01g01)
    RadioButton crj01g01;

    @BindView(R.id.crj01g02)
    RadioButton crj01g02;

    @BindView(R.id.fldGrpcrj01g)
    LinearLayout fldGrpcrj01g;

    @BindView(R.id.crj01gnum)
    EditText crj01gnum;

    @BindView(R.id.crj01gsrc)
    Spinner crj01gsrc;

    @BindView(R.id.crj01h)
    RadioGroup crj01h;

    @BindView(R.id.crj01h01)
    RadioButton crj01h01;

    @BindView(R.id.crj01h02)
    RadioButton crj01h02;

    @BindView(R.id.fldGrpcrj01h)
    LinearLayout fldGrpcrj01h;

    @BindView(R.id.crj01hnum)
    EditText crj01hnum;

    @BindView(R.id.crj01hsrc)
    Spinner crj01hsrc;

    @BindView(R.id.crj01i)
    RadioGroup crj01i;

    @BindView(R.id.crj01i01)
    RadioButton crj01i01;

    @BindView(R.id.crj01i02)
    RadioButton crj01i02;

    @BindView(R.id.fldGrpcrj01i)
    LinearLayout fldGrpcrj01i;

    @BindView(R.id.crj01inum)
    EditText crj01inum;

    @BindView(R.id.crj01isrc)
    Spinner crj01isrc;

    @BindView(R.id.crj01j)
    RadioGroup crj01j;

    @BindView(R.id.crj01j01)
    RadioButton crj01j01;

    @BindView(R.id.crj01j02)
    RadioButton crj01j02;

    @BindView(R.id.fldGrpcrj01j)
    LinearLayout fldGrpcrj01j;

    @BindView(R.id.crj01jnum)
    EditText crj01jnum;

    @BindView(R.id.crj01jsrc)
    Spinner crj01jsrc;

    @BindView(R.id.crj01k)
    RadioGroup crj01k;

    @BindView(R.id.crj01k01)
    RadioButton crj01k01;

    @BindView(R.id.crj01k02)
    RadioButton crj01k02;

    @BindView(R.id.fldGrpcrj01k)
    LinearLayout fldGrpcrj01k;

    @BindView(R.id.crj01knum)
    EditText crj01knum;

    @BindView(R.id.crj01ksrc)
    Spinner crj01ksrc;

    @BindView(R.id.crj01l)
    RadioGroup crj01l;

    @BindView(R.id.crj01l01)
    RadioButton crj01l01;

    @BindView(R.id.crj01l02)
    RadioButton crj01l02;

    @BindView(R.id.fldGrpcrj01l)
    LinearLayout fldGrpcrj01l;

    @BindView(R.id.crj01lnum)
    EditText crj01lnum;

    @BindView(R.id.crj01lsrc)
    Spinner crj01lsrc;

    @BindView(R.id.crj01mx)
    EditText crj01mx;

    @BindView(R.id.crj01m)
    RadioGroup crj01m;

    @BindView(R.id.crj01m01)
    RadioButton crj01m01;

    @BindView(R.id.crj01m02)
    RadioButton crj01m02;

    @BindView(R.id.fldGrpcrj01m)
    LinearLayout fldGrpcrj01m;

    @BindView(R.id.crj01mnum)
    EditText crj01mnum;

    @BindView(R.id.crj01msrc)
    Spinner crj01msrc;

    @BindView(R.id.crj01nx)
    EditText crj01nx;

    @BindView(R.id.crj01n)
    RadioGroup crj01n;

    @BindView(R.id.crj01n01)
    RadioButton crj01n01;

    @BindView(R.id.crj01n02)
    RadioButton crj01n02;

    @BindView(R.id.fldGrpcrj01n)
    LinearLayout fldGrpcrj01n;

    @BindView(R.id.crj01nnum)
    EditText crj01nnum;

    @BindView(R.id.crj01nsrc)
    Spinner crj01nsrc;

    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;

    Map<String, String> getAllNGOs;
    List<String> NGOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_h);
        ButterKnife.bind(this);


//*********************************Section H***********************

        crh01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crh0101.isChecked()) {
                    fldGrpcrh02.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrh02.setVisibility(View.GONE);
                    crh02.clearCheck();
                    crh03.clearCheck();
                }
            }
        });


        crh0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crh0196x.setVisibility(View.VISIBLE);
                } else {
                    crh0196x.setVisibility(View.GONE);
                    crh0196x.setText(null);
                }
            }
        });

        crh04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crh0401.isChecked()) {
                    fldGrpcrh05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrh05.setVisibility(View.GONE);
                    crh05.clearCheck();
                }
            }
        });

        crh0696.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crh0696x.setVisibility(View.VISIBLE);
                } else {
                    crh0696x.setVisibility(View.GONE);
                    crh0696x.setText(null);
                }
            }
        });


//******************************************** Section J *******************************************
        crj01a01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01a.setVisibility(View.GONE);
                    crj01anum.setText(null);
                }
            }
        });

        crj01b01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01b.setVisibility(View.GONE);
                    crj01bnum.setText(null);
                }
            }
        });

        crj01c01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01c.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01c.setVisibility(View.GONE);
                    crj01cnum.setText(null);
                }
            }
        });

        crj01d01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01d.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01d.setVisibility(View.GONE);
                    crj01dnum.setText(null);
                }
            }
        });

        crj01e01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01e.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01e.setVisibility(View.GONE);
                    crj01enum.setText(null);
                }
            }
        });

        crj01f01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01f.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01f.setVisibility(View.GONE);
                    crj01fnum.setText(null);
                }
            }
        });

        crj01g01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01g.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01g.setVisibility(View.GONE);
                    crj01gnum.setText(null);
                }
            }
        });

        crj01h01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01h.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01h.setVisibility(View.GONE);
                    crj01hnum.setText(null);
                }
            }
        });

        crj01i01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01i.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01i.setVisibility(View.GONE);
                    crj01inum.setText(null);
                }
            }
        });

        crj01j01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01j.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01j.setVisibility(View.GONE);
                    crj01jnum.setText(null);
                }
            }
        });

        crj01k01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01k.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01k.setVisibility(View.GONE);
                    crj01knum.setText(null);
                }
            }
        });

        crj01l01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01l.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01l.setVisibility(View.GONE);
                    crj01lnum.setText(null);
                }
            }
        });

        crj01m01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01m.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01m.setVisibility(View.GONE);
                    crj01mnum.setText(null);
                    crj01mx.setText(null);
                }
            }
        });

        crj01n01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrj01n.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrj01n.setVisibility(View.GONE);
                    crj01nnum.setText(null);
                    crj01nx.setText(null);
                }
            }
        });

        DatabaseHelper db = new DatabaseHelper(this);
        Collection<SourceNGOContract> allNGOs = db.getAllNGOs();

        getAllNGOs = new HashMap<>();
        NGOs = new ArrayList<>();
        if (allNGOs.size() != 0) {

            NGOs.add("...");

            for (SourceNGOContract aNGO : allNGOs) {
                getAllNGOs.put(aNGO.getSourceName(), aNGO.getSourceId());
                NGOs.add(aNGO.getSourceName());
            }

//            String[] ngo = new String[]{"NGO 1", "NGOs 2", "NGO 3", "NGO 4", "NGO 5", "NGO 6", "NGO 7"};

            crj01asrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01bsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01csrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01dsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01esrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01fsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01gsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01hsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01isrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01jsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01ksrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01lsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01msrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
            crj01nsrc.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, NGOs));
        }
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

                startActivity(new Intent(this, SectionKActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    @OnClick(R.id.btnEnd)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        /*if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
*/
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
            /*} else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }*/
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sh = new JSONObject();
        JSONObject si = new JSONObject();
        JSONObject sj = new JSONObject();

        sh.put("crh01", crh0101.isChecked() ? "1" : crh0102.isChecked() ? "2" : crh0103.isChecked() ? "3"
                : crh0196.isChecked() ? "96" : "0");
        sh.put("crh0196x", crh0196x.getText().toString());
        sh.put("crh02", crh0201.isChecked() ? "1" : crh0202.isChecked() ? "2" : "0");
        sh.put("crh03", crh0301.isChecked() ? "1" : crh0302.isChecked() ? "2" : crh0303.isChecked() ? "3"
                : crh0304.isChecked() ? "4" : crh0305.isChecked() ? "5" : "0");
        sh.put("crh04", crh0401.isChecked() ? "1" : crh0402.isChecked() ? "2" : "0");
        sh.put("crh05", crh0501.isChecked() ? "1" : crh0502.isChecked() ? "2" : crh0503.isChecked() ? "3"
                : crh0504.isChecked() ? "4" : crh0505.isChecked() ? "5" : "0");
        sh.put("crh0601", crh0601.isChecked() ? "1" : "0");
        sh.put("crh0602", crh0602.isChecked() ? "1" : "0");
        sh.put("crh0603", crh0603.isChecked() ? "1" : "0");
        sh.put("crh0604", crh0604.isChecked() ? "1" : "0");
        sh.put("crh0605", crh0605.isChecked() ? "1" : "0");
        sh.put("crh0606", crh0606.isChecked() ? "1" : "0");
        sh.put("crh0607", crh0607.isChecked() ? "1" : "0");
        sh.put("crh0607", crh0607.isChecked() ? "1" : "0");
        sh.put("crh0608", crh0608.isChecked() ? "1" : "0");
        sh.put("crh0609", crh0609.isChecked() ? "1" : "0");
        sh.put("crh0696", crh0696.isChecked() ? "1" : "0");
        sh.put("crh0696x", crh0696x.getText().toString());

        si.put("cri01a", cri01a.getText().toString());
        si.put("cri01b", cri01b.getText().toString());
        si.put("cri01c", cri01c.getText().toString());
        si.put("cri01d", cri01d.getText().toString());
        si.put("cri01e", cri01e.getText().toString());
        si.put("cri01f", cri01f.getText().toString());
        si.put("cri01g", cri01g.getText().toString());
        si.put("cri01h", cri01h.getText().toString());
        si.put("cri01i", cri01i.getText().toString());
        si.put("cri01j", cri01j.getText().toString());
        si.put("cri01k", cri01k.getText().toString());
        si.put("cri01l", cri01l.getText().toString());
        si.put("cri01m", cri01m.getText().toString());
        si.put("cri02a", cri02a.getText().toString());
        si.put("cri02b", cri02b.getText().toString());
        si.put("cri02c", cri02c.getText().toString());
        si.put("cri02d", cri02d.getText().toString());
        si.put("cri02e", cri02e.getText().toString());
        si.put("cri02f", cri02f.getText().toString());
        si.put("cri02g", cri02g.getText().toString());
        si.put("cri02g", cri02h.getText().toString());
        si.put("cri02i", cri02i.getText().toString());
        si.put("cri02j", cri02j.getText().toString());
        si.put("cri02k", cri02k.getText().toString());
        si.put("cri02l", cri02l.getText().toString());
        si.put("cri03", cri03.getText().toString());
        si.put("cri04", cri0401.isChecked() ? "1" : cri0402.isChecked() ? "2" : cri0499.isChecked() ? "99" : "0");

        sj.put("crj01a", crj01a01.isChecked() ? "1" : crj01a02.isChecked() ? "2" : "0");
        sj.put("crj01anum", crj01anum.getText().toString());
        sj.put("crj01asrc", getAllNGOs.get(crj01asrc.getSelectedItem().toString()));
        sj.put("crj01b", crj01b01.isChecked() ? "1" : crj01b02.isChecked() ? "2" : "0");
        sj.put("crj01bnum", crj01bnum.getText().toString());
        sj.put("crj01bsrc", getAllNGOs.get(crj01bsrc.getSelectedItem().toString()));
        sj.put("crj01c", crj01c01.isChecked() ? "1" : crj01c02.isChecked() ? "2" : "0");
        sj.put("crj01cnum", crj01cnum.getText().toString());
        sj.put("crj01csrc", getAllNGOs.get(crj01csrc.getSelectedItem().toString()));
        sj.put("crj01d", crj01d01.isChecked() ? "1" : crj01d02.isChecked() ? "2" : "0");
        sj.put("crj01dnum", crj01dnum.getText().toString());
        sj.put("crj01dsrc", getAllNGOs.get(crj01dsrc.getSelectedItem().toString()));
        sj.put("crj01e", crj01e01.isChecked() ? "1" : crj01e02.isChecked() ? "2" : "0");
        sj.put("crj01enum", crj01enum.getText().toString());
        sj.put("crj01esrc", getAllNGOs.get(crj01esrc.getSelectedItem().toString()));
        sj.put("crj01f", crj01f01.isChecked() ? "1" : crj01f02.isChecked() ? "2" : "0");
        sj.put("crj01fnum", crj01fnum.getText().toString());
        sj.put("crj01fsrc", getAllNGOs.get(crj01fsrc.getSelectedItem().toString()));
        sj.put("crj01g", crj01g01.isChecked() ? "1" : crj01g02.isChecked() ? "2" : "0");
        sj.put("crj01gnum", crj01gnum.getText().toString());
        sj.put("crj01gsrc", getAllNGOs.get(crj01gsrc.getSelectedItem().toString()));
        sj.put("crj01h", crj01h01.isChecked() ? "1" : crj01h02.isChecked() ? "2" : "0");
        sj.put("crj01hnum", crj01hnum.getText().toString());
        sj.put("crj01hsrc", getAllNGOs.get(crj01hsrc.getSelectedItem().toString()));
        sj.put("crj01i", crj01i01.isChecked() ? "1" : crj01i02.isChecked() ? "2" : "0");
        sj.put("crj01inum", crj01inum.getText().toString());
        sj.put("crj01isrc", getAllNGOs.get(crj01isrc.getSelectedItem().toString()));
        sj.put("crj01j", crj01j01.isChecked() ? "1" : crj01j02.isChecked() ? "2" : "0");
        sj.put("crj01jnum", crj01jnum.getText().toString());
        sj.put("crj01jsrc", getAllNGOs.get(crj01jsrc.getSelectedItem().toString()));
        sj.put("crj01k", crj01k01.isChecked() ? "1" : crj01k02.isChecked() ? "2" : "0");
        sj.put("crj01knum", crj01knum.getText().toString());
        sj.put("crj01ksrc", getAllNGOs.get(crj01ksrc.getSelectedItem().toString()));
        sj.put("crj01l", crj01l01.isChecked() ? "1" : crj01l02.isChecked() ? "2" : "0");
        sj.put("crj01lnum", crj01lnum.getText().toString());
        sj.put("crj01lsrc", getAllNGOs.get(crj01lsrc.getSelectedItem().toString()));
        sj.put("crj01m", crj01m01.isChecked() ? "1" : crj01m02.isChecked() ? "2" : "0");
        sj.put("crj01mx", crj01mx.getText().toString());
        sj.put("crj01mnum", crj01mnum.getText().toString());
        sj.put("crj01msrc", getAllNGOs.get(crj01msrc.getSelectedItem().toString()));
        sj.put("crj01n", crj01n01.isChecked() ? "1" : crj01n02.isChecked() ? "2" : "0");
        sj.put("crj01nx", crj01nx.getText().toString());
        sj.put("crj01nnum", crj01nnum.getText().toString());
        sj.put("crj01nsrc", getAllNGOs.get(crj01nsrc.getSelectedItem().toString()));


        AppMain.fc.setsH(String.valueOf(sh));
        AppMain.fc.setsI(String.valueOf(si));
        AppMain.fc.setsJ(String.valueOf(sj));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section H", Toast.LENGTH_SHORT).show();

//*************************************Section H******************
        //======================= Q 1 ===============
        if (crh01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh01), Toast.LENGTH_SHORT).show();
            crh0196.setError("This data is Required!");
            Log.i(TAG, "crh01: This data is Required!");
            return false;
        } else {
            crh0196.setError(null);
        }

        //====================== Q1 Others ================
        if (crh0196.isChecked() && crh0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crh0196x.setError("This data is Required!");
            Log.i(TAG, "crh0196x: This data is Required!");
            return false;
        } else {
            crh0196x.setError(null);
        }

        if (crh0101.isChecked()) {
            //====================== Q2 ================
            if (crh02.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh02), Toast.LENGTH_SHORT).show();
                crh0202.setError("This data is Required!");
                Log.i(TAG, "crh02: This data is Required!");
                return false;
            } else {
                crh0202.setError(null);
            }

            //====================== Q3 ================
            if (crh03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh03), Toast.LENGTH_SHORT).show();
                crh0305.setError("This data is Required!");
                Log.i(TAG, "crh03: This data is Required!");
                return false;
            } else {
                crh0305.setError(null);
            }

        }

        //====================== Q4 ================
        if (crh04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh04), Toast.LENGTH_SHORT).show();
            crh0402.setError("This data is Required!");
            Log.i(TAG, "crh04: This data is Required!");
            return false;
        } else {
            crh0402.setError(null);
        }

        if (crh0401.isChecked()) {
            //====================== Q5 ================
            if (crh05.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh05), Toast.LENGTH_SHORT).show();
                crh0505.setError("This data is Required!");
                Log.i(TAG, "crh05: This data is Required!");
                return false;
            } else {
                crh0505.setError(null);
            }
        }

        //====================== Q6 ================
        if (!(crh0601.isChecked() || crh0602.isChecked() || crh0603.isChecked() || crh0604.isChecked()
                || crh0605.isChecked() || crh0606.isChecked() || crh0607.isChecked() || crh0607.isChecked()
                || crh0608.isChecked() || crh0609.isChecked() || crh0696.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh06), Toast.LENGTH_SHORT).show();
            crh0696.setError("This data is Required!");
            Log.i(TAG, "crh06: This data is Required!");
            return false;
        } else {
            crh0696.setError(null);
        }

        //====================== Q6 Others ================
        if (crh0696.isChecked() && crh0696x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crh06) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crh0696x.setError("This data is Required!");
            Log.i(TAG, "crh0696x: This data is Required!");
            return false;
        } else {
            crh0696x.setError(null);
        }

//**************************************** Section I ************************************

        // =================== Q 1.1 ===============
        if (cri01a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01a), Toast.LENGTH_SHORT).show();
            cri01a.setError("This data is Required!");
            Log.i(TAG, "cri01a: This data is Required!");
            return false;
        } else {
            cri01a.setError(null);
        }

        // =================== Q 1.2 ===============
        if (cri01b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01b), Toast.LENGTH_SHORT).show();
            cri01b.setError("This data is Required!");
            Log.i(TAG, "cri01b: This data is Required!");
            return false;
        } else {
            cri01b.setError(null);
        }

        // =================== Q 1.3 ===============
        if (cri01c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01c), Toast.LENGTH_SHORT).show();
            cri01c.setError("This data is Required!");
            Log.i(TAG, "cri01c: This data is Required!");
            return false;
        } else {
            cri01c.setError(null);
        }

        // =================== Q 1.4 ===============
        if (cri01d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01d), Toast.LENGTH_SHORT).show();
            cri01d.setError("This data is Required!");
            Log.i(TAG, "cri01d: This data is Required!");
            return false;
        } else {
            cri01d.setError(null);
        }

        // =================== Q 1.5 ===============
        if (cri01e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01e), Toast.LENGTH_SHORT).show();
            cri01e.setError("This data is Required!");
            Log.i(TAG, "cri01e: This data is Required!");
            return false;
        } else {
            cri01e.setError(null);
        }

        // =================== Q 1.6 ===============
        if (cri01f.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01f), Toast.LENGTH_SHORT).show();
            cri01f.setError("This data is Required!");
            Log.i(TAG, "cri01f: This data is Required!");
            return false;
        } else {
            cri01f.setError(null);
        }

        // =================== Q 1.7 ===============
        if (cri01g.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01g), Toast.LENGTH_SHORT).show();
            cri01g.setError("This data is Required!");
            Log.i(TAG, "cri01g: This data is Required!");
            return false;
        } else {
            cri01g.setError(null);
        }

        // =================== Q 1.8 ===============
        if (cri01h.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01h), Toast.LENGTH_SHORT).show();
            cri01h.setError("This data is Required!");
            Log.i(TAG, "cri01h: This data is Required!");
            return false;
        } else {
            cri01h.setError(null);
        }

        // =================== Q 1.9 ===============
        if (cri01i.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01i), Toast.LENGTH_SHORT).show();
            cri01i.setError("This data is Required!");
            Log.i(TAG, "cri01i: This data is Required!");
            return false;
        } else {
            cri01i.setError(null);
        }

        // =================== Q 1.10 ===============
        if (cri01j.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01j), Toast.LENGTH_SHORT).show();
            cri01j.setError("This data is Required!");
            Log.i(TAG, "cri01j: This data is Required!");
            return false;
        } else {
            cri01j.setError(null);
        }

        // =================== Q 1.11 ===============
        if (cri01k.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01k), Toast.LENGTH_SHORT).show();
            cri01k.setError("This data is Required!");
            Log.i(TAG, "cri01k: This data is Required!");
            return false;
        } else {
            cri01k.setError(null);
        }

        // =================== Q 1.12 ===============
        if (cri01l.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01l), Toast.LENGTH_SHORT).show();
            cri01l.setError("This data is Required!");
            Log.i(TAG, "cri01l: This data is Required!");
            return false;
        } else {
            cri01l.setError(null);
        }

        // =================== Q 1.13 ===============
        if (cri01m.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri01m), Toast.LENGTH_SHORT).show();
            cri01m.setError("This data is Required!");
            Log.i(TAG, "cri01m: This data is Required!");
            return false;
        } else {
            cri01m.setError(null);
        }

        // =================== Q 2.1 ===============
        if (cri02a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02a), Toast.LENGTH_SHORT).show();
            cri02a.setError("This data is Required!");
            Log.i(TAG, "cri02a: This data is Required!");
            return false;
        } else {
            cri02a.setError(null);
        }

        // =================== Q 2.2 ===============
        if (cri02b.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02b), Toast.LENGTH_SHORT).show();
            cri02b.setError("This data is Required!");
            Log.i(TAG, "cri02b: This data is Required!");
            return false;
        } else {
            cri02b.setError(null);
        }

        // =================== Q 2.3 ===============
        if (cri02c.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02c), Toast.LENGTH_SHORT).show();
            cri02c.setError("This data is Required!");
            Log.i(TAG, "cri02c: This data is Required!");
            return false;
        } else {
            cri02c.setError(null);
        }

        // =================== Q 2.4 ===============
        if (cri02d.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02d), Toast.LENGTH_SHORT).show();
            cri02d.setError("This data is Required!");
            Log.i(TAG, "cri02d: This data is Required!");
            return false;
        } else {
            cri02d.setError(null);
        }

        // =================== Q 2.5 ===============
        if (cri02e.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02e), Toast.LENGTH_SHORT).show();
            cri02e.setError("This data is Required!");
            Log.i(TAG, "cri02e: This data is Required!");
            return false;
        } else {
            cri02e.setError(null);
        }

        // =================== Q 2.6 ===============
        if (cri02f.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02f), Toast.LENGTH_SHORT).show();
            cri02f.setError("This data is Required!");
            Log.i(TAG, "cri02f: This data is Required!");
            return false;
        } else {
            cri02f.setError(null);
        }

        // =================== Q 2.7 ===============
        if (cri02g.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02g), Toast.LENGTH_SHORT).show();
            cri02g.setError("This data is Required!");
            Log.i(TAG, "cri02g: This data is Required!");
            return false;
        } else {
            cri02g.setError(null);
        }

        // =================== Q 2.8 ===============
        if (cri02h.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02h), Toast.LENGTH_SHORT).show();
            cri02h.setError("This data is Required!");
            Log.i(TAG, "cri02h: This data is Required!");
            return false;
        } else {
            cri02h.setError(null);
        }

        // =================== Q 2.9 ===============
        if (cri02i.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02i), Toast.LENGTH_SHORT).show();
            cri02i.setError("This data is Required!");
            Log.i(TAG, "cri02i: This data is Required!");
            return false;
        } else {
            cri02i.setError(null);
        }

        // =================== Q 2.10 ===============
        if (cri02j.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02j), Toast.LENGTH_SHORT).show();
            cri02j.setError("This data is Required!");
            Log.i(TAG, "cri02j: This data is Required!");
            return false;
        } else {
            cri02j.setError(null);
        }

        // =================== Q 2.11 ===============
        if (cri02k.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02k), Toast.LENGTH_SHORT).show();
            cri02k.setError("This data is Required!");
            Log.i(TAG, "cri02k: This data is Required!");
            return false;
        } else {
            cri02k.setError(null);
        }

        // =================== Q 2.12 ===============
        if (cri02l.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri02l), Toast.LENGTH_SHORT).show();
            cri02l.setError("This data is Required!");
            Log.i(TAG, "cri02l: This data is Required!");
            return false;
        } else {
            cri02l.setError(null);
        }

        // =================== Q 3 ===============
        if (cri03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri03), Toast.LENGTH_SHORT).show();
            cri03.setError("This data is Required!");
            Log.i(TAG, "cri03: This data is Required!");
            return false;
        } else {
            cri03.setError(null);
        }

        // =================== Q 4 ===============
        if (cri04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.cri04), Toast.LENGTH_SHORT).show();
            cri0499.setError("This data is Required!");
            Log.i(TAG, "cri04: This data is Required!");
            return false;
        } else {
            cri0499.setError(null);
        }

//********************************************* Section J ***********************
        //================== 1.1===================
        if (crj01a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01a), Toast.LENGTH_SHORT).show();
            crj01a02.setError("This data is Required!");
            Log.i(TAG, "crj01a: This data is Required!");
            return false;
        } else {
            crj01a02.setError(null);
        }
        if (crj01a01.isChecked()) {
            if (crj01anum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01anum.setError("This data is Required!");
                Log.i(TAG, "crj01anum: This data is Required!");
                return false;
            } else {
                crj01anum.setError(null);
            }

            if (crj01asrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01asrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01asrc.getSelectedView()).setError(null);
            }

        }

        //================== 1.2===================
        if (crj01b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01b), Toast.LENGTH_SHORT).show();
            crj01b02.setError("This data is Required!");
            Log.i(TAG, "crj01b: This data is Required!");
            return false;
        } else {
            crj01b02.setError(null);
        }
        if (crj01b01.isChecked()) {
            if (crj01bnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01bnum.setError("This data is Required!");
                Log.i(TAG, "crj01bnum: This data is Required!");
                return false;
            } else {
                crj01bnum.setError(null);
            }
            if (crj01bsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01bsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01bsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.3===================
        if (crj01c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01c), Toast.LENGTH_SHORT).show();
            crj01c02.setError("This data is Required!");
            Log.i(TAG, "crj01c: This data is Required!");
            return false;
        } else {
            crj01c02.setError(null);
        }
        if (crj01c01.isChecked()) {
            if (crj01cnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01cnum.setError("This data is Required!");
                Log.i(TAG, "crj01cnum: This data is Required!");
                return false;
            } else {
                crj01cnum.setError(null);
            }
            if (crj01csrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01csrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01csrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.4===================
        if (crj01d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01d), Toast.LENGTH_SHORT).show();
            crj01d02.setError("This data is Required!");
            Log.i(TAG, "crj01d: This data is Required!");
            return false;
        } else {
            crj01d02.setError(null);
        }
        if (crj01d01.isChecked()) {
            if (crj01dnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01dnum.setError("This data is Required!");
                Log.i(TAG, "crj01dnum: This data is Required!");
                return false;
            } else {
                crj01dnum.setError(null);
            }
            if (crj01dsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01dsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01dsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.5===================
        if (crj01e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01e), Toast.LENGTH_SHORT).show();
            crj01e02.setError("This data is Required!");
            Log.i(TAG, "crj01e: This data is Required!");
            return false;
        } else {
            crj01e02.setError(null);
        }
        if (crj01e01.isChecked()) {
            if (crj01enum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01enum.setError("This data is Required!");
                Log.i(TAG, "crj01enum: This data is Required!");
                return false;
            } else {
                crj01enum.setError(null);
            }
            if (crj01esrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01esrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01esrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.6===================
        if (crj01f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01f), Toast.LENGTH_SHORT).show();
            crj01f02.setError("This data is Required!");
            Log.i(TAG, "crj01f: This data is Required!");
            return false;
        } else {
            crj01f02.setError(null);
        }
        if (crj01f01.isChecked()) {
            if (crj01fnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01fnum.setError("This data is Required!");
                Log.i(TAG, "crj01fnum: This data is Required!");
                return false;
            } else {
                crj01fnum.setError(null);
            }
            if (crj01fsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01fsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01fsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.7===================
        if (crj01g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01g), Toast.LENGTH_SHORT).show();
            crj01g02.setError("This data is Required!");
            Log.i(TAG, "crj01g: This data is Required!");
            return false;
        } else {
            crj01g02.setError(null);
        }
        if (crj01g01.isChecked()) {
            if (crj01gnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01gnum.setError("This data is Required!");
                Log.i(TAG, "crj01gnum: This data is Required!");
                return false;
            } else {
                crj01gnum.setError(null);
            }
            if (crj01gsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01gsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01gsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.8===================
        if (crj01h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01h), Toast.LENGTH_SHORT).show();
            crj01h02.setError("This data is Required!");
            Log.i(TAG, "crj01h: This data is Required!");
            return false;
        } else {
            crj01h02.setError(null);
        }
        if (crj01h01.isChecked()) {
            if (crj01hnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01hnum.setError("This data is Required!");
                Log.i(TAG, "crj01hnum: This data is Required!");
                return false;
            } else {
                crj01hnum.setError(null);
            }
            if (crj01hsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01hsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01hsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.9===================
        if (crj01i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01i), Toast.LENGTH_SHORT).show();
            crj01i02.setError("This data is Required!");
            Log.i(TAG, "crj01i: This data is Required!");
            return false;
        } else {
            crj01i02.setError(null);
        }
        if (crj01i01.isChecked()) {
            if (crj01inum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01inum.setError("This data is Required!");
                Log.i(TAG, "crj01inum: This data is Required!");
                return false;
            } else {
                crj01inum.setError(null);
            }
            if (crj01isrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01isrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01isrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.10 ===================
        if (crj01j.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01j), Toast.LENGTH_SHORT).show();
            crj01j02.setError("This data is Required!");
            Log.i(TAG, "crj01j: This data is Required!");
            return false;
        } else {
            crj01j02.setError(null);
        }
        if (crj01j01.isChecked()) {
            if (crj01jnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01jnum.setError("This data is Required!");
                Log.i(TAG, "crj01jnum: This data is Required!");
                return false;
            } else {
                crj01jnum.setError(null);
            }
            if (crj01jsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01jsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01jsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.11 ===================
        if (crj01k.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01k), Toast.LENGTH_SHORT).show();
            crj01k02.setError("This data is Required!");
            Log.i(TAG, "crj01k: This data is Required!");
            return false;
        } else {
            crj01k02.setError(null);
        }
        if (crj01k01.isChecked()) {
            if (crj01knum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01knum.setError("This data is Required!");
                Log.i(TAG, "crj01knum: This data is Required!");
                return false;
            } else {
                crj01knum.setError(null);
            }
            if (crj01ksrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01ksrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01ksrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.12 ===================
        if (crj01l.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01l), Toast.LENGTH_SHORT).show();
            crj01l02.setError("This data is Required!");
            Log.i(TAG, "crj01l: This data is Required!");
            return false;
        } else {
            crj01l02.setError(null);
        }
        if (crj01l01.isChecked()) {
            if (crj01lnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01lnum.setError("This data is Required!");
                Log.i(TAG, "crj01lnum: This data is Required!");
                return false;
            } else {
                crj01lnum.setError(null);
            }
            if (crj01lsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01lsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01lsrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.13 ===================
        if (crj01m.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crj01m02.setError("This data is Required!");
            Log.i(TAG, "crj01m: This data is Required!");
            return false;
        } else {
            crj01m02.setError(null);
        }
        if (crj01m01.isChecked()) {
            if (crj01mx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                crj01mx.setError("This data is Required!");
                Log.i(TAG, "crj01mx: This data is Required!");
                return false;
            } else {
                crj01mx.setError(null);
            }
            if (crj01mnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01mnum.setError("This data is Required!");
                Log.i(TAG, "crj01mnum: This data is Required!");
                return false;
            } else {
                crj01mnum.setError(null);
            }
            if (crj01msrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01msrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01msrc.getSelectedView()).setError(null);
            }
        }

        //================== 1.14 ===================
        if (crj01n.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            crj01n02.setError("This data is Required!");
            Log.i(TAG, "crj01n: This data is Required!");
            return false;
        } else {
            crj01n02.setError(null);
        }
        if (crj01n01.isChecked()) {
            if (crj01nx.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crj01) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                crj01nx.setError("This data is Required!");
                Log.i(TAG, "crj01nx: This data is Required!");
                return false;
            } else {
                crj01nx.setError(null);
            }
            if (crj01nnum.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bnf), Toast.LENGTH_SHORT).show();
                crj01nnum.setError("This data is Required!");
                Log.i(TAG, "crj01mnum: This data is Required!");
                return false;
            } else {
                crj01nnum.setError(null);
            }
            if (crj01nsrc.getSelectedItem() == "...") {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.cruc), Toast.LENGTH_SHORT).show();
                ((TextView) crj01nsrc.getSelectedView()).setError("This Data is Required");

                Log.i(TAG, "cra01: This Data is Required!");
                return false;
            } else {
                ((TextView) crj01nsrc.getSelectedView()).setError(null);
            }
        }


        return true;

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount;
//        updcount = db.updateSH();
//        updcount = db.updateSI();
//        updcount = db.updateSJ();
        int updcount = db.updateSH() == 1 ?
                (db.updateSI() == 1 ? (db.updateSJ() == 1 ? 1 : db.updateSJ()) : db.updateSI()) : db.updateSH();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}
