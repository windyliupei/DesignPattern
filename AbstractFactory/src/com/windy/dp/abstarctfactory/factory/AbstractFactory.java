package com.windy.dp.abstarctfactory.factory;

import com.windy.dp.abstarctfactory.colorproduct.Color;
import com.windy.dp.abstarctfactory.shapeproduct.Shape;


public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
