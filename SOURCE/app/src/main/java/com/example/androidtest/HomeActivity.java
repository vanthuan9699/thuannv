package com.example.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtest.Model.HomeData;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class HomeActivity extends AppCompatActivity {
    HomeData homeData;
    TextView tvNew1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
       tvNew1 = findViewById(R.id.new1);
       tvNew1.setText(newsTitle1);

        Toast.makeText(this, customerName, Toast.LENGTH_SHORT).show();
//        try {
//            JSONObject jsonHomeData = new JSONObject(homeData);
//            int status = jsonHomeData.getInt("status");
//            int code = jsonHomeData.getInt("code");
//            String msg = jsonHomeData.getString("message");
//            JSONObject jsonResult = jsonHomeData.getJSONObject("result");
//            JSONObject jsonCustomerDetail = jsonResult.getJSONObject("customerDetail");
//            String customerName = jsonCustomerDetail.getString("customerName");
//            JSONArray jsonArrayNews = jsonResult.getJSONArray("listNews");
//
//            JSONObject jsonNew1 = jsonArrayNews.getJSONObject(0);
//            JSONObject jsonNew2 = jsonArrayNews.getJSONObject(1);
//            JSONObject jsonNew3 = jsonArrayNews.getJSONObject(2);
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }


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
}
