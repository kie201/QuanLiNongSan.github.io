package com.example.qunlcahnghoaqu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About_Infor extends AppCompatActivity {
    TextView txvAbout;
    Button buttonAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__infor);
        txvAbout = findViewById(R.id.textview_About);
        buttonAbout = findViewById(R.id.buttonAbout);
        txvAbout.setText("Chào mừng bạn đến với Kie Fruits." +
                "Đây là app quản lý nông sản của nông trại Kie Fruits" +
                "App có các tính năng như thêm, xóa, sửa các loại nông sản," +
                "đăng ký tài khoản người dùng, xem danh sách các nông sản đã thêm," +
                "Chỉnh sửa thông tin người dùng." +
                "Cuối cùng là người dùng có thể tính tổng nhân viên của trang trại," +
                "tính tổng số lượng trái cây và rau củ," +
                "tính tổng tiền của từng loại." +
                "Chúc Bạn có những phút giây trải nghiệm thật thú vị.");
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}