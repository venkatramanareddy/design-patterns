package com.venkat.learn.gofpatterns.creational.factory;

public interface IFruit {
    public enum color_code{
        RED,
        ORANGE,
        GREEN,
        YELLOW
    }
    color_code color();
}
