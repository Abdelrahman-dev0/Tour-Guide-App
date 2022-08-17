package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Tour Guide - Giza");

        tabLayout = (TabLayout) findViewById(R.id.tabs_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(R.drawable.pin);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(R.drawable.museum);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(R.drawable.bed);
        Objects.requireNonNull(tabLayout.getTabAt(3)).setIcon(R.drawable.dinner);

    }

}