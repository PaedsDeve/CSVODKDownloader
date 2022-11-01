package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class TehsilsContract implements BaseColumns {

    String tehsil_code;
    String tehsil_name;

    public TehsilsContract sync(JSONObject jsonObject) throws JSONException {
        this.tehsil_code = jsonObject.getString(TehsilTable.COLUMN_TEHSIL_CODE);
        this.tehsil_name = jsonObject.getString(TehsilTable.COLUMN_TEHSIL_NAME);

        return this;
    }

    public TehsilsContract hydrate(Cursor cursor) {
        this.tehsil_code = cursor.getString(cursor.getColumnIndex(TehsilTable.COLUMN_TEHSIL_CODE));
        this.tehsil_name = cursor.getString(cursor.getColumnIndex(TehsilTable.COLUMN_TEHSIL_NAME));

        return this;
    }

    public String getTehsil_code() {
        return tehsil_code;
    }

    public void setTehsil_code(String tehsil_code) {
        this.tehsil_code = tehsil_code;
    }

    public String getTehsil_name() {
        return tehsil_name;
    }

    public void setTehsil_name(String tehsil_name) {
        this.tehsil_name = tehsil_name;
    }

    public abstract class TehsilTable implements BaseColumns {


        public static final String TABLE_NAME = "tehsil";
        public static final String URI = "/gettehsil.php";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";

        public static final String _ID = "_ID";
        public static final String COLUMN_TEHSIL_CODE = "tehsil_code";
        public static final String COLUMN_TEHSIL_NAME = "tehsil_name";

    }
}