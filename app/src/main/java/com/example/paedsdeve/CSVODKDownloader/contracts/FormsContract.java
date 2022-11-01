package com.example.paedsdeve.CSVODKDownloader.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by hassan.naqvi on 10/25/2016.
 */

public class FormsContract {

    private final String projectName = "CBT 2016-17";
    private final String surveyType = "SN";
    private String userName = "";
    private String ID = "";
    private String UID = "";
    private String hhDT = ""; // Date
    private String tehsil = "0000"; // Tehsil code
    private String hFacility = ""; // HF
    private String uccode = ""; // uc code
    private String villagename = ""; // Village code
    private String lhwCode = ""; // lhw Code
    private String houseHold = ""; // HH no.
    private String childId = ""; // Index Child ID
    private String iStatus = ""; // Form Status
    private String tagId = "";
    private String sA = "";
    private String sB = "";
    private String sC = "";
    private String sD = "";
    private String sE = "";
    private String sF = "";
    private String sG = "";
    private String sH = "";
    private String sI = "";
    private String sJ = "";
    private String sK = "";
    private String sL = "";
    private String sM = "";
    private String sN = "";

    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract sync(JSONObject jsonObject) throws JSONException {
        this.ID = jsonObject.getString(FormsTable.COLUMN_ID);
        this.UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.hhDT = jsonObject.getString(FormsTable.COLUMN_HHDT);
        this.tehsil = jsonObject.getString(FormsTable.COLUMN_TEHSIL);
        this.hFacility = jsonObject.getString(FormsTable.COLUMN_HFACILITY);
        this.lhwCode = jsonObject.getString(FormsTable.COLUMN_LHWCODE);
        this.houseHold = jsonObject.getString(FormsTable.COLUMN_HOUSEHOLD);
        this.childId = jsonObject.getString(FormsTable.COLUMN_CHILDID);
        this.uccode = jsonObject.getString(FormsTable.COLUMN_UCCODE);
        this.villagename = jsonObject.getString(FormsTable.COLUMN_VILLAGENAME);
        this.iStatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.userName = jsonObject.getString(FormsTable.COLUMN_NAME_USERNAME);
        this.tagId = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.sA = jsonObject.getString(FormsTable.COLUMN_SA);
        this.sB = jsonObject.getString(FormsTable.COLUMN_SB);
        this.sC = jsonObject.getString(FormsTable.COLUMN_SC);
        this.sD = jsonObject.getString(FormsTable.COLUMN_SD);
        this.sE = jsonObject.getString(FormsTable.COLUMN_SE);
        this.sF = jsonObject.getString(FormsTable.COLUMN_SF);
        this.sG = jsonObject.getString(FormsTable.COLUMN_SG);
        this.sH = jsonObject.getString(FormsTable.COLUMN_SH);
        this.sI = jsonObject.getString(FormsTable.COLUMN_SI);
        this.sJ = jsonObject.getString(FormsTable.COLUMN_SJ);
        this.sK = jsonObject.getString(FormsTable.COLUMN_SK);
        this.sL = jsonObject.getString(FormsTable.COLUMN_SL);
        this.sM = jsonObject.getString(FormsTable.COLUMN_SM);
        this.sN = jsonObject.getString(FormsTable.COLUMN_SN);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsTime = jsonObject.getString(FormsTable.COLUMN_GPSTIME);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);


