package com.venkat.learn.gofpatterns.creational.factory;

public class Apple implements IFruit{

    @Override
    public color_code color() {
        return color_code.RED;
    }
}