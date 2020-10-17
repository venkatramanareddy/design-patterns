package com.venkat.learn.gofpatterns.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void Draw() {
        decoratedShape.Draw();
        SetRedBorder();
    }

    public void SetRedBorder(){
        System.out.println("Red Border");
    }
}
