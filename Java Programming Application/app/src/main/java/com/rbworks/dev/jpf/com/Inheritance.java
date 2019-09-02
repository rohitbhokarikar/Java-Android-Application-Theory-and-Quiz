package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Inheritance extends AppCompatActivity {
    CardView interfaces,packages,importstatement,diff,javapackages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        interfaces = (CardView)findViewById(R.id.interfaces);
        packages = (CardView)findViewById(R.id.packages);
        importstatement = (CardView)findViewById(R.id.importstatement);
       // diff = (CardView)findViewById(R.id.difference);
        javapackages = (CardView)findViewById(R.id.javapackages);



        javapackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inheritance.this, JavaPackage.class);
                startActivity(i);
            }
        });




        importstatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inheritance.this, TheImportStatement.class);
                startActivity(i);
            }
        });


        packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inheritance.this, Packages.class);
                startActivity(i);
            }
        });

        interfaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inheritance.this, Interface.class);
                startActivity(i);
            }
        });
    }
}
