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

public class Fybcom_Tutorial extends AppCompatActivity {
    WebView webView;
    String div,tp;
    ActionBar actionBar;
    Intent intent;
    Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fybcom__tutorial);
        actionBar = getSupportActionBar();
        intent = getIntent();
        b = intent.getExtras();

        div = b.getString("div");
        tp = b.getString("tp");
        DispWebView_fybcom(div,tp);
    }

    private void DispWebView_fybcom(String div, String tp) {
        webView = (WebView )findViewById(R.id.v);
        if(div.equals("fybcom_A"))
        {
            if(tp.equals("tutorial_AB1"))
            {
                actionBar.setTitle("FY A B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdUakRyuLiSiSGPNTbEnlk2Sa2nvIydyDZSGSzlTwLzm-RgDA/viewform");
            }
            if(tp.equals("tutorial_AB2"))
            {
                actionBar.setTitle("FY A B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSddaCiGWhLWB-ZHzowlFTlKJWfBZ9Po_ft6pnGMx6zlE-TB9g/viewform");
            }
            if(tp.equals("tutorial_AB3"))
            {
                actionBar.setTitle("FY A B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfR-_Sd5307aPIYzDG1OLpecxm4xTR5dBq87OPSZJqsQcJBhg/viewform");
            }
            if(tp.equals("tutorial_AB4"))
            {
                actionBar.setTitle("FY A B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeY6llrTmMXYTOUtaR6UKrQl-se_0eIgUTTHI1LBleJref4PQ/viewform");
            }
        }
        else if(div.equals("fybcom_B"))
        {
            if(tp.equals("tutorial_BB1"))
            {
                actionBar.setTitle("FY B B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeAoiBONcl_IawfxX5uQpaWtLIyJQw92l8mtBHiBFJFbFzprQ/viewform");
            }
            if(tp.equals("tutorial_BB2"))
            {
                actionBar.setTitle("FY B B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeOfJYI3V7UctJdsl2AK21l8nIBSJYlxWqkxLpx7U_Z_f9Tlg/viewform");
            }
            if(tp.equals("tutorial_BB3"))
            {
                actionBar.setTitle("FY B B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd8rT2qUDDcwHukJOWvytqfOeFEi1FZud4ecw8U72t5Yp-HKw/viewform");
            }
            if(tp.equals("tutorial_BB4"))
            {
                actionBar.setTitle("FY B B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc1hhZrl8UUqBPOBBcUqP1Mcds6CRVgCIVP24QVIjkHr9A1Cg/viewform");
            }
        }
        else if(div.equals("fybcom_C"))
        {
            if(tp.equals("tutorial_CB1"))
            {
                actionBar.setTitle("FY C B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfYVCTZCGc9B6i2kr-0RY0rpUXzL7GPWCTkc5vR7I1gLTtd3g/viewform");
            }
            if(tp.equals("tutorial_CB2"))
            {
                actionBar.setTitle("FY C B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd6yN80UR5bPrfQJTU9ZcsvJepcmyIVPJHHSo1oZvy2r6ZnBA/viewform");
            }
            if(tp.equals("tutorial_CB3"))
            {
                actionBar.setTitle("FY C B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfOftkJIiy8q4bFWilo8w4luFq0vBv6BnrOusXQSecrsfeU_w/viewform");
            }
            if(tp.equals("tutorial_CB4"))
            {
                actionBar.setTitle("FY C B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf-el6mWzNCYuDoX6QvkJL9hOyIWdobpkXHwsMeiN9bJHhZQw/viewform");
            }
        }
        else if(div.equals("fybcom_D"))
        {
            if(tp.equals("tutorial_DB1"))
            {
                actionBar.setTitle("FY D B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeQh-DpC7awhedC_ENKqSUACYEaCV84-_kJWbaaV7jDYoiTvA/viewform");
            }
            if(tp.equals("tutorial_DB2"))
            {
                actionBar.setTitle("FY D B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc8muXvBwNmK_TEGnPgmbw9dEg7vstSPBfYku2_g88694DjkQ/viewform");
            }
            if(tp.equals("tutorial_DB3"))
            {
                actionBar.setTitle("FY D B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfSbQLUvqXT-Viv5QbV19g5Na9Sht0V0BMyJO1R3j_TYNnvQQ/viewform");
            }
            if(tp.equals("tutorial_DB4"))
            {
                actionBar.setTitle("FY D B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSe-f6oJADpHrqQ5Xb48wK4a7Qu29mEbbYdkysskjF3qsKofKA/viewform");
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
            if(div.equals("fybcom_A")) {
                if (tp.equals("tutorial_AB1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1yBDYnPjGvttMjhphOkNEvcPMu8yKguIvscMcEbTVsXQ/edit#gid=2115330379");


                }
                if (tp.equals("tutorial_AB2")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1yBDYnPjGvttMjhphOkNEvcPMu8yKguIvscMcEbTVsXQ/edit#gid=2115330379");


                }
                if (tp.equals("tutorial_AB3")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1yBDYnPjGvttMjhphOkNEvcPMu8yKguIvscMcEbTVsXQ/edit#gid=2115330379");


                }
                if (tp.equals("tutorial_AB4")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1yBDYnPjGvttMjhphOkNEvcPMu8yKguIvscMcEbTVsXQ/edit#gid=2115330379");


                }
            }
            if(div.equals("fybcom_B")) {
                if (tp.equals("tutorial_BB1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=1737371085");


                }
                if (tp.equals("tutorial_BB2")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=1737371085");


                }
                if (tp.equals("tutorial_BB3")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=1737371085");


                }
                if (tp.equals("tutorial_BB4")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1q4LFMKo5auJWJvonubDk-YXD030YWrRjw5HO-HHXRRc/edit#gid=1737371085");


                }
            }
            if(div.equals("fybcom_C")) {
                if (tp.equals("tutorial_CB1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1BE-AMcyigZaVbGwD9cY6DSY5sJJu2KYZVyA_jQlFn1w/edit#gid=650561088");


                }
                if (tp.equals("tutorial_CB2")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1BE-AMcyigZaVbGwD9cY6DSY5sJJu2KYZVyA_jQlFn1w/edit#gid=650561088");


                }
                if (tp.equals("tutorial_CB3")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1BE-AMcyigZaVbGwD9cY6DSY5sJJu2KYZVyA_jQlFn1w/edit#gid=650561088");


                }
                if (tp.equals("tutorial_CB4")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1BE-AMcyigZaVbGwD9cY6DSY5sJJu2KYZVyA_jQlFn1w/edit#gid=650561088");


                }
            }
            if(div.equals("fybcom_D")) {
                if (tp.equals("tutorial_DB1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1IrnqlQZhG7tzW6Q32UpmBObzozNoTOZYPcoLvWA3M7g/edit#gid=2071292337");


                }
                if (tp.equals("tutorial_DB2")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1IrnqlQZhG7tzW6Q32UpmBObzozNoTOZYPcoLvWA3M7g/edit#gid=2071292337");


                }
                if (tp.equals("tutorial_DB3")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1IrnqlQZhG7tzW6Q32UpmBObzozNoTOZYPcoLvWA3M7g/edit#gid=2071292337");


                }
                if (tp.equals("tutorial_DB4")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1IrnqlQZhG7tzW6Q32UpmBObzozNoTOZYPcoLvWA3M7g/edit#gid=2071292337");


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
            Intent i = new Intent(Fybcom_Tutorial.this,fybcom.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);

    }
}
