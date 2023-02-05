package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
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
    }
}