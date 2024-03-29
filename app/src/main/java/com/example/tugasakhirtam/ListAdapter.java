package com.example.tugasakhirtam;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.TokohViewHolder> {

    String name[];
    String detail[];
    int photo[];
    Context context;

    public ListAdapter(Context ct, String name[], int photo[], String detail[]){
        context = ct;
        this.name = name;
        this.photo = photo;
        this.detail = detail;
    }

    @NonNull
    @Override
    public TokohViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_detail, parent, false);
        return new TokohViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TokohViewHolder holder, int position) {
        String n = name[position];
        String d = detail[position];
        int p = photo[position];

        holder.n.setText(name[position]);
        holder.p.setImageResource(photo[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class TokohViewHolder extends RecyclerView.ViewHolder {

        TextView n;
        ImageView p;
        ConstraintLayout mainLayout;

        public TokohViewHolder(@NonNull View itemView) {
            super(itemView);

            n = itemView.findViewById(R.id.tv_item_name);
            p = itemView.findViewById(R.id.iv_item_photo);
            mainLayout = itemView.findViewById(R.id.view_tokoh);
        }
    }
}
