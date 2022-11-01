package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class HFacilitiesContract implements BaseColumns {

    String hFacilityCode;
    String hFacilityName;
    String tehsilCode;

    public HFacilitiesContract sync(JSONObject jsonObject) throws JSONException {
        this.hFacilityCode = jsonObject.getString(HFacilityTable.COLUMN_HFACILITY_CODE);
        this.hFacilityName = jsonObject.getString(HFacilityTable.COLUMN_HFACILITY_NAME);
        this.tehsilCode = jsonObject.getString(HFacilityTable.COLUMN_TEHSIL_CODE);

        return this;
    }

    public HFacilitiesContract hydrate(Cursor cursor) {
        this.hFacilityCode = cursor.getString(cursor.getColumnIndex(HFacilityTable.COLUMN_HFACILITY_CODE));
        this.hFacilityName = cursor.getString(cursor.getColumnIndex(HFacilityTable.COLUMN_HFACILITY_NAME));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(HFacilityTable.COLUMN_TEHSIL_CODE));

        return this;
    }

    public String gethFacilityCode() {
        return hFacilityCode;
    }

    public void sethFacilityCode(String hFacilityCode) {
        this.hFacilityCode = hFacilityCode;
    }

    public String gethFacilityName() {
        return hFacilityName;
    }

    public void sethFacilityName(String hFacilityName) {
        this.hFacilityName = hFacilityName;
    }

    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }

    public abstract class HFacilityTable implements BaseColumns {


        public static final String TABLE_NAME = "hFacilities";
        public static final String URI = "/gethf.php";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";

        public static final String _ID = "_ID";
        public static final String COLUMN_HFACILITY_CODE = "hf_code";
        public static final String COLUMN_HFACILITY_NAME = "health_facility";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";

    }
}