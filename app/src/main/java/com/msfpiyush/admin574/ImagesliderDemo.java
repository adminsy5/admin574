package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class ImagesliderDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_imageslider);
        ViewPager ViewPage=findViewById(R.id.ViewPage);

        CustImageAdapter ad= new CustImageAdapter(this);
        ViewPage.setAdapter(ad);
    }
}