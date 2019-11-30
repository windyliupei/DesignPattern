package com.windy.dp.Factory;

import com.windy.dp.Factory.entity.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

    }
}
