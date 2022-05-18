package com.example.myapplication;

public class Singleton {
    private static Singleton instance;
    private String durakListesi;

    private Singleton(){

    }
    public void setData(String durakListesi){

        this.durakListesi=durakListesi;
    }
    public String getData(){

        return this.durakListesi;
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
