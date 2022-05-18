package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sikayet extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private FirebaseAuth mAut;
    Button talep;
    EditText editText;
    EditText editText2;
    Sikayetlerimiz sikayetlerimiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikayet);

        talep=(Button) findViewById(R.id.talep);
        mDatabase= FirebaseDatabase.getInstance().getReference();
        mAut=FirebaseAuth.getInstance();

        sikayetlerimiz.SikayetEt();


        talep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                talep();
            }
        });

    }


   public void talep() {
       Toast.makeText(Sikayet.this,"Şikayetiniz Alınmıştır.",Toast.LENGTH_LONG).show();
       Intent intent = new Intent(this,KullaniciDevamEtmeYontemi.class);
       startActivity(intent);
    }

}
