package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimePickerDemo extends AppCompatActivity {
EditText YourTime;
TimePicker TimepickerDemo1;
Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepickerdemo);

        btnClick=findViewById(R.id.btnClick);
        TimepickerDemo1=findViewById(R.id.TimepickerDemo1);
        YourTime=findViewById(R.id.YourTime);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal=Calendar.getInstance();
                SimpleDateFormat sdf=new SimpleDateFormat("HH:MM");
//                String str= sdf.format(new Date());
        String str=String.valueOf(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE));
                YourTime.setText(str);
            }
        });
    }
}