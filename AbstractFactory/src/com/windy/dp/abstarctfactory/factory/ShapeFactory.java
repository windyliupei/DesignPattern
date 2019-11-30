package com.windy.dp.abstarctfactory.factory;

import com.windy.dp.abstarctfactory.colorproduct.Color;
import com.windy.dp.abstarctfactory.factory.AbstractFactory;
import com.windy.dp.abstarctfactory.shapeproduct.Circle;
import com.windy.dp.abstarctfactory.shapeproduct.Rectangle;
import com.windy.dp.abstarctfactory.shapeproduct.Shape;
import com.windy.dp.abstarctfactory.shapeproduct.Square;


public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


}
