package com.haibo.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.imagbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = createDialog();
                View detailsView = LayoutInflater.from(Main2Activity.this).inflate(R.layout.sj_main_details, null);
                dialog.setContentView(detailsView);
                dialog.show();
            }
        });

    }

    /**
     * 创建Dialog
     *
     * @return
     */
    protected Dialog createDialog() {
        Dialog dialog = new Dialog(this, android.support.v7.appcompat.R.style.Base_Theme_AppCompat);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        WindowManager.LayoutParams layoutParams = dialog.getWindow().getAttributes();
        layoutParams.gravity = Gravity.BOTTOM;
        //Dialog的高度
        layoutParams.height = 400;
        layoutParams.dimAmount = 0.5f;
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
