package com.appy.mohamedissa.azkaryapp222.model;

import java.util.ArrayList;

public class DataGet <T>{
    public   ArrayList<T> dataName=new ArrayList<>();
    public   ArrayList<T> dataNum=new ArrayList<>();

    public ArrayList<T> getDataName() {
        return dataName;
    }

    public void setDataName(ArrayList<T> dataName) {
        this.dataName = dataName;
    }

    public ArrayList<T> getDataNum() {
        return dataNum;
    }

    public void setDataNum(ArrayList<T> dataNum) {
        this.dataNum = dataNum;
    }








}
