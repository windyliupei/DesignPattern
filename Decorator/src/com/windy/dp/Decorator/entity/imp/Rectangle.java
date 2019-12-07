package com.windy.dp.Decorator.entity.imp;

import com.windy.dp.Decorator.entity.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
