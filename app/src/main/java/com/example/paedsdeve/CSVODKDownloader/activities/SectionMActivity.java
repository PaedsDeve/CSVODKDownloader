package com.example.paedsdeve.CSVODKDownloader.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionMActivity extends AppCompatActivity {

    private static final String TAG = SectionMActivity.class.getSimpleName();
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @BindView(R.id.activity_section_h)
    ScrollView activitySectionH;
    @BindView(R.id.crm01a)
    EditText crm01a;
    @BindView(R.id.fldGrpcrm01b)
    LinearLayout fldGrpcrm01b;
    @BindView(R.id.crm01b)
    RadioGroup crm01b;
    @BindView(R.id.crm01b01)
    RadioButton crm01b01;
    @BindView(R.id.crm01b02)
    RadioButton crm01b02;
    @BindView(R.id.crm01b03)
    RadioButton crm01b03;
    @BindView(R.id.crm01b04)
    RadioButton crm01b04;
    @BindView(R.id.crm01b05)
    RadioButton crm01b05;
    @BindView(R.id.crm01b06)
    RadioButton crm01b06;
    @BindView(R.id.crm01b07)
    RadioButton crm01b07;
    @BindView(R.id.crm01b08)
    RadioButton crm01b08;
    @BindView(R.id.crm01b09)
    RadioButton crm01b09;
    @BindView(R.id.crm01b10)
    RadioButton crm01b10;
    @BindView(R.id.crm02a)
    EditText crm02a;
    @BindView(R.id.fldGrpcrm02b)
    LinearLayout fldGrpcrm02b;
    @BindView(R.id.crm02b)
    RadioGroup crm02b;
    @BindView(R.id.crm02b01)
    RadioButton crm02b01;
    @BindView(R.id.crm02b02)
    RadioButton crm02b02;
    @BindView(R.id.crm02b03)
    RadioButton crm02b03;
    @BindView(R.id.crm02b04)
    RadioButton crm02b04;
    @BindView(R.id.crm02b05)
    RadioButton crm02b05;
    @BindView(R.id.crm02b06)
    RadioButton crm02b06;
    @BindView(R.id.crm02b07)
    RadioButton crm02b07;
    @BindView(R.id.crm02b08)
    RadioButton crm02b08;
    @BindView(R.id.crm02b09)
    RadioButton crm02b09;
    @BindView(R.id.crm02b10)
    RadioButton crm02b10;
    @BindView(R.id.crm03a)
    EditText crm03a;
    @BindView(R.id.fldGrpcrm03b)
    LinearLayout fldGrpcrm03b;
    @BindView(R.id.crm03b)
    RadioGroup crm03b;
    @BindView(R.id.crm03b01)
    RadioButton crm03b01;
    @BindView(R.id.crm03b02)
    RadioButton crm03b02;
    @BindView(R.id.crm03b03)
    RadioButton crm03b03;
    @BindView(R.id.crm03b04)
    RadioButton crm03b04;
    @BindView(R.id.crm03b05)
    RadioButton crm03b05;
    @BindView(R.id.crm03b06)
    RadioButton crm03b06;
    @BindView(R.id.crm03b07)
    RadioButton crm03b07;
    @BindView(R.id.crm03b08)
    RadioButton crm03b08;
    @BindView(R.id.crm03b09)
    RadioButton crm03b09;
    @BindView(R.id.crm03b10)
    RadioButton crm03b10;
    @BindView(R.id.crm04a)
    EditText crm04a;
    @BindView(R.id.fldGrpcrm04b)
    LinearLayout fldGrpcrm04b;
    @BindView(R.id.crm04b)
    RadioGroup crm04b;
    @BindView(R.id.crm04b01)
    RadioButton crm04b01;
    @BindView(R.id.crm04b02)
    RadioButton crm04b02;
    @BindView(R.id.crm04b03)
    RadioButton crm04b03;
    @BindView(R.id.crm04b04)
    RadioButton crm04b04;
    @BindView(R.id.crm04b05)
    RadioButton crm04b05;
    @BindView(R.id.crm04b06)
    RadioButton crm04b06;
    @BindView(R.id.crm04b07)
    RadioButton crm04b07;
    @BindView(R.id.crm04b08)
    RadioButton crm04b08;
    @BindView(R.id.crm04b09)
    RadioButton crm04b09;
    @BindView(R.id.crm04b10)
    RadioButton crm04b10;
    @BindView(R.id.crm041a)
    EditText crm041a;
    @BindView(R.id.fldGrpcrm041b)
    LinearLayout fldGrpcrm041b;
    @BindView(R.id.crm041b)
    RadioGroup crm041b;
    @BindView(R.id.crm041b01)
    RadioButton crm041b01;
    @BindView(R.id.crm041b02)
    RadioButton crm041b02;
    @BindView(R.id.crm041b03)
    RadioButton crm041b03;
    @BindView(R.id.crm041b04)
    RadioButton crm041b04;
    @BindView(R.id.crm041b05)
    RadioButton crm041b05;
    @BindView(R.id.crm041b06)
    RadioButton crm041b06;
    @BindView(R.id.crm041b07)
    RadioButton crm041b07;
    @BindView(R.id.crm041b08)
    RadioButton crm041b08;
    @BindView(R.id.crm041b09)
    RadioButton crm041b09;
    @BindView(R.id.crm041b10)
    RadioButton crm041b10;
    @BindView(R.id.crm042a)
    EditText crm042a;
    @BindView(R.id.fldGrpcrm042b)
    LinearLayout fldGrpcrm042b;
    @BindView(R.id.crm042b)
    RadioGroup crm042b;
    @BindView(R.id.crm042b01)
    RadioButton crm042b01;
    @BindView(R.id.crm042b02)
    RadioButton crm042b02;
    @BindView(R.id.crm042b03)
    RadioButton crm042b03;
    @BindView(R.id.crm042b04)
    RadioButton crm042b04;
    @BindView(R.id.crm042b05)
    RadioButton crm042b05;
    @BindView(R.id.crm042b06)
    RadioButton crm042b06;
    @BindView(R.id.crm042b07)
    RadioButton crm042b07;
    @BindView(R.id.crm042b08)
    RadioButton crm042b08;
    @BindView(R.id.crm042b09)
    RadioButton crm042b09;
    @BindView(R.id.crm042b10)
    RadioButton crm042b10;
    @BindView(R.id.crm043a)
    EditText crm043a;
    @BindView(R.id.fldGrpcrm043b)
    LinearLayout fldGrpcrm043b;
    @BindView(R.id.crm043b)
    RadioGroup crm043b;
    @BindView(R.id.crm043b01)
    RadioButton crm043b01;
    @BindView(R.id.crm043b02)
    RadioButton crm043b02;
    @BindView(R.id.crm043b03)
    RadioButton crm043b03;
    @BindView(R.id.crm043b04)
    RadioButton crm043b04;
    @BindView(R.id.crm043b05)
    RadioButton crm043b05;
    @BindView(R.id.crm043b06)
    RadioButton crm043b06;
    @BindView(R.id.crm043b07)
    RadioButton crm043b07;
    @BindView(R.id.crm043b08)
    RadioButton crm043b08;
    @BindView(R.id.crm043b09)
    RadioButton crm043b09;
    @BindView(R.id.crm043b10)
    RadioButton crm043b10;
    @BindView(R.id.crm044a)
    EditText crm044a;
    @BindView(R.id.fldGrpcrm044b)
    LinearLayout fldGrpcrm044b;
    @BindView(R.id.crm044b)
    RadioGroup crm044b;
    @BindView(R.id.crm044b01)
    RadioButton crm044b01;
    @BindView(R.id.crm044b02)
    RadioButton crm044b02;
    @BindView(R.id.crm044b03)
    RadioButton crm044b03;
    @BindView(R.id.crm044b04)
    RadioButton crm044b04;
    @BindView(R.id.crm044b05)
    RadioButton crm044b05;
    @BindView(R.id.crm044b06)
    RadioButton crm044b06;
    @BindView(R.id.crm044b07)
    RadioButton crm044b07;
    @BindView(R.id.crm044b08)
    RadioButton crm044b08;
    @BindView(R.id.crm044b09)
    RadioButton crm044b09;
    @BindView(R.id.crm044b10)
    RadioButton crm044b10;
    @BindView(R.id.crm05a)
    EditText crm05a;
    @BindView(R.id.fldGrpcrm05b)
    LinearLayout fldGrpcrm05b;
    @BindView(R.id.crm05b)
    RadioGroup crm05b;
    @BindView(R.id.crm05b01)
    RadioButton crm05b01;
    @BindView(R.id.crm05b02)
    RadioButton crm05b02;
    @BindView(R.id.crm05b03)
    RadioButton crm05b03;
    @BindView(R.id.crm05b04)
    RadioButton crm05b04;
    @BindView(R.id.crm05b05)
    RadioButton crm05b05;
    @BindView(R.id.crm05b06)
    RadioButton crm05b06;
    @BindView(R.id.crm05b07)
    RadioButton crm05b07;
    @BindView(R.id.crm05b08)
    RadioButton crm05b08;
    @BindView(R.id.crm05b09)
    RadioButton crm05b09;
    @BindView(R.id.crm05b10)
    RadioButton crm05b10;
    @BindView(R.id.crm051a)
    EditText crm051a;
    @BindView(R.id.fldGrpcrm051b)
    LinearLayout fldGrpcrm051b;
    @BindView(R.id.crm051b)
    RadioGroup crm051b;
    @BindView(R.id.crm051b01)
    RadioButton crm051b01;
    @BindView(R.id.crm051b02)
    RadioButton crm051b02;
    @BindView(R.id.crm051b03)
    RadioButton crm051b03;
    @BindView(R.id.crm051b04)
    RadioButton crm051b04;
    @BindView(R.id.crm051b05)
    RadioButton crm051b05;
    @BindView(R.id.crm051b06)
    RadioButton crm051b06;
    @BindView(R.id.crm051b07)
    RadioButton crm051b07;
    @BindView(R.id.crm051b08)
    RadioButton crm051b08;
    @BindView(R.id.crm051b09)
    RadioButton crm051b09;
    @BindView(R.id.crm051b10)
    RadioButton crm051b10;
    @BindView(R.id.crm052a)
    EditText crm052a;
    @BindView(R.id.fldGrpcrm052b)
    LinearLayout fldGrpcrm052b;
    @BindView(R.id.crm052b)
    RadioGroup crm052b;
    @BindView(R.id.crm052b01)
    RadioButton crm052b01;
    @BindView(R.id.crm052b02)
    RadioButton crm052b02;
    @BindView(R.id.crm052b03)
    RadioButton crm052b03;
    @BindView(R.id.crm052b04)
    RadioButton crm052b04;
    @BindView(R.id.crm052b05)
    RadioButton crm052b05;
    @BindView(R.id.crm052b06)
    RadioButton crm052b06;
    @BindView(R.id.crm052b07)
    RadioButton crm052b07;
    @BindView(R.id.crm052b08)
    RadioButton crm052b08;
    @BindView(R.id.crm052b09)
    RadioButton crm052b09;
    @BindView(R.id.crm052b10)
    RadioButton crm052b10;
    @BindView(R.id.crm06a)
    EditText crm06a;
    @BindView(R.id.fldGrpcrm06b)
    LinearLayout fldGrpcrm06b;
    @BindView(R.id.crm06b)
    RadioGroup crm06b;
    @BindView(R.id.crm06b01)
    RadioButton crm06b01;
    @BindView(R.id.crm06b02)
    RadioButton crm06b02;
    @BindView(R.id.crm06b03)
    RadioButton crm06b03;
    @BindView(R.id.crm06b04)
    RadioButton crm06b04;
    @BindView(R.id.crm06b05)
    RadioButton crm06b05;
    @BindView(R.id.crm06b06)
    RadioButton crm06b06;
    @BindView(R.id.crm06b07)
    RadioButton crm06b07;
    @BindView(R.id.crm06b08)
    RadioButton crm06b08;
    @BindView(R.id.crm06b09)
    RadioButton crm06b09;
    @BindView(R.id.crm06b10)
    RadioButton crm06b10;
    @BindView(R.id.crm061a)
    EditText crm061a;
    @BindView(R.id.fldGrpcrm061b)
    LinearLayout fldGrpcrm061b;
    @BindView(R.id.crm061b)
    RadioGroup crm061b;
    @BindView(R.id.crm061b01)
    RadioButton crm061b01;
    @BindView(R.id.crm061b02)
    RadioButton crm061b02;
    @BindView(R.id.crm061b03)
    RadioButton crm061b03;
    @BindView(R.id.crm061b04)
    RadioButton crm061b04;
    @BindView(R.id.crm061b05)
    RadioButton crm061b05;
    @BindView(R.id.crm061b06)
    RadioButton crm061b06;
    @BindView(R.id.crm061b07)
    RadioButton crm061b07;
    @BindView(R.id.crm061b08)
    RadioButton crm061b08;
    @BindView(R.id.crm061b09)
    RadioButton crm061b09;
    @BindView(R.id.crm061b10)
    RadioButton crm061b10;
    @BindView(R.id.crm07a)
    EditText crm07a;
    @BindView(R.id.fldGrpcrm07b)
    LinearLayout fldGrpcrm07b;
    @BindView(R.id.crm07b)
    RadioGroup crm07b;
    @BindView(R.id.crm07b01)
    RadioButton crm07b01;
    @BindView(R.id.crm07b02)
    RadioButton crm07b02;
    @BindView(R.id.crm07b03)
    RadioButton crm07b03;
    @BindView(R.id.crm07b04)
    RadioButton crm07b04;
    @BindView(R.id.crm07b05)
    RadioButton crm07b05;
    @BindView(R.id.crm07b06)
    RadioButton crm07b06;
    @BindView(R.id.crm07b07)
    RadioButton crm07b07;
    @BindView(R.id.crm07b08)
    RadioButton crm07b08;
    @BindView(R.id.crm07b09)
    RadioButton crm07b09;
    @BindView(R.id.crm07b10)
    RadioButton crm07b10;
    @BindView(R.id.crm08a)
    EditText crm08a;
    @BindView(R.id.fldGrpcrm08b)
    LinearLayout fldGrpcrm08b;
    @BindView(R.id.crm08b)
    RadioGroup crm08b;
    @BindView(R.id.crm08b01)
    RadioButton crm08b01;
    @BindView(R.id.crm08b02)
    RadioButton crm08b02;
    @BindView(R.id.crm08b03)
    RadioButton crm08b03;
    @BindView(R.id.crm08b04)
    RadioButton crm08b04;
    @BindView(R.id.crm08b05)
    RadioButton crm08b05;
    @BindView(R.id.crm08b06)
    RadioButton crm08b06;
    @BindView(R.id.crm08b07)
    RadioButton crm08b07;
    @BindView(R.id.crm08b08)
    RadioButton crm08b08;
    @BindView(R.id.crm08b09)
    RadioButton crm08b09;
    @BindView(R.id.crm08b10)
    RadioButton crm08b10;
    @BindView(R.id.crm09a)
    EditText crm09a;
    @BindView(R.id.fldGrpcrm09b)
    LinearLayout fldGrpcrm09b;
    @BindView(R.id.crm09b)
    RadioGroup crm09b;
    @BindView(R.id.crm09b01)
    RadioButton crm09b01;
    @BindView(R.id.crm09b02)
    RadioButton crm09b02;
    @BindView(R.id.crm09b03)
    RadioButton crm09b03;
    @BindView(R.id.crm09b04)
    RadioButton crm09b04;
    @BindView(R.id.crm09b05)
    RadioButton crm09b05;
    @BindView(R.id.crm09b06)
    RadioButton crm09b06;
    @BindView(R.id.crm09b07)
    RadioButton crm09b07;
    @BindView(R.id.crm09b08)
    RadioButton crm09b08;
    @BindView(R.id.crm09b09)
    RadioButton crm09b09;
    @BindView(R.id.crm09b10)
    RadioButton crm09b10;
    @BindView(R.id.crn01s)
    EditText crn01s;
    @BindView(R.id.fldGrpcrn01)
    LinearLayout fldGrpcrn01;
    @BindView(R.id.crn01dod1)
    DatePickerInputEditText crn01dod1;
    @BindView(R.id.crn01dod2)
    DatePickerInputEditText crn01dod2;
    @BindView(R.id.crn02s)
    EditText crn02s;
    @BindView(R.id.fldGrpcrn02)
    LinearLayout fldGrpcrn02;
    @BindView(R.id.crn02dod1)
    DatePickerInputEditText crn02dod1;
    @BindView(R.id.crn02dod2)
    DatePickerInputEditText crn02dod2;
    @BindView(R.id.crn03s)
    EditText crn03s;
    @BindView(R.id.fldGrpcrn03)
    LinearLayout fldGrpcrn03;
    @BindView(R.id.crn03dob1)
    DatePickerInputEditText crn03dob1;
    @BindView(R.id.crn03dob2)
    DatePickerInputEditText crn03dob2;
    @BindView(R.id.crn03dob3)
    DatePickerInputEditText crn03dob3;
    @BindView(R.id.crn04s)
    EditText crn04s;
    @BindView(R.id.fldGrpcrn04)
    LinearLayout fldGrpcrn04;
    @BindView(R.id.crn04dob1)
    DatePickerInputEditText crn04dob1;
    @BindView(R.id.crn04dod1)
    DatePickerInputEditText crn04dod1;
    @BindView(R.id.crn04dob2)
    DatePickerInputEditText crn04dob2;
    @BindView(R.id.crn04dod2)
    DatePickerInputEditText crn04dod2;
    @BindView(R.id.crn05s)
    EditText crn05s;
    @BindView(R.id.fldGrpcrn05)
    LinearLayout fldGrpcrn05;
    @BindView(R.id.crn05dob1)
    DatePickerInputEditText crn05dob1;
    @BindView(R.id.crn05dod1)
    DatePickerInputEditText crn05dod1;
    @BindView(R.id.fldGrpcrn05dob2)
    LinearLayout fldGrpcrn05dob2;
    @BindView(R.id.crn05dob2)
    DatePickerInputEditText crn05dob2;
    @BindView(R.id.crn05dod2)
    DatePickerInputEditText crn05dod2;
    @BindView(R.id.crn06s)
    EditText crn06s;
    @BindView(R.id.fldGrpcrn06)
    LinearLayout fldGrpcrn06;
    @BindView(R.id.crn06dob1)
    DatePickerInputEditText crn06dob1;
    @BindView(R.id.crn06dod1)
    DatePickerInputEditText crn06dod1;
    @BindView(R.id.fldGrpcrn06dob2)
    LinearLayout fldGrpcrn06dob2;
    @BindView(R.id.crn06dob2)
    DatePickerInputEditText crn06dob2;
    @BindView(R.id.crn06dod2)
    DatePickerInputEditText crn06dod2;
    @BindView(R.id.crn07s)
    EditText crn07s;
    @BindView(R.id.fldGrpcrn07)
    LinearLayout fldGrpcrn07;
    @BindView(R.id.crn07dob1)
    DatePickerInputEditText crn07dob1;
    @BindView(R.id.crn07dod1)
    DatePickerInputEditText crn07dod1;
    @BindView(R.id.fldGrpcrn07dob2)
    LinearLayout fldGrpcrn07dob2;
    @BindView(R.id.crn07dob2)
    DatePickerInputEditText crn07dob2;
    @BindView(R.id.crn07dod2)
    DatePickerInputEditText crn07dod2;
    @BindView(R.id.crn08s)
    EditText crn08s;
    @BindView(R.id.fldGrpcrn08)
    LinearLayout fldGrpcrn08;
    @BindView(R.id.crn08dob1)
    DatePickerInputEditText crn08dob1;
    @BindView(R.id.crn08dod1)
    DatePickerInputEditText crn08dod1;
    @BindView(R.id.fldGrpcrn08dob2)
    LinearLayout fldGrpcrn08dob2;
    @BindView(R.id.crn08dob2)
    DatePickerInputEditText crn08dob2;
    @BindView(R.id.crn08dod2)
    DatePickerInputEditText crn08dod2;
    @BindView(R.id.fldGrpbtn)
    LinearLayout fldGrpbtn;
    @BindView(R.id.fldGrpcrn04dob2)
    LinearLayout fldGrpcrn04dob2;
    @BindView(R.id.fldGrpcrm04)
    LinearLayout fldGrpcrm04;
    @BindView(R.id.fldGrpcrm05)
    LinearLayout fldGrpcrm05;
    @BindView(R.id.fldGrpcrm06)
    LinearLayout fldGrpcrm06;
    String dateToday;
    String maxDateyear;
    String maxDate5Years;
    String maxDate49Years;
    String maxDate15Years;
    Calendar now = Calendar.getInstance();
    @BindViews({R.id.crn01dod1, R.id.crn01dod2, R.id.crn02dod1, R.id.crn02dod2, R.id.crn03dob1, R.id.crn03dob2, R.id.crn03dob3,
            R.id.crn04dob1, R.id.crn04dob2, R.id.crn04dod1, R.id.crn04dod2, R.id.crn05dob1, R.id.crn05dob2, R.id.crn05dod1,
            R.id.crn05dod2, R.id.crn06dob1, R.id.crn06dob2, R.id.crn06dod1, R.id.crn06dod2, R.id.crn07dob1, R.id.crn07dob2,
            R.id.crn07dod1, R.id.crn07dod2, R.id.crn08dob1, R.id.crn08dob2, R.id.crn08dod1, R.id.crn08dod2})
    List<DatePickerInputEditText> crndates;

    @BindViews({R.id.crn01dod1, R.id.crn01dod2, R.id.crn02dod1, R.id.crn02dod2,
            R.id.crn04dod1, R.id.crn04dod2, R.id.crn05dod1,
            R.id.crn05dod2, R.id.crn06dod1, R.id.crn06dod2,
            R.id.crn07dod1, R.id.crn07dod2, R.id.crn08dod1, R.id.crn08dod2})
    List<DatePickerInputEditText> crndateofDeath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_m);
        ButterKnife.bind(this);


        dateToday = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        maxDateyear = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_YEAR));
        maxDate5Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_5Years));
        maxDate49Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_49Years));
        maxDate15Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - (AppMain.MILLISECONDS_IN_15Years));


        for (DatePickerInputEditText de : crndates) {
            de.setManager(getSupportFragmentManager());
            de.setMaxDate(dateToday);
            de.setMinDate(maxDateyear);

        }


        crn07dob1.setMinDate(maxDate5Years);
        crn07dob1.setMaxDate(maxDateyear);
        crn07dob2.setMinDate(maxDate5Years);
        crn07dob2.setMaxDate(maxDateyear);
        crn08dob1.setMaxDate(maxDate15Years);
        crn08dob1.setMinDate(maxDate49Years);
        crn08dob2.setMaxDate(maxDate15Years);
        crn08dob2.setMinDate(maxDate49Years);
        crn08dod1.setMaxDate(dateToday);
        crn08dod1.setMinDate(maxDateyear);
        crn08dod2.setMaxDate(dateToday);
        crn08dod2.setMinDate(maxDateyear);

        crn04dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn04dod1.setMinDate(convertDateFormat(crn04dob1.getText().toString())); // Needed dd/MM/yyyy and converted to dd-MM-yyyy
                Calendar cal = getCalendarDate(crn04dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                crn04dod1.setMaxDate(sdf.format(cal.getTime()));
                crn04dod1.setEnabled(true);


            }
        });

        crn04dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn04dod2.setMinDate(convertDateFormat(crn04dob2.getText().toString()));
                Calendar cal = getCalendarDate(crn04dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 7);
                crn04dod2.setMaxDate(sdf.format(cal.getTime()));
                crn04dod2.setEnabled(true);


            }
        });

        crn05dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn05dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                crn05dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                crn05dod1.setMaxDate(sdf.format(cal.getTime()));
                crn05dod1.setEnabled(true);

            }
        });

        crn05dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn05dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 8);
                crn05dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 20);
                crn05dod2.setMaxDate(sdf.format(cal.getTime()));
                crn05dod2.setEnabled(true);

            }
        });

        crn06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod1.setMaxDate(sdf.format(cal.getTime()));
                crn06dod1.setEnabled(true);

            }
        });


        crn06dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob1.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod1.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod1.setMaxDate(sdf.format(cal.getTime()));
                crn06dod1.setEnabled(true);

            }
        });

        crn06dob2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                Calendar cal = getCalendarDate(crn06dob2.getText().toString());
                cal.add(Calendar.DAY_OF_MONTH, 29);
                crn06dod2.setMinDate(sdf.format(cal.getTime()));
                cal.add(Calendar.DAY_OF_MONTH, 335);
                crn06dod2.setMaxDate(sdf.format(cal.getTime()));
                crn06dod2.setEnabled(true);

            }
        });

        crn07dob1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                crn07dod1.setMinDate(maxDateyear);
                crn07dod1.setEnabled(true);

            }
        });

