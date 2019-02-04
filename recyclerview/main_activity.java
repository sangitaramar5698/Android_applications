package com.example.recyclerview3rdtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView recycle;
String[] items={"items listed here","scroll down for more ","life is full of recyclerview","recyclerview coffee","recyclerview with buttons","recyclerview without button","recycleview with edit box","recyclerview without editbox"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=(RecyclerView)findViewById(R.id.reclrvw);
        recycle.setLayoutManager(new LinearLayoutManager(this));
        recycle.setAdapter(new newAdapterforRecyclerview(items));
    }
}
