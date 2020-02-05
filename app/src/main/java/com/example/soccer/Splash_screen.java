package com.example.soccer;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Splash_screen extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        imageView = findViewById(R.id.img_logo);


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        animation.setDuration(500);
        imageView.setAnimation(animation);


        new Handler() {
            public void postDelayed(Runnable runnable, int i) {
            }

            @Override
            public void publish(LogRecord logRecord) {

            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        }.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash_screen.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },10000);
    }
}
