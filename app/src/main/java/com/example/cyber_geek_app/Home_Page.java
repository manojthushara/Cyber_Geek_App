package com.example.cyber_geek_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Home_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        LinearLayout  service01 = findViewById(R.id.securitybtn);
        LinearLayout  service02 = findViewById(R.id.vulnerablitiybtn);
        LinearLayout  service03 = findViewById(R.id.mobilebtn);
        LinearLayout  service04 = findViewById(R.id.lockbtn);
        LinearLayout  service05 = findViewById(R.id.networkbtn);
        LinearLayout  service06 = findViewById(R.id.cyberbtn);
        LinearLayout  service07 = findViewById(R.id.threatbtn);

        service07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service07_Page.class));
            }
        });

        service06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service06_Page.class));
            }
        });

        service05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service05_Page.class));
            }
        });

        service04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service04_Page.class));
            }
        });

        service03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service03_Page.class));
            }
        });

        service02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service02_Page.class));
            }
        });

        service01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home_Page.this, Service01_Page.class));
            }
        });
    }
}