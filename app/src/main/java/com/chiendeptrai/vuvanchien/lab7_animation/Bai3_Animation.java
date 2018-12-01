package com.chiendeptrai.vuvanchien.lab7_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Bai3_Animation extends AppCompatActivity {
    private ImageView imgbacgroud;
    private ImageView imgSeconds;
    private ImageView imgMinute;
    private ImageView imghour;
    private Button btnRun;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3__animation);
        imgbacgroud = findViewById(R.id.imgbacgroud);
        imgSeconds = findViewById(R.id.imgSeconds);
        imgMinute = findViewById(R.id.imgMinute);
        imghour = findViewById(R.id.imghour);
        btnRun = findViewById(R.id.btnRun);



    }

    public void Run(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_seconds);
        imgSeconds.startAnimation(animation);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.rotate_minute);
        imgMinute.startAnimation(animation1);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.rotate_hour);
        imghour.startAnimation(animation2);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.blink);
        imgbacgroud.startAnimation(animation3);
    }
}
