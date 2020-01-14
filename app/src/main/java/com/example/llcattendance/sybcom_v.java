package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class sybcom_v extends AppCompatActivity {

    WebView webView;
    String div;
    String tp;
    private static String URL = "http://llc-attendance.000webhostapp.com/Attendance_Data/getSubject.php";
    private static String google_form = "";
    private static String google_sheet = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sybcom_v);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div = b.getString("div");
        tp = b.getString("tp");

        if(div.equals("sybcom_A"))
        {
//            webView = ( WebView )findViewById(R.id.v);
//            WebSettings webSettings = webView.getSettings();
//
//            webSettings.setJavaScriptEnabled(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.setScrollbarFadingEnabled(false);
//            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//            //  webView.getSettings().setBuiltInZoomControls(true);
//            webView.setWebViewClient(new WebViewClient());
//
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScOGwCkIqG3guNjI8kITSEHoXKcc6bo3S16EeeRwM5Q7ayFxA/viewform");
            getURLs("SY","A","THEORY");

        }
        else if(div.equals("sybcom_B"))
        {
//            webView = (WebView )findViewById(R.id.v);
//            WebSettings webSettings = webView.getSettings();
//
//            webSettings.setJavaScriptEnabled(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.setScrollbarFadingEnabled(false);
//            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//            //  webView.getSettings().setBuiltInZoomControls(true);
//            webView.setWebViewClient(new WebViewClient());
//
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSePnDZE_-EOOsS0cYxvS2ILJqI4d6ukt5i_T4SKJlmOplwEUA/viewform");
//
            getURLs("SY","B","THEORY");
        }
        else if(div.equals("sybcom_C"))
        {
//            webView = (WebView )findViewById(R.id.v);
//            WebSettings webSettings = webView.getSettings();
//
//            webSettings.setJavaScriptEnabled(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.setScrollbarFadingEnabled(false);
//            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//            //  webView.getSettings().setBuiltInZoomControls(true);
//            webView.setWebViewClient(new WebViewClient());
//
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfekCjLCEgA9OiDlW8UJ3YM0f_cbmGe1KFsajTHLUCLiJgO0w/viewform");
            getURLs("SY","C","THEORY");

        }
        else if(div.equals("sybcom_D"))
        {
//            webView = (WebView )findViewById(R.id.v);
//            WebSettings webSettings = webView.getSettings();
//
//            webSettings.setJavaScriptEnabled(true);
//            webView.getSettings().setLoadWithOverviewMode(true);
//            webView.getSettings().setUseWideViewPort(true);
//            webView.setScrollbarFadingEnabled(false);
//            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//            //  webView.getSettings().setBuiltInZoomControls(true);
//            webView.setWebViewClient(new WebViewClient());
//
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfK9kb4He3g-7lVmGNRSGL9EwYCTWfTwLKH4QPzC2PpDPxxRw/viewform");
            getURLs("SY","D","THEORY");

        }


    }
    private void getURLs(final String Year, final String Div, final String Type) {
        Log.d("URL","ENTERED getURLs METHOD");
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONArray("subject");
                            Log.d("URL","jsonARRAY: " + jsonArray);
                            if(jsonObject.getString("success").equals("1"))
                            {
                                for(int i=0;i<jsonArray.length();i++)
                                {
                                    JSONObject object = jsonArray.getJSONObject(i);
                                    Log.d("URL","Google Form: " + object.getString("google_form"));
                                    Log.d("URL","Google Sheet: " + object.getString("google_sheet"));

                                    google_form = object.getString("google_form");
                                    google_sheet = object.getString("google_sheet");
                                    if(google_form !=" " && google_sheet != "")
                                    {
                                        Toast.makeText(sybcom_v.this, "URL`s Loaded Successfully", Toast.LENGTH_SHORT).show();
                                    }
                                    else if(google_form == " " && google_sheet == "")
                                    {
                                        Toast.makeText(sybcom_v.this, "Failed to Load URL`s \nKindly Refresh", Toast.LENGTH_SHORT).show();
                                    }

                                }

                            }
                            else
                            {
                                Toast.makeText(sybcom_v.this, "Could not fetch URL", Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch(JSONException e)
                        {
                            Toast.makeText(sybcom_v.this, "JSON Exception " + e.toString(), Toast.LENGTH_SHORT).show();
                        }
                        catch(Exception ex)
                        {
                            Toast.makeText(sybcom_v.this, "Exception: " + ex.toString(), Toast.LENGTH_SHORT).show();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(sybcom_v.this, "Volley Error: " + error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                params.put("year",Year);
                params.put("div",Div);
                params.put("stream","BCOM");
                params.put("p_type",Type);
                return params;
            }
        } ;

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back button clicked ... \n Click on Home button to go back", Toast.LENGTH_SHORT).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.form)
        {
            webView = (WebView )findViewById(R.id.v);
            WebSettings webSettings = webView.getSettings();

            webSettings.setJavaScriptEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setScrollbarFadingEnabled(false);
            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
            //  webView.getSettings().setBuiltInZoomControls(true);
            webView.setWebViewClient(new WebViewClient());

            webView.loadUrl(google_form);
        }
        if(id == R.id.sheet)
        {
            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
            LayoutInflater inflater = this.getLayoutInflater();
            View view = inflater.inflate(R.layout.sheet,null);
            WebView wv = (WebView) view.findViewById(R.id.view);
            TextView tv = (TextView) view.findViewById(R.id.layer);
            alertBuilder.setView(view);
            final AlertDialog dialog = alertBuilder.create();
            dialog.show();
            WebSettings webSettings = wv.getSettings();
            webSettings.setJavaScriptEnabled(true);
            wv.getSettings().setLoadWithOverviewMode(true);
            wv.getSettings().setUseWideViewPort(true);
            wv.setScrollbarFadingEnabled(false);
            wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
            //  webView.getSettings().setBuiltInZoomControls(true);
            wv.setWebViewClient(new WebViewClient());

            wv.loadUrl(google_sheet);



            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });
//            if(div.equals("sybcom_A"))
//            {
//
//
//                WebSettings webSettings = wv.getSettings();
//
//                webSettings.setJavaScriptEnabled(true);
//                wv.getSettings().setLoadWithOverviewMode(true);
//                wv.getSettings().setUseWideViewPort(true);
//                wv.setScrollbarFadingEnabled(false);
//                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//                //  webView.getSettings().setBuiltInZoomControls(true);
//                wv.setWebViewClient(new WebViewClient());
//
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");
//
//
//            }
//            else if(div.equals("sybcom_B"))
//            {
//
//                WebSettings webSettings = wv.getSettings();
//
//                webSettings.setJavaScriptEnabled(true);
//                wv.getSettings().setLoadWithOverviewMode(true);
//                wv.getSettings().setUseWideViewPort(true);
//                wv.setScrollbarFadingEnabled(false);
//                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//                //  webView.getSettings().setBuiltInZoomControls(true);
//                wv.setWebViewClient(new WebViewClient());
//
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");
//
//
//            }
//            else if(div.equals("sybcom_C"))
//            {
//
//                WebSettings webSettings = wv.getSettings();
//
//                webSettings.setJavaScriptEnabled(true);
//                wv.getSettings().setLoadWithOverviewMode(true);
//                wv.getSettings().setUseWideViewPort(true);
//                wv.setScrollbarFadingEnabled(false);
//                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//                //  webView.getSettings().setBuiltInZoomControls(true);
//                wv.setWebViewClient(new WebViewClient());
//
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");
//
//
//            }
//            else if(div.equals("sybcom_D"))
//            {
//                WebSettings webSettings = wv.getSettings();
//
//                webSettings.setJavaScriptEnabled(true);
//                wv.getSettings().setLoadWithOverviewMode(true);
//                wv.getSettings().setUseWideViewPort(true);
//                wv.setScrollbarFadingEnabled(false);
//                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//                //  webView.getSettings().setBuiltInZoomControls(true);
//                wv.setWebViewClient(new WebViewClient());
//
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");
//
//
//            }







        }
        if (id == R.id.home)
        {

                Intent i = new Intent(getApplicationContext(),bcom_n.class);
                startActivity(i);
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
