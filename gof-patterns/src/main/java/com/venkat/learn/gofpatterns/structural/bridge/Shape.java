package com.venkat.learn.gofpatterns.structural.bridge;

public abstract class Shape {
    public Color color = null;
    public abstract String getShapeName();
    public String getName(){
        String name = "";
        if(color != null){
            name += color.getName();
        }
        name += getShapeName();
        return name;
    }
}
