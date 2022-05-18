package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MailGonderme extends AppCompatActivity {
    EditText icerik;
    EditText mailAdres;
    Button button;
    String icerikText , mailAdresText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_gonderme);
        tanimla();
        mailUygulamalarınıGorveGonder();
    }
    public void tanimla(){
        icerik=(EditText) findViewById(R.id.editTextMailIcerik);
        mailAdres=(EditText) findViewById(R.id.editTextMailAdres);
        button=(Button) findViewById(R.id.mailAt);
    }
    public void bilgiAl(){
        icerikText=icerik.getText().toString();
        mailAdresText=mailAdres.getText().toString();
    }
    public  void mailUygulamalarınıGorveGonder(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bilgiAl();
                try {
                    Intent intent= new Intent(Intent.ACTION_SEND);
                    intent.setType("message/rfc822");
                    intent.putExtra(Intent.EXTRA_EMAIL,mailAdresText);
                    intent.putExtra(Intent.EXTRA_TEXT,mailAdresText);

                    startActivity(Intent.createChooser(intent,"Mail Gonderiniz"));
                }catch (Exception e){
                    System.out.print(""+e);

                }

            }
        });
    }
}
