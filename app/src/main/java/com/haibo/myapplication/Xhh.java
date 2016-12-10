package com.haibo.myapplication;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

/**
 * 项目名称: MyApplication.
 * 创建人: yuhaibo
 * 创建时间: 2016/10/11 17:16.
 */

public class Xhh extends Application {
    private static  Xhh instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        MobclickAgent.setDebugMode(true);
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
    }
    public static Xhh getInstance(){
        return instance;
    }

}
