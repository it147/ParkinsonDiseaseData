package com.google.parkinsondiseasedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by John on 29/11/2016.
 */

public class SplashScreenActivity extends Activity{

    public LinearLayout linearLayout;
    public static int splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreenactivity_layout);

        linearLayout = (LinearLayout) findViewById(R.id.layout_splashscreen);

        if (splashImage == 0) {
            linearLayout.setBackgroundResource(R.drawable.parkinsons_converted);
        } else {
            linearLayout.setBackgroundResource(splashImage);
        }

        Thread displaySplash = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(5 * 1000);
                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    //kill the app
                    finish();
                }
            }
        };

        displaySplash.start();
    }

}

