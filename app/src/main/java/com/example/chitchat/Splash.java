package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (Build.VERSION.SDK_INT > 21) {
            Window window = getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }
        new Handler().postDelayed
                (new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);

                        finish();
                    }
                }, 2000);
}}
