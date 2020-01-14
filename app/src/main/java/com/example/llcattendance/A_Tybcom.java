package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.support.v7.app.AlertDialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
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

public class A_Tybcom extends AppCompatActivity {
    WebView webView;
    String div1;
    private static String URL = "http://llc-attendance.000webhostapp.com/Attendance_Data/getSubject.php";
    private static String google_form = "";
    private static String google_sheet = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a__tybcom);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div1 = b.getString("div");

        if(div1.equals("A"))
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
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScLB_UiMZNdfZzEXdyp7JxR2rnecgDpUoh4DvR4C__OfQa8sw/viewform");
//

            getURLs("TY","A","THEORY");

        }

       else  if(div1.equals("B"))
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
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfkrnjwSBVLG0h178NQMvBwz5VYgF7znoozZVsC4iRDXthi1w/viewform");

            getURLs("TY","B","THEORY");

        }
        else if(div1.equals("C"))
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
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdnoWkDjLss92jWFwdE17TtWR8rhpfTzF6Li8aGFJkcXnDjzg/viewform");
            getURLs("TY","C","THEORY");

        }
        else if(div1.equals("D"))
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
//            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSerFvrpwNO3UawVNzt_st-bybGdoYgMgEkAK6wOOV-JHowirA/viewform");
            getURLs("TY","D","THEORY");
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
                                        Toast.makeText(A_Tybcom.this, "URL`s Loaded Successfully", Toast.LENGTH_SHORT).show();
                                    }
                                    else if(google_form == " " && google_sheet == "")
                                    {
                                        Toast.makeText(A_Tybcom.this, "Failed to Load URL`s \nKindly Refresh", Toast.LENGTH_SHORT).show();
                                    }

                                }

                            }
                            else
                            {
                                Toast.makeText(A_Tybcom.this, "Could not fetch URL", Toast.LENGTH_SHORT).show();
                            }
                        }
                        catch(JSONException e)
                        {
                            Toast.makeText(A_Tybcom.this, "JSON Exception " + e.toString(), Toast.LENGTH_SHORT).show();
                        }
                        catch(Exception ex)
                        {
                            Toast.makeText(A_Tybcom.this, "Exception: " + ex.toString(), Toast.LENGTH_SHORT).show();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(A_Tybcom.this, "Volley Error: " + error.toString(), Toast.LENGTH_SHORT).show();
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
//
//
//
//            if(div.equals("A"))
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
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");
//
//
//
//            }
//
//            else  if(div.equals("B"))
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
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");
//
//
//
//            }
//            else if(div.equals("C"))
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
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");
//
//
//            }
//            else if(div.equals("D"))
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
//                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");
//
//
//            }





        }
        if (id == R.id.home)
        {

                Intent i = new Intent(getApplicationContext(),tybcom_main.class);
                startActivity(i);
                finish();






        }

        return super.onOptionsItemSelected(item);
    }

}
