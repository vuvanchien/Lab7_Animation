package com.chiendeptrai.vuvanchien.lab7_animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Bai1(View view) {
        startActivity(new Intent(MainActivity.this, Bai1_Animation.class));
    }



    public void Bai3(View view) {
        startActivity(new Intent(MainActivity.this, Bai3_Animation.class));
    }
}
