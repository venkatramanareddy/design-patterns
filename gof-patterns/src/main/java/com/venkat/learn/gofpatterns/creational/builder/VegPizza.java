package com.venkat.learn.gofpatterns.creational.builder;

public class VegPizza extends Pizza {
    @Override
    public String name() {
        return "Veg Pizza";
    }

    @Override
    public float cost() {
        return 20;
    }
}
