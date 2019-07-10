package com.example.androidtest.Controller.Main;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtest.Controller.Main.Adapter.NewsAdapter;
import com.example.androidtest.Model.HomeData;
import com.example.androidtest.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

public class HomeActivity extends AppCompatActivity {
    HomeData homeData;
    RecyclerView rvNews;
    TextView tvNew1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        String strHomData = loadJSONFromAsset();
        Gson gson = new Gson();
        homeData = gson.fromJson(strHomData, HomeData.class);
        String customerName = homeData.getResult().getCustomerDetail().getCustomerName();
        String newsTitle1 = homeData.getResult().getListNews().get(0).getTitle();
        String urlnew1 = homeData.getResult().getListNews().get(0).getUrlImage();

        String newsTitle2 = homeData.getResult().getListNews().get(1).getTitle();
        String urlnew2 = homeData.getResult().getListNews().get(1).getUrlImage();

        String newsTitle3 = homeData.getResult().getListNews().get(2).getTitle();
        String urlnew3 = homeData.getResult().getListNews().get(2).getUrlImage();


        String ctthTitle1 = homeData.getResult().getListPromotion().get(0).getTitle();
        String imgnew1 = homeData.getResult().getListNews().get(0).getUrlImage();

        String ctthTitle2 = homeData.getResult().getListPromotion().get(1).getTitle();
        String imgnew2 = homeData.getResult().getListNews().get(1).getUrlImage();

//       tvNew1 = findViewById(R.id.new1);
        tvNew1.setText(newsTitle1);

        Toast.makeText(this, customerName, Toast.LENGTH_SHORT).show();

        configRvNews();

    }

    public String loadJSONFromAsset() {
        String str = null;
        try {
            InputStream is = getAssets().open("home.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return str;


    }

    void init() {
        rvNews = findViewById(R.id.rv_news);
    }

    void configRvNews() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        rvNews.setLayoutManager(linearLayoutManager);
        NewsAdapter adapter = new NewsAdapter();
        adapter.setData(homeData.getResult().getListNews());
//        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
//
//            @NonNull
//            @Override
//            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//                View view = LayoutInflater.from(HomeActivity.this).inflate(R.layout.new_item_layout, viewGroup, false);
//
//                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(view) {
//                    @Override
//                    public String toString() {
//                        return super.toString();
//                    }
//                };
//
//
//                return null;
//            }
//
//            @Override
//            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
//
//            }
//
//            @Override
//            public int getItemCount() {
//                return 0;
//            }
//        };
//        rvNews.setAdapter(adapter);
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
