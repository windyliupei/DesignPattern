package com.windy.dp.Decorator.entity.imp;

import com.windy.dp.Decorator.entity.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
