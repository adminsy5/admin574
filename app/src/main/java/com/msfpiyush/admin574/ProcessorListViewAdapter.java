package com.msfpiyush.admin574;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProcessorListViewAdapter extends BaseAdapter {
    Context contex;
    String ArrayProcessorName[];
    String ArrayProcessorPrice[];
    int ArrayProcessorImg[];
    LayoutInflater inflater;

    public ProcessorListViewAdapter(Context applicationContext, String[] ArrayProcessorName, String[] ArrayProcessorPrice, int[] ArrayProcessorImg) {
        this.contex = contex;
        this.ArrayProcessorName = ArrayProcessorName;
        this.ArrayProcessorPrice = ArrayProcessorPrice;
        this.ArrayProcessorImg = ArrayProcessorImg;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return ArrayProcessorName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.processorlistviewdemo,null);
        TextView ProcessorName1=(TextView) view.findViewById(R.id.ProcessorName);
        TextView ProcessorPrice1=(TextView) view.findViewById(R.id.ProcessorPrice);
        ImageView ProcessorImg1=(ImageView) view.findViewById(R.id.ProcessorImg);
        ProcessorName1.setText(ArrayProcessorName[i]);
        ProcessorPrice1.setText(ArrayProcessorPrice[i]);
        ProcessorImg1.setImageResource(ArrayProcessorImg[i]);
        return view;
    }
}
