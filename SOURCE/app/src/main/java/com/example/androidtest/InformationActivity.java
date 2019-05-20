package com.example.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_layout);
        init();
    }
    void init(){
        Button btSuaThongTin = findViewById(R.id.bt_SuaThongTin);
        RelativeLayout rlGD = findViewById(R.id.rl_gd_buttom);
        RelativeLayout rlHD = findViewById(R.id.rl_hd_buttom);
        RelativeLayout rlHDSD = findViewById(R.id.rl_hdsd_buttom);
        RelativeLayout rlExit = findViewById(R.id.rl_exit_buttom);

        btSuaThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });rlGD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });rlHD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        rlHDSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });rlExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
