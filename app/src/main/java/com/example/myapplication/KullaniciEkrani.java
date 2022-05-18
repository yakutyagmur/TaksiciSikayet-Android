package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

public class KullaniciEkrani extends AppCompatActivity {
    EditText emailText;
    EditText passwordText;
    Button button3;
    FirebaseDatabase database;
    DatabaseReference myRef;
    private FirebaseAuth mAuth;
    private StorageReference mStorageRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullanici_ekrani);
        mAuth = FirebaseAuth.getInstance();
        emailText = (EditText) findViewById(R.id.emailText);
        passwordText = (EditText) findViewById(R.id.passwordText);
        button3=(Button) findViewById(R.id.button3);
        FirebaseUser user = mAuth.getCurrentUser();
        /*if (user != null) {
            Intent intent = new Intent(getApplicationContext(), Semt.class);
            startActivity(intent);

        }*/

    /*public void Tiklendi(View v){
        if(v.getId()==R.id.button3){
            Intent intent = new Intent(getApplicationContext(),Semt.class);
            startActivity(intent);

        }
    }*/

    }

    public void signUp( View view) {
        mAuth.signInWithEmailAndPassword(emailText.getText().toString(), passwordText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Intent intent = new Intent(getApplicationContext(), Semt.class);
                            startActivity(intent);
                        }
                    }
                }).addOnFailureListener(this, new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(KullaniciEkrani.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
