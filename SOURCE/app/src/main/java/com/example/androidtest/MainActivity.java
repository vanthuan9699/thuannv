package com.example.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // ahihi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);





        // Tạo đối tượng User.
//      Khai báo + khởi tạo
        User windsUser = new User();
//        //cách 1
//        windsUser.id = 1;
//        windsUser.phoneNumber = "13546848465";
//        windsUser.profileUrl = "http://gdkgdgk/dgr.jpg";
//        windsUser.username = "ThuậnNV";


        //cách 2
        //gán giá trị
        windsUser.setId(1);
        windsUser.setPhoneNumber("46542135554");
        windsUser.setProfileUrl("http:/shfjshjf");
        windsUser.setUsername("ThuậnNV");


//        Toast.makeText(this, windsUser.username, Toast.LENGTH_LONG).show();

//        sử dụng đối tượng mà được khai báo và khởi tạo trong XML
//        bước 1: gán id cho đối tượng trong XML
//        bước 2: tạo tên mới và gắn lại cho đối tượng đó

        EditText edtPhoneNumber = findViewById(R.id.edt_phone_number);
        edtPhoneNumber.setText("Hello phonenumber");
        edtPhoneNumber.setTextSize(25);

        TextView tvUsername = findViewById(R.id.tv_username);
        tvUsername.setText(windsUser.getUsername());

    }
}
