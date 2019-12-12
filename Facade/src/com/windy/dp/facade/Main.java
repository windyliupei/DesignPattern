package com.windy.dp.facade;

public class Main {
    public static void main(String[] args){

        //ShapeMaker 封装了画“形状”的操作
        //使用者不需要知道，具体怎么（谁去）画圆，怎么（谁去）画方块
        //一切交给 ShapeMaker就可以了
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
