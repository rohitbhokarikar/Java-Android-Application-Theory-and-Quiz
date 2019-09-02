package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;


public class MainTheory extends AppCompatActivity {

    CardView introduction, vector, inhertance, thread, applet, subfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_theory);



/*
        //2 nd add

        MobileAds.initialize(this,"ca-app-pub-4543617673565974/7912648228");
        mAdview = findViewById(R.id.adViews);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);


        //end


        rinterstitialAd = new InterstitialAd(this);
        rinterstitialAd.setAdUnitId("ca-app-pub-4543617673565974/4317229202");
        rinterstitialAd.loadAd(new AdRequest.Builder().build());

        rinterstitialAd.setAdListener(new AdListener() {
                                         @Override
                                         public void onAdClosed() {
                                             Intent i = new Intent(MainTheory.this, Applet.class);
                                             startActivity(i);
                                             rinterstitialAd.loadAd(new AdRequest.Builder().build());
                                         }
                                     }


        );


*/

        introduction = (CardView) findViewById(R.id.introduction);
        vector = (CardView) findViewById(R.id.vectors);

        inhertance = (CardView) findViewById(R.id.inheritance);

        thread = (CardView) findViewById(R.id.thread);

        applet = (CardView) findViewById(R.id.applet);
        subfile = (CardView)findViewById(R.id.filej);



        subfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainTheory.this, subfile.class);
                startActivity(i);
            }
        });

        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainTheory.this, Introduction.class);
                startActivity(i);
            }
        });


        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainTheory.this, Vector.class);
                startActivity(i);
            }
        });


        thread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainTheory.this, Thread.class);
                startActivity(i);
            }
        });


        inhertance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainTheory.this, Inheritance.class);
                startActivity(i);
            }
        });


        applet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                    Intent i = new Intent(MainTheory.this,Applet.class);
                    startActivity(i);
                }
            }
        });



    }


}



