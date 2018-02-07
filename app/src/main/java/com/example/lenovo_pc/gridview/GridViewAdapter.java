package com.example.lenovo_pc.gridview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo-PC on 2/7/2018.
 */

public class GridViewAdapter extends BaseAdapter {

    List<Country> list;
    Context context;

    public GridViewAdapter(Context context, List<Country> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Country getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }
        ImageView imageView = convertView.findViewById(R.id.img_country);
        TextView textView = convertView.findViewById(R.id.txt_name);
        Country country = list.get(position);
        imageView.setImageResource(country.getmId());
        textView.setText(country.getmName());


        return convertView;
    }

}