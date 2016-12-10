package com.haibo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class TestActivity extends AppCompatActivity {

    protected LinearLayout sj_main_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        sj_main_content = ((LinearLayout) findViewById(R.id.sj_main_content));
        View view = LayoutInflater.from(this).inflate(R.layout.test_layout, null,true);
        sj_main_content.addView(view);

        ViewGroup.LayoutParams lp;
        lp=  view.getLayoutParams();
        lp.width= ViewGroup.LayoutParams.MATCH_PARENT;
        lp.height=ViewGroup.LayoutParams.MATCH_PARENT;
        view.setLayoutParams(lp);
    }
}
