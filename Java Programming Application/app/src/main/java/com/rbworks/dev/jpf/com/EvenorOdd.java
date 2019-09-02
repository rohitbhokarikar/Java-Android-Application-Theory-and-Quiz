package com.rbworks.dev.jpf.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class EvenorOdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenor_odd);



        WebView minShow = (WebView)findViewById(R.id.evenoroddweb);
        minShow.loadUrl("file:///android_asset/EvenorOddCheck.html");
        WebSettings settings = minShow.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);
    }
}
