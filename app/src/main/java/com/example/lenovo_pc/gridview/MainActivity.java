package com.example.lenovo_pc.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Country> list = new ArrayList<Country>();
//    GridViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new GridViewAdapter(this, list));
    }

    public void setData(){
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
        list.add(new Country(R.drawable.comy,"Mỹ"));
    }
}
