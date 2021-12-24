package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView) findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[]={"C","C++","Java",".NET","JQuery","Python","PHP","Javascript","Database","C","C++","Java",".NET","JQuery","Python","PHP","Javascript","Database"};
        rcv.setAdapter(new myAdapter(arr));
    }
}