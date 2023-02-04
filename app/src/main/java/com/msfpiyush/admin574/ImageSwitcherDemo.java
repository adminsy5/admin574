package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitcherDemo extends AppCompatActivity {
Button btnNext1,btnPre1;
ImageSwitcher imgSw1;
int[] imgId={R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5};
int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher_demo);
        imgSw1=findViewById(R.id.imgSw1);
        btnNext1=findViewById(R.id.btnNext1);
        btnPre1=findViewById(R.id.btnPre1);

        imgSw1.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw=new ImageView(ImageSwitcherDemo.this);
                imgVw.setImageResource(imgId[position]);
                return imgVw;
            }
        });
        imgSw1.setInAnimation(this, android.R.anim.fade_in);
        imgSw1.setOutAnimation(this,android.R.anim.fade_out);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position<imgId.length)
                    position++;
                if(position>=imgId.length)
                    position=imgId.length-1;
                imgSw1.setImageResource(imgId[position]);
            }
        });
        btnPre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position>0)
                    position--;
                else if (position<0)
                {
                    position=0;
                }
                imgSw1.setImageResource(imgId[position]);
            }
        });
    }
}