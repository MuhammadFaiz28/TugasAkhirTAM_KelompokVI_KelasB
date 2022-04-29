package com.example.tugasakhirtam.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasakhirtam.R;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.FeaturedViewHolder> {

    ArrayList<HelperClass> aLocation;

    public recyclerAdapter(ArrayList<HelperClass> aLocation) {
        this.aLocation = aLocation;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_content_1,parent,false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        HelperClass helperClass = aLocation.get(position);

        holder.image.setImageResource(helperClass.getImage());
        holder.title.setText(helperClass.getTitle());
        holder.desc.setText(helperClass.getDesc());
    }

    @Override
    public int getItemCount() {
        return aLocation.size();
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, desc;

        public FeaturedViewHolder(@NonNull View itemView){
            super(itemView);

            image = itemView.findViewById(R.id.img_1);
            title = itemView.findViewById(R.id.title_1);
            desc = itemView.findViewById(R.id.desc_1);
        }
    }
}
