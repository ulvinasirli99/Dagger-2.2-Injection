package com.neodevloper.dagger.dagger;

import android.app.Application;

import com.neodevloper.dagger.dagger.ActivityComponent;
import com.neodevloper.dagger.dagger.AppComonenet;
import com.neodevloper.dagger.dagger.DaggerAppComonenet;


public class ExampleApp extends Application {

    private AppComonenet component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComonenet.create();

    }

    public AppComonenet getAppComponent(){

        return component;

    }

}
