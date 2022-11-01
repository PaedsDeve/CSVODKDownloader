package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class LHWsContract {

    private String LHWCode;
    private String LHWName;
    private String areaType;
    private String hfCode;
    private String status;


    public LHWsContract() {
    }

    public LHWsContract sync(JSONObject jsonObject) throws JSONException {
        this.LHWCode = jsonObject.getString(LHWTable.COLUMN_LHW_CODE);
        this.LHWName = jsonObject.getString(LHWTable.COLUMN_LHW_NAME);
        this.hfCode = jsonObject.getString(LHWTable.COLUMN_HF_CODE);
        this.areaType = jsonObject.getString(LHWTable.COLUMN_AREA_TYPE);
        this.status = jsonObject.getString(LHWTable.COLUMN_STATUS);


        return this;
    }

    public LHWsContract hydrate(Cursor cursor) {
        this.LHWCode = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_CODE));
        this.LHWName = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_LHW_NAME));
        this.hfCode = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_HF_CODE));
        this.areaType = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_AREA_TYPE));
        this.status = cursor.getString(cursor.getColumnIndex(LHWTable.COLUMN_STATUS));

        return this;
    }

    public String getLHWCode() {
        return LHWCode;
    }

    public void setLHWCode(String LHWCode) {
        this.LHWCode = LHWCode;
    }

    public String getLHWName() {
        return LHWName;
    }

    public void setLHWName(String LHWName) {
        this.LHWName = LHWName;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getHfCode() {
        return hfCode;
    }

    public void setHfCode(String hfCode) {
        this.hfCode = hfCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static abstract class LHWTable implements BaseColumns {

        public static final String TABLE_NAME = "lhws";
        public static final String URI = "/getlhws.php";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String _ID = "_id";
        public static final String COLUMN_LHW_CODE = "lhw_code";
        public static final String COLUMN_LHW_NAME = "lhw_name";
        public static final String COLUMN_AREA_TYPE = "area_type";
        public static final String COLUMN_HF_CODE = "hf_code";
        public static final String COLUMN_STATUS = "status";

    }

}
