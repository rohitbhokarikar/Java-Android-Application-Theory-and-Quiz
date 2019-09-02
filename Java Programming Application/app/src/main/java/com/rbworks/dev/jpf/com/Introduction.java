package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;


public class Introduction extends AppCompatActivity {



    CardView features, components, constants, operators, decision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);



/*
        minterstitialAd = new InterstitialAd(this);
        minterstitialAd.setAdUnitId("ca-app-pub-4543617673565974/4265080708");
        minterstitialAd.loadAd(new AdRequest.Builder().build());

        minterstitialAd.setAdListener(new AdListener() {
                                         @Override
                                         public void onAdClosed() {
                                             Intent i = new Intent(Introduction.this, ConstantsVariableDatatypes.class);
                                             startActivity(i);
                                             minterstitialAd.loadAd(new AdRequest.Builder().build());
                                         }
                                     }


        );



*/



        features = (CardView) findViewById(R.id.features);
        components = (CardView) findViewById(R.id.component);

        constants = (CardView) findViewById(R.id.constantvariablesdatatypes);

        operators = (CardView) findViewById(R.id.operator);

        decision = (CardView) findViewById(R.id.decisionmaking);


        features.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Introduction.this, JavaFeature.class);
                startActivity(i);
            }
        });


        components.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Introduction.this, JavaComponents.class);
                startActivity(i);
            }
        });


        constants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent i = new Intent(Introduction.this,ConstantsVariableDatatypes.class);
                    startActivity(i);
                }
            }
        });



        operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Introduction.this, Operators.class);
                startActivity(i);
            }
        });


        decision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Introduction.this, DecisionMaking.class);
                startActivity(i);
            }
        });
    }
}

