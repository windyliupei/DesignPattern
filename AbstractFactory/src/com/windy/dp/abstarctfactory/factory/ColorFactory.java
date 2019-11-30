package com.windy.dp.abstarctfactory.factory;

import com.windy.dp.abstarctfactory.colorproduct.Blue;
import com.windy.dp.abstarctfactory.colorproduct.Color;
import com.windy.dp.abstarctfactory.colorproduct.Green;
import com.windy.dp.abstarctfactory.colorproduct.Red;
import com.windy.dp.abstarctfactory.shapeproduct.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
