package com.appy.mohamedissa.azkaryapp222.model.setData;

import java.util.ArrayList;

public class add_Azkar_Model {

    private ArrayList<String> azkar = new ArrayList<>();
    private ArrayList<String> azkar_rolse = new ArrayList<>();
    private ArrayList<String> azkar_number = new ArrayList<>();
    private int text_Size;
    public add_Azkar_Model(){}
   public add_Azkar_Model(ArrayList<String>azkar,ArrayList<String>azkar_rolse,ArrayList<String>azkar_number,int text_Size){
        this.azkar=azkar;
        this.azkar_rolse=azkar_rolse;
        this.azkar_number=azkar_number;
        this.text_Size=text_Size;
    }



    public void setAzkar(ArrayList<String> azkar) {
        this.azkar = azkar;
    }

    public void setAzkar_rolse(ArrayList<String> azkar_rolse) {
        this.azkar_rolse = azkar_rolse;
    }

    public void setAzkar_number(ArrayList<String> azkar_number) {
        this.azkar_number = azkar_number;
    }

    public void setText_Size(int text_Size) {
        this.text_Size = text_Size;
    }

    public ArrayList<String> getAzkar() {
        return azkar;
    }

    public ArrayList<String> getAzkar_rolse() {
        return azkar_rolse;
    }

    public ArrayList<String> getAzkar_number() {
        return azkar_number;
    }

    public int getText_Size() {
        return text_Size;
    }
}
