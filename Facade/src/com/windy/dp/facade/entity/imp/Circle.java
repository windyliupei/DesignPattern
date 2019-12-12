package com.windy.dp.facade.entity.imp;

import com.windy.dp.facade.entity.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
