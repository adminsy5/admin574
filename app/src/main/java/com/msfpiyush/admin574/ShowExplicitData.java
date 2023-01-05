package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowExplicitData extends AppCompatActivity {
TextView getName,getCollege,getCourse;
Button HomeEx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showexplicitdata);

        getName=findViewById(R.id.getName);
        getCollege=findViewById(R.id.getCollege);
        getCourse=findViewById(R.id.getCourse);

        Bundle Data=getIntent().getExtras();
        String name =Data.getString("Name");
        String course= Data.getString("Course");
        String college =Data.getString("College");

        getName.setText(String.valueOf(name));
        getCollege.setText(String.valueOf(college));
        getCourse.setText(String.valueOf(course));

        HomeEx=findViewById(R.id.HomeEx);
        HomeEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenMainActivity=new Intent(ShowExplicitData.this,MainActivity.class);
                startActivity(OpenMainActivity);
            }
        });
    }
}