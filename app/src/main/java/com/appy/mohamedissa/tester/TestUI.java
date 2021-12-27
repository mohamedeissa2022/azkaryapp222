package com.appy.mohamedissa.tester;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.appy.mohamedissa.azkaryapp222.MyListAdapter;
import com.appy.mohamedissa.azkaryapp222.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.ArrayList;

public class TestUI extends AppCompatActivity {
ListView ls ;
private final static String TAG =TestUI.ACTIVITY_SERVICE;
ArrayList<Object> data = new ArrayList<>();
FirebaseFirestore db= FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ui);
        ls =findViewById(R.id.listV_test_FireBase);



        findViewById(R.id.btn_GetDataFor_FireBase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                DocumentReference docRef = db.document("/اذكار/اذكار المساء");

                docRef.addSnapshotListener(new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        if (value.exists()){
                            data= (ArrayList<Object>) value.get("Azkar");

                            setData(data);
                            ArrayAdapter adapter = new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1,data);
                            ls.setAdapter(adapter);
                            Log.d(TAG, "onSuccess: " + value.getData());
                            Log.d("arrayTest", "onSuccess: \n" + data);




                        }
                    }
                });




            }
        });


    }
    public void setData(ArrayList<Object> data) {
        this.data = data;
    }
}