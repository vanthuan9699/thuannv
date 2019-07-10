package com.example.androidtest.Controller.Main.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest.Model.ListNews;
import com.example.androidtest.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{

    public List<ListNews> data;
    Context context;
    public void setContext(Context context){
        this.context = context;
    }
    public void setData(List<ListNews> data){
        this.data = data;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NewsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgBg;
        TextView tvTitle;
        Button btnDetail;
        public NewsViewHolder(View itemView){
            super(itemView);
            imgBg = itemView.findViewById(R.id.img_bg);
            tvTitle = itemView.findViewById(R.id.tv_title);
            btnDetail = itemView.findViewById(R.id.btn_detail);

        }
    }

}
