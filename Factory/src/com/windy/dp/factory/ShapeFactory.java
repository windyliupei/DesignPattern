package com.windy.dp.factory;

import com.windy.dp.factory.entity.Circle;
import com.windy.dp.factory.entity.Rectangle;
import com.windy.dp.factory.entity.Shape;
import com.windy.dp.factory.entity.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType.isEmpty()){
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
