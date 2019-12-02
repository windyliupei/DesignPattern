package com.windy.dp.prototype;

import com.windy.dp.prototype.entity.Shape;

public class Main {
    public static void main(String[] args){
        ShapeCache.loadCache();

        //拿到的并不是 Hash Table，中的对象而是它的clone对象，
        //用于保持一份“原型”，所谓：不忘初心
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
