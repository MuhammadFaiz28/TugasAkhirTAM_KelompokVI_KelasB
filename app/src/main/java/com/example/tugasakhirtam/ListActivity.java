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

        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");
        arrayList.add("test");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }

}