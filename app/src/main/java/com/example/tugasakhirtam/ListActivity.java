package com.example.tugasakhirtam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ListActivity extends AppCompatActivity {
    String name[], detail[];
    int photo[];
    RecyclerView rvtokoh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvtokoh = findViewById(R.id.rv_tokoh);

        Bundle b = getIntent().getExtras();
        photo = b.getIntArray("tokohPhoto");
        name = getIntent().getStringArrayExtra("tokoh");
        detail = getIntent().getStringArrayExtra("tokohDetail");

        ListAdapter listAdapter = new ListAdapter(this, name, photo, detail);
        rvtokoh.setAdapter(listAdapter);
        rvtokoh.setLayoutManager(new LinearLayoutManager(this));
    }
}