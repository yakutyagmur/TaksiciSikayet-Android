package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;

import java.util.ArrayList;

public class Semt extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    private boolean semtSecimi = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semt);

        final ListView listView = (ListView) findViewById(R.id.listView1);

        final Singleton singleton = Singleton.getInstance();
        String string = singleton.getData();

        final ArrayList<String> SemtName = new ArrayList<String>();
        SemtName.add("Battalgazi");
        SemtName.add("Yeşilyurt");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, SemtName);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            ArrayList<String> durakListesi = new ArrayList<String>();


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(durakListesi.isEmpty()){

                    String string= SemtName.get(position);
                    Singleton globals = Singleton.getInstance();
                    singleton.setData(string);

                    if (SemtName.get(position).toString().equals("Battalgazi")) {
                        durakListesi.add("Akasya Durak");
                        durakListesi.add("Sümbül Durak");
                        durakListesi.add("Maviş Durak");
                        arrayAdapter.clear();
                        arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, durakListesi);
                        listView.setAdapter(arrayAdapter);
                    } else if (SemtName.get(position).toString().equals("Yeşilyurt")) {
                        durakListesi.clear();
                        durakListesi.add("Gül Durak");
                        durakListesi.add("Turkuaz Durak");
                        durakListesi.add("Temiz Durak");
                        arrayAdapter.clear();
                        arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, durakListesi);
                        listView.setAdapter(arrayAdapter);
                    }
                }

                else{
                    Intent intent = new Intent(getApplicationContext(),Taksici.class);
                    startActivity(intent);
                }
            }
        });
    }


}
