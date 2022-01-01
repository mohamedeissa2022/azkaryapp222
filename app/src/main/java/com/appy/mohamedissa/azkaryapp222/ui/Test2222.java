package com.appy.mohamedissa.azkaryapp222.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.appy.mohamedissa.azkaryapp222.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.mlkit.nl.smartreply.SmartReply;
import com.google.mlkit.nl.smartreply.SmartReplyGenerator;
import com.google.mlkit.nl.smartreply.SmartReplySuggestion;
import com.google.mlkit.nl.smartreply.SmartReplySuggestionResult;
import com.google.mlkit.nl.smartreply.TextMessage;

import java.util.ArrayList;
import java.util.List;

public class Test2222 extends AppCompatActivity {
    EditText editText;
    public List<TextMessage> rep;
    String replyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2222);
        editText = findViewById(R.id.et_replay);
        findViewById(R.id.btn_reyplay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = editText.getText().toString();
                Toast.makeText(getBaseContext(), "test \t" + getText, Toast.LENGTH_SHORT).show();
                rep.add(TextMessage.createForLocalUser(
                        getText, System.currentTimeMillis()));


            }
        });




    }


}