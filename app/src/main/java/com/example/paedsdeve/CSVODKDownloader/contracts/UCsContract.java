package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class UCsContract {

    private static String TAG = "";

    private String ucCode;
    private String ucName;
    private String tehsilCode;

    public UCsContract() {
    }

    public UCsContract sync(JSONObject jsonObject) throws JSONException {

        this.ucCode = jsonObject.getString(UcTable.COLUMN_UC_CODE);
        this.ucName = jsonObject.getString(UcTable.COLUMN_UC_NAME);
        this.tehsilCode = jsonObject.getString(UcTable.COLUMN_TEHSIL_CODE);

        return this;
    }

    public UCsContract hydrate(Cursor cursor) {
        this.ucCode = cursor.getString(cursor.getColumnIndex(UcTable.COLUMN_UC_CODE));
        this.ucName = cursor.getString(cursor.getColumnIndex(UcTable.COLUMN_UC_NAME));
        this.tehsilCode = cursor.getString(cursor.getColumnIndex(UcTable.COLUMN_TEHSIL_CODE));

        return this;
    }

    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
    }

    public String getUcName() {
        return ucName;
    }

    public void setUcName(String ucName) {
        this.ucName = ucName;
    }

    public String getTehsilCode() {
        return tehsilCode;
    }

    public void setTehsilCode(String tehsilCode) {
        this.tehsilCode = tehsilCode;
    }

    public UCsContract setDefaultVal(String code, String name) {
        this.ucCode = code;
        this.ucName = name;

        return this;
    }

    public static abstract class UcTable implements BaseColumns {

        public static final String URI = "/getucs.php";

        public static final String TABLE_NAME = "Ucs";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";

        public static final String _ID = "_ID";
        public static final String COLUMN_UC_CODE = "uc_code";
        public static final String COLUMN_UC_NAME = "uc_name";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";

    }

}
