package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class SourceNGOContract {

    private String sourceId;
    private String sourceName;

    public SourceNGOContract() {
    }

    public SourceNGOContract sync(JSONObject jsonObject) throws JSONException {

        this.sourceId = jsonObject.getString(SourceTable.COLUMN_SOURCE_ID);
        this.sourceName = jsonObject.getString(SourceTable.COLUMN_SOURCE_NAME);

        return this;
    }

    public SourceNGOContract hydrate(Cursor cursor) {
        this.sourceId = cursor.getString(cursor.getColumnIndex(SourceTable.COLUMN_SOURCE_ID));
        this.sourceName = cursor.getString(cursor.getColumnIndex(SourceTable.COLUMN_SOURCE_NAME));

        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public SourceNGOContract setDefaultVal(String code, String name) {
        this.sourceId = code;
        this.sourceName = name;

        return this;
    }

    public static abstract class SourceTable implements BaseColumns {

        public static final String URI = "/getngos.php";

        public static final String TABLE_NAME = "Source";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";

        public static final String _ID = "_ID";
        public static final String COLUMN_SOURCE_ID = "id";
        public static final String COLUMN_SOURCE_NAME = "ngo";

    }

}
