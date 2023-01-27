package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class PrpgressBarDemo extends AppCompatActivity {
ProgressBar ProgressbarLine,pbg2;
int pgbStatus=0,pbgSt=0;
TextView TextPbg,TextPbg2;
Handler handler=new Handler();
Handler hd=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbardemo);

        ProgressbarLine=findViewById(R.id.ProgressBarLine);
        pbg2=findViewById(R.id.pbg2);
        TextPbg=findViewById(R.id.TextPbg);
        TextPbg2=findViewById(R.id.TextPbg2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(pgbStatus < 10000)
                {
                    pgbStatus= pgbStatus+1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            ProgressbarLine.setProgress(pgbStatus);
                            TextPbg.setText(pgbStatus+"/"+ ProgressbarLine.getMax());
                        }
                    });
                    try
                    {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        Toast.makeText(PrpgressBarDemo.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(pbgSt < 100)
                {
                    pbgSt= pbgSt+1;
                    hd.post(new Runnable() {
                        @Override
                        public void run() {
                            pbg2.setProgress(pbgSt);
                            TextPbg2.setText(pgbStatus+"/"+ ProgressbarLine.getMax());
                        }
                    });
                    try
                    {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        Toast.makeText(PrpgressBarDemo.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }).start();

    }
}