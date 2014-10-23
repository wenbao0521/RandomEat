package com.randomeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGHT = 3000; //—”≥Ÿ»˝√Î 
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable(){
 
         @Override
         public void run() {
             Intent mainIntent = new Intent(MainActivity.this,StartProjectActivity.class);
             MainActivity.this.startActivity(mainIntent);
             MainActivity.this.finish();
         }
           
        }, SPLASH_DISPLAY_LENGHT);
    }
}