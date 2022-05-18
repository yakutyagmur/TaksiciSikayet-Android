package com.example.myapplication.Facade;


public class Facade {
    private Method method ;

    public Facade(){
        method=new Method();
    }

    public void encrypt(String text ){
        method.sifrele();
    }


}
