package com.venkat.learn.gofpatterns.structural.decorator;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        decoratedShape = shape;
    }

    public void Draw() {
        decoratedShape.Draw();
    }
}
