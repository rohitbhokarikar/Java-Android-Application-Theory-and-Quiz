package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Vector extends AppCompatActivity {


    CardView inheritance,vector,array,string,garbage,thiskey,superkey,commandline,constructor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);


        inheritance = (CardView) findViewById(R.id.inheritance);
        vector = (CardView) findViewById(R.id.vectorsw);

        array = (CardView) findViewById(R.id.array);

        string = (CardView) findViewById(R.id.string);

        thiskey = (CardView) findViewById(R.id.thiskey);
        superkey = (CardView) findViewById(R.id.superkey);

        commandline = (CardView) findViewById(R.id.command);

        constructor = (CardView) findViewById(R.id.constructor);

        garbage = (CardView) findViewById(R.id.garbagecollecction);


        garbage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, GarbageCollection.class);
                startActivity(i);
            }
        });

        inheritance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, InheritanceActual.class);
                startActivity(i);
            }
        });

        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, VectorActual.class);
                startActivity(i);
            }
        });

        array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, Array.class);
                startActivity(i);
            }
        });

        string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, StringClass.class);
                startActivity(i);
            }
        });


        thiskey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, Thethiskeyword.class);
                startActivity(i);
            }
        });

        superkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, SuperKeyword.class);
                startActivity(i);
            }
        });

        commandline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, CommandLineArguments.class);
                startActivity(i);
            }
        });



        constructor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Vector.this, Constructor.class);
                startActivity(i);
            }
        });

    }
}
