package com.windy.dp.facade;

import com.windy.dp.facade.entity.Shape;
import com.windy.dp.facade.entity.imp.Circle;
import com.windy.dp.facade.entity.imp.Rectangle;
import com.windy.dp.facade.entity.imp.Square;

//创建一个外观类。
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
