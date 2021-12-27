package com.appy.mohamedissa.azkaryapp222;



import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Activity;


import android.content.Intent;

import android.os.Bundle;


import android.view.View;

import android.widget.ImageView;


import android.widget.TextView;




public class homescreenapp extends AppCompatActivity {
    private static final String TAG = Activity.class.getName();
    ImageView imgMoon, imgSun, imgSpha, imgadaia;

    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeapp);
        imgMoon = findViewById(R.id.imgMoon);
        imgSun = findViewById(R.id.imgSun);
        imgSpha = findViewById(R.id.img_spha);
        imgadaia = findViewById(R.id.img_adaia);


        tv1 = findViewById(R.id.textView3);
        tv2 = findViewById(R.id.textView5);
        tv3 = findViewById(R.id.textView4);
        tv4 = findViewById(R.id.textView6);



        imgMoon.setAlpha(0f);
        imgMoon.animate().alpha(1f).setDuration(400);

        imgSun.setAlpha(0f);
        imgSun.animate().alpha(1f).setDuration(800);

        imgSpha.setAlpha(0f);
        imgSpha.animate().alpha(1f).setDuration(1200);

        imgadaia.setAlpha(0f);
        imgadaia.animate().alpha(1f).setDuration(1600);

        tv1.setAlpha(0f);
        tv1.animate().alpha(1f).setDuration(400);

        tv2.setAlpha(0f);
        tv2.animate().alpha(1f).setDuration(800);

        tv3.setAlpha(0f);
        tv3.animate().alpha(1f).setDuration(1200);

        tv4.setAlpha(0f);
        tv4.animate().alpha(1f).setDuration(1600);

        imgMoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), UI_Evening_prayers.class);
                startActivity(intent);
            }
        });
        imgSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), UI_Citation_for_morning.class);
                startActivity(intent);
            }
        });


        imgadaia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), UI_Islamic.class);
                startActivity(intent);
            }
        });

        imgSpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), UI_praise.class);
                startActivity(intent);
            }
        });

    }



}