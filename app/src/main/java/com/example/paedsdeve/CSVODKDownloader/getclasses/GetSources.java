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
import com.example.paedsdeve.CSVODKDownloader.contracts.SourceNGOContract.SourceTable;

/**
 * Created by hassan.naqvi on 4/28/2016.
 */
public class GetSources extends AsyncTask<String, String, String> {

    private final String TAG = "GetSources()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetSources(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext, R.style.AlertDialogStyle);
        pd.setTitle("Getting Sources");
        pd.setMessage("Preparing...");
        pd.show();
    }

    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(AppMain.PROJECT_URI + SourceTable.URI);
            Log.d(TAG, "doInBackground: " + url);
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //pd.show();

                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line = "";
                while ((line = reader.readLine()) != null) {
                    Log.i(TAG, "Sources In: " + line);
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
            DatabaseHelper db = new DatabaseHelper(mContext);
            try {
                JSONArray jsonArray = new JSONArray(json);
                pd.setMessage("Received: " + jsonArray.length() + " Sources");
                pd.setTitle("Done... Synced Sources");
                db.syncSources(jsonArray);
            } catch (JSONException e) {
                e.printStackTrace();
                pd.setMessage("Received: 0 Sources");
                pd.setTitle("Error... Syncing Sources");
            }
            pd.show();
        }
    }
}