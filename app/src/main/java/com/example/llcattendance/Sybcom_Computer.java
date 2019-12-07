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

public class Sybcom_Computer extends AppCompatActivity {
    WebView webView;
    String div,tp;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sybcom__computer);
        actionBar = getSupportActionBar();
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        div = b.getString("div");
        tp = b.getString("tp");
        DispWebView_sybcom(div,tp);

    }

    private void DispWebView_sybcom(String div, String tp) {
        webView = (WebView )findViewById(R.id.v);
        if(div.equals("sybcom_C"))
        {
            if(tp.equals("computer_B1"))
            {
                actionBar.setTitle("SY C B1");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdIsIuxCiXoAzBnwHdur1JKYFPgkTypZK7YZh91pOV_-uGQrg/viewform");
            }
            if(tp.equals("computer_B2"))
            {
                actionBar.setTitle("SY C B2");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdR_xjIvA3PZWVmIqwPgnmxTul_aWhwWSsg6EelyUCp0be5sg/viewform");
            }
            if(tp.equals("computer_B3"))
            {
                actionBar.setTitle("SY C B3");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScNm6C-k662z14pYIHI2YamNdhQhFBXsUBLAQm0SgzEFOt1vg/viewform");
            }
            if(tp.equals("computer_B4"))
            {
                actionBar.setTitle("SY C B4");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc6npqW2gj4zfPPMbbQUoY2SbaN7iHnpNvzw5dkrYTh6ul2Mg/viewform");
            }
            if(tp.equals("computer_B5"))
            {
                actionBar.setTitle("SY C B5");
                WebSettings webSettings = webView.getSettings();

                webSettings.setJavaScriptEnabled(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setScrollbarFadingEnabled(false);
                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                //  webView.getSettings().setBuiltInZoomControls(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeBHKE7rK59Pdj13usXGPqmwFNXkHfgLnEERTTfeB7Ia3HnaA/viewform");
            }
//            if(tp.equals("computer_B6"))
//            {
//                actionBar.setTitle("SY C B6");
//                WebSettings webSettings = webView.getSettings();
//
//                webSettings.setJavaScriptEnabled(true);
//                webView.getSettings().setLoadWithOverviewMode(true);
//                webView.getSettings().setUseWideViewPort(true);
//                webView.setScrollbarFadingEnabled(false);
//                webView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
//                //  webView.getSettings().setBuiltInZoomControls(true);
//                webView.setWebViewClient(new WebViewClient());
//
//                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeBHKE7rK59Pdj13usXGPqmwFNXkHfgLnEERTTfeB7Ia3HnaA/viewform");
//            }
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
            if(div.equals("sybcom_C")) {
                if (tp.equals("computer_B1")) {
                    WebSettings webSettings = wv.getSettings();

                    webSettings.setJavaScriptEnabled(true);
                    wv.getSettings().setLoadWithOverviewMode(true);
                    wv.getSettings().setUseWideViewPort(true);
                    wv.setScrollbarFadingEnabled(false);
                    wv.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
                    //  webView.getSettings().setBuiltInZoomControls(true);
                    wv.setWebViewClient(new WebViewClient());

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1OEufLR3fp4PijDYQg3JXVMOyqUVob1svYL7kPeyR36A/edit#gid=1167898587");


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

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1OEufLR3fp4PijDYQg3JXVMOyqUVob1svYL7kPeyR36A/edit#gid=1167898587");


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

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1OEufLR3fp4PijDYQg3JXVMOyqUVob1svYL7kPeyR36A/edit#gid=1167898587");


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

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1OEufLR3fp4PijDYQg3JXVMOyqUVob1svYL7kPeyR36A/edit#gid=1167898587");
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

                    wv.loadUrl("https://docs.google.com/spreadsheets/d/1OEufLR3fp4PijDYQg3JXVMOyqUVob1svYL7kPeyR36A/edit#gid=1167898587");
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
            Intent i = new Intent(Sybcom_Computer.this,bcom_n.class);
            startActivity(i);
            finish();
        }
        return super.onOptionsItemSelected(item);

    }
}
