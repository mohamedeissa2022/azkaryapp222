package com.appy.mohamedissa.azkaryapp222;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class adapterTest extends BaseAdapter {
    ArrayList<String>arrayList_azkar =new ArrayList<>();
    ArrayList<String>arrayList_cunter=new ArrayList<>();
    ArrayList<String>arrayList_rolse =new ArrayList<>();
    Context context;
    adapterTest(Context context,ArrayList<String>arrayList_azkar,ArrayList<String>arrayList_cunter,ArrayList<String>arrayList_rolse){
        this.context=context;
        this.arrayList_azkar=arrayList_azkar;
        this.arrayList_cunter=arrayList_cunter;
        this.arrayList_rolse=arrayList_rolse;
    }
    @Override
    public int getCount() {
        return arrayList_azkar.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList_azkar.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        return null;
    }
}
