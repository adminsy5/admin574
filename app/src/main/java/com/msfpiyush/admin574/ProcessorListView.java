package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class ProcessorListView extends AppCompatActivity {
    ListView SimpleListView;
    String OsBuild[]={"Apple","Microsoft","Android","Ubuntu","Fedora","Kali","ParrotSec","Debian","BlackBarry","Chromium"};
    int OsIcon[]={R.drawable.apple,R.drawable.microsoft,R.drawable.android,R.drawable.ubuntu,R.drawable.fedora,R.drawable.kali_linux,R.drawable.parrot_sec,R.drawable.debian,R.drawable.blackberry,R.drawable.chrome_os};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplelistviewdemo);

        SimpleListView=findViewById(R.id.SimpleListView);
        ProcessorListViewAdapter CustomAdapter=new ProcessorListViewAdapter(getApplicationContext(),OsBuild,OsIcon);
        SimpleListView.setAdapter(CustomAdapter);

    }
}