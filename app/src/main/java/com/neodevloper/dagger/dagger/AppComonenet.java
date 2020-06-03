package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = DrvierModule.class)
public interface AppComonenet {

    Driver getDriver();

}
