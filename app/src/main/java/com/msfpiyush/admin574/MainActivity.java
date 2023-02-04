package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
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
        b4=findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenImplicitIntent = new Intent(MainActivity.this,ImplicitIntent.class);
                startActivity(OpenImplicitIntent);
            }
        });

        b5=findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenExplicitIntent = new Intent(MainActivity.this,ExplicitIntent.class);
                startActivity(OpenExplicitIntent);
            }
        });

        b6=findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CustomListView=new Intent(MainActivity.this,SimpleListViewDemo.class);
                startActivity(CustomListView);
            }
        });
        b7=findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProcessorListViewTest=new Intent(MainActivity.this,ProcessorListView.class);
                startActivity(ProcessorListViewTest);
            }
        });

        b8=findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CalendarViewTest=new Intent(MainActivity.this,CalendarViewDemo.class);
                startActivity(CalendarViewTest);
            }
        });

        b9=findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TimepickerTest=new Intent(MainActivity.this,TimePickerDemo.class);
                startActivity(TimepickerTest);
            }
        });

        b10=findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Progressbartest=new Intent(MainActivity.this,PrpgressBarDemo.class);
                startActivity(Progressbartest);
            }
        });

        b11=findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ScrollViewtest=new Intent(MainActivity.this,ScrollViewDemo.class);
                startActivity(ScrollViewtest);
            }
        });

        b12=findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AutoTexttest=new Intent(MainActivity.this, AutoCompleteTextDemo.class);
                startActivity(AutoTexttest);
            }
        });

        b13=findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent WatcherTest=new Intent(MainActivity.this, EditTextWithWatcher.class);
                startActivity(WatcherTest);
            }
        });
    }
}