package com.example.tugasakhirtam.RecyclerViewAll;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasakhirtam.Announcement.AnnouncementActivity;
import com.example.tugasakhirtam.R;
import com.example.tugasakhirtam.RecyclerViewAll.CardViewContactAdapter;
import com.example.tugasakhirtam.RecyclerViewAll.Contact;
import com.example.tugasakhirtam.RecyclerViewAll.ContactData;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class viewall extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Contact> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Data");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewall);
        recyclerView = (RecyclerView)findViewById( R.id.recycler_view_1111);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll( ContactData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager (this));

        CardViewContactAdapter cardViewContactAdapter= new
                CardViewContactAdapter(this);
        cardViewContactAdapter.setContactList(list);
        recyclerView.setAdapter(cardViewContactAdapter);
    }
}

