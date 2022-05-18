package com.example.myapplication;

public abstract class Sikayetlerimiz {
    abstract void TaksiDurakSikayet();
    abstract void TaksiciSikayet();

    //template method
    public final void SikayetEt(){
        TaksiDurakSikayet();
        TaksiciSikayet();
    }
}
