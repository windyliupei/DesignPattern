package com.windy.dp.Decorator.entity.decorator;

import com.windy.dp.Decorator.entity.Shape;

public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
