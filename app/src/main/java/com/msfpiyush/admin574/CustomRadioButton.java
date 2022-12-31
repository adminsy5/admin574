package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.Toast;

public class CustomRadioButton extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdb1,rdb2,rdb3,rdb4;
    Button homerdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customradiobutton);
        rdb1=findViewById(R.id.rdb1);
        rdb1.setOnClickListener(this);
        rdb2=findViewById(R.id.rdb2);
        rdb2.setOnClickListener(this);
        rdb3=findViewById(R.id.rdb3);
        rdb3.setOnClickListener(this);
        rdb4=findViewById(R.id.rdb4);
        rdb4.setOnClickListener(this);
        homerdb=findViewById(R.id.homerdb);
        homerdb.setOnClickListener(view ->
        {
            Intent rdbback = new Intent(CustomRadioButton.this,MainActivity.class);
            startActivity(rdbback);
        });
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.rdb1:
                if(rdb1.isChecked())
                    Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            case R.id.rdb2:
                if(rdb2.isChecked())
                    Toast.makeText(this,"Female",Toast.LENGTH_SHORT).show();
            case R.id.rdb3:
                if(rdb3.isChecked())
                    Toast.makeText(this,"Shemale",Toast.LENGTH_SHORT).show();
            case R.id.rdb4:
                if(rdb4.isChecked())
                    Toast.makeText(this,"None of these",Toast.LENGTH_SHORT).show();
        }
    }
}