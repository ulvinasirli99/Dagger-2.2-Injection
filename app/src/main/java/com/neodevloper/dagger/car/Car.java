package com.neodevloper.dagger.car;

import android.util.Log;

import com.neodevloper.dagger.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {

    private static final String TAG = "Car";

    private Driver driver;

    private Engine engine;
    
    private Whells whells;

    @Inject
    public Car(Engine engine, Whells whells,Driver driver) {
        this.engine = engine;
        this.whells = whells;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){

        engine.start();

        Log.d(TAG, driver+"driversss : "+this);

    }
    
}
