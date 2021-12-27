package com.appy.mohamedissa.azkaryapp222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class UI_praise extends AppCompatActivity {
TextView tv_result;
Button btn;
int cunter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_praise);





        tv_result =findViewById(R.id.UI_tv_cunter);

        btn=findViewById(R.id.btn_click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cunter+=1;
                tv_result.setText(String.valueOf(cunter));
            }
        });
        tv_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cunter=0;
                tv_result.setText(String.valueOf(cunter));
            }
        });


    }
}