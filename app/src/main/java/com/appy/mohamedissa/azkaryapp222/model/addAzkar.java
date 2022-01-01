package com.appy.mohamedissa.azkaryapp222.model;

import java.util.ArrayList;

public class addAzkar {
    private ArrayList<String> arrayList_azkar = new ArrayList<>();
    private ArrayList<String> arrayList_azkar_cunter = new ArrayList<>();
    private ArrayList<String> arrayList_azkar_roulse = new ArrayList<>();
    private float textSize;
    public addAzkar(ArrayList<String> arrayList_azkar, ArrayList<String> arrayList_azkar_cunter, ArrayList<String> arrayList_azkar_roulse, float textSize){
        this.arrayList_azkar=arrayList_azkar;
        this.arrayList_azkar_cunter=arrayList_azkar_cunter;
        this.arrayList_azkar_roulse=arrayList_azkar_roulse;
        this.textSize =textSize;
    }
    public ArrayList<String> getArrayList_azkar() {
        return arrayList_azkar;
    }

    public void setArrayList_azkar(ArrayList<String> arrayList_azkar) {
        this.arrayList_azkar = arrayList_azkar;
    }

    public ArrayList<String> getArrayList_azkar_cunter() {
        return arrayList_azkar_cunter;
    }

    public void setArrayList_azkar_cunter(ArrayList<String> arrayList_azkar_cunter) {
        this.arrayList_azkar_cunter = arrayList_azkar_cunter;
    }

    public ArrayList<String> getArrayList_azkar_roulse() {
        return arrayList_azkar_roulse;
    }

    public void setArrayList_azkar_roulse(ArrayList<String> arrayList_azkar_roulse) {
        this.arrayList_azkar_roulse = arrayList_azkar_roulse;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }






}
