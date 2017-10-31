package com.example.a0426611017.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    //ini gua jadiin comment, kalo mau dibalikin ke awal tinggal di re-comment lagi
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("http://autonetmagz.com");
        webView.setWebViewClient(new WebViewClient());

        //Settings
        WebSettings webSettings = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed()
    {
        WebView webView = (WebView) findViewById(R.id.webView);
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
    }