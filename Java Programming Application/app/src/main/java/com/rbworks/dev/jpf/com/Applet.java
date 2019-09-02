package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Applet extends AppCompatActivity {


    CardView applet,writing,methods,life,applettag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applet);

        applet = findViewById(R.id.appletactual);
        writing = findViewById(R.id.firstapplet);
        methods = findViewById(R.id.methodsofgraphics);
        life = findViewById(R.id.lifecycleofapplet);
        applettag = findViewById(R.id.applettagattributes);


        writing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Applet.this,WritingFirstApplet.class));
            }
        });


        methods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Applet.this,MethodsOfGraphicsClass.class));
            }
        });


        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Applet.this,LifeCycleOfApplet.class));
            }
        });


        applettag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Applet.this,AppletTagAttributes.class));
            }
        });

        applet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Applet.this,WhatIsApplet.class));
            }
        });

    }
}
