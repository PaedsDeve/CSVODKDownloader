package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

public class VillagesContract {

    private String villageCode;
    private String villageName;
    private String ucCode;


    public VillagesContract() {
    }

    public VillagesContract sync(JSONObject jsonObject) throws JSONException {
        this.villageCode = jsonObject.getString(VillageTable.COLUMN_VILLAGE_CODE);
        this.villageName = jsonObject.getString(VillageTable.COLUMN_VILLAGE_NAME);
        this.ucCode = jsonObject.getString(VillageTable.COLUMN_UC_CODE);


        return this;
    }

    public VillagesContract hydrate(Cursor cursor) {
        this.villageCode = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_VILLAGE_CODE));
        this.villageName = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_VILLAGE_NAME));
        this.ucCode = cursor.getString(cursor.getColumnIndex(VillageTable.COLUMN_UC_CODE));

        return this;
    }

    public VillagesContract setDefaultVal(String code, String name) {
        this.villageCode = code;
        this.villageName = name;

        return this;
    }

    public String getVillageCode() {
        return villageCode;
    }

    public void setVillageCode(String villageCode) {
        this.villageCode = villageCode;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getUcCode() {
        return ucCode;
    }

    public void setUcCode(String ucCode) {
        this.ucCode = ucCode;
    }

    public static abstract class VillageTable implements BaseColumns {

        public static final String TABLE_NAME = "villages";
        public static final String URI = "/getvillages.php";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String _ID = "_id";
        public static final String COLUMN_VILLAGE_CODE = "village_code";
        public static final String COLUMN_VILLAGE_NAME = "village_name";
        public static final String COLUMN_UC_CODE = "uc_code";

    }

}
