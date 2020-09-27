package com.venkat.learn.gofpatterns.creational.factory;

public interface IFruit {
    enum color_code{
        RED,
        ORANGE,
        GREEN,
        YELLOW
    }
    color_code color();
}
