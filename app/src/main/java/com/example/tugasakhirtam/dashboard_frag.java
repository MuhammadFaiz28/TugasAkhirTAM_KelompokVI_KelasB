package com.example.tugasakhirtam;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasakhirtam.Announcement.AnnouncementActivity;
import com.example.tugasakhirtam.Recycler.HelperClass;
import com.example.tugasakhirtam.Recycler.MostViewedAdpater;
import com.example.tugasakhirtam.Recycler.helperClass_2;
import com.example.tugasakhirtam.Recycler.recyclerAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dashboard_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class dashboard_frag extends Fragment implements  NavigationView.OnNavigationItemSelectedListener{

    RecyclerView featuredRecycler, mostViewedRecycler, categoriesRecycler;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;

    //private GradientDrawable gradient1, gradient2, gradient3, gradient4;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        featuredRecycler = (RecyclerView) getView().findViewById(R.id.recycler_1);
        mostViewedRecycler = (RecyclerView) getView().findViewById(R.id.recycler_2);
        drawerLayout = view.findViewById(R.id.drawer_layout);
        navigationView = view.findViewById(R.id.nav_view);
        menuIcon = view.findViewById(R.id.menu_icon);


        navigationDrawer();

        featuredRecycler();
        mostViewedRecycler();




    }

    private void navigationDrawer() {
        //Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                    else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    public dashboard_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment dashboard_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static dashboard_frag newInstance(String param1, String param2) {
        dashboard_frag fragment = new dashboard_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dashboard_frag, container, false);
    }

    private void SetAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter){
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
}

   /* private void categoriesRecycler() {

        //All Gradients
        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});


        ArrayList<helperClass_2> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new helperClass_2(gradient1, R.drawable.context, "Education"));
        categoriesHelperClasses.add(new helperClass_2(gradient2, R.drawable.context, "HOSPITAL"));
        categoriesHelperClasses.add(new helperClass_2(gradient3, R.drawable.context, "Restaurant"));
        categoriesHelperClasses.add(new helperClass_2(gradient4, R.drawable.context, "Shopping"));
        categoriesHelperClasses.add(new helperClass_2(gradient1, R.drawable.context, "Transport"));

        SetAdapter(categoriesRecycler, new CategoriesAdapter(categoriesHelperClasses));*/


    private void mostViewedRecycler() {

        ArrayList<helperClass_2> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new helperClass_2(R.drawable.manusiasalmon, "Manusia Salmon"));
        mostViewedLocations.add(new helperClass_2(R.drawable.a, "A"));

        SetAdapter(mostViewedRecycler, new MostViewedAdpater(mostViewedLocations));
    }

    private void featuredRecycler() {

        ArrayList<HelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new HelperClass(R.drawable.mariposa, "Mariposa", "Menceritakan sebuah kisah cinta antara dua pesaing olimpiade"));
        featuredLocations.add(new HelperClass(R.drawable.manusiasalmon, "Manusia Salmon", "Kisah Raditya Dika"));
        featuredLocations.add(new HelperClass(R.drawable.a, "A", "Sebuah buku karya Wulanfadi"));
        

        SetAdapter(featuredRecycler, new recyclerAdapter(featuredLocations));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_logout:
                Intent intent = new Intent(dashboard_frag.this.getActivity(), MainActivity.class);
                startActivity(intent);
        }
        switch (item.getItemId()) {

            case R.id.nav_announcement:
                Intent intent_1 = new Intent(dashboard_frag.this.getActivity(), AnnouncementActivity.class);
                startActivity(intent_1);
        }
        switch (item.getItemId()){

            case R.id.nav_list:
                Intent intent_2 = new Intent(dashboard_frag.this.getActivity(),ListActivity.class);
                startActivity(intent_2);

        }

        return true;
    }
}