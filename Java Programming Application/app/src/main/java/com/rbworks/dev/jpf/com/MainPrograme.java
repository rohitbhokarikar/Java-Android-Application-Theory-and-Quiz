package com.rbworks.dev.jpf.com;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainPrograme extends AppCompatActivity {

    CardView input,addition,factorial,primenumber,palidromenumber,fibonaccci,even,pascal,armstrong,swaping
            ,inheritance,superkey,threadprograme,userexception,exceptiononly,vector,interfaceprograme,
            inheritanceprograme,arrayexample,proversio;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_programe);


        proversio = (CardView)findViewById(R.id.proversion);
        input = (CardView)findViewById(R.id.input);

        addition = (CardView)findViewById(R.id.addition);
        factorial = (CardView)findViewById(R.id.facctorial);
        palidromenumber = (CardView)findViewById(R.id.palindromenumber);
        primenumber = (CardView)findViewById(R.id.primenumber);
        fibonaccci = (CardView)findViewById(R.id.fibonacci);
        even = (CardView)findViewById(R.id.evenorodd);
        pascal = (CardView)findViewById(R.id.pascaltriangle);
        armstrong = (CardView)findViewById(R.id.armstrongnumber);
        swaping= (CardView)findViewById(R.id.swappingusingtwovariables);
        inheritance= (CardView)findViewById(R.id.inheritance);
        superkey= (CardView)findViewById(R.id.superprograme);

        threadprograme= (CardView)findViewById(R.id.threadprogrames);
        userexception= (CardView)findViewById(R.id.userexceptionprogrames);
        //exceptiononly= (CardView)findViewById(R.id.exceptionprogrames);
        vector= (CardView)findViewById(R.id.vectorprogrames);
       interfaceprograme= (CardView)findViewById(R.id.interfaceprograme);
       inheritanceprograme= (CardView)findViewById(R.id.inheritanceprograme);
        arrayexample= (CardView)findViewById(R.id.arrayexample);





        proversio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.javaprogramming.rbworks.dev.jpcp&hl=en")));

            }
        });






        superkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,SuperKeywordPrograme.class));
            }
        });




        swaping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,SwappingUsingTwo.class));
            }
        });


        armstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,ArmstrongNumber.class));
            }
        });



        pascal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,PascalTriangle.class));
            }
        });



        arrayexample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,ArrayExamplePro.class));
            }
        });



        inheritanceprograme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,InheritancePrograme.class));
            }
        });



        interfaceprograme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,InterfacePrograme.class));
            }
        });


        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,VectorPrograme.class));
            }
        });

       /* exceptiononly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,SadhExceptionPrograme.class));
            }
        });*/

        userexception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,UserExceptionPrograme.class));
            }
        });

       threadprograme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,ThreadPrograme.class));
            }
        });





        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,EvenorOdd.class));
            }
        });



        fibonaccci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,FibonacciSeries.class));
            }
        });


        primenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,PrimeNumber.class));
            }
        });




        palidromenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,PalindromNumber.class));
            }
        });


        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,Factorial.class));
            }
        });


        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,Factorial.class));
            }
        });





        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,Addition.class));
            }
        });


        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainPrograme.this,TakeInput.class));
            }
        });




    }
}

