package com.example.campuspe.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import android.widget.Filter;

import com.example.campuspe.R;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    Context contextHere;
    ArrayList<CanteenData> canteenList;


    public ListAdapter(Context contextHere, ArrayList<CanteenData> canteenList) {
        this.contextHere = contextHere;
        this.canteenList = canteenList;
        //filteredNameList = new ArrayList<>(complexList);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contextHere).inflate(R.layout.item_canteen_list,parent,false);
//        Toast.makeText(contextHere, "oncreate called", Toast.LENGTH_SHORT).show();
        return new ListAdapter.ViewHolder(view);
    }


    @SuppressLint("RestrictedApi")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CanteenData data = canteenList.get(position);
//        Log.d("chatTag", "onBindViewHolder: "+user.getName());
        holder.canteen_name.setText(data.getName());
//        if(user.uri!=null){
//            Picasso.get().load(user.getUri()).into(holder.card_pic);
//        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contextHere,CanteenActivity.class);
                intent.putExtra("cName",data.getName());
//                intent.putExtra("uid",user.getUid());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contextHere.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return canteenList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        CardView tile;
        RatingBar ratingBar;
        TextView canteen_name;
        ImageView card_pic;
        user.uri!=null){
//            Picasso.get().load(user.getUri()).into(holder.card_pic);
//        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contextHere,CanteenActivity.class);
                intent.putExtra("cName",data.getName());
//                intent.putExtra("uid",user.getUid());
                intent.setFlags(Intent.FLAG_ACTIVITY
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            canteen_name = itemView.findViewById(R.id.canteenName);
        }
    }
}
