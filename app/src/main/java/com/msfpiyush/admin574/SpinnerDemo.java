package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerDemo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String[] City = {" ","Ahemdabad","Surat","Vadodara","Rajkot","Bhavnagar","Jamnagar","Gandhinagar","Junagadh","Gandhidham","Ananad","Navsari","Morbi"
,"Nadiad","Surendranagar","Mehsana","Bharuch","Bhuj","Porbandar","Palanpur","Valsad","Gondal","Veraval","Vapi","Patan","Kalol","Godhara","Amreli","Dhasa"
,"Dhola","Botad","Jetpur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinnerdemo);
        Spinner CityList = findViewById(R.id.CityList);
        CityList.setOnItemSelectedListener(this);

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