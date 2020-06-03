package com.neodevloper.dagger.factory;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import dagger.Binds;
import dagger.Component;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class FactoryMethods {

    public static void main(String[] args){

        Single<String> oneMessage = getMessages().single("Hello");
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        oneMessage = getMessages().singleOrError();
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        oneMessage = getOneMessage().single("Hi");
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        oneMessage = getOneMessage().singleOrError();
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        oneMessage = getNonMessage().single("Hi there");
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        oneMessage = getNonMessage().singleOrError();
        oneMessage.subscribe(m -> System.out.println("Message: " + m), System.out::println);

        Single<Boolean> isThereMessage = getMessages().any(m -> m.equals("Hello"));
        isThereMessage.subscribe(b -> System.out.println("Is there a match in the messages? " + b));

        Single<Long> messagesCount = getMessages().count();
        messagesCount.subscribe(c -> System.out.println("Messages count is " + c));
    }

    static Observable<String> getMessages(){
        return Observable.just("Hello", "World");
    }

    static Observable<String> getOneMessage(){
        return Observable.just("Hello");
    }

    static Observable getNonMessage(){
        return Observable.empty();
    }

}