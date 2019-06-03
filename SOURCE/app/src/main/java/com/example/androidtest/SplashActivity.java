package com.example.androidtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                screenRouter();
            }
        }, 2000);
    }

    void screenRouter() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

//        String phoneNumber = AppConfig.getPhoneNumber(this);
//        if (phoneNumber == null) {
//            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
//            startActivity(intent);
//        } else {
//            Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
//            User user;
//            user = new User();
//            user.setUsername("Nguyễn Văn Thuận");
//            user.setPhoneNumber("0962805021");
//            user.setProfileUrl("http://image.sggp.org.vn/w560/Uploaded/2019/kvovhun/2018_01_26/carolinewozniacki02_ckrr.jpg");
//            user.setId(1);
//            intent.putExtra("user", user);
//            startActivity(intent);
//            finish();
//        }
    }
}
