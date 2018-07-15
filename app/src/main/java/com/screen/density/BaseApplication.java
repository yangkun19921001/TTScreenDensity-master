package com.screen.density;

import android.app.Application;

import com.screen.density.utils.Density;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Density.setDensity(this);
    }
}
