package com.windy.dp.factory;

import com.windy.dp.factory.entity.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

    }
}
