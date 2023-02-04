package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutoCompleteTextDemo extends AppCompatActivity {
String[] fname={"Rajat","Piyush","Arpit","Hitesh","Mayank","Ajay","Hiral","Kartik","Umesh","Nikhil","Himat","Pinal","Pravinbhai","Haresh","Naresh","Anjali","Divya"};
String[] lname={"Makwana","Patel","Parmar","Kevat","Mishra","Kakadiya","Parmar","Sagthiya","Pnachal"};
String[] role={"Teacher","Student","Admin"};
AutoCompleteTextView AutoFname,AutoLname,AutoRole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete_text_demo);
        AutoFname=findViewById(R.id.AutoFname);
        AutoLname=findViewById(R.id.AutoLname);
        AutoRole=findViewById(R.id.AutoRole);

        ArrayAdapter<String> AdapterFname= new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,fname);
        ArrayAdapter<String> AdapterLanme=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,lname);
        ArrayAdapter<String> AdapterRole=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,role);

        AutoFname.setThreshold(1);
        AutoLname.setThreshold(1);
        AutoRole.setThreshold(1);

        AutoFname.setAdapter(AdapterFname);
        AutoLname.setAdapter(AdapterLanme);
        AutoRole.setAdapter(AdapterRole);
    }
}