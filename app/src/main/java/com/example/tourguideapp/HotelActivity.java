package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_category);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HotelFragment()).commit();
    }
}