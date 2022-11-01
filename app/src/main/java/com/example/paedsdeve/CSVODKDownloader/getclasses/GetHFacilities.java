package com.example.paedsdeve.CSVODKDownloader.getclasses;

/**
 * Created by Hassan.naqvi on 3/18/2017.
 */

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.example.paedsdeve.CSVODKDownloader.AppMain;
import com.example.paedsdeve.CSVODKDownloader.DatabaseHelper;
import com.example.paedsdeve.CSVODKDownloader.R;
import com.example.paedsdeve.CSVODKDownloader.contracts.HFacilitiesContract.HFacilityTable;

/**
 * Created by hassan.naqvi on 4/28/2016.
 */
public class GetHFacilities extends AsyncTask<String, String, String> {

    private final String TAG = "GetHFacilitys()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetHFacilities(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext, R.style.AlertDialogStyle);
        pd.setTitle("Getting Health Facilities");
        pd.setMessage("Preparing...");
        pd.show();
    }

    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(AppMain.PROJECT_URI + HFacilityTable.URI);
            Log.d(TAG, "doInBackground: " + url);
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //pd.show();

                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    //pd.show();
                    Log.i(TAG, "Health Facilities In: " + line);
                    result.append(line);
                }
            } else {
                result.append("URL not found");

            }
        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            urlConnection.disconnect();
        }


        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {

        //Do something with the JSON string
        if (result != "URL not found") {

            String json = result;
            //json = json.replaceAll("\\[", "").replaceAll("\\]","");
            //Log.d(TAG, result);
            DatabaseHelper db = new DatabaseHelper(mContext);
            try {
                //JSONObject jsonObject = new JSONObject(json);
                JSONArray jsonArray = new JSONArray(json);
                pd.setMessage("Received: " + jsonArray.length() + " Health Facilities");
                pd.setTitle("Done... Synced Health Facilities");
                db.syncHFacility(jsonArray);
            } catch (JSONException e) {
                e.printStackTrace();
                pd.setMessage("Received: 0 Health Facilities");
                pd.setTitle("Error... Syncing Health Facilities");
            }
            pd.show();
        }



/*        try {
            JSONObject obj = new JSONObject(json);
            Log.d("My App", obj.toString());
        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + json + "\"");
        }*/

//        ArrayList<String> listdata = new ArrayList<String>();
//        JSONArray jArray = (JSONArray)jsonObject;
//        if (jArray != null) {
//            for (int i=0;i<jArray.length();i++){
//                listdata.add(jArray.get(i).toString());
//            }
//        }

    }
}