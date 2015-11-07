package com.daodao.yanchao.daodao;

import android.app.Application;

import com.daodao.yanchao.daodao.smack.SessionManager;
import com.daodao.yanchao.daodao.smack.SmackManager;

/**
 * Created by yanchao on 10/21/15.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SmackManager.init(this);
    }
}
