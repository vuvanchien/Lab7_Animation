package com.chiendeptrai.vuvanchien.lab7_animation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class Bai1_Animation extends AppCompatActivity {
    private ImageView imgBai1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1__animation);
        imgBai1 = findViewById(R.id.imgBai1);
    }

    public void Rotaion(View view) {
        int dest = 360;
        if (imgBai1.getRotation() == 360){
            System.out.println(imgBai1.getAlpha());
            dest = 0;

        }
        ObjectAnimator animator = ObjectAnimator.ofFloat(imgBai1, "rotation", dest);
        animator.setDuration(2000);
        animator.start();
    }

    public void Moving(View view) {
//        Animation animation = new TranslateAnimation(Animation.ABSOLUTE, 150, Animation.ABSOLUTE, Animation.ABSOLUTE);
//        animation.setDuration(1000);
//        animation.setFillAfter(true);
//        animation.start();
        boolean clicked = false;
        if (clicked) {
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgBai1, "translationY", 0f, 500f);
            anim.setDuration(1000);
            anim.start();
        }else {
            ObjectAnimator anim = ObjectAnimator.ofFloat(imgBai1, "translationY", 500f, 0f);
            anim.setDuration(1000);
            anim.start();
        }

    }

    public void Zoom(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        imgBai1.startAnimation(animation);
    }


}
