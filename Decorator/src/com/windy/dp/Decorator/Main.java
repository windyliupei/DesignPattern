package com.windy.dp.Decorator;

import com.windy.dp.Decorator.entity.Shape;
import com.windy.dp.Decorator.entity.decorator.ShapeDecorator;
import com.windy.dp.Decorator.entity.decorator.imp.RedShapeDecorator;
import com.windy.dp.Decorator.entity.imp.Circle;
import com.windy.dp.Decorator.entity.imp.Rectangle;

public class Main {

    public static void main(String[] args){
        //使用 RedShapeDecorator 来装饰 Shape 对象。
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
