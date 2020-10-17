package com.venkat.learn.gofpatterns.structural.decorator;

public class BrownShapeDecorator extends ShapeDecorator {
    public BrownShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void Draw() {
        decoratedShape.Draw();
        SetBrownBorder();
    }

    public void SetBrownBorder(){
        System.out.println("Red Border");
    }
}
