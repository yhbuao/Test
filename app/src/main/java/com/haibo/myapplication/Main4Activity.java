package com.haibo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.haibo.myapplication.utils.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    protected RecyclerView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lv = ((RecyclerView) findViewById(R.id.lv));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("余海波" + i);
        }

        MyAdapter myAdapter = new MyAdapter(this, list);
        lv.setAdapter(myAdapter);
        lv.setLayoutManager(new LinearLayoutManager(this));
        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int postion) {
                Toast.makeText(Main4Activity.this, "点击了" + postion, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