        return this;
    }

    public String getProjectName() {

        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public String getTagId() {

        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getHhDT() {
        return hhDT;
    }

    public void setHhDT(String hhDT) {
        this.hhDT = hhDT;
    }

    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }

    public String gethFacility() {
        return hFacility;
    }

    public void sethFacility(String hFacility) {
        this.hFacility = hFacility;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getUccode() {
        return uccode;
    }

    public void setUccode(String uccode) {
        this.uccode = uccode;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getsA() {
        return sA;
    }

    public void setsA(String sA) {
        this.sA = sA;
    }

    public String getsB() {
        return sB;
    }

    public void setsB(String sB) {
        this.sB = sB;
    }

    public String getsC() {
        return sC;
    }

    public void setsC(String sC) {
        this.sC = sC;
    }

    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }

    public String getsE() {
        return sE;
    }

    public void setsE(String sE) {
        this.sE = sE;
    }

    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }

    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }

    public String getsH() {
        return sH;
    }

    public void setsH(String sH) {
        this.sH = sH;
    }

    public String getsI() {
        return sI;
    }

    public void setsI(String sI) {
        this.sI = sI;
    }

    public String getsJ() {
        return sJ;
    }

    public void setsJ(String sJ) {
        this.sJ = sJ;
    }

    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }

    public String getsL() {
        return sL;
    }

    public void setsL(String sL) {
        this.sL = sL;
    }

    public String getsM() {
        return sM;
    }

    public void setsM(String sM) {
        this.sM = sM;
    }

    public String getsN() {
        return sN;
    }

    public void setsN(String sN) {
        this.sN = sN;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public FormsContract hydrate(Cursor cursor) {
        this.ID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ID));
        this.UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.hhDT = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HHDT));
        this.tehsil = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_TEHSIL));
        this.hFacility = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HFACILITY));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_LHWCODE));
        this.houseHold = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HOUSEHOLD));
        this.childId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CHILDID));
        this.uccode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UCCODE));
        this.villagename = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_VILLAGENAME));
        this.iStatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.userName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_NAME_USERNAME));
        this.tagId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.sA = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SA));
        this.sB = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SB));
        this.sC = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SC));
        this.sD = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SD));
        this.sE = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SE));
        this.sF = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SF));
        this.sG = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SG));
        this.sH = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SH));
        this.sI = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SI));
        this.sJ = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SJ));
        this.sK = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SK));
        this.sL = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SL));
        this.sM = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SM));
        this.sN = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SN));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));


        return this;
    }

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_SURVEY_TYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(FormsTable.COLUMN_ID, this.ID == null ? JSONObject.NULL : this.ID);
        json.put(FormsTable.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(FormsTable.COLUMN_HHDT, this.hhDT == null ? JSONObject.NULL : this.hhDT);
        json.put(FormsTable.COLUMN_TEHSIL, this.tehsil == null ? JSONObject.NULL : this.tehsil);
        json.put(FormsTable.COLUMN_HFACILITY, this.hFacility == null ? JSONObject.NULL : this.hFacility);
        json.put(FormsTable.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(FormsTable.COLUMN_HOUSEHOLD, this.houseHold == null ? JSONObject.NULL : this.houseHold);
        json.put(FormsTable.COLUMN_CHILDID, this.childId == null ? JSONObject.NULL : this.childId);
        json.put(FormsTable.COLUMN_UCCODE, this.uccode == null ? JSONObject.NULL : this.uccode);
        json.put(FormsTable.COLUMN_VILLAGENAME, this.villagename == null ? JSONObject.NULL : this.villagename);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus == null ? JSONObject.NULL : this.iStatus);
        json.put(FormsTable.COLUMN_NAME_USERNAME, this.userName == null ? JSONObject.NULL : this.userName);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.tagId == null ? JSONObject.NULL : this.tagId);
        json.put(FormsTable.COLUMN_SA, this.sA == null ? JSONObject.NULL : this.sA);
        json.put(FormsTable.COLUMN_SB, this.sB == null ? JSONObject.NULL : this.sB);
        json.put(FormsTable.COLUMN_SC, this.sC == null ? JSONObject.NULL : this.sC);
        json.put(FormsTable.COLUMN_SD, this.sD == null ? JSONObject.NULL : this.sD);
        json.put(FormsTable.COLUMN_SE, this.sE == null ? JSONObject.NULL : this.sE);
        json.put(FormsTable.COLUMN_SF, this.sF == null ? JSONObject.NULL : this.sF);
        json.put(FormsTable.COLUMN_SG, this.sG == null ? JSONObject.NULL : this.sG);
        json.put(FormsTable.COLUMN_SH, this.sH == null ? JSONObject.NULL : this.sH);
        json.put(FormsTable.COLUMN_SI, this.sI == null ? JSONObject.NULL : this.sI);
        json.put(FormsTable.COLUMN_SJ, this.sJ == null ? JSONObject.NULL : this.sJ);
        json.put(FormsTable.COLUMN_SK, this.sK == null ? JSONObject.NULL : this.sK);
        json.put(FormsTable.COLUMN_SL, this.sL == null ? JSONObject.NULL : this.sL);
        json.put(FormsTable.COLUMN_SM, this.sM == null ? JSONObject.NULL : this.sM);
        json.put(FormsTable.COLUMN_SN, this.sN == null ? JSONObject.NULL : this.sN);

        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);

        return json;
    }

    public JSONObject jsonMerge(JSONObject o1, JSONObject o2) throws JSONException {

        JSONObject jm = new JSONObject();

        //I assume that your two JSONObjects are o1 and o2
        JSONObject mergedObj = new JSONObject();

        Iterator i1 = o1.keys();
        Iterator i2 = o2.keys();
        String tmp_key;
        while (i1.hasNext()) {
            tmp_key = (String) i1.next();
            mergedObj.put(tmp_key, o1.get(tmp_key));
        }
        while (i2.hasNext()) {
            tmp_key = (String) i2.next();
            mergedObj.put(tmp_key, o2.get(tmp_key));
        }

        return mergedObj;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String URI = "/syncforms.php";

        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECT_NAME = "projectname";
        public static final String COLUMN_SURVEY_TYPE = "surveytype";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_HHDT = "hhdt";
        public static final String COLUMN_TEHSIL = "tehsil";
        public static final String COLUMN_HFACILITY = "hfacility";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_CHILDID = "childid";
        public static final String COLUMN_UCCODE = "uccode";
        public static final String COLUMN_VILLAGENAME = "villagename";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_DEVICETAGID = "tagId";
        public static final String COLUMN_SA = "sa";
        public static final String COLUMN_SB = "sb";
        public static final String COLUMN_SC = "sc";
        public static final String COLUMN_SD = "sd";
        public static final String COLUMN_SE = "se";
        public static final String COLUMN_SF = "sf";
        public static final String COLUMN_SG = "sg";
        public static final String COLUMN_SH = "sh";
        public static final String COLUMN_SI = "si";
        public static final String COLUMN_SJ = "sj";
        public static final String COLUMN_SK = "sk";
        public static final String COLUMN_SL = "sl";
        public static final String COLUMN_SM = "sm";
        public static final String COLUMN_SN = "sn";

        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

    }
}


