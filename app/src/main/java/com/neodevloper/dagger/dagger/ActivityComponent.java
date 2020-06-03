package com.neodevloper.dagger.dagger;

import com.neodevloper.dagger.activity.MainActivity;
import com.neodevloper.dagger.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component (dependencies =  AppComonenet.class,modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower( @Named ("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity( @Named ("engine capacity") int engineCapacity);

        Builder appComponent(AppComonenet comonenet);

        ActivityComponent build();

    }

}
