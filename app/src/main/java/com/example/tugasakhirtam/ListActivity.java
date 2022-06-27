package com.example.tugasakhirtam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=(ListView)findViewById(R.id.idList);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Matahari");
        arrayList.add("Kambing Jantan");
        arrayList.add("Fresh Graduate");
        arrayList.add("Dilan");
        arrayList.add("Perahu Kertas");
        arrayList.add("Menanti Restu Langit");
        arrayList.add("Hujan");
        arrayList.add("Cinta Brontosaurus");
        arrayList.add("Bulan");
        arrayList.add("A");
        arrayList.add("Ketika Cinta Bertasbih");
        arrayList.add("Hafalan Sholat Delisa");
        arrayList.add("Pulang");
        arrayList.add("Pergi");
        arrayList.add("Pulang-Pergi");
        arrayList.add("Janji");
        arrayList.add("Bumi");
        arrayList.add("Sekuntum Mawar");
        arrayList.add("Experience");
        arrayList.add("Susah Sinyal");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }

}