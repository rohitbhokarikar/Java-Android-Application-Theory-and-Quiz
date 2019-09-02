package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class subfile extends AppCompatActivity {

    CardView methods,method,serial,fileclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subfile);

        methods = findViewById(R.id.methodsoffielinputstream);
        method = findViewById(R.id.methodsoffileoutputstream);
        serial = findViewById(R.id.serialization);
        fileclass = findViewById(R.id.fileclassmethods);



        fileclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(subfile.this,MethodsOfFile.class));
            }
        });




        serial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(subfile.this,Serialization.class));
            }
        });




        method.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(subfile.this,MethodsOfFileOutput.class));
            }
        });


        methods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(subfile.this,MethodsOfFileInput.class));
            }
        });

    }
}
