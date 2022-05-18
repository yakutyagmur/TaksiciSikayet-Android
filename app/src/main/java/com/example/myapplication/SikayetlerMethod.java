package com.example.myapplication;

public class SikayetlerMethod extends Sikayetlerimiz {
    @Override
    void TaksiDurakSikayet() {
        System.out.println("Duraktan gelen taksi şikayetiniz alınmıştır.");
    }

    @Override
    void TaksiciSikayet() {
        System.out.println("Taksici şikayetiniz alınmıştır.");
    }
}
