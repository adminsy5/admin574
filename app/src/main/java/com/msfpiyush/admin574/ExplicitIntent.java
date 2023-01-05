package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;

public class ExplicitIntent extends AppCompatActivity {
Button finish;
EditText EditName,EditCourse,EditCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicitintent);

        finish=findViewById(R.id.finish);
        EditName=findViewById(R.id.EditName);
        EditCollege=findViewById(R.id.EditCollege);
        EditCourse=findViewById(R.id.EditCourse);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String putName=EditName.getText().toString();
                String putCourse=EditCourse.getText().toString();
                String putCollege=EditCollege.getText().toString();

                Intent ig=new Intent(ExplicitIntent.this,ShowExplicitData.class);
                ig.putExtra("Name",putName);
                ig.putExtra("College",putCollege);
                ig.putExtra("Course",putCourse);
                startActivity(ig);
            }
        });
    }
}