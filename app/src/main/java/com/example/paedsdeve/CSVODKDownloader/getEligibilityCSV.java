package com.example.paedsdeve.CSVODKDownloader;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import com.opencsv.CSVWriter;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class getEligibilityCSV extends AsyncTask<Void, Void, String> {

    private static final Object APP_NAME = "CSVODKDownloader";
    private final String TAG = "GetPrePop()";
    private final Context mContext;
    HttpURLConnection urlConnection;
    private URL serverURL = null;
    private ProgressDialog pd;

    public getEligibilityCSV(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Syncing Prepop CSV");
        pd.setMessage("Getting connected to server...");
        pd.show();
        Log.d(TAG, "onPreExecute: Starting");
    }


    @Override
    protected String doInBackground(Void... args) {
        try {
            // https://kc.humanitarianresponse.info/api/v1/data      // get all forms odk
            // String url = "https://kc.humanitarianresponse.info/api/v1/data/1278925";     // get specific instance form

            String url = "https://kc.humanitarianresponse.info/api/v1/data";
            Log.d(TAG, "doInBackground: URL " + url);
            return downloadUrl(url);
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }
    }


    private String downloadUrl(String myurl) throws IOException {
        String line = "";
        Log.d(TAG, "doInBackground: Starting");
        URL url = null;
        String new_url = null;
        String var_instance_id = "";

        try {
            Log.d(TAG, "doInBackground: Trying...");
            if (serverURL == null) {
                //    url = new URL("http://43.245.131.159:8080/dss/api/getdata.php");
                //url = new URL("http://3.249.206.243/aku/api/getdata.php");
                url = new URL(myurl);
            } else {
                url = serverURL;
            }


            File folder = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "/Android/data/org.odk.collect.android/files/projects");


            if (!folder.exists()) {
                return "ODK not found in this device install ODK first";
            } else {

                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url(url)
                        .get()
                        .addHeader("authorization", "token 281de2b90e14e068f73614375903cb427c41bb96")
                        .addHeader("cache-control", "no-cache")
                        .addHeader("Content-Type", "application/json")
                        .addHeader("charset", "utf-8")
                        .build();

                Response response = client.newCall(request).execute();

                if (response.code() == 200) {

                    InputStream in = response.body().byteStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

                    StringBuffer sb = new StringBuffer();

                    while ((line = reader.readLine()) != null) {
                        Log.i(TAG, "ELIgi In: " + line);
                        sb.append(line);
                    }
                    reader.close();

                    JSONArray json = new JSONArray(sb.toString());

                    for (int i = 0; i < json.length(); i++) {
                        JSONObject jsonObject = new JSONObject(json.getString(i));
                        if (jsonObject.getString("title").equals("FORM A-0: INITIAL ASSESSMENT FORM")) {
                            var_instance_id = jsonObject.getString("id");
                        }
                    }
                } else {
                    System.out.println(response.message());
                    return response.message();
                }

                response = null;


                if (serverURL == null) {
                    myurl = myurl + "/" + var_instance_id;
                    url = new URL(myurl);
                } else {
                    url = serverURL;
                }


                Request request1 = new Request.Builder()
                        .url(url)
                        .get()
                        .addHeader("authorization", "token 281de2b90e14e068f73614375903cb427c41bb96")
                        .addHeader("cache-control", "no-cache")
                        .addHeader("Content-Type", "application/json")
                        .addHeader("charset", "utf-8")
                        .build();

                response = client.newCall(request1).execute();

                //Log.d(TAG, "doInBackground: " + urlConnection.getResponseCode());

                if (response.code() == 200) {

                    //InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                    InputStream in = response.body().byteStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));

                    StringBuffer sb = new StringBuffer();

                    while ((line = reader.readLine()) != null) {
                        Log.i(TAG, "ELIgi In: " + line);
                        sb.append(line);
                    }
                    reader.close();

                    System.out.println("" + sb.toString());
                    return sb.toString();
                } else {
                    System.out.println(response.message());
                    return response.message();
                }

            }

        } catch (JSONException | MalformedURLException e) {
            e.printStackTrace();
        } catch (java.net.SocketTimeoutException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            urlConnection.disconnect();
        }
        return line;
    }


    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        int sSynced = 0;
        String sError = "";
        try {

            if (result.equals("")) {
                Toast.makeText(mContext, "No response from the server", Toast.LENGTH_SHORT).show();
                pd.cancel();
            } else if (result.equals("ODK not found in this device install ODK first")) {
                Toast.makeText(mContext, "ODK not found in this device install ODK first", Toast.LENGTH_SHORT).show();
                pd.cancel();
            } else {

                JSONArray json = new JSONArray(result);

                //File dir = new File("/storage/emulated/0/Android/data/org.odk.collect.android/files/projects/");

                File file_lf = new File("/storage/emulated/0/Android/data/org.odk.collect.android/files/projects/d2d3b5fc-21d4-45e8-a764-ed28b9489c5f/forms/FORM NO A 1 CRF Pneumonia-media/" + "forma0.csv");


                //File file_lf = new File(Environment.getExternalStorageDirectory() + "/tvipneumonia2022/forma0.csv");

//                Toast.makeText(mContext, Environment.getExternalStoragePublicDirectory("/Android/data/org.odk.collect.android/").toString(), Toast.LENGTH_LONG).show();


                String csvString = CDL.toString(json);
                FileUtils.writeStringToFile(file_lf, csvString);


                //DatabaseHelper db = new DatabaseHelper(mContext);

            /*for (int i = 0; i < json.length(); i++) {
                JSONObject jsonObject = new JSONObject(json.getString(i));
                if (jsonObject.getString("status").equals("1")) {
                    sSynced++;
                } else if (jsonObject.getString("error").equals("1")) {
                    sError += "[" + jsonObject.getString("id") + "] " + jsonObject.getString("message") + "\n";
                }
            }*/

                //Toast.makeText(mContext, sSynced + " Forms synced." + String.valueOf(json.length() - sSynced) + " Errors.", Toast.LENGTH_SHORT).show();

                Toast.makeText(mContext, "CSV file downloaded", Toast.LENGTH_LONG).show();
                pd.cancel();

                //pd.setMessage("CSV Downloaded");
                //pd.setTitle("CSV Downloaded");
                //pd.show();
            }

        } catch (JSONException |
                IOException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Error CSV downloading " + e.getMessage(), Toast.LENGTH_SHORT).show();
            pd.cancel();

            //pd.setMessage("Error CSV downloading");
            //pd.setTitle("Error CSV downloading");
            //pd.show();
        }

    }

}