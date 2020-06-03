package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.car.Engine;
import com.neodevloper.dagger.car.PetrlolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine (PetrlolEngine engine);

}
