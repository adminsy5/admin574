//This is Custom checkbox for android app with Toast Message
package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CustomCheckBox extends AppCompatActivity implements View.OnClickListener {
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customcheckbox);
        cb1 = findViewById(R.id.cb1);
        cb1.setOnClickListener(this);
        cb2 = findViewById(R.id.cb2);
        cb2.setOnClickListener(this);
        cb3 = findViewById(R.id.cb3);
        cb3.setOnClickListener(this);
        cb4 = findViewById(R.id.cb4);
        cb4.setOnClickListener(this);
        cb5 = findViewById(R.id.cb5);
        cb5.setOnClickListener(this);
        cb6 = findViewById(R.id.cb6);
        cb6.setOnClickListener(this);
        cb7 = findViewById(R.id.cb7);
        cb7.setOnClickListener(this);
        cb8 = findViewById(R.id.cb8);
        cb8.setOnClickListener(this);
        cb9 = findViewById(R.id.cb9);
        cb9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cb1:
                if (cb1.isChecked())
                    Toast.makeText(getApplicationContext(), "Android App Development", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb2:
                if (cb2.isChecked())
                    Toast.makeText(getApplicationContext(), ".Net Programming ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb3:
                if (cb3.isChecked())
                    Toast.makeText(getApplicationContext(), "Java Programming", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb4:
                if (cb4.isChecked())
                    Toast.makeText(getApplicationContext(), "Flutter app Development", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb5:
                if(cb5.isChecked())
                    Toast.makeText(getApplicationContext(),"Information System",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb6:
                if(cb6.isChecked())
                    Toast.makeText(getApplicationContext(),"Oops++",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb7:
                if(cb7.isChecked())
                    Toast.makeText(getApplicationContext(), "Internet of Things", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb8:
                if(cb8.isChecked())
                    Toast.makeText(getApplicationContext(), "Rdbms", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cb9:
                if(cb9.isChecked())
                    Toast.makeText(getApplicationContext(),"Statistics",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}