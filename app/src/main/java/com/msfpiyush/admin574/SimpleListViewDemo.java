package com.msfpiyush.admin574;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleListViewDemo extends AppCompatActivity {
ListView SimpleListView;
String OsBuild[]={"Apple","Microsoft","Android","Ubuntu","Fedora","Kali","ParrotSec","Debian","BlackBarry","Chromium"};
int OsIcon[]={R.drawable.apple,R.drawable.microsoft,R.drawable.android,R.drawable.ubuntu,R.drawable.fedora,R.drawable.kali_linux,R.drawable.parrot_sec,R.drawable.debian,R.drawable.blackberry,R.drawable.chrome_os};
AlertDialog.Builder adb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplelistviewdemo);

        ActionBar ad=getSupportActionBar();
        ad.setHomeAsUpIndicator(R.drawable.backbutton32k1);
        ad.setDisplayHomeAsUpEnabled(true);

        SimpleListView=findViewById(R.id.SimpleListView);
        CustomAdapterForListView CustomAdapter=new CustomAdapterForListView(getApplicationContext(),OsBuild,OsIcon);
        SimpleListView.setAdapter(CustomAdapter);

//Obj of alert dialogue box
        adb=new AlertDialog.Builder(this);
        SimpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),OsBuild[i],Toast.LENGTH_SHORT).show();
//                SimpleListView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
                //----------------------------------------------------------------
                adb.setMessage("You are choosing "+OsBuild[i]+" ! ");
                adb.setTitle(" Note ");
                adb.setCancelable(false);
                adb.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                //-----------------------------------------------------------------------

                AlertDialog AlertDialogObject=adb.create();
                AlertDialogObject.show();


                        LayoutInflater inflater = getLayoutInflater();
                        View layout= inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.LinearLayoutRoot));
                        TextView CustomText=layout.findViewById(R.id.CustomText);
                        ImageView CustomImage=layout.findViewById(R.id.CustomIcon);
                        CustomText.setText(OsBuild[i]);
                        CustomImage.setImageResource(OsIcon[i]);
                        Toast toast=new Toast(getApplicationContext());
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setView(layout);
                        toast.show();
                    }
                });
            }
//back button in action bar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
//            });
//    }
}