package com.example.myapplication.Facade;

import com.example.myapplication.KayitSifreleme;

public class Method implements KayitSifreleme {

    public void AESEncryptorMethod(String text){ System.out.println("<AES>" + text + "</AES>"); }
    public void MDSEncryptorMethod(String text , String key){ System.out.println("MDS" + text + key + "</MDS"); }
    public void SHAEncryptorMethod(String text , String key , boolean type){
        if(type){
            System.out.println("<SHA>" + text + key + "</SHA>");
        }
        else
            System.out.println("<SHA>" + key + text + "</SHA>");
    }

    @Override
    public void sifrele() {
        AESEncryptorMethod("");
        MDSEncryptorMethod("","");
        SHAEncryptorMethod("","",true);

    }
}
