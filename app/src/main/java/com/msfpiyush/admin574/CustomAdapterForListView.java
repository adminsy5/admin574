package com.msfpiyush.admin574;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterForListView extends BaseAdapter {
    Context context;
    String OsBuild[];
    int OsIcon[];
    LayoutInflater inflater;

    public CustomAdapterForListView(Context applicationContext,String[] OsBuild,int[] OsIcon)
    {
        this.context=context;
        this.OsBuild=OsBuild;
        this.OsIcon=OsIcon;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return OsBuild.length;
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
        view=inflater.inflate(R.layout.activity_listview,null);
        TextView Builds=(TextView) view.findViewById(R.id.BuildText);
        ImageView Icons=(ImageView) view.findViewById(R.id.icon);
        Builds.setText(OsBuild[i]);
        Icons.setImageResource(OsIcon[i]);
        return view;
    }
}
