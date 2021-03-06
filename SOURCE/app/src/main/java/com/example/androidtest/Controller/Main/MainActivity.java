package com.example.androidtest.Controller.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidtest.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity extends AppCompatActivity {
    TextView tvPhoneNumber, tvName, tvEdit;
    CircleImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getData();
    }
    void getData(){
        User user = (User) getIntent().getSerializableExtra("user");
        tvPhoneNumber.setText(user.getPhoneNumber());
        tvName.setText(user.getUsername());
        Picasso.get().load(user.getProfileUrl()).into(imgAvatar);





//        String phoneNumber = getIntent().getStringExtra("phone_number");
//        tvPhoneNumber.setText(phoneNumber);
//        Toast.makeText(this,phoneNumber, Toast.LENGTH_SHORT).show();
    }
    void init(){
        tvPhoneNumber = findViewById(R.id.tv_phone_number);
        tvName = findViewById(R.id.tv_name);
        tvEdit = findViewById(R.id.tv_edit);
        imgAvatar = findViewById(R.id.img_avatar);



    }

}
