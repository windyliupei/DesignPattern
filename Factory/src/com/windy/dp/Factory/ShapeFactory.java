package com.windy.dp.Factory;

import com.windy.dp.Factory.entity.Circle;
import com.windy.dp.Factory.entity.Rectangle;
import com.windy.dp.Factory.entity.Shape;
import com.windy.dp.Factory.entity.Square;

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
