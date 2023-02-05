package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;


public class SearchViewDemo extends AppCompatActivity  {
ListView lst1;
SearchView sv1;
ArrayAdapter<String> myAdapter;
ArrayList<String> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_searchview);
        lst1=findViewById(R.id.lst1);
        sv1=findViewById(R.id.sv1);

        myList=new ArrayList<String>();
        myList.add("Piyush Makwana");
        myList.add("Rajat Kevat");
        myList.add("Hiral Patel");
        myList.add("Kakdiya Arpit");
        myList.add("Ajay Vaghela");
        myList.add("Ajay Mali");
        myList.add("Piyush Sharma");
        myList.add("nikhil Mishra");
        myList.add("Pravinbhai Makwana");
        myList.add("Hiral Kevat");
        myList.add("Umesh Sharma");
        myList.add("Kakdiya Ajay");
        myList.add("Meet Vaghela");
        myList.add("Dev Mali");
        myList.add("devjibhai sosa");
        myList.add("hemant Sosa");
        myList.add("Rathod Kirti");
        myList.add("Dabhi Bharat");
        myList.add("ashwin Patel");
        myList.add("bhumi patel");
        myList.add("Kejal Vadza");
        myList.add("Khusi Parmar");

        myAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myList);
        lst1.setAdapter(myAdapter);

        sv1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String Query) {
                if(myList.contains(Query))
                {
                    myAdapter.getFilter().filter(Query);
                }else
                {
                    Toast.makeText(SearchViewDemo.this, "Not Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
               myAdapter.getFilter().filter(newText);
               return false;
            }
        });
    }
}