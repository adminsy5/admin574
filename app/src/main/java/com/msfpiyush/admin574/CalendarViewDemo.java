package com.msfpiyush.admin574;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CalendarViewDemo extends AppCompatActivity {
EditText newDateGet;
Button btnClick;
DatePicker DatePickerDemo1;
String newDate;
AlertDialog.Builder adb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendarviewdemo);
//        btnClick=findViewById(R.id.btnClick);
//        newDateGet=findViewById(R.id.newDateGet);
//        calendarView1=findViewById(R.id.calendarView1);
//        adb=new AlertDialog.Builder(this);
//
//        btnClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
//                String currentDate=sdf.format(new Date());      //Get Currnt date
//                String newDate="22/02/2023";
////                String newDate=str.toString();
//                        if(currentDate.compareTo(newDate) > -1)
//                        {
//                            adb.setMessage("You choose old date !")
//                                    .setTitle("Warning ⚠");
//                            AlertDialog alertDialog=adb.create();
//                            alertDialog.show();
//                        }else
//                        {
//                            Toast.makeText(CalendarViewDemo.this, "Not working", Toast.LENGTH_SHORT).show();
//                        }
//
////                Toast.makeText(CalendarViewDemo.this, "Today :"+ currentDate, Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//        calendarView1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
//                //String data=year+" "+month+" "+day;
//
//                StringBuilder data=new StringBuilder();
//                data.append("You Choose The : ");
//                data.append(day+"/"+month+1+"/"+year);
//
////                Toast.makeText(CalendarViewDemo.this, data, Toast.LENGTH_SHORT).show();
//            }
//        });
        DatePickerDemo1=findViewById(R.id.DatePickerDemo1);
        btnClick=findViewById(R.id.btnClick);
        newDateGet=findViewById(R.id.newDateGet);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            DatePickerDemo1.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                    String str="You choose the : ";
                    StringBuilder sb=new StringBuilder();
                    sb.append(str)
                            .append(day+"/"+month+1+"/"+year);
                    Toast.makeText(CalendarViewDemo.this, sb.toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowCurrentDate();
            }
        });
    }

    private String ShowCurrentDate() {
        SimpleDateFormat sdf=new SimpleDateFormat("DD/MM/YYYY");
        String sdk2= sdf.format(new Date());
        Toast.makeText(this,"Today : "+ sdk2, Toast.LENGTH_SHORT).show();
        return sdk2;
    }
}
