package com.example.androidtest.Controller.Auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtest.Model.HomeData;
import com.example.androidtest.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;

public class HomeActivity extends AppCompatActivity {
    HomeData homeData;
    RecyclerView rvNew;
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

//       tvNew1 = findViewById(R.id.new1);
       tvNew1.setText(newsTitle1);

        Toast.makeText(this, customerName, Toast.LENGTH_SHORT).show();



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
