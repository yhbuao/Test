package com.haibo.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * 项目名称: MyApplication.
 * 创建人: yuhaibo
 * 创建时间: 2016/10/25 17:40.
 */

public class UiWidget extends ViewGroup {
    public UiWidget(Context context) {
        super(context);
    }

    public UiWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UiWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public UiWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
