package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImplicitIntent extends AppCompatActivity {
Button HomeIb,UrlButton;
EditText AddText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicitintent);
        HomeIb=findViewById(R.id.Homeib);
        HomeIb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GotoMainAct=new Intent(ImplicitIntent.this,MainActivity.class);
                startActivity(GotoMainAct);
            }
        });
        UrlButton=findViewById(R.id.UrlButton);
        AddText=findViewById(R.id.AddText);
        UrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String url="https://google.com";
                String url=AddText.getText().toString();
                if(!url.startsWith("https://")&&!url.startsWith("http://"))
                {
                    url="https://"+url;
                }
                Intent GoToUrl=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(Intent.createChooser(GoToUrl,"Browse with"));
            }
        });
    }
}