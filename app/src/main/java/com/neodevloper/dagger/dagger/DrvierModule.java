package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DrvierModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }

}
