package com.chiendeptrai.vuvanchien.lab7_animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class Bai2_Animation extends AppCompatActivity {
    private ImageView imgBai2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2__animation);
        imgBai2 = findViewById(R.id.imgBai2);
    }
    public void ALL(View view) {
    }

    public void Doaremon(View view) {
    }

    public void Nobita(View view) {
    }
//    private void ShowImage(String img){
//        ObjectAnimator animator = ObjectAnimator.ofFloat(imgBai2, "translationX", 0f, 500f);
//        animator.setDuration(2000);
//        ObjectAnimator animator1 = ObjectAnimator.ofFloat(imgBai2, "alpha", 1f, 0f);
//        animator1.setDuration(2000);
//        ObjectAnimator animator2 = ObjectAnimator.ofFloat(imgBai2, "translationX", -500f, 0f);
//        animator2.setDuration(2000);
//        ObjectAnimator animator3 = ObjectAnimator.ofFloat(imgBai2, "alpha", 1f, 0f);
//        animator3.setDuration(2000);
//        AnimationSet animationSet = new AnimationSet();
//        animationSet.play(animator2).witht(animator3).after(animator).after(animator1);
//        animationSet.start();
//        final String imgName = img;
//        animator1.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationCancel(Animator animation) {
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//
//                if (imgName == "Nobita"){
//                    imgBai2.setImageResource(R.drawable.nobita);
//                } if (imgName == "Doaremon"){
//                    imgBai2.setImageResource(R.drawable.doraemon);
//                }
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//            }
//
//            @Override
//            public void onAnimationStart(Animator animation) {
//            }
//        });
//
//    }
}
