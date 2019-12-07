package com.example.llcattendance;

import android.content.Intent;
import android.support.v7.app.ActionBar;
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

public class Tybcom_Computer extends AppCompatActivity {
    WebView webView;
    String div,tp;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tybcom__computer);
        actionBar = getSupportActionBar();
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div = b.getString("div");
        tp = b.getString("tp");
        DispWebView_sybcom(div,tp);

    }

    private void DispWebView_sybcom(String div, String tp) {
        webView = (WebView )findViewById(R.id.v);
        if(div.equals("tybcom_C"))
        {
            if(tp.equals("computer_B1"))
            {
                actionBar.setTitle("TY C B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfLbYAn6OLW6Koaepmsv6jmeesS32HQUelt_wmzrtQHCuxkyw/viewform");
            }
            if(tp.equals("computer_B2"))
            {
                actionBar.setTitle("TY C B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeZYu1rpMWvDX6Ao1aYQFTDC9InnnEWA7pKAEF_EpaJMV8WEA/viewform");
            }
            if(tp.equals("computer_B3"))
            {
                actionBar.setTitle("TY C B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSedi9qjwZyOaTyZrcrUPRu-nXCMOinAtyEdb3rKtvsddwU9UA/viewform");
            }
            if(tp.equals("computer_B4"))
            {
                actionBar.setTitle("TY C B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSctnMqq1I7lHXiZFkED1G65MTkBfjcekrREUKMhT9CqXcr41Q/viewform");
            }
            if(tp.equals("computer_B5"))
            {
                actionBar.setTitle("TY C B5");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScM2QlPdUtkNCoAk-NDxXR2V1UXJzQzLMbJq8SzgwA3mHptUA/viewform");
            }

        }
        if(div.equals("tybcom_D"))
        {
            if(tp.equals("computer_B6"))
            {
                actionBar.setTitle("TY D B6");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf4dTOs5AoGGS8nrToYj2NtCtU19tc2NrsNX0pj19OVikw27Q/viewform");
            }
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

    @Override
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
            if(div.equals("tybcom_D"))
            {
                if (tp.equals("computer_B6")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");
                }
            }
            if(div.equals("tybcom_C")) {
                if (tp.equals("computer_B1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");


                }
                if (tp.equals("computer_B2")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");


                }
                if (tp.equals("computer_B3")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");


                }
                if (tp.equals("computer_B4")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");
                }
                if (tp.equals("computer_B5")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1a-5caATcKkqq20P66v-G46QRDyk-E0SscSma97_4FOY/edit#gid=1066218191");
                }
            }

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.dismiss();
                }
            });


        }
        if(id == R.id.home)
        {
            Intent i = new Intent(Tybcom_Computer.this,tybcom_main.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);

    }
}
