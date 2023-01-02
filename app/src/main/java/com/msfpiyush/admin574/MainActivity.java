package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CustomCheckbox = new Intent(MainActivity.this,CustomCheckBox.class);
                startActivity(CustomCheckbox);
            }
        });
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RadioButton = new Intent(MainActivity.this,CustomRadioButton.class);
                startActivity(RadioButton);
            }
        });
        b3=findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenSpinnerDemo = new Intent(MainActivity.this,SpinnerDemo.class);
                Toast.makeText(MainActivity.this, "Hurray !😁", Toast.LENGTH_SHORT).show();
                startActivity(OpenSpinnerDemo);
            }
        });
    }
}