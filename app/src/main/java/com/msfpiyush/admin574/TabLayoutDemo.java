package com.msfpiyush.admin574;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class TabLayoutDemo extends AppCompatActivity {
FrameLayout FrameLayout1;
TabLayout TabLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_tablayout);
        FrameLayout1=findViewById(R.id.FrameLayout1);
        TabLayout1=findViewById(R.id.TabLayout1);

        if (Build.VERSION.SDK_INT >= 24) {
            Window window = this.getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.black));
        }

        TabLayout.Tab Ajith=TabLayout1.newTab();
        Ajith.setText("💜");

        TabLayout.Tab Ajay=TabLayout1.newTab();
        Ajay.setText("🧡");

        TabLayout.Tab Arpit=TabLayout1.newTab();
        Arpit.setText("💚");

        TabLayout.Tab Rajat= TabLayout1.newTab();
        Rajat.setText("❤️");

        TabLayout.Tab Umesh=TabLayout1.newTab();
        Umesh.setText("💛");

        TabLayout.Tab Piyush=TabLayout1.newTab();
        Piyush.setText("🤍");

        TabLayout1.addTab(Ajith);
        TabLayout1.addTab(Rajat);
        TabLayout1.addTab(Piyush);
        TabLayout1.addTab(Umesh);
        TabLayout1.addTab(Arpit);
        TabLayout1.addTab(Ajay);

        TabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment=null;
                switch (tab.getPosition())
                {
                    case 0:
                        fragment = new AjithFrag();
                        break;
                    case 1:
                        fragment = new RajatFrag();
                        break;
                    case 2:
                        fragment = new PiyushFrag();
                        break;
                    case 3:
                        fragment = new UmeshFrag();
                        break;
                    case 4:
                        fragment = new ArpitFrag();
                        break;
                    case 5:
                        fragment = new AjayFrag();
                        break;
                }
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.FrameLayout1,fragment);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                fragmentTransaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable=new ColorDrawable(Color.parseColor("#000000"));
        actionBar.setBackgroundDrawable(colorDrawable);
        actionBar.setTitle(" Admin Team 🔥 ");
    }
}