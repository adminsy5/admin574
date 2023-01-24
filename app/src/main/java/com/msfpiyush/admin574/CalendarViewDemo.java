package com.msfpiyush.admin574;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarViewDemo extends AppCompatActivity {
CalendarView calendarView1;
Button btnClick;
AlertDialog.Builder adb ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendarviewdemo);
        btnClick=findViewById(R.id.btnClick);
        calendarView1=findViewById(R.id.calendarView1);
        adb=new AlertDialog.Builder(this);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
                String currentDate=sdf.format(new Date());      //Get Currnt date
                String newDate="26/07/2023";
                        if(currentDate.compareTo(newDate) > -1)
                        {
                            adb.setMessage("You choose old date !")
                                    .setTitle("Warning ⚠");
                            AlertDialog alertDialog=adb.create();
                            alertDialog.show();
                        }else
                        {
                            Toast.makeText(CalendarViewDemo.this, "Not working", Toast.LENGTH_SHORT).show();
                        }

//                Toast.makeText(CalendarViewDemo.this, "Today :"+ currentDate, Toast.LENGTH_SHORT).show();
            }
        });


        calendarView1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                //String data=year+" "+month+" "+day;

                StringBuilder data=new StringBuilder();
                data.append("You Choose The : ");
                data.append(day+"/"+month+1+"/"+year);

//                Toast.makeText(CalendarViewDemo.this, data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
