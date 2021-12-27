package com.appy.mohamedissa.azkaryapp222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UI_Islamic extends AppCompatActivity {
Button btn;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_islamic);
        tv =findViewById(R.id.imageView9);
        tv.setAlpha(0f);
        tv.animate().alpha(1f).setDuration(70);
    btn =findViewById(R.id.btn_exit);


        btn.setAlpha(0f);
        btn.animate().alpha(1f).setDuration(50);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });


    }
}