package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Thread extends AppCompatActivity {

    CardView multi , life,creating ,threadmethod,exception,exceptionhandling,throwingown,finallystatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);


        multi = (CardView) findViewById(R.id.multithreading);
        life = (CardView) findViewById(R.id.lifecycleofthread);
        creating  = (CardView) findViewById(R.id.creatingthread);
        finallystatement  = (CardView) findViewById(R.id.finallystatement);



        threadmethod = (CardView) findViewById(R.id.threadmethods);

        exception = (CardView) findViewById(R.id.exception);

        exceptionhandling  = (CardView) findViewById(R.id.exceptionhandligsyntax);

        throwingown  = (CardView) findViewById(R.id.throwingownexception);




        finallystatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, FinallyStatement.class);
                startActivity(i);
            }
        });



        throwingown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, ThrowingOurOwnException.class);
                startActivity(i);
            }
        });


        exceptionhandling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, ExxceptionHandlingSyntax.class);
                startActivity(i);
            }
        });

        exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, com.rbworks.dev.jpf.com.Exceptions.class);
                startActivity(i);
            }
        });

        threadmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, ThreadMethods.class);
                startActivity(i);
            }
        });


        creating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, CreatingThread.class);
                startActivity(i);
            }
        });


        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, LifeCycleOfThread.class);
                startActivity(i);
            }
        });




        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thread.this, Multithreading.class);
                startActivity(i);
            }
        });

    }
}
