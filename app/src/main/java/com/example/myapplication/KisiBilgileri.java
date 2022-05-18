package com.example.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class KisiBilgileri extends RealmObject {
    private String email;
    private String sifre;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "KisiBilgileri{" +
                "email='" + email + '\'' +
                ", sifre='" + sifre + '\'' +
                '}';
    }
}
