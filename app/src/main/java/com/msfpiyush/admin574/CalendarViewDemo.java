package com.msfpiyush.admin574;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.database.CursorIndexOutOfBoundsException;
import android.icu.number.Scale;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import org.joda.time.DateTimeComparator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarViewDemo extends AppCompatActivity {
EditText newDateGet;
Button btnClick;
DatePicker DatePickerDemo1;
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

        newDateGet.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Calendar c= Calendar.getInstance();
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog=new DatePickerDialog(CalendarViewDemo.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        newDateGet.setText(d+"/"+m+1+"/"+y);
                    }
                },
                        day,month,year);
                datePickerDialog.show();
                return true;
            }
        });
//        newDateGet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Calendar c= Calendar.getInstance();
//                int year=c.get(Calendar.YEAR);
//                int month=c.get(Calendar.MONTH);
//                int day=c.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog datePickerDialog=new DatePickerDialog(CalendarViewDemo.this, new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
//                        newDateGet.setText(d+"/"+m+1+"/"+y);
//                    }
//                },
//                        year,month,day);
//                datePickerDialog.show();
//            }
//        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            DatePickerDemo1.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                    String str="You choose the : ";
                    StringBuilder sb=new StringBuilder();
                    sb.append(str)
                            .append(day+"/"+month+1+"/"+year);
                    Toast.makeText(CalendarViewDemo.this, sb.toString(), Toast.LENGTH_SHORT).show();
//                    newDateGet.setText(day+"/"+month+"/"+year);
                }
            });
        }
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ShowCurrentDate();
                Calendar c=Calendar.getInstance();
                String CurrentDate=String.valueOf(c.get(Calendar.DAY_OF_MONTH)+"/"
                        + c.get(Calendar.MONTH)+1+"/"
                        + c.get(Calendar.YEAR));

                String NewDate=String.valueOf(c.get(Calendar.DAY_OF_MONTH)-1+"/"
                        + c.get(Calendar.MONTH)+1+"/"
                        + c.get(Calendar.YEAR));
//
//                DateTimeComparator dateTimeComparator=DateTimeComparator.getDateOnlyInstance();
//
//                Date date1=new Date();
//                Date date2=new Date();
//
//                int retVal=dateTimeComparator.compare(date1,date2);
//                if(retVal==0)
//                {
//                    Toast.makeText(CalendarViewDemo.this, "equal", Toast.LENGTH_SHORT).show();
//                }
//                else if (retVal>0)
//                {
//                    Toast.makeText(CalendarViewDemo.this, "date1", Toast.LENGTH_SHORT).show();
//                }else
//                {
//                    Toast.makeText(CalendarViewDemo.this, "date2", Toast.LENGTH_SHORT).show();
//                }
                newDateGet.setText(NewDate);

                if(CurrentDate.compareTo(NewDate) > 1) {
                    Toast.makeText(CalendarViewDemo.this, "New date", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(CalendarViewDemo.this, "Old date", Toast.LENGTH_SHORT).show();
                }
//                Toast.makeText(CalendarViewDemo.this, date, Toast.LENGTH_SHORT).show();

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
