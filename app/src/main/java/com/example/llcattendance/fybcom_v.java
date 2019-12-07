package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class fybcom_v extends AppCompatActivity {



    WebView webView;
    String div;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fybcom_v);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div = b.getString("div");



        if(div.equals("fybcom_A"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScVg0-T8mv-nig4KOMmY9mi9i8qT0ASy3794-Uy9h8h2dvBBw/viewform");


        }
        else if(div.equals("fybcom_B"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScjFfZVz1DwWKuW21yb42JPb0i0HbNlWsehF_jKWUqqjeLTUQ/viewform");



        }
        else if(div.equals("fybcom_C"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfjI8nl2flbsAbfTDs5hZqHz_19EgaHWqGWBgT3UDrMOYDF-A/viewform");


        }
        else if(div.equals("fybcom_D"))
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

            webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeZ-x6Mji6N5C3uh0qtvzHndrkXAz2nhtGr2ABFx_U6YCw9JQ/viewform");


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


            if(div.equals("fybcom_A"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=630729995");


            }
            else if(div.equals("fybcom_B"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=630729995");



            }
            else if(div.equals("fybcom_C"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=630729995");


            }
            else if(div.equals("fybcom_D"))
            {
                WebSettings webSettings = wv.getSettings();

                webSettings.setJavaScriptEnabled(true);
                wv.getSettings().setLoadWithOverviewMode(true);
                wv.getSettings().setUseWideViewPort(true);
                wv.setScrollbarFadingEnabled(false);
                wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                wv.setWebViewClient(new WebViewClient());

                wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=630729995");


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


                Intent i = new Intent(getApplicationContext(),fybcom.class);
                i.putExtra("year", "fybcom");
                startActivity(i);
                finish();
        }

        return super.onOptionsItemSelected(item);
    }

}
