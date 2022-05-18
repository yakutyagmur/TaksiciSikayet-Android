package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.security.PublicKey;

public class KullaniciDevamEtmeYontemi extends AppCompatActivity {
    Button Semtİcin;
    Button Anasayfaİcin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_devam_etme_yontemi);
        Semtİcin=(Button) findViewById(R.id.Semtİcin);
        Anasayfaİcin=(Button) findViewById(R.id.Anasayfaİcin);


       Semtİcin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gecis(Semtİcin);
            }
        });

       Anasayfaİcin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Gecis(Anasayfaİcin);
           }
       });
    }

    public void Gecis(View view){
        if (view.getId()==R.id.Semtİcin){
            Intent intent = new Intent(this,Semt.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.Anasayfaİcin){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}
