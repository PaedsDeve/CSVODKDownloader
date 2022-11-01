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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;

public class SectionGActivity extends Activity {

    private static final String TAG = SectionGActivity.class.getSimpleName();

    @BindView(R.id.activity_section_g)
    ScrollView activitySectionG;
    @BindView(R.id.crg01)
    RadioGroup crg01;
    @BindView(R.id.crg0101)
    RadioButton crg0101;
    @BindView(R.id.crg0102)
    RadioButton crg0102;
    @BindView(R.id.crg0103)
    RadioButton crg0103;
    @BindView(R.id.crg0104)
    RadioButton crg0104;
    @BindView(R.id.crg0105)
    RadioButton crg0105;
    @BindView(R.id.crg0106)
    RadioButton crg0106;
    @BindView(R.id.crg0196)
    RadioButton crg0196;
    @BindView(R.id.crg0196x)
    EditText crg0196x;
    @BindView(R.id.crg02)
    RadioGroup crg02;
    @BindView(R.id.crg0201)
    RadioButton crg0201;
    @BindView(R.id.crg0202)
    RadioButton crg0202;
    @BindView(R.id.crg0203)
    RadioButton crg0203;
    @BindView(R.id.crg0204)
    RadioButton crg0204;
    @BindView(R.id.crg0205)
    RadioButton crg0205;
    @BindView(R.id.crg0206)
    RadioButton crg0206;
    @BindView(R.id.crg0207)
    RadioButton crg0207;
    @BindView(R.id.crg0208)
    RadioButton crg0208;
    @BindView(R.id.crg0209)
    RadioButton crg0209;
    @BindView(R.id.crg0210)
    RadioButton crg0210;
    @BindView(R.id.crg0211)
    RadioButton crg0211;
    @BindView(R.id.crg0212)
    RadioButton crg0212;
    @BindView(R.id.crg0213)
    RadioButton crg0213;
    @BindView(R.id.crg0214)
    RadioButton crg0214;
    @BindView(R.id.crg0215)
    RadioButton crg0215;
    @BindView(R.id.crg0296)
    RadioButton crg0296;
    @BindView(R.id.crg0296x)
    EditText crg0296x;
    @BindView(R.id.crg03)
    RadioGroup crg03;
    @BindView(R.id.crg0301)
    RadioButton crg0301;
    @BindView(R.id.crg0302)
    RadioButton crg0302;
    @BindView(R.id.crg04)
    RadioGroup crg04;
    @BindView(R.id.crg0401)
    RadioButton crg0401;
    @BindView(R.id.crg0402)
    RadioButton crg0402;
    @BindView(R.id.crg0403)
    RadioButton crg0403;
    @BindView(R.id.crg0404)
    RadioButton crg0404;
    @BindView(R.id.crg0405)
    RadioButton crg0405;
    @BindView(R.id.crg0406)
    RadioButton crg0406;
    @BindView(R.id.crg0496)
    RadioButton crg0496;
    @BindView(R.id.crg0496x)
    EditText crg0496x;
    @BindView(R.id.crg05)
    RadioGroup crg05;
    @BindView(R.id.crg0501)
    RadioButton crg0501;
    @BindView(R.id.crg0502)
    RadioButton crg0502;
    @BindView(R.id.crg0503)
    RadioButton crg0503;
    @BindView(R.id.crg0504)
    RadioButton crg0504;
    @BindView(R.id.crg0505)
    RadioButton crg0505;
    @BindView(R.id.crg0506)
    RadioButton crg0506;
    @BindView(R.id.crg0507)
    RadioButton crg0507;
    @BindView(R.id.crg0508)
    RadioButton crg0508;
    @BindView(R.id.crg0509)
    RadioButton crg0509;
    @BindView(R.id.crg0596)
    RadioButton crg0596;
    @BindView(R.id.crg0596x)
    EditText crg0596x;
    @BindView(R.id.crg06)
    RadioGroup crg06;
    @BindView(R.id.crg0601)
    RadioButton crg0601;
    @BindView(R.id.crg0602)
    RadioButton crg0602;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.crg07)
    EditText crg07;
    @BindView(R.id.crg0801)
    RadioGroup crg0801;
    @BindView(R.id.crg080101)
    RadioButton crg080101;
    @BindView(R.id.crg080102)
    RadioButton crg080102;
    @BindView(R.id.crg0802)
    RadioGroup crg0802;
    @BindView(R.id.crg080201)
    RadioButton crg080201;
    @BindView(R.id.crg080202)
    RadioButton crg080202;
    @BindView(R.id.crg0803)
    RadioGroup crg0803;
    @BindView(R.id.crg080301)
    RadioButton crg080301;
    @BindView(R.id.crg080302)
    RadioButton crg080302;
    @BindView(R.id.crg0804)
    RadioGroup crg0804;
    @BindView(R.id.crg080401)
    RadioButton crg080401;
    @BindView(R.id.crg080402)
    RadioButton crg080402;
    @BindView(R.id.crg0805)
    RadioGroup crg0805;
    @BindView(R.id.crg080501)
    RadioButton crg080501;
    @BindView(R.id.crg080502)
    RadioButton crg080502;
    @BindView(R.id.crg0806)
    RadioGroup crg0806;
    @BindView(R.id.crg080601)
    RadioButton crg080601;
    @BindView(R.id.crg080602)
    RadioButton crg080602;
    @BindView(R.id.crg0807)
    RadioGroup crg0807;
    @BindView(R.id.crg080701)
    RadioButton crg080701;
    @BindView(R.id.crg080702)
    RadioButton crg080702;
    @BindView(R.id.crg0808)
    RadioGroup crg0808;
    @BindView(R.id.crg080801)
    RadioButton crg080801;
    @BindView(R.id.crg080802)
    RadioButton crg080802;
    @BindView(R.id.crg0809)
    RadioGroup crg0809;
    @BindView(R.id.crg080901)
    RadioButton crg080901;
    @BindView(R.id.crg080902)
    RadioButton crg080902;
    @BindView(R.id.crg0810)
    RadioGroup crg0810;
    @BindView(R.id.crg081001)
    RadioButton crg081001;
    @BindView(R.id.crg081002)
    RadioButton crg081002;
    @BindView(R.id.crg0811)
    RadioGroup crg0811;
    @BindView(R.id.crg081101)
    RadioButton crg081101;
    @BindView(R.id.crg081102)
    RadioButton crg081102;
    @BindView(R.id.crg0812)
    RadioGroup crg0812;
    @BindView(R.id.crg081201)
    RadioButton crg081201;
    @BindView(R.id.crg081202)
    RadioButton crg081202;
    @BindView(R.id.crg0813)
    RadioGroup crg0813;
    @BindView(R.id.crg081301)
    RadioButton crg081301;
    @BindView(R.id.crg081302)
    RadioButton crg081302;
    @BindView(R.id.crg0814)
    RadioGroup crg0814;
    @BindView(R.id.crg081401)
    RadioButton crg081401;
    @BindView(R.id.crg081402)
    RadioButton crg081402;
    @BindView(R.id.crg0815)
    RadioGroup crg0815;
    @BindView(R.id.crg081501)
    RadioButton crg081501;
    @BindView(R.id.crg081502)
    RadioButton crg081502;
    @BindView(R.id.crg0816)
    RadioGroup crg0816;
    @BindView(R.id.crg081601)
    RadioButton crg081601;
    @BindView(R.id.crg081602)
    RadioButton crg081602;
    @BindView(R.id.crg0817)
    RadioGroup crg0817;
    @BindView(R.id.crg081701)
    RadioButton crg081701;
    @BindView(R.id.crg081702)
    RadioButton crg081702;
    @BindView(R.id.crg0818)
    RadioGroup crg0818;
    @BindView(R.id.crg081801)
    RadioButton crg081801;
    @BindView(R.id.crg081802)
    RadioButton crg081802;
    @BindView(R.id.crg0819)
    RadioGroup crg0819;
    @BindView(R.id.crg081901)
    RadioButton crg081901;
    @BindView(R.id.crg081902)
    RadioButton crg081902;
    @BindView(R.id.crg09)
    RadioGroup crg09;
    @BindView(R.id.crg0901)
    RadioButton crg0901;
    @BindView(R.id.crg0902)
    RadioButton crg0902;
    @BindView(R.id.crg0903)
    RadioButton crg0903;
    @BindView(R.id.crg0904)
    RadioButton crg0904;
    @BindView(R.id.crg0905)
    RadioButton crg0905;
    @BindView(R.id.crg0906)
    RadioButton crg0906;
    @BindView(R.id.crg0907)
    RadioButton crg0907;
    @BindView(R.id.crg0908)
    RadioButton crg0908;
    @BindView(R.id.crg0909)
    RadioButton crg0909;
    @BindView(R.id.crg0910)
    RadioButton crg0910;
    @BindView(R.id.crg0996)
    RadioButton crg0996;
    @BindView(R.id.crg0996x)
    EditText crg0996x;
    @BindView(R.id.crg10)
    RadioGroup crg10;
    @BindView(R.id.crg1001)
    RadioButton crg1001;
    @BindView(R.id.crg1002)
    RadioButton crg1002;
    @BindView(R.id.crg1003)
    RadioButton crg1003;
    @BindView(R.id.crg1096)
    RadioButton crg1096;
    @BindView(R.id.crg1096x)
    EditText crg1096x;
    @BindView(R.id.crgGrp09)
    LinearLayout crgGrp09;
    @BindView(R.id.crg11)
    RadioGroup crg11;
    @BindView(R.id.crg1101)
    RadioButton crg1101;
    @BindView(R.id.crg1102)
    RadioButton crg1102;
    @BindView(R.id.crg12)
    RadioGroup crg12;
    @BindView(R.id.crg1201)
    RadioButton crg1201;
    @BindView(R.id.crg1202)
    RadioButton crg1202;
    @BindView(R.id.crg1203)
    RadioButton crg1203;
    @BindView(R.id.crg1204)
    RadioButton crg1204;
    @BindView(R.id.crg1205)
    RadioButton crg1205;
    @BindView(R.id.crg1206)
    RadioButton crg1206;
    @BindView(R.id.crg1207)
    RadioButton crg1207;
    @BindView(R.id.crg1208)
    RadioButton crg1208;
    @BindView(R.id.crg1209)
    RadioButton crg1209;
    @BindView(R.id.crg1210)
    RadioButton crg1210;
    @BindView(R.id.crg1211)
    RadioButton crg1211;
    @BindView(R.id.crg1296)
    RadioButton crg1296;
    @BindView(R.id.crg1296x)
    EditText crg1296x;
    @BindView(R.id.crg13)
    RadioGroup crg13;
    @BindView(R.id.crg1301)
    RadioButton crg1301;
    @BindView(R.id.crg1302)
    RadioButton crg1302;
    @BindView(R.id.crg1303)
    RadioButton crg1303;
    @BindView(R.id.crg1304)
    RadioButton crg1304;
    @BindView(R.id.crg1305)
    RadioButton crg1305;
    @BindView(R.id.crg1306)
    RadioButton crg1306;
    @BindView(R.id.crg1307)
    RadioButton crg1307;
    @BindView(R.id.crg1308)
    RadioButton crg1308;
    @BindView(R.id.crg1309)
    RadioButton crg1309;
    @BindView(R.id.crg1310)
    RadioButton crg1310;
    @BindView(R.id.crg1311)
    RadioButton crg1311;
    @BindView(R.id.crg1312)
    RadioButton crg1312;
    @BindView(R.id.crg1396)
    RadioButton crg1396;
    @BindView(R.id.crg1396x)
    EditText crg1396x;
    @BindView(R.id.crg14)
    RadioGroup crg14;
    @BindView(R.id.crg1401)
    RadioButton crg1401;
    @BindView(R.id.crg1402)
    RadioButton crg1402;
    @BindView(R.id.crg1403)
    RadioButton crg1403;
    @BindView(R.id.crg1404)
    RadioButton crg1404;
    @BindView(R.id.crg1405)
    RadioButton crg1405;
    @BindView(R.id.crg1406)
    RadioButton crg1406;
    @BindView(R.id.crg1407)
    RadioButton crg1407;
    @BindView(R.id.crg1408)
    RadioButton crg1408;
    @BindView(R.id.crg1409)
    RadioButton crg1409;
    @BindView(R.id.crg1410)
    RadioButton crg1410;
    @BindView(R.id.crg1411)
    RadioButton crg1411;
    @BindView(R.id.crg1496)
    RadioButton crg1496;
    @BindView(R.id.crg1496x)
    EditText crg1496x;
    @BindView(R.id.crg15)
    EditText crg15;
    @BindView(R.id.crg16a)
    RadioGroup crg16a;
    @BindView(R.id.crg16a01)
    RadioButton crg16a01;
    @BindView(R.id.crg16a02)
    RadioButton crg16a02;
    @BindView(R.id.crg16b)
    RadioGroup crg16b;
    @BindView(R.id.crg16b01)
    RadioButton crg16b01;
    @BindView(R.id.crg16b02)
    RadioButton crg16b02;
    @BindView(R.id.crg16c)
    RadioGroup crg16c;
    @BindView(R.id.crg16c01)
    RadioButton crg16c01;
    @BindView(R.id.crg16c02)
    RadioButton crg16c02;
    @BindView(R.id.crg16d)
    RadioGroup crg16d;
    @BindView(R.id.crg16d01)
    RadioButton crg16d01;
    @BindView(R.id.crg16d02)
    RadioButton crg16d02;
    @BindView(R.id.crg16e)
    RadioGroup crg16e;
    @BindView(R.id.crg16e01)
    RadioButton crg16e01;
    @BindView(R.id.crg16e02)
    RadioButton crg16e02;
    @BindView(R.id.crg16f)
    RadioGroup crg16f;
    @BindView(R.id.crg16f01)
    RadioButton crg16f01;
    @BindView(R.id.crg16f02)
    RadioButton crg16f02;
    @BindView(R.id.crg16g)
    RadioGroup crg16g;
    @BindView(R.id.crg16g01)
    RadioButton crg16g01;
    @BindView(R.id.crg16g02)
    RadioButton crg16g02;
    @BindView(R.id.crg16h)
    RadioGroup crg16h;
    @BindView(R.id.crg16h01)
    RadioButton crg16h01;
    @BindView(R.id.crg16h02)
    RadioButton crg16h02;
    @BindView(R.id.crg16i)
    RadioGroup crg16i;
    @BindView(R.id.crg16i01)
    RadioButton crg16i01;
    @BindView(R.id.crg16i02)
    RadioButton crg16i02;
    @BindView(R.id.crg17)
    RadioGroup crg17;
    @BindView(R.id.crg1701)
    RadioButton crg1701;
    @BindView(R.id.crg1702)
    RadioButton crg1702;
    @BindView(R.id.crgGrp17)
    LinearLayout crgGrp17;
    @BindView(R.id.crg1801)
    EditText crg1801;
    @BindView(R.id.crg1802)
    EditText crg1802;
    @BindView(R.id.crg1803)
    EditText crg1803;
    @BindView(R.id.crg1899)
    CheckBox crg1899;
    @BindView(R.id.crg19)
    RadioGroup crg19;
    @BindView(R.id.crg1901)
    RadioButton crg1901;
    @BindView(R.id.crg1902)
    RadioButton crg1902;
    @BindView(R.id.crgGrp19)
    LinearLayout crgGrp19;
    @BindView(R.id.crg2001)
    EditText crg2001;
    @BindView(R.id.crg2002)
    EditText crg2002;
    @BindView(R.id.crg2003)
    EditText crg2003;
    @BindView(R.id.crg2004)
    EditText crg2004;
    @BindView(R.id.crg2005)
    EditText crg2005;
    @BindView(R.id.crg2006)
    EditText crg2006;
    //@BindView(R.id.crg2007)
    //EditText crg2007;
    @BindView(R.id.crg21a)
    RadioGroup crg21a;
    @BindView(R.id.crg21a01)
    RadioButton crg21a01;
    @BindView(R.id.crg21a02)
    RadioButton crg21a02;
    @BindView(R.id.crg21a03)
    RadioButton crg21a03;
    @BindView(R.id.crg21a04)
    RadioButton crg21a04;
    @BindView(R.id.crg21a05)
    RadioButton crg21a05;
    @BindView(R.id.crg21a06)
    RadioButton crg21a06;
    @BindView(R.id.crg21a07)
    RadioButton crg21a07;
    @BindView(R.id.crg21a08)
    RadioButton crg21a08;
    @BindView(R.id.crg21a09)
    RadioButton crg21a09;
    @BindView(R.id.crg21a10)
    RadioButton crg21a10;
    @BindView(R.id.crg21a11)
    RadioButton crg21a11;
    @BindView(R.id.crg21a12)
    RadioButton crg21a12;
    @BindView(R.id.crg21a13)
    RadioButton crg21a13;
    @BindView(R.id.crg21a96)
    RadioButton crg21a96;
    @BindView(R.id.crg21a96x)
    EditText crg21a96x;
    @BindView(R.id.crg21b)
    RadioGroup crg21b;
    @BindView(R.id.crg21b01)
    RadioButton crg21b01;
    @BindView(R.id.crg21b02)
    RadioButton crg21b02;
    @BindView(R.id.crg21b03)
    RadioButton crg21b03;
    @BindView(R.id.crg21b04)
    RadioButton crg21b04;
    @BindView(R.id.crg21b05)
    RadioButton crg21b05;
    @BindView(R.id.crg21b06)
    RadioButton crg21b06;
    @BindView(R.id.crg21b07)
    RadioButton crg21b07;
    @BindView(R.id.crg21b08)
    RadioButton crg21b08;
    @BindView(R.id.crg21b09)
    RadioButton crg21b09;
    @BindView(R.id.crg21b10)
    RadioButton crg21b10;
    @BindView(R.id.crg21b11)
    RadioButton crg21b11;
    @BindView(R.id.crg21b12)
    RadioButton crg21b12;
    @BindView(R.id.crg21b13)
    RadioButton crg21b13;
    @BindView(R.id.crg21b96)
    RadioButton crg21b96;
    @BindView(R.id.crg21b96x)
    EditText crg21b96x;
    @BindView(R.id.crg21c)
    RadioGroup crg21c;
    @BindView(R.id.crg21c01)
    RadioButton crg21c01;
    @BindView(R.id.crg21c02)
    RadioButton crg21c02;
    @BindView(R.id.crg21c03)
    RadioButton crg21c03;
    @BindView(R.id.crg21c04)
    RadioButton crg21c04;
    @BindView(R.id.crg21c05)
    RadioButton crg21c05;
    @BindView(R.id.crg21c06)
    RadioButton crg21c06;
    @BindView(R.id.crg21c07)
    RadioButton crg21c07;
    @BindView(R.id.crg21c08)
    RadioButton crg21c08;
    @BindView(R.id.crg21c09)
    RadioButton crg21c09;
    @BindView(R.id.crg21c10)
    RadioButton crg21c10;
    @BindView(R.id.crg21c11)
    RadioButton crg21c11;
    @BindView(R.id.crg21c12)
    RadioButton crg21c12;
    @BindView(R.id.crg21c13)
    RadioButton crg21c13;
    @BindView(R.id.crg21c96)
    RadioButton crg21c96;
    @BindView(R.id.crg21c96x)
    EditText crg21c96x;
    @BindView(R.id.crg22)
    RadioGroup crg22;
    @BindView(R.id.crg2201)
    RadioButton crg2201;
    @BindView(R.id.crg2202)
    RadioButton crg2202;
    @BindView(R.id.crgGrp22)
    LinearLayout crgGrp22;
    @BindView(R.id.crg22a)
    RadioGroup crg22a;
    @BindView(R.id.crg22a01)
    RadioButton crg22a01;
    @BindView(R.id.crg22a02)
    RadioButton crg22a02;
    @BindView(R.id.crg22a03)
    RadioButton crg22a03;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.crg2007)
    EditText crg2007;
    @BindView(R.id.fldGrpcrg04)
    LinearLayout fldGrpcrg04;
    @BindView(R.id.fldGrpcrg07)
    LinearLayout fldGrpcrg07;
    @BindView(R.id.fldGrpcrg08)
    LinearLayout fldGrpcrg08;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_g);
        ButterKnife.bind(this);


        crg0509.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpcrg08.setVisibility(View.GONE);
                    crg06.clearCheck();
                    crg07.setText(null);
                } else {
                    fldGrpcrg08.setVisibility(View.VISIBLE);
                }
            }
        });


        // ====================== Q9 Skip Pattern =========================

        crg0910.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp09.setVisibility(View.GONE);
                    crg10.clearCheck();
                    crg1096x.setText(null);
                } else {
                    crgGrp09.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q17 Skip Pattern =========================
        crg1702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp17.setVisibility(View.GONE);
                    crg1899.setChecked(false);
                    crg1801.setText(null);
                    crg1802.setText(null);
                    crg1803.setText(null);
                } else {
                    crgGrp17.setVisibility(View.VISIBLE);
                }
            }
        });

        // ====================== Q19 Skip Pattern =========================

        crg1902.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp19.setVisibility(View.GONE);
                    crg2001.setText(null);
                    crg2002.setText(null);
                    crg2003.setText(null);
                    crg2004.setText(null);
                    crg2005.setText(null);
                    crg2006.setText(null);
                    crg2006.setText(null);
                    crg2007.setText(null);
                    crg21a02.setEnabled(false);
                    crg21a02.setChecked(false);
                    crg21b02.setEnabled(false);
                    crg21b02.setChecked(false);
                    crg21c02.setEnabled(false);
                    crg21c02.setChecked(false);

                } else {
                    crgGrp19.setVisibility(View.VISIBLE);
                    crgGrp22.setVisibility(View.VISIBLE);
                    crg21a02.setEnabled(true);
                    crg21b02.setEnabled(true);
                    crg21c02.setEnabled(true);
                }
            }
        });

        // ====================== Q22 Skip Pattern =========================
        crg2202.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crgGrp22.setVisibility(View.GONE);
                    crg22a.clearCheck();
                } else {
                    crgGrp22.setVisibility(View.VISIBLE);
                }
            }
        });

        // =================== Q1 Others ====================

        crg0196.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg0196x.setVisibility(View.VISIBLE);
                } else {
                    crg0196x.setVisibility(View.GONE);
                    crg0196x.setText(null);
                }
            }
        });

        // =================== Q2 Others ====================

        crg0296.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg0296x.setVisibility(View.VISIBLE);
                } else {
                    crg0296x.setVisibility(View.GONE);
                    crg0296x.setText(null);
                }
            }
        });

        // =================== Q4 Others ====================

        crg0496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg0496x.setVisibility(View.VISIBLE);
                } else {
                    crg0496x.setVisibility(View.GONE);
                    crg0496x.setText(null);
                }
            }
        });

        // =================== Q5 Others ====================

        crg0596.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg0596x.setVisibility(View.VISIBLE);
                } else {
                    crg0596x.setVisibility(View.GONE);
                    crg0596x.setText(null);
                }
            }
        });

        // =================== Q9 Others ====================

        crg0996.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg0996x.setVisibility(View.VISIBLE);
                } else {
                    crg0996x.setVisibility(View.GONE);
                    crg0996x.setText(null);
                }
            }
        });

        // =================== Q10 Others ====================

        crg1096.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg1096x.setVisibility(View.VISIBLE);
                } else {
                    crg1096x.setVisibility(View.GONE);
                    crg1096x.setText(null);
                }
            }
        });

        // =================== Q12 Others ====================

        crg1296.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg1296x.setVisibility(View.VISIBLE);
                } else {
                    crg1296x.setVisibility(View.GONE);
                    crg1296x.setText(null);
                }
            }
        });

        // =================== Q13 Others ====================

        crg1396.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg1396x.setVisibility(View.VISIBLE);
                } else {
                    crg1396x.setVisibility(View.GONE);
                    crg1396x.setText(null);
                }
            }
        });

        // =================== Q14 Others ====================

        crg1496.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg1496x.setVisibility(View.VISIBLE);
                } else {
                    crg1496x.setVisibility(View.GONE);
                    crg1496x.setText(null);
                }
            }
        });

        // =================== Q21a Others ====================

        crg21a96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg21a96x.setVisibility(View.VISIBLE);
                } else {
                    crg21a96x.setVisibility(View.GONE);
                    crg21a96x.setText(null);
                }
            }
        });

        // =================== Q21b Others ====================

        crg21b96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg21b96x.setVisibility(View.VISIBLE);
                } else {
                    crg21b96x.setVisibility(View.GONE);
                    crg21b96x.setText(null);
                }
            }
        });

        // =================== Q21c Others ====================

        crg21c96.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg21c96x.setVisibility(View.VISIBLE);
                } else {
                    crg21c96x.setVisibility(View.GONE);
                    crg21c96x.setText(null);
                }
            }
        });

        //================= Q4 Skip pattern ===============
        crg03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crg0301.isChecked()) {
                    fldGrpcrg04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrg04.setVisibility(View.GONE);
                    crg04.clearCheck();
                    crg0496x.setText(null);
                }
            }
        });

        //================= Q6 Skip pattern ===============
        crg06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (crg0601.isChecked()) {
                    fldGrpcrg07.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrg07.setVisibility(View.GONE);
                    crg07.setText(null);
                }
            }
        });

        crg1899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    crg1801.setVisibility(View.GONE);
                    crg1801.setText(null);
                    crg1802.setVisibility(View.GONE);
                    crg1802.setText(null);
                    crg1803.setVisibility(View.GONE);
                    crg1803.setText(null);
                } else {
                    crg1801.setVisibility(View.VISIBLE);
                    crg1802.setVisibility(View.VISIBLE);
                    crg1803.setVisibility(View.VISIBLE);
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
                Intent secH = new Intent(this, SectionHActivity.class);
                startActivity(secH);

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

        int updcount = db.updateSG();

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

        JSONObject sg = new JSONObject();

        sg.put("crg01", crg0101.isChecked() ? "1" : crg0102.isChecked() ? "2" : crg0103.isChecked() ? "3"
                : crg0104.isChecked() ? "4" : crg0105.isChecked() ? "5" : crg0106.isChecked() ? "6"
                : crg0196.isChecked() ? "96" : "0");
        sg.put("crg96x", crg0196x.getText().toString());
        sg.put("crg02", crg0201.isChecked() ? "1" : crg0202.isChecked() ? "2" : crg0203.isChecked() ? "3"
                : crg0204.isChecked() ? "4" : crg0205.isChecked() ? "5" : crg0206.isChecked() ? "6"
                : crg0207.isChecked() ? "7" : crg0208.isChecked() ? "8" : crg0209.isChecked() ? "9"
                : crg0210.isChecked() ? "10" : crg0211.isChecked() ? "11" : crg0212.isChecked() ? "12"
                : crg0213.isChecked() ? "13" : crg0214.isChecked() ? "14" : crg0215.isChecked() ? "15"
                : crg0296.isChecked() ? "96" : "0");
        sg.put("crg0296x", crg0296x.getText().toString());
        sg.put("crg03", crg0301.isChecked() ? "1" : crg0302.isChecked() ? "2" : "0");
        sg.put("crg04", crg0401.isChecked() ? "1" : crg0402.isChecked() ? "2" : crg0403.isChecked() ? "3"
                : crg0404.isChecked() ? "4" : crg0405.isChecked() ? "5" : crg0406.isChecked() ? "6"
                : crg0496.isChecked() ? "96" : "0");
        sg.put("crg04x", crg0496x.getText().toString());
        sg.put("crg05", crg0501.isChecked() ? "1" : crg0502.isChecked() ? "2" : crg0503.isChecked() ? "3"
                : crg0504.isChecked() ? "4" : crg0505.isChecked() ? "5" : crg0506.isChecked() ? "6"
                : crg0507.isChecked() ? "7" : crg0508.isChecked() ? "8" : crg0509.isChecked() ? "9"
                : crg0596.isChecked() ? "96" : "0");
        sg.put("crg0596x", crg0596x.getText().toString());
        sg.put("crg06", crg0601.isChecked() ? "1" : crg0602.isChecked() ? "2" : "0");
        sg.put("crg07", crg07.getText().toString());
        sg.put("crg0801", crg080101.isChecked() ? "1" : crg080102.isChecked() ? "2" : "0");
        sg.put("crg0802", crg080201.isChecked() ? "1" : crg080202.isChecked() ? "2" : "0");
        sg.put("crg0803", crg080301.isChecked() ? "1" : crg080302.isChecked() ? "2" : "0");
        sg.put("crg0804", crg080401.isChecked() ? "1" : crg080402.isChecked() ? "2" : "0");
        sg.put("crg0805", crg080501.isChecked() ? "1" : crg080502.isChecked() ? "2" : "0");
        sg.put("crg0806", crg080601.isChecked() ? "1" : crg080602.isChecked() ? "2" : "0");
        sg.put("crg0807", crg080701.isChecked() ? "1" : crg080702.isChecked() ? "2" : "0");
        sg.put("crg0808", crg080801.isChecked() ? "1" : crg080802.isChecked() ? "2" : "0");
        sg.put("crg0809", crg080901.isChecked() ? "1" : crg080902.isChecked() ? "2" : "0");
        sg.put("crg0810", crg081001.isChecked() ? "1" : crg081002.isChecked() ? "2" : "0");
        sg.put("crg0811", crg081101.isChecked() ? "1" : crg081102.isChecked() ? "2" : "0");
        sg.put("crg0812", crg081201.isChecked() ? "1" : crg081202.isChecked() ? "2" : "0");
        sg.put("crg0813", crg081301.isChecked() ? "1" : crg081302.isChecked() ? "2" : "0");
        sg.put("crg0814", crg081401.isChecked() ? "1" : crg081402.isChecked() ? "2" : "0");
        sg.put("crg0815", crg081501.isChecked() ? "1" : crg081502.isChecked() ? "2" : "0");
        sg.put("crg0816", crg081601.isChecked() ? "1" : crg081602.isChecked() ? "2" : "0");
        sg.put("crg0817", crg081701.isChecked() ? "1" : crg081702.isChecked() ? "2" : "0");
        sg.put("crg0818", crg081801.isChecked() ? "1" : crg081802.isChecked() ? "2" : "0");
        sg.put("crg0819", crg081901.isChecked() ? "1" : crg081902.isChecked() ? "2" : "0");
        sg.put("crg09", crg0901.isChecked() ? "1" : crg0902.isChecked() ? "2" : crg0903.isChecked() ? "3"
                : crg0904.isChecked() ? "4" : crg0905.isChecked() ? "5" : crg0906.isChecked() ? "6"
                : crg0907.isChecked() ? "7" : crg0908.isChecked() ? "8" : crg0909.isChecked() ? "9"
                : crg0910.isChecked() ? "10" : crg0996.isChecked() ? "96" : "0");
        sg.put("crg0996x", crg0996x.getText().toString());
        sg.put("crg10", crg1001.isChecked() ? "1" : crg1002.isChecked() ? "2" : crg1003.isChecked() ? "3" : "0");
        sg.put("crg1096x", crg1096x.getText().toString());
        sg.put("crg11", crg1101.isChecked() ? "1" : crg1102.isChecked() ? "2" : "0");
        sg.put("crg12", crg1201.isChecked() ? "1" : crg1202.isChecked() ? "2" : crg1203.isChecked() ? "3"
                : crg1204.isChecked() ? "4" : crg1205.isChecked() ? "5" : crg1206.isChecked() ? "6"
                : crg1207.isChecked() ? "7" : crg1208.isChecked() ? "8" : crg1209.isChecked() ? "9"
                : crg1210.isChecked() ? "10" : crg1211.isChecked() ? "11" : crg1296.isChecked() ? "96" : "0");
        sg.put("crg1296x", crg1296x.getText().toString());
        sg.put("crg13", crg1301.isChecked() ? "1" : crg1302.isChecked() ? "2" : crg1303.isChecked() ? "3"
                : crg1304.isChecked() ? "4" : crg1305.isChecked() ? "5" : crg1306.isChecked() ? "6"
                : crg1307.isChecked() ? "7" : crg1308.isChecked() ? "8" : crg1309.isChecked() ? "9"
                : crg1310.isChecked() ? "10" : crg1311.isChecked() ? "11" : crg1312.isChecked() ? "12"
                : crg1396.isChecked() ? "96" : "0");
        sg.put("crg1396x", crg1396x.getText().toString());
        sg.put("crg14", crg1401.isChecked() ? "1" : crg1402.isChecked() ? "2" : crg1403.isChecked() ? "3"
                : crg1404.isChecked() ? "4" : crg1405.isChecked() ? "5" : crg1406.isChecked() ? "6"
                : crg1407.isChecked() ? "7" : crg1408.isChecked() ? "8" : crg1409.isChecked() ? "9"
                : crg1410.isChecked() ? "10" : crg1411.isChecked() ? "11" : crg1496.isChecked() ? "96" : "0");
        sg.put("crg1496x", crg1496x.getText().toString());
        sg.put("crg15", crg15.getText().toString());
        sg.put("crg16a", crg16a01.isChecked() ? "1" : crg16a02.isChecked() ? "2" : "0");
        sg.put("crg16b", crg16b01.isChecked() ? "1" : crg16b02.isChecked() ? "2" : "0");
        sg.put("crg16c", crg16c01.isChecked() ? "1" : crg16c02.isChecked() ? "2" : "0");
        sg.put("crg16d", crg16d01.isChecked() ? "1" : crg16d02.isChecked() ? "2" : "0");
        sg.put("crg16e", crg16e01.isChecked() ? "1" : crg16e02.isChecked() ? "2" : "0");
        sg.put("crg16f", crg16f01.isChecked() ? "1" : crg16f02.isChecked() ? "2" : "0");
        sg.put("crg16g", crg16g01.isChecked() ? "1" : crg16g02.isChecked() ? "2" : "0");
        sg.put("crg16h", crg16h01.isChecked() ? "1" : crg16h02.isChecked() ? "2" : "0");
        sg.put("crg16i", crg16i01.isChecked() ? "1" : crg16i02.isChecked() ? "2" : "0");
        sg.put("crg17", crg1701.isChecked() ? "1" : crg1702.isChecked() ? "2" : "0");
        sg.put("crg1801", crg1801.getText().toString());
        sg.put("crg1802", crg1802.getText().toString());
        sg.put("crg1803", crg1803.getText().toString());
        sg.put("crg1899", crg1899.isChecked() ? "1" : "0");
        sg.put("crg19", crg1901.isChecked() ? "1" : crg1902.isChecked() ? "2" : "0");
        sg.put("crg2001", crg2001.getText().toString());
        sg.put("crg2002", crg2002.getText().toString());
        sg.put("crg2003", crg2003.getText().toString());
        sg.put("crg2004", crg2004.getText().toString());
        sg.put("crg2005", crg2005.getText().toString());
        sg.put("crg2006", crg2006.getText().toString());
        sg.put("crg2007", crg2006.getText().toString());
        sg.put("crg21a", crg21a01.isChecked() ? "1" : crg21a02.isChecked() ? "2" : crg21a03.isChecked() ? "3"
                : crg21a04.isChecked() ? "4" : crg21a05.isChecked() ? "5" : crg21a06.isChecked() ? "6"
                : crg21a07.isChecked() ? "7" : crg21a08.isChecked() ? "8" : crg21a09.isChecked() ? "9"
                : crg21a10.isChecked() ? "10" : crg21a11.isChecked() ? "11" : crg21a12.isChecked() ? "12"
                : crg21a13.isChecked() ? "13" : crg21a96.isChecked() ? "96" : "0");
        sg.put("crg21b", crg21b01.isChecked() ? "1" : crg21b02.isChecked() ? "2" : crg21b03.isChecked() ? "3"
                : crg21b04.isChecked() ? "4" : crg21b05.isChecked() ? "5" : crg21b06.isChecked() ? "6"
                : crg21b07.isChecked() ? "7" : crg21b08.isChecked() ? "8" : crg21b09.isChecked() ? "9"
                : crg21b10.isChecked() ? "10" : crg21b11.isChecked() ? "11" : crg21b12.isChecked() ? "12"
                : crg21b13.isChecked() ? "13" : crg21b96.isChecked() ? "96" : "0");
        sg.put("crg21c", crg21c01.isChecked() ? "1" : crg21c02.isChecked() ? "2" : crg21c03.isChecked() ? "3"
                : crg21c04.isChecked() ? "4" : crg21c05.isChecked() ? "5" : crg21c06.isChecked() ? "6"
                : crg21c07.isChecked() ? "7" : crg21c08.isChecked() ? "8" : crg21c09.isChecked() ? "9"
                : crg21c10.isChecked() ? "10" : crg21c11.isChecked() ? "11" : crg21c12.isChecked() ? "12"
                : crg21c13.isChecked() ? "13" : crg21c96.isChecked() ? "96" : "0");
        sg.put("crg22", crg2201.isChecked() ? "1" : crg2202.isChecked() ? "2" : "0");
        sg.put("crg22a", crg22a01.isChecked() ? "1" : crg22a02.isChecked() ? "2" : crg22a03.isChecked() ? "3" : "0");

        AppMain.fc.setsG(String.valueOf(sg));

        Toast.makeText(this, "Validation Succecful", Toast.LENGTH_SHORT).show();
    }

    public boolean validateForm() {

        // =================== Q1 ====================
        if (crg01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg01), Toast.LENGTH_SHORT).show();
            crg0196.setError("This Data is required");
            Log.d(TAG, "crg01 : This Data is required");
            return false;
        } else {
            crg0196.setError(null);
        }

        if (crg01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg01), Toast.LENGTH_SHORT).show();
            crg0196.setError("This Data is required");
            Log.d(TAG, "crg01 :This Data is required ");
            return false;
        } else {
            crg0196.setError(null);
        }


        if (crg0196.isChecked() && crg0196x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg01) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg0196x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg0196: This data is Required!");
            return false;
        } else {
            crg0196x.setError(null);
        }

        // =================== Q2 ====================
        if (crg02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg02), Toast.LENGTH_SHORT).show();
            crg0296.setError("This Data is required");
            Log.d(TAG, "crg02 :This Data is required");
            return false;
        } else {
            crg0296.setError(null);
        }

        if (crg0296.isChecked() && crg0296x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg02) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg0296x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg0296: This data is Required!");
            return false;
        } else {
            crg0296x.setError(null);
        }

        // =================== Q3 ====================
        if (crg03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg03), Toast.LENGTH_SHORT).show();
            crg0302.setError("This Data is required");
            Log.d(TAG, "crg02  :This Data is required ");
            return false;
        } else {
            crg0302.setError(null);
        }


        if (crg0301.isChecked()) {
            // =================== Q4 ====================
            if (crg04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg04), Toast.LENGTH_SHORT).show();
                crg0496.setError("This Data is required");
                Log.d(TAG, "crg04 : This Data is required ");
                return false;
            } else {
                crg0496.setError(null);
            }

            if (crg0496.isChecked() && crg0496x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg04) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crg0496x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crg0496x: This data is Required!");
                return false;
            } else {
                crg0496x.setError(null);
            }
        }

        // =================== Q5 ====================
        if (crg05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg05), Toast.LENGTH_SHORT).show();
            crg0596.setError("This Data is required");
            Log.d(TAG, "crg05 : This Data is required ");
            return false;
        } else {
            crg0596.setError(null);
        }

        if (crg0596.isChecked() && crg0596x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg0596x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg0596x: This data is Required!");
            return false;
        } else {
            crg0596x.setError(null);
        }

        if (!crg0509.isChecked()) {
            // =================== Q6 ====================
            if (crg06.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg06), Toast.LENGTH_SHORT).show();
                crg0602.setError("This Data is required");
                Log.d(TAG, "crg06 : This Data is required ");
                return false;
            } else {
                crg0602.setError(null);
            }

            if (crg0601.isChecked()) {
                // =================== Q7 ====================
                if (crg07.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg07), Toast.LENGTH_SHORT).show();
                    crg07.setError("This data is required");
                    Log.d(TAG, "crg07  : This Data is required ");
                    return false;
                } else {
                    crg07.setError(null);
                }

                if ((Integer.parseInt(crg07.getText().toString()) == 0)) {
                    Toast.makeText(this, "ERROR: " + getString(R.string.crg07), Toast.LENGTH_LONG).show();
                    crg07.setError("No. of HH cannot be zero");
                    Log.i(TAG, "crg07: No. of HH cannot  not be zero");
                    return false;
                } else {
                    crg07.setError(null);
                }
            }
        }

        // =================== Q801 ====================
        if (crg0801.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0801), Toast.LENGTH_SHORT).show();
            crg080102.setError("This Data is required");
            Log.d(TAG, " crg0801 :This Data is required");
            return false;
        } else {
            crg080102.setError(null);
        }

        // =================== Q802 ====================
        if (crg0802.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0802), Toast.LENGTH_SHORT).show();
            crg080202.setError("This Data is required");
            Log.d(TAG, "crg0802 : This Data is required ");
            return false;
        } else {
            crg080202.setError(null);
        }

        // =================== Q803 ====================
        if (crg0803.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0803), Toast.LENGTH_SHORT).show();
            crg080302.setError("This Data is required");
            Log.d(TAG, "crg0803 : This Data is required ");
            return false;
        } else {
            crg080302.setError(null);
        }

        // =================== Q804 ====================
        if (crg0804.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0804), Toast.LENGTH_SHORT).show();
            crg080402.setError("This Data is required");
            Log.d(TAG, "crg0804 : This Data is required ");
            return false;
        } else {
            crg080402.setError(null);
        }
        // =================== Q805 ====================
        if (crg0805.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0805), Toast.LENGTH_SHORT).show();
            crg080502.setError("This Data is required");
            Log.d(TAG, "crg0805 : This Data is required ");
            return false;
        } else {
            crg080502.setError(null);
        }

        // =================== Q806 ====================
        if (crg0806.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0806), Toast.LENGTH_SHORT).show();
            crg080602.setError("This Data is required");
            Log.d(TAG, "crg0806 : This Data is required ");
            return false;
        } else {
            crg080602.setError(null);
        }

        // =================== Q807 ====================
        if (crg0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0807), Toast.LENGTH_SHORT).show();
            crg080702.setError("This Data is required");
            Log.d(TAG, "crg0807 : This Data is required ");
            return false;
        } else {
            crg080702.setError(null);
        }

        // =================== Q807 ====================
        if (crg0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0807), Toast.LENGTH_SHORT).show();
            crg080702.setError("This Data is required");
            Log.d(TAG, "crg0807 : This Data is required ");
            return false;
        } else {
            crg080702.setError(null);
        }

        // =================== Q808 ====================
        if (crg0808.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0808), Toast.LENGTH_SHORT).show();
            crg080802.setError("This Data is required");
            Log.d(TAG, "crg0808 :This Data is required ");
            return false;
        } else {
            crg080802.setError(null);
        }

        // =================== Q809 ====================
        if (crg0809.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0809), Toast.LENGTH_SHORT).show();
            crg080902.setError("This Data is required");
            Log.d(TAG, "crg0809 : This Data is required ");
            return false;
        } else {
            crg080902.setError(null);
        }

        // =================== Q810 ====================
        if (crg0810.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0810), Toast.LENGTH_SHORT).show();
            crg081002.setError("This Data is required");
            Log.d(TAG, "crg0810 : This Data is required");
            return false;
        } else {
            crg081002.setError(null);
        }

        // =================== Q811 ====================
        if (crg0811.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0811), Toast.LENGTH_SHORT).show();
            crg081102.setError("This Data is required");
            Log.d(TAG, "crg0811 : This Data is required");
            return false;
        } else {
            crg081102.setError(null);
        }

        // =================== Q812 ====================
        if (crg0812.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0812), Toast.LENGTH_SHORT).show();
            crg081202.setError("This Data is required");
            Log.d(TAG, "crg0812 : This Data is required ");
            return false;
        } else {
            crg081202.setError(null);
        }

        // =================== Q813 ====================
        if (crg0813.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0813), Toast.LENGTH_SHORT).show();
            crg081302.setError("This Data is required");
            Log.d(TAG, "crg0813 : This Data is required ");
            return false;
        } else {
            crg081302.setError(null);
        }

        // =================== Q814 ====================
        if (crg0814.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.crg0814), Toast.LENGTH_SHORT).show();
            crg081402.setError("This Data is required");
            Log.d(TAG, "crg0814 :This Data is required ");
            return false;
        } else {
            crg081402.setError(null);
        }
        // =================== Q815 ====================
        if (crg0815.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0815), Toast.LENGTH_SHORT).show();
            crg081502.setError("This Data is required");
            Log.d(TAG, "crg0815 : This Data is required ");
            return false;
        } else {
            crg081502.setError(null);
        }

        // =================== Q816 ====================
        if (crg0816.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0816), Toast.LENGTH_SHORT).show();
            crg081602.setError("This Data is required");
            Log.d(TAG, "crg0816 :This Data is required ");
            return false;
        } else {
            crg081602.setError(null);
        }

        // =================== Q817 ====================
        if (crg0817.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0817), Toast.LENGTH_SHORT).show();
            crg081702.setError("This Data is required");
            Log.d(TAG, "crg0817 :This Data is required ");
            return false;
        } else {
            crg081702.setError(null);
        }

        // =================== Q818 ====================
        if (crg0818.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0818), Toast.LENGTH_SHORT).show();
            crg081802.setError("This Data is required");
            Log.d(TAG, "crg0818 : This Data is required ");
            return false;
        } else {
            crg081802.setError(null);
        }

        // =================== Q819 ====================
        if (crg0819.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg0819), Toast.LENGTH_SHORT).show();
            crg081902.setError("This Data is required");
            Log.d(TAG, "crg0819 : This Data is required ");
            return false;
        } else {
            crg081902.setError(null);
        }

        // =================== Q9 ====================
        if (crg09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg09), Toast.LENGTH_SHORT).show();
            crg0996.setError("This Data is required");
            Log.d(TAG, "crg09 :This Data is required ");
            return false;
        } else {
            crg0996.setError(null);
        }

        if (crg0996.isChecked() && crg0996x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg09) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg0996x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg0996x: This data is Required!");
            return false;
        } else {
            crg0996x.setError(null);
        }

        if (!crg0910.isChecked()) {
            // =================== Q10 ====================
            if (crg10.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg10), Toast.LENGTH_SHORT).show();
                crg1096.setError("This Data is required");
                Log.d(TAG, "crg10 : This Data is required ");
                return false;
            } else {
                crg1096.setError(null);
            }

            if (crg1096.isChecked() && crg1096x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg10) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
                crg1096x.setError("This data is Required!");    // Set Error on last radio button
                Log.d(TAG, "crg1096x: This data is Required!");
                return false;
            } else {
                crg1096x.setError(null);
            }
        }

        // =================== Q11 ====================
        if (crg11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg11), Toast.LENGTH_SHORT).show();
            crg1102.setError("This Data is required");
            Log.d(TAG, "crg11 : This Data is required ");
            return false;
        } else {
            crg1102.setError(null);
        }

        // =================== Q12 ====================
        if (crg12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg12), Toast.LENGTH_SHORT).show();
            crg1296.setError("This Data is required");
            Log.d(TAG, "crg12 : This Data is required ");
            return false;
        } else {
            crg1296.setError(null);
        }

        if (crg1296.isChecked() && crg1296x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg12) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg1296x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg1296x: This data is Required!");
            return false;
        } else {
            crg1296x.setError(null);
        }

        // =================== Q13 ====================
        if (crg13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg13), Toast.LENGTH_SHORT).show();
            crg1396.setError("This Data is required");
            Log.d(TAG, "crg13 : This Data is required ");
            return false;
        } else {
            crg1396.setError(null);
        }

        if (crg1396.isChecked() && crg1396x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg13) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg1396x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg1396x: This data is Required!");
            return false;
        } else {
            crg1396x.setError(null);
        }

        // =================== Q14 ====================
        if (crg14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg14), Toast.LENGTH_SHORT).show();
            crg1496.setError("This Data is required");
            Log.d(TAG, "crg14 :This Data is required ");
            return false;
        } else {
            crg1496.setError(null);
        }

        if (crg1496.isChecked() && crg1496x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg14) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            crg1496x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg1496x: This data is Required!");
            return false;
        } else {
            crg1496x.setError(null);
        }

        // =================== Q15 ====================
        if (crg15.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg15), Toast.LENGTH_SHORT).show();
            crg15.setError("This data is required");
            Log.d(TAG, "crg15  : This Data is required ");
            return false;
        } else {
            crg15.setError(null);
        }

        if ((Integer.parseInt(crg15.getText().toString()) == 0)) {
            Toast.makeText(this, "ERROR: " + getString(R.string.crg15), Toast.LENGTH_LONG).show();
            crg15.setError("No. of rooms cannot be zero");
            Log.i(TAG, "crg15: No. of rooms cannot  not be zero");
            return false;
        } else {
            crg15.setError(null);
        }

        // =================== Q16a ====================
        if (crg16a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16a), Toast.LENGTH_SHORT).show();
            crg16a02.setError("This Data is required");
            Log.d(TAG, "crg16a : This Data is required ");
            return false;
        } else {
            crg16a02.setError(null);
        }

        // =================== Q16b ====================
        if (crg16b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16b), Toast.LENGTH_SHORT).show();
            crg16b02.setError("This Data is required");
            Log.d(TAG, "crg16b : This Data is required ");
            return false;
        } else {
            crg16b02.setError(null);
        }

        // =================== Q16c ====================
        if (crg16c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16c), Toast.LENGTH_SHORT).show();
            crg16c02.setError("This Data is required");
            Log.d(TAG, "crg16c : This Data is required");
            return false;
        } else {
            crg16c02.setError(null);
        }

        // =================== Q16d ====================
        if (crg16d.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16d), Toast.LENGTH_SHORT).show();
            crg16d02.setError("This Data is required");
            Log.d(TAG, "crg16d : This Data is required ");
            return false;
        } else {
            crg16d02.setError(null);
        }

        // =================== Q16e ====================
        if (crg16e.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16e), Toast.LENGTH_SHORT).show();
            crg16e02.setError("This Data is required");
            Log.d(TAG, "crg16e : This Data is required");
            return false;
        } else {
            crg16e02.setError(null);
        }

        // =================== Q16f ====================
        if (crg16f.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16f), Toast.LENGTH_SHORT).show();
            crg16f02.setError("This Data is required");
            Log.d(TAG, "crg16f : This Data is required");
            return false;
        } else {
            crg16f02.setError(null);
        }

        // =================== Q16g ====================
        if (crg16g.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16g), Toast.LENGTH_SHORT).show();
            crg16g02.setError("This Data is required");
            Log.d(TAG, "crg16g :This Data is required");
            return false;
        } else {
            crg16g02.setError(null);
        }
        // =================== Q16h ====================
        if (crg16h.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16h), Toast.LENGTH_SHORT).show();
            crg16h02.setError("This Data is required");
            Log.d(TAG, "crg16h : This Data is required");
            return false;
        } else {
            crg16h02.setError(null);
        }

        // =================== Q16i ====================
        if (crg16i.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg16i), Toast.LENGTH_SHORT).show();
            crg16i02.setError("This Data is required");
            Log.d(TAG, "crg16i : This Data is required");
            return false;
        } else {
            crg16i02.setError(null);
        }

        // =================== Q17 ====================
        if (crg17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg17), Toast.LENGTH_SHORT).show();
            crg1702.setError("This Data is required");
            Log.d(TAG, "crg17 : This Data is required");
            return false;
        } else {
            crg1702.setError(null);
        }

        if (crg1701.isChecked()) {
            // =================== Q1801 ====================

            if ((crg1801.getText().toString().isEmpty() && crg1802.getText().toString().isEmpty()
                    && crg1803.getText().toString().isEmpty())
                    && !crg1899.isChecked()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.crg18), Toast.LENGTH_SHORT).show();
                crg1899.setError("This data is required");
                Log.d(TAG, "crg1801: This data is required  ");
                return false;
            } else {
                crg1899.setError(null);
            }

            if (!crg1899.isChecked()) {
                if ((Integer.parseInt(crg1801.getText().toString().isEmpty() ? "0" : crg1801.getText().toString()) < 1)
                        && Integer.parseInt(crg1802.getText().toString().isEmpty() ? "0" : crg1802.getText().toString()) < 1
                        && Integer.parseInt(crg1803.getText().toString().isEmpty() ? "0" : crg1803.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crg18), Toast.LENGTH_SHORT).show();
                    crg1801.setError("Zero not allowed");
                    Log.i(TAG, "crg18: Zero not allowed");
                    return false;
                } else {
                    crg1801.setError(null);
                }
            }
        }

        // =================== Q19 ====================
        if (crg19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty)" + getString(R.string.crg19), Toast.LENGTH_SHORT).show();
            crg1902.setError("This Data is required");
            Log.d(TAG, "crg19 :This Data is required ");
            return false;
        } else {
            crg1902.setError(null);
        }
        if (crg1901.isChecked()) {

            // =================== Q20.01 ====================
            if (crg2001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2001), Toast.LENGTH_SHORT).show();
                crg2001.setError("This data is required");
                Log.d(TAG, "crg2001 :This Data is required");
                return false;
            } else {
                crg2001.setError(null);
            }

            // =================== Q20.02 ====================
            if (crg2002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2002), Toast.LENGTH_SHORT).show();
                crg2002.setError("This data is required");
                Log.d(TAG, "crg2002  :This Data is required");
                return false;
            } else {
                crg2002.setError(null);
            }

            // =================== Q20.03 ====================
            if (crg2003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2003), Toast.LENGTH_SHORT).show();
                crg2003.setError("This data is required");
                Log.d(TAG, "crg2003  : This Data is required ");
                return false;
            } else {
                crg2003.setError(null);
            }

            // =================== Q20.04 ====================
            if (crg2004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2004), Toast.LENGTH_SHORT).show();
                crg2004.setError("This data is required");
                Log.d(TAG, "crg2004 : This Data is required ");
                return false;
            } else {
                crg2004.setError(null);
            }


            // =================== Q20.05 ====================
            if (crg2005.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2005), Toast.LENGTH_SHORT).show();
                crg2005.setError("This data is required");
                Log.d(TAG, "crg2005  : This Data is required ");
                return false;
            } else {
                crg2005.setError(null);
            }

            // =================== Q20.06 ====================
            if (crg2006.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2006), Toast.LENGTH_SHORT).show();
                crg2006.setError("This data is required");
                Log.d(TAG, "crg2006 :This Data is required ");
                return false;
            } else {
                crg2006.setError(null);
            }

            // =================== Q20.07 ====================
            if (crg2007.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg20) + getString(R.string.crg2007), Toast.LENGTH_SHORT).show();
                crg2007.setError("This data is required");
                Log.d(TAG, "crg2007 :This Data is required ");
                return false;
            } else {
                crg2007.setError(null);
            }

        }

        // =================== Q21a ====================
        if (crg21a.getCheckedRadioButtonId() == -1 && crg21b.getCheckedRadioButtonId() == -1 && crg21c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg21) + getString(R.string.crg21a) + getString(R.string.crg21b) + getString(R.string.crg21c), Toast.LENGTH_SHORT).show();
            crg21c96.setError("This Data is required");
            Log.d(TAG, "crg21a : This Data is required");
            return false;
        } else {
            crg21c96.setError(null);
        }

        if (crg21a96.isChecked() && crg21a96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg21) + " - " + getString(R.string.crg21a), Toast.LENGTH_LONG).show();
            crg21a96x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg21a96x: This data is Required!");
            return false;
        } else {
            crg21a96x.setError(null);
        }

        // =================== Q21b ====================
       /* if (crg21b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg21) + getString(R.string.crg21b), Toast.LENGTH_SHORT).show();
            crg21b96.setError("This Data is required");
            Log.d(TAG, "crg21b : This Data is required");
            return false;
        } else {
            crg21b96.setError(null);
        }*/

        if (crg21b96.isChecked() && crg21b96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg21) + " - " + getString(R.string.crg21b), Toast.LENGTH_LONG).show();
            crg21b96x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg21b96x: This data is Required!");
            return false;
        } else {
            crg21b96x.setError(null);
        }

        // =================== Q21c ====================
        /*if (crg21c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg21) + getString(R.string.crg21c), Toast.LENGTH_SHORT).show();
            crg21c96.setError("This Data is required");
            Log.d(TAG, "crg21c : This Data is required");
            return false;
        } else {
            crg21c96.setError(null);
        }*/

        if (crg21c96.isChecked() && crg21c96x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crg21) + " - " + getString(R.string.crg21c), Toast.LENGTH_LONG).show();
            crg21c96x.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "crg21c96x: This data is Required!");
            return false;
        } else {
            crg21c96x.setError(null);
        }

        // =================== Q22 ====================
        if (crg22.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg22), Toast.LENGTH_SHORT).show();
            crg2202.setError("This Data is required");
            Log.d(TAG, "crg22 : This Data is required");
            return false;
        } else {
            crg2202.setError(null);
        }

        if (crg2201.isChecked()) {
            // =================== Q22a ====================
            if (crg22a.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(Empty)" + getString(R.string.crg22a), Toast.LENGTH_SHORT).show();
                crg22a03.setError("This Data is required");
                Log.d(TAG, "crg22a : This Data is required");
                return false;
            } else {
                crg22a03.setError(null);
            }

        }

        return true;
    }


}
