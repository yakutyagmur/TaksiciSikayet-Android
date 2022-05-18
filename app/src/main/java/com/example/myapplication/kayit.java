package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.Facade.Facade;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.lang.reflect.Method;

import io.realm.Realm;

public class kayit extends AppCompatActivity {
    EditText emailText;
    EditText passwordText;
    Button button4;
    ImageView imageView5;
    Facade facade;
    FirebaseDatabase database;
    DatabaseReference myRef;
    Realm realm;
    private  FirebaseAuth mAuth;
    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);
        mAuth = FirebaseAuth.getInstance();
        emailText = (EditText)findViewById(R.id.emailText);
        passwordText = (EditText) findViewById(R.id.passwordText);

        facade= new Facade();
        facade.encrypt("");

    }

    public void signUp( View view) {


        mAuth.createUserWithEmailAndPassword(emailText.getText().toString(),passwordText.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(kayit.this,"Kullanıcı oluşturuldu",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(),KullaniciEkrani.class);
                            startActivity(intent);
                        }
                    }
                }).addOnFailureListener(this, new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(kayit.this,e.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

