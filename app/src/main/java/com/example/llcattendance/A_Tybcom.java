package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class A_Tybcom extends AppCompatActivity {
    WebView webView;
    String div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a__tybcom);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div = b.getString("div");

        if(div.equals("A"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScLB_UiMZNdfZzEXdyp7JxR2rnecgDpUoh4DvR4C__OfQa8sw/viewform");



        }

       else  if(div.equals("B"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfkrnjwSBVLG0h178NQMvBwz5VYgF7znoozZVsC4iRDXthi1w/viewform");



        }
        else if(div.equals("C"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdnoWkDjLss92jWFwdE17TtWR8rhpfTzF6Li8aGFJkcXnDjzg/viewform");


        }
        else if(div.equals("D"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSerFvrpwNO3UawVNzt_st-bybGdoYgMgEkAK6wOOV-JHowirA/viewform");
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



            if(div.equals("A"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");



            }

            else  if(div.equals("B"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");



            }
            else if(div.equals("C"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");


            }
            else if(div.equals("D"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1GPVsCKJLHe93SGreI-Kl2OmKMRPdyrAHfuVY2ZXXB40/edit#gid=2019525135");


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

                Intent i = new Intent(getApplicationContext(),tybcom_main.class);
                startActivity(i);
                finish();






        }

        return super.onOptionsItemSelected(item);
    }

}
