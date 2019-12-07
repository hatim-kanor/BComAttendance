package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class sybcom_v extends AppCompatActivity {

    WebView webView;
    String div;
    String tp;


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
            webView = ( WebView )findViewById(R.id.v);
            WebSettings webSettings = webView.getSettings();

            webSettings.setJavaScriptEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.setScrollbarFadingEnabled(false);
            webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
            //  webView.getSettings().setBuiltInZoomControls(true);
            webView.setWebViewClient(new WebViewClient());

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScOGwCkIqG3guNjI8kITSEHoXKcc6bo3S16EeeRwM5Q7ayFxA/viewform");


        }
        else if(div.equals("sybcom_B"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSePnDZE_-EOOsS0cYxvS2ILJqI4d6ukt5i_T4SKJlmOplwEUA/viewform");


        }
        else if(div.equals("sybcom_C"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfekCjLCEgA9OiDlW8UJ3YM0f_cbmGe1KFsajTHLUCLiJgO0w/viewform");


        }
        else if(div.equals("sybcom_D"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfK9kb4He3g-7lVmGNRSGL9EwYCTWfTwLKH4QPzC2PpDPxxRw/viewform");


        }


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




            if(div.equals("sybcom_A"))
            {


                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");


            }
            else if(div.equals("sybcom_B"))
            {

                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");


            }
            else if(div.equals("sybcom_C"))
            {

                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");


            }
            else if(div.equals("sybcom_D"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1L8z8GYYoD7aSiQpxWfuVu5qB5q1bUWptIAf7dtsyEOo/edit#gid=1860735893");


            }

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();

                }
            });





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
