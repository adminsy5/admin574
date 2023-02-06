package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FrameLayoutDemo extends AppCompatActivity {
TextView text1;
ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_framelayout);
        text1=findViewById(R.id.text1);
        image1=findViewById(R.id.image1);
        ImageView img1=new ImageView(this);
        img1.setImageResource(R.drawable.piyush_frag);
        img1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        img1.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT));

        TextView name = new TextView(this);
        name.setText("@Mpiyush3510");
        name.setTextColor(Color.parseColor("#000000"));
        name.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM);
        name.setTextSize(34);
        name.setTypeface(null, Typeface.BOLD);
        name.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        FrameLayout.LayoutParams marginSetting = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT);
        marginSetting.setMargins(0,0,0,200);
        name.setLayoutParams(marginSetting);

        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT));

        frameLayout.addView(img1);
        frameLayout.addView(name);
        setContentView(frameLayout);
    }
}