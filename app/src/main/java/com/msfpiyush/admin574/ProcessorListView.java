package com.msfpiyush.admin574;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Switch;


public class ProcessorListView extends AppCompatActivity {
    ListView ProcessorListViewDemo;
    String ArrayProcessorName[]={"Amd 3200G","Intel i5 10400F","Intel i3 10100F","Intel i3 10105F","Intel i3 12100F","Amd Ryzen 3600","Amd Ryzen 5600G"};
    String ArrayProcessorPrice[]={"$22,999","$26,100","$12,699","$102,000","$19,900","$31,000","$220,000"};
    int ArrayProcessorImg[]={R.drawable.amd3200g,R.drawable.corei510400f,R.drawable.i310100f,R.drawable.i310105fintel,R.drawable.i312100f,R.drawable.ryzen3600,R.drawable.ryzen5600g};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processorlistview);

        ProcessorListViewDemo=findViewById(R.id.ProcessorListViewDemo);
        ProcessorListViewAdapter CustomAdapter=new ProcessorListViewAdapter(getApplicationContext(),ArrayProcessorName,ArrayProcessorPrice,ArrayProcessorImg);
        ProcessorListViewDemo.setAdapter(CustomAdapter);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.backbutton32k);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return onOptionsItemSelected(item);
    }
}