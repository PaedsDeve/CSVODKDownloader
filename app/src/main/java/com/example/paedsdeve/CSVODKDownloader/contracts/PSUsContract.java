package com.example.paedsdeve.CSVODKDownloader.contracts;


import android.database.Cursor;
import android.provider.BaseColumns;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class PSUsContract {

    private static final String TAG = "PSUs_CONTRACT";

    private Long _ID;
    private String LUID;
    private String psu; // hh02
    private String hh03;  // Structure
    private String hh07; // Extension
    private String hh;
    private String child_name;

    public PSUsContract() {
    }


    public PSUsContract(JSONObject jsonObject) throws JSONException {
        this.LUID = jsonObject.getString(singleChild.COLUMN_LUID);
        Log.d(TAG, "PSUsContract: LUID " + this.LUID);
        this.psu = jsonObject.getString(singleChild.COLUMN_PSU);
        this.hh03 = jsonObject.getString(singleChild.COLUMN_HH03);
        this.hh07 = jsonObject.getString(singleChild.COLUMN_HH07);
        Log.d(TAG, "PSUsContract: HH07 " + this.hh07);

        this.hh = jsonObject.getString(singleChild.COLUMN_HH03)
                + "-" + jsonObject.getString(singleChild.COLUMN_HH07);
        this.child_name = jsonObject.getString(singleChild.COLUMN_CHILD_NAME);

    }

    public PSUsContract(Cursor cursor) {
        this.LUID = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_LUID));
        this.psu = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_PSU));
        this.hh03 = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_HH03));
        this.hh07 = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_HH07));
        this.hh = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_HH03))
                + "-" + cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_HH07));
        this.child_name = cursor.getString(cursor.getColumnIndex(singleChild.COLUMN_CHILD_NAME));
    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getLUID() {
        return LUID;
    }

    public void setLUID(String LUID) {
        this.LUID = LUID;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getHh03() {
        return hh03;
    }

    public void setHh03(String hh03) {
        this.hh03 = hh03;
    }

    public String getHh07() {
        return hh07;
    }

    public void setHh07(String hh07) {
        this.hh07 = hh07;
    }

    public String getHh() {
        return hh03 + "-" + "" + hh07;
    }

    public void setHh(String hh) {
        this.hh = hh;
    }

    public String getChild_name() {
        return child_name;
    }

    public void setChild_name(String child_name) {
        this.child_name = child_name;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(singleChild._ID, this._ID);
        json.put(singleChild.COLUMN_LUID, this.LUID);
        json.put(singleChild.COLUMN_PSU, this.psu);
        json.put(singleChild.COLUMN_HH, this.hh);
        json.put(singleChild.COLUMN_CHILD_NAME, this.child_name);

        return json;
    }

    public static abstract class singleChild implements BaseColumns {

        public static final String TABLE_NAME = "psus";
        public static final String _ID = "id";
        public static final String COLUMN_LUID = "uid";
        public static final String COLUMN_PSU = "hh02";
        public static final String COLUMN_HH03 = "hh03";
        public static final String COLUMN_HH07 = "hh07";
        public static final String COLUMN_HH = "hh";
        public static final String COLUMN_CHILD_NAME = "child_name";

    }

}