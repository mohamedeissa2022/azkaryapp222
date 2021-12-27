package com.appy.mohamedissa.azkaryapp222;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapterFireBase extends ArrayAdapter<Object> {

    private Activity context;
    private ArrayList<Object> azkar;
    private ArrayList<Object> azkar_rolse;
    private ArrayList<Object> azkar_cunter ;
    int textSize;
    public MyListAdapterFireBase(Activity context, ArrayList<Object> azkar, ArrayList<Object> azkar_rolse, ArrayList<Object> azkar_cunter, int textSize) {
        super(context,R.layout.list_array,azkar);

        this.context = context;
        this.azkar = azkar;
        this.azkar_rolse = azkar_rolse;
        this.azkar_cunter = azkar_cunter;
        this.textSize = textSize;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View rowView = inflater.inflate(R.layout.list_array, null, false);
        TextView title =  rowView.findViewById(R.id.tv_azkar);
        TextView des =  rowView.findViewById(R.id.tv_adds);
        TextView cunter =  rowView.findViewById(R.id.azkar_cunter);
        //---------
        title.setTextSize(textSize);
        des.setTextSize(textSize);
        cunter.setTextSize(textSize);
        title.setText((Integer) azkar.get(position));
        des.setText((Integer) azkar_rolse.get(position));
        cunter.setText((Integer) azkar_cunter.get(position));


        //---------
        title.setAlpha(0f);
        title.animate().alpha(1f).setDuration(400);
        //---------

        des.setAlpha(0f);
        des.animate().alpha(1f).setDuration(800);
        //---------

        cunter.setAlpha(0f);
        cunter.animate().alpha(1f).setDuration(400);
        //---------


        return rowView;
    }

    ;
}