//******************************** Section M *******************
        //=============== Q 1B Skip Pattern==============
        crm01a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm01a.getText().toString().isEmpty() ? "0" : crm01a.getText().toString()) > 0) {
                    fldGrpcrm01b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm01b.setVisibility(View.GONE);
                    crm01b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 2B Skip Pattern==============
        crm02a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm02a.getText().toString().isEmpty() ? "0" : crm02a.getText().toString()) > 0) {
                    fldGrpcrm02b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm02b.setVisibility(View.GONE);
                    crm02b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 3B Skip Pattern==============
        crm03a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm03a.getText().toString().isEmpty() ? "0" : crm03a.getText().toString()) > 0) {
                    fldGrpcrm03b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm03b.setVisibility(View.GONE);
                    crm03b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4B Skip Pattern==============
        crm04a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm04a.getText().toString().isEmpty() ? "0" : crm04a.getText().toString()) > 0) {
                    fldGrpcrm04b.setVisibility(View.VISIBLE);
                    fldGrpcrm04.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm04.setVisibility(View.GONE);
                    fldGrpcrm04b.setVisibility(View.GONE);
                    crm04b.clearCheck();
                    crm041a.setText(null);
                    crm041b.clearCheck();
                    crm042a.setText(null);
                    crm042b.clearCheck();
                    crm043a.setText(null);
                    crm043b.clearCheck();
                    crm044a.setText(null);
                    crm044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.1 B Skip Pattern==============
        crm041a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm041a.getText().toString().isEmpty() ? "0" : crm041a.getText().toString()) > 0) {
                    fldGrpcrm041b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm041b.setVisibility(View.GONE);
                    crm041b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.2 B Skip Pattern==============
        crm042a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm042a.getText().toString().isEmpty() ? "0" : crm042a.getText().toString()) > 0) {
                    fldGrpcrm042b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm042b.setVisibility(View.GONE);
                    crm042b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.3 B Skip Pattern==============
        crm043a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm043a.getText().toString().isEmpty() ? "0" : crm043a.getText().toString()) > 0) {
                    fldGrpcrm043b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm043b.setVisibility(View.GONE);
                    crm043b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 4.4 B Skip Pattern==============
        crm044a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm044a.getText().toString().isEmpty() ? "0" : crm044a.getText().toString()) > 0) {
                    fldGrpcrm044b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm044b.setVisibility(View.GONE);
                    crm044b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 5B Skip Pattern==============
        crm05a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm05a.getText().toString().isEmpty() ? "0" : crm05a.getText().toString()) > 0) {
                    fldGrpcrm05b.setVisibility(View.VISIBLE);
                    fldGrpcrm05.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm05b.setVisibility(View.GONE);
                    fldGrpcrm05.setVisibility(View.GONE);
                    crm05b.clearCheck();
                    crm051a.setText(null);
                    crm051b.clearCheck();
                    crm052a.setText(null);
                    crm052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.1 B Skip Pattern==============
        crm051a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm051a.getText().toString().isEmpty() ? "0" : crm051a.getText().toString()) > 0) {
                    fldGrpcrm051b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm051b.setVisibility(View.GONE);
                    crm051b.clearCheck();


                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 5.2 B Skip Pattern==============
        crm052a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm052a.getText().toString().isEmpty() ? "0" : crm052a.getText().toString()) > 0) {
                    fldGrpcrm052b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm052b.setVisibility(View.GONE);
                    crm052b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=============== Q 6B Skip Pattern==============
        crm06a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm06a.getText().toString().isEmpty() ? "0" : crm06a.getText().toString()) > 0) {
                    fldGrpcrm06b.setVisibility(View.VISIBLE);
                    fldGrpcrm06.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm06b.setVisibility(View.GONE);
                    fldGrpcrm06.setVisibility(View.GONE);
                    crm06b.clearCheck();
                    crm061a.setText(null);
                    crm061b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 6.1 B Skip Pattern==============
        crm061a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm061a.getText().toString().isEmpty() ? "0" : crm061a.getText().toString()) > 0) {
                    fldGrpcrm061b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm061b.setVisibility(View.GONE);
                    crm061b.clearCheck();

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 7B Skip Pattern==============
        crm07a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm07a.getText().toString().isEmpty() ? "0" : crm07a.getText().toString()) > 0) {
                    fldGrpcrm07b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm07b.setVisibility(View.GONE);
                    crm07b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 8B Skip Pattern==============
        crm08a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm08a.getText().toString().isEmpty() ? "0" : crm08a.getText().toString()) > 0) {
                    fldGrpcrm08b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm08b.setVisibility(View.GONE);
                    crm08b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=============== Q 9B Skip Pattern==============
        crm09a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crm09a.getText().toString().isEmpty() ? "0" : crm09a.getText().toString()) > 0) {
                    fldGrpcrm09b.setVisibility(View.VISIBLE);
                } else {
                    fldGrpcrm09b.setVisibility(View.GONE);
                    crm09b.clearCheck();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

//*************************************** Section N ********************

        //======================== Q1 Skip Pattern
        crn01s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 0) {
                    fldGrpcrn01.setVisibility(View.GONE);
                    crn01dod1.setText(null);
                    crn01dod2.setText(null);
                } else {
                    fldGrpcrn01.setVisibility(View.VISIBLE);

                }

                if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 1) {
                    fldGrpcrn01.setVisibility(View.VISIBLE);
                    crn01dod2.setVisibility(View.GONE);
                    crn01dod2.setText(null);
                } else {
                    crn01dod2.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //======================== Q2 Skip Pattern
        crn02s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn02s.getText().toString().isEmpty() ? "0" : crn02s.getText().toString()) == 0) {
                    fldGrpcrn02.setVisibility(View.GONE);
                    crn02dod1.setText(null);
                    crn02dod2.setText(null);
                } else {
                    fldGrpcrn02.setVisibility(View.VISIBLE);

                }

                if (Integer.parseInt(crn02s.getText().toString().isEmpty() ? "0" : crn02s.getText().toString()) == 1) {
                    fldGrpcrn02.setVisibility(View.VISIBLE);
                    crn02dod2.setVisibility(View.GONE);
                    crn02dod2.setText(null);
                } else {
                    crn02dod2.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //======================== Q3 Skip Pattern
        crn03s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn03s.getText().toString().isEmpty() ? "0" : crn03s.getText().toString()) == 0) {
                    fldGrpcrn03.setVisibility(View.GONE);
                    crn03dob1.setText(null);
                    crn03dob2.setText(null);
                    crn03dob3.setText(null);
                } else {
                    fldGrpcrn03.setVisibility(View.VISIBLE);

                }

                if (Integer.parseInt(crn03s.getText().toString().isEmpty() ? "0" : crn03s.getText().toString()) == 1) {
                    fldGrpcrn03.setVisibility(View.VISIBLE);
                    crn03dob2.setVisibility(View.GONE);
                    crn03dob3.setVisibility(View.GONE);
                    crn03dob2.setText(null);
                    crn03dob3.setText(null);
                } else if (Integer.parseInt(crn03s.getText().toString().isEmpty() ? "0" : crn03s.getText().toString()) == 2) {
                    fldGrpcrn03.setVisibility(View.VISIBLE);
                    crn03dob2.setVisibility(View.VISIBLE);
                    crn03dob3.setVisibility(View.GONE);
                    crn03dob3.setText(null);
                } else if (Integer.parseInt(crn03s.getText().toString().isEmpty() ? "0" : crn03s.getText().toString()) == 3) {
                    fldGrpcrn03.setVisibility(View.VISIBLE);
                    crn03dob3.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=================== Q4 Skip Pattern

        crn04s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn04s.getText().toString().isEmpty() ? "0" : crn04s.getText().toString()) == 0) {
                    fldGrpcrn04.setVisibility(View.GONE);
                    crn04dob2.setText(null);
                    crn04dod2.setText(null);
                    crn04dob1.setText(null);
                    crn04dod1.setText(null);
                } else if (Integer.parseInt(crn04s.getText().toString().isEmpty() ? "0" : crn04s.getText().toString()) == 1) {
                    fldGrpcrn04.setVisibility(View.VISIBLE);
                    fldGrpcrn04dob2.setVisibility(View.GONE);
                    crn04dob2.setText(null);
                    crn04dod2.setText(null);
                } else if (Integer.parseInt(crn04s.getText().toString().isEmpty() ? "0" : crn04s.getText().toString()) == 2) {
                    fldGrpcrn04.setVisibility(View.VISIBLE);
                    fldGrpcrn04dob2.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=================== Q5 Skip Pattern

        crn05s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn05s.getText().toString().isEmpty() ? "0" : crn05s.getText().toString()) == 0) {
                    fldGrpcrn05.setVisibility(View.GONE);
                    crn05dob2.setText(null);
                    crn05dod2.setText(null);
                    crn05dob1.setText(null);
                    crn05dod1.setText(null);
                } else if (Integer.parseInt(crn05s.getText().toString().isEmpty() ? "0" : crn05s.getText().toString()) == 1) {
                    fldGrpcrn05.setVisibility(View.VISIBLE);
                    fldGrpcrn05dob2.setVisibility(View.GONE);
                    crn05dob2.setText(null);
                    crn05dod2.setText(null);
                } else if (Integer.parseInt(crn05s.getText().toString().isEmpty() ? "0" : crn05s.getText().toString()) == 2) {
                    fldGrpcrn05.setVisibility(View.VISIBLE);
                    fldGrpcrn05dob2.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        //=================== Q6 Skip Pattern

        crn06s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn06s.getText().toString().isEmpty() ? "0" : crn06s.getText().toString()) == 0) {
                    fldGrpcrn06.setVisibility(View.GONE);
                    crn06dob2.setText(null);
                    crn06dod2.setText(null);
                    crn06dob1.setText(null);
                    crn06dod1.setText(null);
                } else if (Integer.parseInt(crn06s.getText().toString().isEmpty() ? "0" : crn06s.getText().toString()) == 1) {
                    fldGrpcrn06.setVisibility(View.VISIBLE);
                    fldGrpcrn06dob2.setVisibility(View.GONE);
                    crn06dob2.setText(null);
                    crn06dod2.setText(null);
                } else if (Integer.parseInt(crn06s.getText().toString().isEmpty() ? "0" : crn06s.getText().toString()) == 2) {
                    fldGrpcrn06.setVisibility(View.VISIBLE);
                    fldGrpcrn06dob2.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=================== Q7 Skip Pattern

        crn07s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn07s.getText().toString().isEmpty() ? "0" : crn07s.getText().toString()) == 0) {
                    fldGrpcrn07.setVisibility(View.GONE);
                    crn07dob2.setText(null);
                    crn07dod2.setText(null);
                    crn07dob1.setText(null);
                    crn07dod1.setText(null);
                } else if (Integer.parseInt(crn07s.getText().toString().isEmpty() ? "0" : crn07s.getText().toString()) == 1) {
                    fldGrpcrn07.setVisibility(View.VISIBLE);
                    fldGrpcrn07dob2.setVisibility(View.GONE);
                    crn07dob2.setText(null);
                    crn07dod2.setText(null);
                } else if (Integer.parseInt(crn07s.getText().toString().isEmpty() ? "0" : crn07s.getText().toString()) == 2) {
                    fldGrpcrn07.setVisibility(View.VISIBLE);
                    fldGrpcrn07dob2.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //=================== Q8 Skip Pattern

        crn08s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (Integer.parseInt(crn08s.getText().toString().isEmpty() ? "0" : crn08s.getText().toString()) == 0) {
                    fldGrpcrn08.setVisibility(View.GONE);
                    crn08dob2.setText(null);
                    crn08dod2.setText(null);
                    crn08dob1.setText(null);
                    crn08dod1.setText(null);
                } else if (Integer.parseInt(crn08s.getText().toString().isEmpty() ? "0" : crn08s.getText().toString()) == 1) {
                    fldGrpcrn08.setVisibility(View.VISIBLE);
                    fldGrpcrn08dob2.setVisibility(View.GONE);
                    crn08dob2.setText(null);
                    crn08dod2.setText(null);
                } else if (Integer.parseInt(crn08s.getText().toString().isEmpty() ? "0" : crn08s.getText().toString()) == 2) {
                    fldGrpcrn08.setVisibility(View.VISIBLE);
                    fldGrpcrn08dob2.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

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

                Intent secNext = new Intent(this, EndingActivity.class);
                secNext.putExtra("complete", true);
                startActivity(secNext);

                //startActivity(new Intent(this, EndingActivity.class));
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
        //endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sm = new JSONObject();
        JSONObject sn = new JSONObject();

        sm.put("crm01a", crm01a.getText().toString());
        sm.put("crm01b", crm01b01.isChecked() ? "1" : crm01b02.isChecked() ? "2" : crm01b03.isChecked() ? "3"
                : crm01b04.isChecked() ? "4" : crm01b05.isChecked() ? "5" : crm01b06.isChecked() ? "6" : crm01b07.isChecked() ? "7"
                : crm01b08.isChecked() ? "8" : crm01b09.isChecked() ? "9" : crm01b10.isChecked() ? "10" : "0");

        sm.put("crm02a", crm02a.getText().toString());
        sm.put("crm02b", crm02b01.isChecked() ? "1" : crm02b02.isChecked() ? "2" : crm02b03.isChecked() ? "3"
                : crm02b04.isChecked() ? "4" : crm02b05.isChecked() ? "5" : crm02b06.isChecked() ? "6" : crm02b07.isChecked() ? "7"
                : crm02b08.isChecked() ? "8" : crm02b09.isChecked() ? "9" : crm02b10.isChecked() ? "10" : "0");

        sm.put("crm03a", crm03a.getText().toString());
        sm.put("crm03b", crm03b01.isChecked() ? "1" : crm03b02.isChecked() ? "2" : crm03b03.isChecked() ? "3"
                : crm03b04.isChecked() ? "4" : crm03b05.isChecked() ? "5" : crm03b06.isChecked() ? "6" : crm03b07.isChecked() ? "7"
                : crm03b08.isChecked() ? "8" : crm03b09.isChecked() ? "9" : crm03b10.isChecked() ? "10" : "0");

        sm.put("crm04a", crm04a.getText().toString());
        sm.put("crm04b", crm04b01.isChecked() ? "1" : crm04b02.isChecked() ? "2" : crm04b03.isChecked() ? "3"
                : crm04b04.isChecked() ? "4" : crm04b05.isChecked() ? "5" : crm04b06.isChecked() ? "6" : crm04b07.isChecked() ? "7"
                : crm04b08.isChecked() ? "8" : crm04b09.isChecked() ? "9" : crm04b10.isChecked() ? "10" : "0");

        sm.put("crm041a", crm041a.getText().toString());
        sm.put("crm041b", crm041b01.isChecked() ? "1" : crm041b02.isChecked() ? "2" : crm041b03.isChecked() ? "3"
                : crm041b04.isChecked() ? "4" : crm041b05.isChecked() ? "5" : crm041b06.isChecked() ? "6" : crm041b07.isChecked() ? "7"
                : crm041b08.isChecked() ? "8" : crm041b09.isChecked() ? "9" : crm041b10.isChecked() ? "10" : "0");

        sm.put("crm042a", crm042a.getText().toString());
        sm.put("crm042b", crm042b01.isChecked() ? "1" : crm042b02.isChecked() ? "2" : crm042b03.isChecked() ? "3"
                : crm042b04.isChecked() ? "4" : crm042b05.isChecked() ? "5" : crm042b06.isChecked() ? "6" : crm042b07.isChecked() ? "7"
                : crm042b08.isChecked() ? "8" : crm042b09.isChecked() ? "9" : crm042b10.isChecked() ? "10" : "0");

        sm.put("crm043a", crm043a.getText().toString());
        sm.put("crm043b", crm043b01.isChecked() ? "1" : crm043b02.isChecked() ? "2" : crm043b03.isChecked() ? "3"
                : crm043b04.isChecked() ? "4" : crm043b05.isChecked() ? "5" : crm043b06.isChecked() ? "6" : crm043b07.isChecked() ? "7"
                : crm043b08.isChecked() ? "8" : crm043b09.isChecked() ? "9" : crm043b10.isChecked() ? "10" : "0");

        sm.put("crm044a", crm044a.getText().toString());
        sm.put("crm044b", crm044b01.isChecked() ? "1" : crm044b02.isChecked() ? "2" : crm044b03.isChecked() ? "3"
                : crm044b04.isChecked() ? "4" : crm044b05.isChecked() ? "5" : crm044b06.isChecked() ? "6" : crm044b07.isChecked() ? "7"
                : crm044b08.isChecked() ? "8" : crm044b09.isChecked() ? "9" : crm044b10.isChecked() ? "10" : "0");

        sm.put("crm05a", crm05a.getText().toString());
        sm.put("crm05b", crm05b01.isChecked() ? "1" : crm05b02.isChecked() ? "2" : crm05b03.isChecked() ? "3"
                : crm05b04.isChecked() ? "4" : crm05b05.isChecked() ? "5" : crm05b06.isChecked() ? "6" : crm05b07.isChecked() ? "7"
                : crm05b08.isChecked() ? "8" : crm05b09.isChecked() ? "9" : crm05b10.isChecked() ? "10" : "0");

        sm.put("crm051a", crm051a.getText().toString());
        sm.put("crm051b", crm051b01.isChecked() ? "1" : crm051b02.isChecked() ? "2" : crm043b03.isChecked() ? "3"
                : crm051b04.isChecked() ? "4" : crm051b05.isChecked() ? "5" : crm051b06.isChecked() ? "6" : crm051b07.isChecked() ? "7"
                : crm051b08.isChecked() ? "8" : crm051b09.isChecked() ? "9" : crm051b10.isChecked() ? "10" : "0");

        sm.put("crm052a", crm052a.getText().toString());
        sm.put("crm052b", crm052b01.isChecked() ? "1" : crm052b02.isChecked() ? "2" : crm052b03.isChecked() ? "3"
                : crm052b04.isChecked() ? "4" : crm052b05.isChecked() ? "5" : crm052b06.isChecked() ? "6" : crm052b07.isChecked() ? "7"
                : crm052b08.isChecked() ? "8" : crm052b09.isChecked() ? "9" : crm052b10.isChecked() ? "10" : "0");

        sm.put("crm06a", crm06a.getText().toString());
        sm.put("crm06b", crm06b01.isChecked() ? "1" : crm06b02.isChecked() ? "2" : crm06b03.isChecked() ? "3"
                : crm06b04.isChecked() ? "4" : crm06b05.isChecked() ? "5" : crm06b06.isChecked() ? "6" : crm06b07.isChecked() ? "7"
                : crm06b08.isChecked() ? "8" : crm06b09.isChecked() ? "9" : crm06b10.isChecked() ? "10" : "0");

        sm.put("crm061a", crm061a.getText().toString());
        sm.put("crm061b", crm061b01.isChecked() ? "1" : crm061b02.isChecked() ? "2" : crm061b03.isChecked() ? "3"
                : crm061b04.isChecked() ? "4" : crm061b05.isChecked() ? "5" : crm061b06.isChecked() ? "6" : crm061b07.isChecked() ? "7"
                : crm061b08.isChecked() ? "8" : crm061b09.isChecked() ? "9" : crm061b10.isChecked() ? "10" : "0");

        sm.put("crm07a", crm07a.getText().toString());
        sm.put("crm07b", crm07b01.isChecked() ? "1" : crm07b02.isChecked() ? "2" : crm07b03.isChecked() ? "3"
                : crm07b04.isChecked() ? "4" : crm07b05.isChecked() ? "5" : crm07b06.isChecked() ? "6" : crm07b07.isChecked() ? "7"
                : crm07b08.isChecked() ? "8" : crm07b09.isChecked() ? "9" : crm07b10.isChecked() ? "10" : "0");

        sm.put("crm08a", crm08a.getText().toString());
        sm.put("crm08b", crm08b01.isChecked() ? "1" : crm08b02.isChecked() ? "2" : crm08b03.isChecked() ? "3"
                : crm08b04.isChecked() ? "4" : crm08b05.isChecked() ? "5" : crm08b06.isChecked() ? "6" : crm08b07.isChecked() ? "7"
                : crm08b08.isChecked() ? "8" : crm08b09.isChecked() ? "9" : crm08b10.isChecked() ? "10" : "0");

        sm.put("crm09a", crm09a.getText().toString());
        sm.put("crm09b", crm09b01.isChecked() ? "1" : crm09b02.isChecked() ? "2" : crm09b03.isChecked() ? "3"
                : crm09b04.isChecked() ? "4" : crm09b05.isChecked() ? "5" : crm09b06.isChecked() ? "6" : crm09b07.isChecked() ? "7"
                : crm09b08.isChecked() ? "8" : crm09b09.isChecked() ? "9" : crm09b10.isChecked() ? "10" : "0");

        sn.put("crn01s", crn01s.getText().toString());
        sn.put("crn01dod1", crn01dod1.getText().toString());
        sn.put("crn01dod2", crn01dod2.getText().toString());
        sn.put("crn02s", crn02s.getText().toString());
        sn.put("crn02dod1", crn02dod1.getText().toString());
        sn.put("crn02dod2", crn02dod2.getText().toString());

        sn.put("crn03s", crn03s.getText().toString());
        sn.put("crn03dob1", crn03dob1.getText().toString());
        sn.put("crn03dob2", crn03dob2.getText().toString());
        sn.put("crn03dob3", crn03dob3.getText().toString());

        sn.put("crn04s", crn04s.getText().toString());
        sn.put("crn04dob1", crn04dob1.getText().toString());
        sn.put("crn04dob2", crn04dob2.getText().toString());
        sn.put("crn04dod1", crn04dod1.getText().toString());
        sn.put("crn04dod2", crn04dod2.getText().toString());

        sn.put("crn05s", crn05s.getText().toString());
        sn.put("crn05dob1", crn05dob1.getText().toString());
        sn.put("crn05dob2", crn05dob2.getText().toString());
        sn.put("crn05dod1", crn05dod1.getText().toString());
        sn.put("crn05dod2", crn05dod2.getText().toString());

        sn.put("crn06s", crn06s.getText().toString());
        sn.put("crn06dob1", crn06dob1.getText().toString());
        sn.put("crn06dob2", crn06dob2.getText().toString());
        sn.put("crn06dod1", crn06dod1.getText().toString());
        sn.put("crn06dod2", crn06dod2.getText().toString());
        sn.put("crn07s", crn07s.getText().toString());
        sn.put("crn07dob1", crn07dob1.getText().toString());
        sn.put("crn07dob2", crn07dob2.getText().toString());
        sn.put("crn07dod1", crn07dod1.getText().toString());
        sn.put("crn07dod2", crn07dod2.getText().toString());
        sn.put("crn08s", crn08s.getText().toString());
        sn.put("crn08dob1", crn08dob1.getText().toString());
        sn.put("crn08dob2", crn08dob2.getText().toString());
        sn.put("crn08dod1", crn08dod1.getText().toString());
        sn.put("crn08dod2", crn08dod2.getText().toString());


        AppMain.fc.setsM(String.valueOf(sm));
        AppMain.fc.setsN(String.valueOf(sn));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating Section M", Toast.LENGTH_SHORT).show();

        //======================= Q 1 ===============
        if (crm01a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm01a.setError("This data is Required!");
            Log.i(TAG, "crm01a: This data is Required!");
            return false;
        } else {
            crm01a.setError(null);
        }

        if (Integer.valueOf(crm01a.getText().toString()) < 0 || Integer.valueOf(crm01a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm01a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm01a: This data is Required!");
            return false;
        } else {
            crm01a.setError(null);
        }

        if (Integer.valueOf(crm01a.getText().toString()) > 0) {
            if (crm01b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm01b10.setError("This data is Required!");
                Log.i(TAG, "crm01b: This data is Required!");
                return false;
            } else {
                crm01b10.setError(null);
            }
        }


        //======================= Q 2 ===============
        if (crm02a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm02a.setError("This data is Required!");
            Log.i(TAG, "crm02a: This data is Required!");
            return false;
        } else {
            crm02a.setError(null);
        }

        if (Integer.valueOf(crm02a.getText().toString()) < 0 || Integer.valueOf(crm02a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm02a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm02a: This data is Required!");
            return false;
        } else {
            crm02a.setError(null);
        }

        if (Integer.valueOf(crm02a.getText().toString()) > 0) {
            if (crm02b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm02b10.setError("This data is Required!");
                Log.i(TAG, "crm02b: This data is Required!");
                return false;
            } else {
                crm02b10.setError(null);
            }

        }


        //======================= Q 3 ===============
        if (crm03a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm03a.setError("This data is Required!");
            Log.i(TAG, "crm03a: This data is Required!");
            return false;
        } else {
            crm03a.setError(null);
        }

        if (Integer.valueOf(crm03a.getText().toString()) < 0 || Integer.valueOf(crm03a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm03a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm03a: This data is Required!");
            return false;
        } else {
            crm03a.setError(null);
        }

        if (Integer.valueOf(crm03a.getText().toString()) > 0) {
            if (crm03b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm03b10.setError("This data is Required!");
                Log.i(TAG, "crm03b: This data is Required!");
                return false;
            } else {
                crm03b10.setError(null);
            }

        }

        //======================= Q 4 ===============
        if (crm04a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm04a.setError("This data is Required!");
            Log.i(TAG, "crm01a: This data is Required!");
            return false;
        } else {
            crm04a.setError(null);
        }

        if (Integer.valueOf(crm04a.getText().toString()) < 0 || Integer.valueOf(crm04a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm04a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm04a: This data is Required!");
            return false;
        } else {
            crm04a.setError(null);
        }

        if (Integer.valueOf(crm04a.getText().toString()) > 0) {
            if (crm04b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm04b10.setError("This data is Required!");
                Log.i(TAG, "crm04b: This data is Required!");
                return false;
            } else {
                crm04b10.setError(null);
            }

            //======================= Q 4.1 ===============
            if (crm041a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm041a.setError("This data is Required!");
                Log.i(TAG, "crm041a: This data is Required!");
                return false;
            } else {
                crm041a.setError(null);
            }

            if (Integer.valueOf(crm041a.getText().toString()) < 0 || Integer.valueOf(crm041a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm041a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm01a: This data is Required!");
                return false;
            } else {
                crm041a.setError(null);
            }

            if (Integer.valueOf(crm041a.getText().toString()) > 0) {
                if (crm041b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm041b10.setError("This data is Required!");
                    Log.i(TAG, "crm041b: This data is Required!");
                    return false;
                } else {
                    crm041b10.setError(null);
                }

            }

            //======================= Q 4.2 ===============
            if (crm042a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm042a.setError("This data is Required!");
                Log.i(TAG, "crm042a: This data is Required!");
                return false;
            } else {
                crm042a.setError(null);
            }

            if (Integer.valueOf(crm042a.getText().toString()) < 0 || Integer.valueOf(crm042a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm042a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm042a: This data is Required!");
                return false;
            } else {
                crm042a.setError(null);
            }

            if (Integer.valueOf(crm042a.getText().toString()) > 0) {
                if (crm042b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm042b10.setError("This data is Required!");
                    Log.i(TAG, "crm042b: This data is Required!");
                    return false;
                } else {
                    crm042b10.setError(null);
                }

            }

            //======================= Q 4.3 ===============
            if (crm043a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm043a.setError("This data is Required!");
                Log.i(TAG, "crm043a: This data is Required!");
                return false;
            } else {
                crm043a.setError(null);
            }

            if (Integer.valueOf(crm043a.getText().toString()) < 0 || Integer.valueOf(crm043a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm043a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm043a: This data is Required!");
                return false;
            } else {
                crm043a.setError(null);
            }

            if (Integer.valueOf(crm043a.getText().toString()) > 0) {
                if (crm043b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm043b10.setError("This data is Required!");
                    Log.i(TAG, "crm043b: This data is Required!");
                    return false;
                } else {
                    crm043b10.setError(null);
                }

            }

            //======================= Q 4.4 ===============
            if (crm044a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm044a.setError("This data is Required!");
                Log.i(TAG, "crm044a: This data is Required!");
                return false;
            } else {
                crm044a.setError(null);
            }

            if (Integer.valueOf(crm044a.getText().toString()) < 0 || Integer.valueOf(crm044a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm044a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm044a: This data is Required!");
                return false;
            } else {
                crm044a.setError(null);
            }

            if (Integer.valueOf(crm044a.getText().toString()) > 0) {
                if (crm044b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm044b10.setError("This data is Required!");
                    Log.i(TAG, "crm044b: This data is Required!");
                    return false;
                } else {
                    crm044b10.setError(null);
                }

            }

        }

        //======================= Q 5 ===============
        if (crm05a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm05a.setError("This data is Required!");
            Log.i(TAG, "crm05a: This data is Required!");
            return false;
        } else {
            crm05a.setError(null);
        }

        if (Integer.valueOf(crm05a.getText().toString()) < 0 || Integer.valueOf(crm05a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm05a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm05a: This data is Required!");
            return false;
        } else {
            crm05a.setError(null);
        }

        if (Integer.valueOf(crm05a.getText().toString()) > 0) {
            if (crm05b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm05b10.setError("This data is Required!");
                Log.i(TAG, "crm05b: This data is Required!");
                return false;
            } else {
                crm05b10.setError(null);
            }

            //======================= Q 5.1 ===============
            if (crm051a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm051a.setError("This data is Required!");
                Log.i(TAG, "crm051a: This data is Required!");
                return false;
            } else {
                crm051a.setError(null);
            }

            if (Integer.valueOf(crm051a.getText().toString()) < 0 || Integer.valueOf(crm051a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm051a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm051a: This data is Required!");
                return false;
            } else {
                crm051a.setError(null);
            }

            if (Integer.valueOf(crm051a.getText().toString()) > 0) {
                if (crm051b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm051b10.setError("This data is Required!");
                    Log.i(TAG, "crm051b: This data is Required!");
                    return false;
                } else {
                    crm051b10.setError(null);
                }

            }

            //======================= Q 5.2 ===============
            if (crm052a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm052a.setError("This data is Required!");
                Log.i(TAG, "crm052a: This data is Required!");
                return false;
            } else {
                crm052a.setError(null);
            }


            if (Integer.valueOf(crm052a.getText().toString()) < 0 || Integer.valueOf(crm052a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm052a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm052a: This data is Required!");
                return false;
            } else {
                crm052a.setError(null);
            }

            if (Integer.valueOf(crm052a.getText().toString()) > 0) {
                if (crm052b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm052b10.setError("This data is Required!");
                    Log.i(TAG, "crm052b: This data is Required!");
                    return false;
                } else {
                    crm052b10.setError(null);
                }

            }


        }

        //======================= Q 6 ===============
        if (crm06a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm06a.setError("This data is Required!");
            Log.i(TAG, "crm06a: This data is Required!");
            return false;
        } else {
            crm06a.setError(null);
        }

        if (Integer.valueOf(crm06a.getText().toString()) < 0 || Integer.valueOf(crm06a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm06a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm06a: This data is Required!");
            return false;
        } else {
            crm06a.setError(null);
        }

        if (Integer.valueOf(crm06a.getText().toString()) > 0) {
            if (crm06b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm06b10.setError("This data is Required!");
                Log.i(TAG, "crm06b: This data is Required!");
                return false;
            } else {
                crm06b10.setError(null);
            }

            //======================= Q 6.1 ===============
            if (crm061a.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm061a.setError("This data is Required!");
                Log.i(TAG, "crm061a: This data is Required!");
                return false;
            } else {
                crm061a.setError(null);
            }

            if (Integer.valueOf(crm061a.getText().toString()) < 0 || Integer.valueOf(crm061a.getText().toString()) > 7) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
                crm061a.setError("Range is 0 - 7 days");
                Log.i(TAG, "crm061a: This data is Required!");
                return false;
            } else {
                crm061a.setError(null);
            }

            if (Integer.valueOf(crm061a.getText().toString()) > 0) {
                if (crm061b.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                    crm061b10.setError("This data is Required!");
                    Log.i(TAG, "crm061b: This data is Required!");
                    return false;
                } else {
                    crm061b10.setError(null);
                }

            }


        }

        //======================= Q 7 ===============
        if (crm07a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm07a.setError("This data is Required!");
            Log.i(TAG, "crm07a: This data is Required!");
            return false;
        } else {
            crm07a.setError(null);
        }

        if (Integer.valueOf(crm07a.getText().toString()) < 0 || Integer.valueOf(crm07a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm07a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm07a: This data is Required!");
            return false;
        } else {
            crm07a.setError(null);
        }

        if (Integer.valueOf(crm07a.getText().toString()) > 0) {
            if (crm07b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm07b10.setError("This data is Required!");
                Log.i(TAG, "crm07b: This data is Required!");
                return false;
            } else {
                crm07b10.setError(null);
            }

        }

        //======================= Q 8 ===============
        if (crm08a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm08a.setError("This data is Required!");
            Log.i(TAG, "crm08a: This data is Required!");
            return false;
        } else {
            crm08a.setError(null);
        }

        if (Integer.valueOf(crm08a.getText().toString()) < 0 || Integer.valueOf(crm08a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm08a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm08a: This data is Required!");
            return false;
        } else {
            crm08a.setError(null);
        }

        if (Integer.valueOf(crm08a.getText().toString()) > 0) {
            if (crm08b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm08b10.setError("This data is Required!");
                Log.i(TAG, "crm08b: This data is Required!");
                return false;
            } else {
                crm08b10.setError(null);
            }

        }

        //======================= Q 9 ===============
        if (crm09a.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm09a.setError("This data is Required!");
            Log.i(TAG, "crm09a: This data is Required!");
            return false;
        } else {
            crm09a.setError(null);
        }

        if (Integer.valueOf(crm09a.getText().toString()) < 0 || Integer.valueOf(crm09a.getText().toString()) > 7) {
            Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.crm01a), Toast.LENGTH_SHORT).show();
            crm09a.setError("Range is 0 - 7 days");
            Log.i(TAG, "crm09a: This data is Required!");
            return false;
        } else {
            crm09a.setError(null);
        }

        if (Integer.valueOf(crm09a.getText().toString()) > 0) {
            if (crm09b.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crm01b), Toast.LENGTH_SHORT).show();
                crm09b10.setError("This data is Required!");
                Log.i(TAG, "crm09b: This data is Required!");
                return false;
            } else {
                crm09b10.setError(null);
            }

        }

//================================= Section N ***************************************
        //======================== Q 1 ==========================

        if (crn01s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
            crn01s.setError("This data is Required!");
            Log.i(TAG, "crn01s: This data is Required!");
            return false;
        } else {
            crn01s.setError(null);
        }

        if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 1) {
            if (crn01dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
                crn01dod1.setError("This data is Required!");
                Log.i(TAG, "crn01dod1: This data is Required!");
                return false;
            } else {
                crn01dod1.setError(null);
            }
        }

        if (Integer.parseInt(crn01s.getText().toString().isEmpty() ? "0" : crn01s.getText().toString()) == 2) {
            if (crn01dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn01), Toast.LENGTH_SHORT).show();
                crn01dod2.setError("This data is Required!");
                Log.i(TAG, "crn01dod2: This data is Required!");
                return false;
            } else {
                crn01dod2.setError(null);
            }
        }

        //======================== Q 2 ==========================

        if (crn02s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
            crn02s.setError("This data is Required!");
            Log.i(TAG, "crn02s: This data is Required!");
            return false;
        } else {
            crn02s.setError(null);
        }
        if (Integer.valueOf(crn02s.getText().toString()) == 1) {
            if (crn02dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
                crn02dod1.setError("This data is Required!");
                Log.i(TAG, "crn02dod1: This data is Required!");
                return false;
            } else {
                crn02dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn02s.getText().toString()) == 2) {
            if (crn02dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn02), Toast.LENGTH_SHORT).show();
                crn02dod2.setError("This data is Required!");
                Log.i(TAG, "crn02dod2: This data is Required!");
                return false;
            } else {
                crn02dod2.setError(null);
            }
        }

        //======================== Q 3 ==========================

        if (crn03s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
            crn03s.setError("This data is Required!");
            Log.i(TAG, "crn03s: This data is Required!");
            return false;
        } else {
            crn03s.setError(null);
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 1) {
            if (crn03dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob1.setError("This data is Required!");
                Log.i(TAG, "crn03dob1: This data is Required!");
                return false;
            } else {
                crn03dob1.setError(null);
            }
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 2) {
            if (crn03dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob2.setError("This data is Required!");
                Log.i(TAG, "crn03dob2: This data is Required!");
                return false;
            } else {
                crn03dob2.setError(null);
            }
        }

        if (Integer.valueOf(crn03s.getText().toString()) == 3) {
            if (crn03dob3.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn03), Toast.LENGTH_SHORT).show();
                crn03dob3.setError("This data is Required!");
                Log.i(TAG, "crn03dob3: This data is Required!");
                return false;
            } else {
                crn03dob3.setError(null);
            }
        }

        //================ Q4============

        if (crn04s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
            crn04s.setError("This data is Required!");
            Log.i(TAG, "crn04s: This data is Required!");
            return false;
        } else {
            crn04s.setError(null);
        }

        if (Integer.valueOf(crn04s.getText().toString()) == 1) {
            if (crn04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dob1.setError("This data is Required!");
                Log.i(TAG, "crn04dob1: This data is Required!");
                return false;
            } else {
                crn04dob1.setError(null);
            }

            if (crn04dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dod1.setError("This data is Required!");
                Log.i(TAG, "crn04dod1: This data is Required!");
                return false;
            } else {
                crn04dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn04s.getText().toString()) == 2) {
            if (crn04dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dob2.setError("This data is Required!");
                Log.i(TAG, "crn04dob2: This data is Required!");
                return false;
            } else {
                crn04dob2.setError(null);
            }

            if (crn04dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn04), Toast.LENGTH_SHORT).show();
                crn04dod2.setError("This data is Required!");
                Log.i(TAG, "crn04dod2: This data is Required!");
                return false;
            } else {
                crn04dod2.setError(null);
            }
        }


        //================ Q5============

        if (crn05s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
            crn05s.setError("This data is Required!");
            Log.i(TAG, "crn05s: This data is Required!");
            return false;
        } else {
            crn05s.setError(null);
        }

        if (Integer.valueOf(crn05s.getText().toString()) == 1) {
            if (crn05dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dob1.setError("This data is Required!");
                Log.i(TAG, "crn05dob1: This data is Required!");
                return false;
            } else {
                crn05dob1.setError(null);
            }

            if (crn05dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dod1.setError("This data is Required!");
                Log.i(TAG, "crn05dod1: This data is Required!");
                return false;
            } else {
                crn05dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn05s.getText().toString()) == 2) {
            if (crn05dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dob2.setError("This data is Required!");
                Log.i(TAG, "crn05dob2: This data is Required!");
                return false;
            } else {
                crn05dob2.setError(null);
            }

            if (crn05dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn05), Toast.LENGTH_SHORT).show();
                crn05dod2.setError("This data is Required!");
                Log.i(TAG, "crn05dod2: This data is Required!");
                return false;
            } else {
                crn05dod2.setError(null);
            }
        }

        //================ Q6============

        if (crn06s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
            crn06s.setError("This data is Required!");
            Log.i(TAG, "crn06s: This data is Required!");
            return false;
        } else {
            crn06s.setError(null);
        }

        if (Integer.valueOf(crn06s.getText().toString()) == 1) {
            if (crn04dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dob1.setError("This data is Required!");
                Log.i(TAG, "crn06dob1: This data is Required!");
                return false;
            } else {
                crn06dob1.setError(null);
            }

            if (crn06dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dod1.setError("This data is Required!");
                Log.i(TAG, "crn06dod1: This data is Required!");
                return false;
            } else {
                crn06dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn06s.getText().toString()) == 2) {
            if (crn06dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dob2.setError("This data is Required!");
                Log.i(TAG, "crn06dob2: This data is Required!");
                return false;
            } else {
                crn06dob2.setError(null);
            }

            if (crn06dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn06), Toast.LENGTH_SHORT).show();
                crn06dod2.setError("This data is Required!");
                Log.i(TAG, "crn06dod2: This data is Required!");
                return false;
            } else {
                crn06dod2.setError(null);
            }
        }

        //================ Q7============

        if (crn07s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
            crn07s.setError("This data is Required!");
            Log.i(TAG, "crn07s: This data is Required!");
            return false;
        } else {
            crn07s.setError(null);
        }

        if (Integer.valueOf(crn07s.getText().toString()) == 1) {
            if (crn07dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dob1.setError("This data is Required!");
                Log.i(TAG, "crn07dob1: This data is Required!");
                return false;
            } else {
                crn07dob1.setError(null);
            }

            if (crn07dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dod1.setError("This data is Required!");
                Log.i(TAG, "crn07dod1: This data is Required!");
                return false;
            } else {
                crn07dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn07s.getText().toString()) == 2) {
            if (crn07dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dob2.setError("This data is Required!");
                Log.i(TAG, "crn07dob2: This data is Required!");
                return false;
            } else {
                crn07dob2.setError(null);
            }

            if (crn07dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn07), Toast.LENGTH_SHORT).show();
                crn07dod2.setError("This data is Required!");
                Log.i(TAG, "crn07dod2: This data is Required!");
                return false;
            } else {
                crn07dod2.setError(null);
            }
        }

        //================ Q8============

        if (crn08s.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
            crn08s.setError("This data is Required!");
            Log.i(TAG, "crn01s: This data is Required!");
            return false;
        } else {
            crn08s.setError(null);
        }

        if (Integer.valueOf(crn08s.getText().toString()) == 1) {
            if (crn08dob1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dob1.setError("This data is Required!");
                Log.i(TAG, "crn08dob1: This data is Required!");
                return false;
            } else {
                crn08dob1.setError(null);
            }

            if (crn08dod1.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dod1.setError("This data is Required!");
                Log.i(TAG, "crn08dod1: This data is Required!");
                return false;
            } else {
                crn08dod1.setError(null);
            }
        }

        if (Integer.valueOf(crn08s.getText().toString()) == 2) {
            if (crn08dob2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dob2.setError("This data is Required!");
                Log.i(TAG, "crn08dob2: This data is Required!");
                return false;
            } else {
                crn08dob2.setError(null);
            }

            if (crn08dod2.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.crn08), Toast.LENGTH_SHORT).show();
                crn08dod2.setError("This data is Required!");
                Log.i(TAG, "crn08dod2: This data is Required!");
                return false;
            } else {
                crn08dod2.setError(null);
            }
        }


        return true;

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

//        int updcount = db.updateSM();
        int updcount = db.updateSM() == 1 ?
                (db.updateSN() == 1 ? 1 : db.updateSN()) : db.updateSM();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public Calendar getCalendarDate(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(value);
            calendar.setTime(date);
            return calendar;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }

    public String convertDateFormat(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d = sdf.parse(dateStr);
            return new SimpleDateFormat("dd/MM/yyyy").format(d);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        return "";
    }


}
