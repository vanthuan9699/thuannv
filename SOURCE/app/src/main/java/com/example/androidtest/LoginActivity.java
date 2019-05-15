package com.example.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        init();
    }

    void init() {
        edtPhoneNumber = findViewById(R.id.edt_phone_number);
        RelativeLayout rlLogin = findViewById(R.id.rl_login_button);
        ImageView imgFB = findViewById(R.id.img_fb_login);
        ImageView imgGG = findViewById(R.id.img_gg_login);

        rlLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(LoginActivity.this, edtPhoneNumber.getText().toString(), Toast.LENGTH_SHORT).show();

               if (checkvalid()){
                   // chuyen man hinh
                   //tao doi tuong intent
                   Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                   startActivity(intent);
               }else {
                   //thong bao loi
                   Toast.makeText(LoginActivity.this, "Vui long kiem tra so dien thoai va thu lai", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }

    boolean checkvalid() {
        int phoneLeng = edtPhoneNumber.getText().toString().length();
        return (phoneLeng > 9);
//        if (phoneLeng > 9)
//            return true;
//        return false;

    }
}
