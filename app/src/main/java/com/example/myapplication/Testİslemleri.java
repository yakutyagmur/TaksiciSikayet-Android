package com.example.myapplication;

import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Testİslemleri {
 private boolean sonuc;
 private FirebaseAuth mAuth;
 DatabaseReference mdatabase;

 public boolean bulucu(Taksici t){
     String taksici_adi=null;
     mdatabase.push().getDatabase().getReference();
     return sonuc;
 }

 public void testInsert(Taksici t){
     if(bulucu(t)){
         System.out.println("Ekleme islemi basarili");
     }
     else
         System.out.println("Ekleme islemi basarisiz");
 }
}
