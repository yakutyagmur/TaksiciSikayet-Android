package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;

        import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    Button button,button2;
    ImageView imageView;
    DatabaseReference ref;
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database=FirebaseDatabase.getInstance();
        RealmTanimla();
        tanimla();

    }
    public void RealmTanimla(){
        realm=Realm.getDefaultInstance();
    }
    public void tanimla(){
        database=FirebaseDatabase.getInstance();
        button=(Button) findViewById(R.id.button);
        button=(Button) findViewById(R.id.button2);
        imageView=(ImageView)findViewById(R.id.imageView);
    }
    public void action(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ref= database.getReference();
            }
        });
    }

    public void Tiklendi(View v){
        if(v.getId()==R.id.button2){
            Intent intent = new Intent(getApplicationContext(),KullaniciEkrani.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.button){
            Intent intent = new Intent(getApplicationContext(),kayit.class);
            startActivity(intent);
        }
    }
}