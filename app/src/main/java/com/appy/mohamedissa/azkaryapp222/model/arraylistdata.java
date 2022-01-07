package com.appy.mohamedissa.azkaryapp222.model;

import java.util.ArrayList;

public class arraylistdata {
          ArrayList<String> azkar;
    ArrayList<String> azkar_rolse;
    ArrayList<String> azkar_number;

    public arraylistdata(ArrayList<String> azkar, ArrayList<String> azkar_rolse, ArrayList<String> azkar_number) {
        this.azkar = azkar;
        this.azkar_rolse = azkar_rolse;
        this.azkar_number = azkar_number;
    }
    public arraylistdata() {

    }

    public ArrayList<String> getAzkar() {
        return azkar;
    }

    public void setAzkar(ArrayList<String> azkar) {
        this.azkar = azkar;
    }

    public ArrayList<String> getAzkar_rolse() {
        return azkar_rolse;
    }

    public void setAzkar_rolse(ArrayList<String> azkar_rolse) {
        this.azkar_rolse = azkar_rolse;
    }

    public ArrayList<String> getAzkar_number() {
        return azkar_number;
    }

    public void setAzkar_number(ArrayList<String> azkar_number) {
        this.azkar_number = azkar_number;
    }
}
