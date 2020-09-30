package com.venkat.learn.gofpatterns.creational.builder;

public class NonVegPizza extends Pizza{

    @Override
    public String name() {
        return "Non Veg Pizza";
    }

    @Override
    public float cost() {
        return 22.5f;
    }
}
