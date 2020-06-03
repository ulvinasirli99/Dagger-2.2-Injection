package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.car.DiselEngine;
import com.neodevloper.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineMoule {

    private int horsePower;

    public DiselEngineMoule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DiselEngine engine) {

        return engine;

    }

}
