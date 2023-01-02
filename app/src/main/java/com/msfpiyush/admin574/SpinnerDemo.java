package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

public class SpinnerDemo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String[] City = {" ","Ahemdabad","Surat","Vadodara","Rajkot","Bhavnagar","Jamnagar","Gandhinagar","Junagadh","Gandhidham","Ananad","Navsari","Morbi"
,"Nadiad","Surendranagar","Mehsana","Bharuch","Bhuj","Porbandar","Palanpur","Valsad","Gondal","Veraval","Vapi","Patan","Kalol","Godhara","Amreli","Dhasa"
,"Dhola","Botad","Jetpur"};
Button homesb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerdemo);
        Spinner CityList = findViewById(R.id.CityList);
        CityList.setOnItemSelectedListener(this);

        homesb=findViewById(R.id.homesb);
        homesb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainMenu=new Intent(SpinnerDemo.this,MainActivity.class);
                Toast.makeText(SpinnerDemo.this, "👌", Toast.LENGTH_SHORT).show();
                startActivity(MainMenu);
            }
        });

        ArrayAdapter Connector = new ArrayAdapter(this, android.R.layout.simple_spinner_item, City);
        Connector.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CityList.setAdapter(Connector);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int PositionOfCity, long l) {
        Toast.makeText(this,City[PositionOfCity],Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}