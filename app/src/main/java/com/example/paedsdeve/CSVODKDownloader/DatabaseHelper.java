package com.example.paedsdeve.CSVODKDownloader;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.example.paedsdeve.CSVODKDownloader.contracts.FormsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.HFacilitiesContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.LHWsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.PSUsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.SourceNGOContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.TehsilsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.UCsContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.UsersContract;
import com.example.paedsdeve.CSVODKDownloader.contracts.VillagesContract;

/**
 * Created by hassan.naqvi on 10/29/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String SQL_CREATE_PSU = "CREATE TABLE " + PSUsContract.singleChild.TABLE_NAME + "("
            + PSUsContract.singleChild._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + PSUsContract.singleChild.COLUMN_PSU + " TEXT,"
            + PSUsContract.singleChild.COLUMN_LUID + " TEXT,"
            + PSUsContract.singleChild.COLUMN_HH + " TEXT,"
            + PSUsContract.singleChild.COLUMN_HH03 + " TEXT,"
            + PSUsContract.singleChild.COLUMN_HH07 + " TEXT,"
            + PSUsContract.singleChild.COLUMN_CHILD_NAME + " TEXT );";
    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT );";
    public static final String DATABASE_NAME = "cbt.db";
    public static final String DB_NAME = "cbt_copy.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_FORMS = "CREATE TABLE "
            + FormsContract.FormsTable.TABLE_NAME + "("
            + FormsContract.FormsTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            FormsContract.FormsTable.COLUMN_UID + " TEXT," +
            FormsContract.FormsTable.COLUMN_HHDT + " TEXT," +
            FormsContract.FormsTable.COLUMN_TEHSIL + " TEXT," +
            FormsContract.FormsTable.COLUMN_HFACILITY + " TEXT," +
            FormsContract.FormsTable.COLUMN_LHWCODE + " TEXT," +
            FormsContract.FormsTable.COLUMN_HOUSEHOLD + " TEXT," +
            FormsContract.FormsTable.COLUMN_CHILDID + " TEXT," +
            FormsContract.FormsTable.COLUMN_UCCODE + " TEXT," +
            FormsContract.FormsTable.COLUMN_VILLAGENAME + " TEXT," +
            FormsContract.FormsTable.COLUMN_ISTATUS + " TEXT," +
            FormsContract.FormsTable.COLUMN_NAME_USERNAME + " TEXT," +
            FormsContract.FormsTable.COLUMN_DEVICETAGID + " TEXT," +
            FormsContract.FormsTable.COLUMN_SA + " TEXT," +
            FormsContract.FormsTable.COLUMN_SB + " TEXT," +
            FormsContract.FormsTable.COLUMN_SC + " TEXT," +
            FormsContract.FormsTable.COLUMN_SD + " TEXT," +
            FormsContract.FormsTable.COLUMN_SE + " TEXT," +
            FormsContract.FormsTable.COLUMN_SF + " TEXT," +
            FormsContract.FormsTable.COLUMN_SG + " TEXT," +
            FormsContract.FormsTable.COLUMN_SH + " TEXT," +
            FormsContract.FormsTable.COLUMN_SI + " TEXT," +
            FormsContract.FormsTable.COLUMN_SJ + " TEXT," +
            FormsContract.FormsTable.COLUMN_SK + " TEXT," +
            FormsContract.FormsTable.COLUMN_SL + " TEXT," +
            FormsContract.FormsTable.COLUMN_SM + " TEXT," +
            FormsContract.FormsTable.COLUMN_SN + " TEXT," +
            FormsContract.FormsTable.COLUMN_GPSLAT + " TEXT," +
            FormsContract.FormsTable.COLUMN_GPSLNG + " TEXT," +
            FormsContract.FormsTable.COLUMN_GPSTIME + " TEXT," +
            FormsContract.FormsTable.COLUMN_GPSACC + " TEXT," +
            FormsContract.FormsTable.COLUMN_DEVICEID + " TEXT," +
            FormsContract.FormsTable.COLUMN_SYNCED + " TEXT," +
            FormsContract.FormsTable.COLUMN_SYNCED_DATE + " TEXT"
            + " );";
    private static final String SQL_DELETE_FORMS = "DROP TABLE IF EXISTS " + FormsContract.FormsTable.TABLE_NAME;
    private static final String SQL_DELETE_USERS = "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;
    private static final String SQL_DELETE_PSUS = "DROP TABLE IF EXISTS " + PSUsContract.singleChild.TABLE_NAME;
    public static String DB_FORM_ID;
    public static String DB_IMS_ID;
    final String SQL_CREATE_TEHSIL_TABLE = "CREATE TABLE " + TehsilsContract.TehsilTable.TABLE_NAME + " (" +
            TehsilsContract.TehsilTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            TehsilsContract.TehsilTable.COLUMN_TEHSIL_CODE + " TEXT, " +
            TehsilsContract.TehsilTable.COLUMN_TEHSIL_NAME + " TEXT " +
            ");";
    final String SQL_CREATE_H_FACILIY_TABLE = "CREATE TABLE " + HFacilitiesContract.HFacilityTable.TABLE_NAME + " (" +
            HFacilitiesContract.HFacilityTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_CODE + " TEXT, " +
            HFacilitiesContract.HFacilityTable.COLUMN_TEHSIL_CODE + " TEXT, " +
            HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_NAME + " TEXT " +
            ");";
    final String SQL_CREATE_UC_TABLE = "CREATE TABLE " + UCsContract.UcTable.TABLE_NAME + " (" +
            UCsContract.UcTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            UCsContract.UcTable.COLUMN_TEHSIL_CODE + " TEXT, " +
            UCsContract.UcTable.COLUMN_UC_NAME + " TEXT, " +
            UCsContract.UcTable.COLUMN_UC_CODE + " TEXT " +
            ");";
    final String SQL_CREATE_SOURCE_TABLE = "CREATE TABLE " + SourceNGOContract.SourceTable.TABLE_NAME + " (" +
            SourceNGOContract.SourceTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            SourceNGOContract.SourceTable.COLUMN_SOURCE_ID + " TEXT, " +
            SourceNGOContract.SourceTable.COLUMN_SOURCE_NAME + " TEXT " +
            ");";
    final String SQL_CREATE_VILLAGE_TABLE = "CREATE TABLE " + VillagesContract.VillageTable.TABLE_NAME + " (" +
            VillagesContract.VillageTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            VillagesContract.VillageTable.COLUMN_VILLAGE_CODE + " TEXT, " +
            VillagesContract.VillageTable.COLUMN_VILLAGE_NAME + " TEXT, " +
            VillagesContract.VillageTable.COLUMN_UC_CODE + " TEXT " +
            ");";
    final String SQL_CREATE_LHW_TABLE = "CREATE TABLE " + LHWsContract.LHWTable.TABLE_NAME + " (" +
            LHWsContract.LHWTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            LHWsContract.LHWTable.COLUMN_LHW_CODE + " TEXT, " +
            LHWsContract.LHWTable.COLUMN_LHW_NAME + " TEXT, " +
            LHWsContract.LHWTable.COLUMN_AREA_TYPE + " TEXT, " +
            LHWsContract.LHWTable.COLUMN_STATUS + " TEXT, " +
            LHWsContract.LHWTable.COLUMN_HF_CODE + " TEXT " +
            ");";
    private final String TAG = "DatabaseHelper";
    public String spDateT = new SimpleDateFormat("dd-MM-yy").format(new Date().getTime());

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_PSU);
        db.execSQL(SQL_CREATE_TEHSIL_TABLE);
        db.execSQL(SQL_CREATE_UC_TABLE);
        db.execSQL(SQL_CREATE_VILLAGE_TABLE);
        db.execSQL(SQL_CREATE_H_FACILIY_TABLE);
        db.execSQL(SQL_CREATE_LHW_TABLE);
        db.execSQL(SQL_CREATE_SOURCE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_PSUS);

        db.execSQL(TehsilsContract.TehsilTable.TABLE_NAME);
        db.execSQL(UCsContract.UcTable.TABLE_NAME);
        db.execSQL(VillagesContract.VillageTable.TABLE_NAME);
        db.execSQL(HFacilitiesContract.HFacilityTable.TABLE_NAME);
        db.execSQL(LHWsContract.LHWTable.TABLE_NAME);
        db.execSQL(SourceNGOContract.SourceTable.TABLE_NAME);

        onCreate(db);
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_HHDT, fc.getHhDT());
        values.put(FormsContract.FormsTable.COLUMN_TEHSIL, fc.getTehsil());
        values.put(FormsContract.FormsTable.COLUMN_HFACILITY, fc.gethFacility());
        values.put(FormsContract.FormsTable.COLUMN_LHWCODE, fc.getLhwCode());
        values.put(FormsContract.FormsTable.COLUMN_HOUSEHOLD, fc.getHouseHold());
        values.put(FormsContract.FormsTable.COLUMN_CHILDID, fc.getChildId());
        values.put(FormsContract.FormsTable.COLUMN_UCCODE, fc.getUccode());
        values.put(FormsContract.FormsTable.COLUMN_VILLAGENAME, fc.getVillagename());
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, fc.getiStatus());
        values.put(FormsContract.FormsTable.COLUMN_NAME_USERNAME, fc.getUserName());
        values.put(FormsContract.FormsTable.COLUMN_DEVICETAGID, fc.getTagId());
        values.put(FormsContract.FormsTable.COLUMN_SA, fc.getsA());
        values.put(FormsContract.FormsTable.COLUMN_SB, fc.getsB());
        values.put(FormsContract.FormsTable.COLUMN_SC, fc.getsC());
        values.put(FormsContract.FormsTable.COLUMN_SD, fc.getsD());
        values.put(FormsContract.FormsTable.COLUMN_SE, fc.getsE());
        values.put(FormsContract.FormsTable.COLUMN_SF, fc.getsF());
        values.put(FormsContract.FormsTable.COLUMN_SG, fc.getsG());
        values.put(FormsContract.FormsTable.COLUMN_SH, fc.getsH());
        values.put(FormsContract.FormsTable.COLUMN_SI, fc.getsI());
        values.put(FormsContract.FormsTable.COLUMN_SJ, fc.getsJ());
        values.put(FormsContract.FormsTable.COLUMN_SK, fc.getsK());
        values.put(FormsContract.FormsTable.COLUMN_SL, fc.getsL());
        values.put(FormsContract.FormsTable.COLUMN_SM, fc.getsM());
        values.put(FormsContract.FormsTable.COLUMN_SN, fc.getsN());
        values.put(FormsContract.FormsTable.COLUMN_GPSLAT, fc.getGpsLat());
        values.put(FormsContract.FormsTable.COLUMN_GPSLNG, fc.getGpsLng());
        values.put(FormsContract.FormsTable.COLUMN_GPSTIME, fc.getGpsTime());
        values.put(FormsContract.FormsTable.COLUMN_GPSACC, fc.getGpsAcc());
        values.put(FormsContract.FormsTable.COLUMN_DEVICEID, fc.getDeviceID());
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, fc.getSynced());
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, fc.getSynced_date());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                FormsContract.FormsTable.TABLE_NAME,
                FormsContract.FormsTable.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public int updateFormID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_UID, AppMain.fc.getUID());

// Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SYNCED, true);
        values.put(FormsContract.FormsTable.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = FormsContract.FormsTable._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                FormsContract.FormsTable.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable.COLUMN_ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_HHDT,
                FormsContract.FormsTable.COLUMN_TEHSIL,
                FormsContract.FormsTable.COLUMN_HFACILITY,
                FormsContract.FormsTable.COLUMN_LHWCODE,
                FormsContract.FormsTable.COLUMN_HOUSEHOLD,
                FormsContract.FormsTable.COLUMN_CHILDID,
                FormsContract.FormsTable.COLUMN_UCCODE,
                FormsContract.FormsTable.COLUMN_VILLAGENAME,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_NAME_USERNAME,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_SA,
                FormsContract.FormsTable.COLUMN_SB,
                FormsContract.FormsTable.COLUMN_SC,
                FormsContract.FormsTable.COLUMN_SD,
                FormsContract.FormsTable.COLUMN_SE,
                FormsContract.FormsTable.COLUMN_SF,
                FormsContract.FormsTable.COLUMN_SG,
                FormsContract.FormsTable.COLUMN_SH,
                FormsContract.FormsTable.COLUMN_SI,
                FormsContract.FormsTable.COLUMN_SJ,
                FormsContract.FormsTable.COLUMN_SK,
                FormsContract.FormsTable.COLUMN_SL,
                FormsContract.FormsTable.COLUMN_SM,
                FormsContract.FormsTable.COLUMN_SN,
                FormsContract.FormsTable.COLUMN_GPSLAT,
                FormsContract.FormsTable.COLUMN_GPSLNG,
                FormsContract.FormsTable.COLUMN_GPSTIME,
                FormsContract.FormsTable.COLUMN_GPSACC,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_SYNCED,
                FormsContract.FormsTable.COLUMN_SYNCED_DATE
        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable.COLUMN_ID,
                FormsContract.FormsTable.COLUMN_UID,
                FormsContract.FormsTable.COLUMN_HHDT,
                FormsContract.FormsTable.COLUMN_TEHSIL,
                FormsContract.FormsTable.COLUMN_HFACILITY,
                FormsContract.FormsTable.COLUMN_LHWCODE,
                FormsContract.FormsTable.COLUMN_HOUSEHOLD,
                FormsContract.FormsTable.COLUMN_CHILDID,
                FormsContract.FormsTable.COLUMN_UCCODE,
                FormsContract.FormsTable.COLUMN_VILLAGENAME,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_NAME_USERNAME,
                FormsContract.FormsTable.COLUMN_DEVICETAGID,
                FormsContract.FormsTable.COLUMN_SA,
                FormsContract.FormsTable.COLUMN_SB,
                FormsContract.FormsTable.COLUMN_SC,
                FormsContract.FormsTable.COLUMN_SD,
                FormsContract.FormsTable.COLUMN_SE,
                FormsContract.FormsTable.COLUMN_SF,
                FormsContract.FormsTable.COLUMN_SG,
                FormsContract.FormsTable.COLUMN_SH,
                FormsContract.FormsTable.COLUMN_SI,
                FormsContract.FormsTable.COLUMN_SJ,
                FormsContract.FormsTable.COLUMN_SK,
                FormsContract.FormsTable.COLUMN_SL,
                FormsContract.FormsTable.COLUMN_SM,
                FormsContract.FormsTable.COLUMN_SN,
                FormsContract.FormsTable.COLUMN_GPSLAT,
                FormsContract.FormsTable.COLUMN_GPSLNG,
                FormsContract.FormsTable.COLUMN_GPSTIME,
                FormsContract.FormsTable.COLUMN_GPSACC,
                FormsContract.FormsTable.COLUMN_DEVICEID,
                FormsContract.FormsTable.COLUMN_SYNCED,
                FormsContract.FormsTable.COLUMN_SYNCED_DATE
        };
        String whereClause = FormsContract.FormsTable.COLUMN_SYNCED + " is null OR " + FormsContract.FormsTable.COLUMN_SYNCED + " = ''";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                allFC.add(fc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<FormsContract> getTodayForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                FormsContract.FormsTable._ID,
                FormsContract.FormsTable.COLUMN_CHILDID,
                FormsContract.FormsTable.COLUMN_HHDT,
                FormsContract.FormsTable.COLUMN_ISTATUS,
                FormsContract.FormsTable.COLUMN_SYNCED,

        };
        String whereClause = FormsContract.FormsTable.COLUMN_HHDT + " Like ? ";
        String[] whereArgs = new String[]{"%" + spDateT.substring(0, 8).trim() + "%"};
        String groupBy = null;
        String having = null;

        String orderBy =
                FormsContract.FormsTable.COLUMN_ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<>();
        try {
            c = db.query(
                    FormsContract.FormsTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                FormsContract fc = new FormsContract();
                fc.setID(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ID)));
                fc.setChildId(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_CHILDID)));
                fc.setHhDT(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_HHDT)));
                fc.setiStatus(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_ISTATUS)));
                fc.setSynced(c.getString(c.getColumnIndex(FormsContract.FormsTable.COLUMN_SYNCED)));
                allFC.add(fc);
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }


    public List<FormsContract> getFormsByT_HF_LHW(String tehsil, String hf, String lhw) {
        List<FormsContract> formList = new ArrayList<FormsContract>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + FormsContract.FormsTable.TABLE_NAME + " where "
                + FormsContract.FormsTable.COLUMN_TEHSIL + "='" + tehsil + "' and "
                + FormsContract.FormsTable.COLUMN_HFACILITY + "='" + hf + "' and "
                + FormsContract.FormsTable.COLUMN_LHWCODE + "='" + lhw + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                FormsContract fc = new FormsContract();
                formList.add(fc.hydrate(c));
            } while (c.moveToNext());
        }

        // return contact list
        return formList;
    }


    public int updateSB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SB, AppMain.fc.getsB());
        values.put(FormsContract.FormsTable.COLUMN_UID, AppMain.fc.getUID());


// Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateSC() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SC, AppMain.fc.getsC());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSD() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SD, AppMain.fc.getsD());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSE() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SE, AppMain.fc.getsE());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSF() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SF, AppMain.fc.getsF());

        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSG() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SG, AppMain.fc.getsG());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSH() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SH, AppMain.fc.getsH());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSI() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SI, AppMain.fc.getsI());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSJ() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SJ, AppMain.fc.getsJ());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSK() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SK, AppMain.fc.getsK());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSL() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SL, AppMain.fc.getsL());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSM() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SM, AppMain.fc.getsM());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSN() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_SN, AppMain.fc.getsN());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateEnd() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(FormsContract.FormsTable.COLUMN_ISTATUS, AppMain.fc.getiStatus());


        // Which row to update, based on the ID
        String selection = FormsContract.FormsTable._ID + " = ?";
        String[] selectionArgs = {String.valueOf(AppMain.fc.getID())};

        int count = db.update(FormsContract.FormsTable.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public void addUser(UsersContract userscontract) {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(UsersContract.singleUser.ROW_USERNAME, userscontract.getUserName());
            values.put(UsersContract.singleUser.ROW_PASSWORD, userscontract.getPassword());
            db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");


                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, userName);
                values.put(UsersContract.singleUser.ROW_PASSWORD, password);
                db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersContract.singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.singleUser.TABLE_NAME + " WHERE " + UsersContract.singleUser.ROW_USERNAME + "=? AND " + UsersContract.singleUser.ROW_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public Collection<HFacilitiesContract> getAllHFacilitiesByTehsil(String tehsil_code) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                HFacilitiesContract.HFacilityTable._ID,
                HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_CODE,
                HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_NAME,
                HFacilitiesContract.HFacilityTable.COLUMN_TEHSIL_CODE,
        };

        String whereClause = HFacilitiesContract.HFacilityTable.COLUMN_TEHSIL_CODE + " = ?";
        String[] whereArgs = {tehsil_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                HFacilitiesContract.HFacilityTable._ID + " ASC";

        Collection<HFacilitiesContract> allHFC = new ArrayList<>();
        try {
            c = db.query(
                    HFacilitiesContract.HFacilityTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                HFacilitiesContract hfc = new HFacilitiesContract();
                allHFC.add(hfc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allHFC;
    }

    public Collection<UCsContract> getAllUCsByTehsil(String tehsil_code) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                UCsContract.UcTable._ID,
                UCsContract.UcTable.COLUMN_UC_NAME,
                UCsContract.UcTable.COLUMN_UC_CODE,
                UCsContract.UcTable.COLUMN_TEHSIL_CODE,
        };

        String whereClause = UCsContract.UcTable.COLUMN_TEHSIL_CODE + " = ?";
        String[] whereArgs = {tehsil_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                UCsContract.UcTable._ID + " ASC";

        Collection<UCsContract> allUCsC = new ArrayList<>();
        try {
            c = db.query(
                    UCsContract.UcTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );

            UCsContract uc1 = new UCsContract();
            allUCsC.add(uc1.setDefaultVal("", "..."));

            while (c.moveToNext()) {
                UCsContract ucsc = new UCsContract();
                allUCsC.add(ucsc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allUCsC;
    }

    public Collection<VillagesContract> getAllVillagesByUc(String uc_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VillagesContract.VillageTable._ID,
                VillagesContract.VillageTable.COLUMN_VILLAGE_CODE,
                VillagesContract.VillageTable.COLUMN_VILLAGE_NAME,
                VillagesContract.VillageTable.COLUMN_UC_CODE
        };

        String whereClause = VillagesContract.VillageTable.COLUMN_UC_CODE + " = ?";
        String[] whereArgs = {uc_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                VillagesContract.VillageTable.COLUMN_VILLAGE_CODE + " ASC";

        Collection<VillagesContract> allPC = new ArrayList<VillagesContract>();
        try {
            c = db.query(
                    VillagesContract.VillageTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );

            VillagesContract uc1 = new VillagesContract();
            allPC.add(uc1.setDefaultVal("", "..."));

            while (c.moveToNext()) {
                VillagesContract pc = new VillagesContract();
                allPC.add(pc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allPC;
    }

    public Collection<LHWsContract> getAllLhwsByHf(String hf_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                LHWsContract.LHWTable._ID,
                LHWsContract.LHWTable.COLUMN_LHW_CODE,
                LHWsContract.LHWTable.COLUMN_LHW_NAME,
                LHWsContract.LHWTable.COLUMN_HF_CODE,
                LHWsContract.LHWTable.COLUMN_AREA_TYPE,
                LHWsContract.LHWTable.COLUMN_STATUS
        };

        String whereClause = LHWsContract.LHWTable.COLUMN_HF_CODE + " = ?";
        String[] whereArgs = {hf_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                LHWsContract.LHWTable.COLUMN_LHW_CODE + " ASC";

        Collection<LHWsContract> allLhwC = new ArrayList<LHWsContract>();
        try {
            c = db.query(
                    LHWsContract.LHWTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                LHWsContract lhwc = new LHWsContract();
                allLhwC.add(lhwc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allLhwC;
    }


    public Collection<TehsilsContract> getAllTehsil() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                TehsilsContract.TehsilTable._ID,
                TehsilsContract.TehsilTable.COLUMN_TEHSIL_CODE,
                TehsilsContract.TehsilTable.COLUMN_TEHSIL_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                TehsilsContract.TehsilTable._ID + " ASC";

        Collection<TehsilsContract> allDC = new ArrayList<TehsilsContract>();
        try {
            c = db.query(
                    TehsilsContract.TehsilTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                TehsilsContract dc = new TehsilsContract();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }


    public Collection<VillagesContract> getAllVillage() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VillagesContract.VillageTable._ID,
                VillagesContract.VillageTable.COLUMN_VILLAGE_CODE,
                VillagesContract.VillageTable.COLUMN_VILLAGE_NAME,
                VillagesContract.VillageTable.COLUMN_UC_CODE
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                VillagesContract.VillageTable._ID + " ASC";

        Collection<VillagesContract> allDC = new ArrayList<VillagesContract>();
        try {
            c = db.query(
                    VillagesContract.VillageTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                VillagesContract vc = new VillagesContract();
                allDC.add(vc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }

    public Collection<SourceNGOContract> getAllNGOs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                SourceNGOContract.SourceTable.COLUMN_SOURCE_ID,
                SourceNGOContract.SourceTable.COLUMN_SOURCE_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                SourceNGOContract.SourceTable.COLUMN_SOURCE_ID + " ASC";

        Collection<SourceNGOContract> allSR = new ArrayList<>();
        try {
            c = db.query(
                    SourceNGOContract.SourceTable.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                SourceNGOContract sr = new SourceNGOContract();
                allSR.add(sr.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allSR;
    }


    public void syncChild(JSONArray childlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(PSUsContract.singleChild.TABLE_NAME, null, null);
        Log.d(TAG, "PSU table deleted!");
        try {
            JSONArray jsonArray = childlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String LUID = jsonObjectUser.getString("UID");
                String psu = jsonObjectUser.getString("hh02");
                String hh03 = jsonObjectUser.getString("hh03");
                String hh07 = jsonObjectUser.getString("hh07");
                String child_name = jsonObjectUser.getString("child_name");


                ContentValues values = new ContentValues();

                values.put(PSUsContract.singleChild.COLUMN_LUID, LUID);
                values.put(PSUsContract.singleChild.COLUMN_HH03, hh03);
                values.put(PSUsContract.singleChild.COLUMN_HH07, hh07);
                values.put(PSUsContract.singleChild.COLUMN_HH, hh03 + "-" + hh07);
                values.put(PSUsContract.singleChild.COLUMN_PSU, psu);
                values.put(PSUsContract.singleChild.COLUMN_CHILD_NAME, child_name);

                db.insert(PSUsContract.singleChild.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }


    public void syncUc(JSONArray ucList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UCsContract.UcTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = ucList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUc = jsonArray.getJSONObject(i);

                UCsContract dc = new UCsContract();
                dc.sync(jsonObjectUc);

                ContentValues values = new ContentValues();

                values.put(UCsContract.UcTable.COLUMN_UC_CODE, dc.getUcCode());
                values.put(UCsContract.UcTable.COLUMN_UC_NAME, dc.getUcName());
                values.put(UCsContract.UcTable.COLUMN_TEHSIL_CODE, dc.getTehsilCode());

                db.insert(UCsContract.UcTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
            Log.e(TAG, "syncUc: " + e.toString());
        }
    }

    public void syncSources(JSONArray ucList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(SourceNGOContract.SourceTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = ucList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUc = jsonArray.getJSONObject(i);

                SourceNGOContract dc = new SourceNGOContract();
                dc.sync(jsonObjectUc);

                ContentValues values = new ContentValues();

                values.put(SourceNGOContract.SourceTable.COLUMN_SOURCE_ID, dc.getSourceId());
                values.put(SourceNGOContract.SourceTable.COLUMN_SOURCE_NAME, dc.getSourceName());

                db.insert(SourceNGOContract.SourceTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
            Log.e(TAG, "syncUc: " + e.toString());
        }
    }


    public void syncTehsil(JSONArray pcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TehsilsContract.TehsilTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = pcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectTehsil = jsonArray.getJSONObject(i);

                TehsilsContract pc = new TehsilsContract();
                pc.sync(jsonObjectTehsil);

                ContentValues values = new ContentValues();

                values.put(TehsilsContract.TehsilTable.COLUMN_TEHSIL_CODE, pc.getTehsil_code());
                values.put(TehsilsContract.TehsilTable.COLUMN_TEHSIL_NAME, pc.getTehsil_name());

                db.insert(TehsilsContract.TehsilTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }

    public void syncHFacility(JSONArray pcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(HFacilitiesContract.HFacilityTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = pcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectHFacility = jsonArray.getJSONObject(i);

                HFacilitiesContract hc = new HFacilitiesContract();
                hc.sync(jsonObjectHFacility);

                ContentValues values = new ContentValues();

                values.put(HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_CODE, hc.gethFacilityCode());
                values.put(HFacilitiesContract.HFacilityTable.COLUMN_HFACILITY_NAME, hc.gethFacilityName());
                values.put(HFacilitiesContract.HFacilityTable.COLUMN_TEHSIL_CODE, hc.getTehsilCode());

                db.insert(HFacilitiesContract.HFacilityTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }


    public void syncVillages(JSONArray pcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VillagesContract.VillageTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = pcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectVillage = jsonArray.getJSONObject(i);

                VillagesContract vc = new VillagesContract();
                vc.sync(jsonObjectVillage);

                ContentValues values = new ContentValues();

                values.put(VillagesContract.VillageTable.COLUMN_VILLAGE_CODE, vc.getVillageCode());
                values.put(VillagesContract.VillageTable.COLUMN_VILLAGE_NAME, vc.getVillageName());
                values.put(VillagesContract.VillageTable.COLUMN_UC_CODE, vc.getUcCode());

                db.insert(VillagesContract.VillageTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }

    public void syncLHW(JSONArray lcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(LHWsContract.LHWTable.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = lcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectLHW = jsonArray.getJSONObject(i);

                LHWsContract lc = new LHWsContract();
                lc.sync(jsonObjectLHW);

                ContentValues values = new ContentValues();

                values.put(LHWsContract.LHWTable.COLUMN_LHW_CODE, lc.getLHWCode());
                values.put(LHWsContract.LHWTable.COLUMN_LHW_NAME, lc.getLHWName());
                values.put(LHWsContract.LHWTable.COLUMN_AREA_TYPE, lc.getAreaType());
                values.put(LHWsContract.LHWTable.COLUMN_HF_CODE, lc.getHfCode());
                values.put(LHWsContract.LHWTable.COLUMN_STATUS, lc.getStatus());

                db.insert(LHWsContract.LHWTable.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }


    public ArrayList<PSUsContract> getAllChildren() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<PSUsContract> childList = null;
        try {
            childList = new ArrayList<PSUsContract>();
            String QUERY = "SELECT * FROM " + PSUsContract.singleChild.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    PSUsContract child = new PSUsContract(cursor);

                    childList.add(child);

                }
            }
            db.close();
        } catch (Exception e) {
        }
        return childList;
    }

    public String getChildByHH(String hh, String psu) {
        SQLiteDatabase db = this.getReadableDatabase();
        PSUsContract child = null;
        try {
            String QUERY = "SELECT * FROM " + PSUsContract.singleChild.TABLE_NAME
                    + " where " + PSUsContract.singleChild.COLUMN_HH + " = '" + hh.toUpperCase().replaceFirst("^0+(?!$)", "") + "' and " + PSUsContract.singleChild.COLUMN_PSU + " = '" + psu + "' Limit 1";
            Cursor cursor = db.rawQuery(QUERY, null);
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    child = new PSUsContract(cursor);
                    return child.getChild_name();

                }
            } else {
                return "No Child Found";
            }
            db.close();
        } catch (Exception e) {
        }
        return "No Child Found";
    }

    // ANDROID DATABASE MANAGER
    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);

        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);

            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {

                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }
}