package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Taksici extends AppCompatActivity{
   // FirebaseDatabase db;
    private DatabaseReference mDatabase;
    //Taksici taksiciadi;
    ImageButton taksici1;
    ImageButton taksici2;
    ImageButton taksici3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taksici);
        tanimla();
        taksici1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taksici1();
            }
        });
        taksici2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taksici2();
            }
        });
        taksici3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taksici3();
            }
        });

    }
    public void tanimla(){

        //db=FirebaseDatabase.getInstance();
        mDatabase=FirebaseDatabase.getInstance().getReference();
        taksici1=(ImageButton) findViewById(R.id.taksici1);
        taksici2=(ImageButton) findViewById(R.id.taksici2);
        taksici3=(ImageButton) findViewById(R.id.taksici3);

    }

   /* private void taksiciEkle(String taksiciadiId , String taksiciadi){
      TaksiBilgileri taksici = new TaksiBilgileri(taksiciadi);
      mDatabase.child("Taksiciler").child(taksiciadiId).setValue(taksici);
    }*/



    public void taksici1(){
        Intent intent = new Intent(this,Sikayet.class);
        startActivity(intent);

    }
    public void taksici2(){
        Intent intent = new Intent(this,Sikayet.class);
        startActivity(intent);

    }
    public void taksici3(){
        Intent intent = new Intent(this,Sikayet.class);
        startActivity(intent);

    }
}
