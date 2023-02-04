package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScrollViewDemo extends AppCompatActivity {
Button HorizontalView,VerticalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollviewdemo);
        HorizontalView=findViewById(R.id.HorizontalView);
        VerticalView=findViewById(R.id.VerticalView);

        HorizontalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig=new Intent(ScrollViewDemo.this,HorizontalScrollview.class);
                Toast.makeText(ScrollViewDemo.this, "Wow ❤", Toast.LENGTH_SHORT).show();
                startActivity(ig);
            }
        });

        VerticalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ifx=new Intent(ScrollViewDemo.this,VerticalScrollView.class);
                Toast.makeText(ScrollViewDemo.this, "Good ❤", Toast.LENGTH_SHORT).show();
                startActivity(ifx);
            }
        });
    }
}