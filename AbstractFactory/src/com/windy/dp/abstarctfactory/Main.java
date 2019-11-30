package com.windy.dp.abstarctfactory;

import com.windy.dp.abstarctfactory.colorproduct.Color;
import com.windy.dp.abstarctfactory.factory.AbstractFactory;
import com.windy.dp.abstarctfactory.factory.FactoryProducer;
import com.windy.dp.abstarctfactory.factory.ShapeFactory;
import com.windy.dp.abstarctfactory.shapeproduct.Shape;

public class Main {

    public static void main(String[] args){

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw();


        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");
        //调用 Red 的 fill 方法
        color1.fill();
        //获取颜色为 Green 的对象
        Color color2 = colorFactory.getColor("Green");
        //调用 Green 的 fill 方法
        color2.fill();
    }

}
