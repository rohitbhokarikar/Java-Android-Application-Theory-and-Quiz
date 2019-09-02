package com.rbworks.dev.jpf.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ArmstrongNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong_number);




        WebView minShow = (WebView)findViewById(R.id.armstrongweb);
        minShow.loadUrl("file:///android_asset/ArmstrongNumberCheck.html");
        WebSettings settings = minShow.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);
    }
}
