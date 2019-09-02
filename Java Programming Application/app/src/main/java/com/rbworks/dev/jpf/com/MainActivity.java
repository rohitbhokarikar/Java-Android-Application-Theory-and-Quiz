package com.rbworks.dev.jpf.com;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    CardView about, theory, programe, mainquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-4543617673565974/4265080708");
        interstitialAd.loadAd(new AdRequest.Builder().build());

        interstitialAd.setAdListener(new AdListener() {
                                         @Override
                                         public void onAdClosed() {
                                             Intent i = new Intent(MainActivity.this, MainPrograme.class);
                                             startActivity(i);
                                             interstitialAd.loadAd(new AdRequest.Builder().build());
                                         }
                                     }


        );

*/


        // about = (CardView) findViewById(R.id.mainabout);
        theory = (CardView) findViewById(R.id.maintheory);
        programe = (CardView) findViewById(R.id.mainprograme);
        mainquiz = findViewById(R.id.mainquiz);

        programe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {

                    Intent i = new Intent(MainActivity.this, MainPrograme.class);
                    startActivity(i);
                }
            }

        });

        mainquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(i);
            }
        });


       /* about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainAbout.class);
                startActivity(i);
            }
        });
*/
        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainTheory.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {

        AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("Exit ?").setMessage("Are you sure want to Exit ?")
                .setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        finish();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Rate App", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rbworks.dev.jpf.com&hl=en")));

                    }
                })
                .show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.action_about) {

            startActivity(new Intent(this, MainAbout.class));

            return true;
        }
        if (i == R.id.action_proversions) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.javaprogramming.rbworks.dev.jpcp&hl=en")));


        }

        if (i == R.id.action_rate) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.rbworks.dev.jpf.com&hl=en")));
        } else {
            return super.onOptionsItemSelected(item);

        }
        return true;
    }
}