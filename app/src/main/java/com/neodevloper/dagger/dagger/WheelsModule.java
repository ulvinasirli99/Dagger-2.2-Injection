package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.car.Tires;
import com.neodevloper.dagger.car.Rims;
import com.neodevloper.dagger.car.Whells;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }


    @Provides
    static Tires provideTries() {

        Tires tires = new Tires();

        tires.inflate();

        return tires;

    }

    @Provides
    static Whells provideWheels(Rims rims, Tires tires) {

        return new Whells(rims, tires);

    }

}
