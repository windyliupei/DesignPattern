package com.windy.dp.bridge;

import com.windy.dp.bridge.actionimp.GreenCircle;
import com.windy.dp.bridge.actionimp.RedCircle;

public class Main {
    public static void main(String[] args){

        Shape redCircle = new Circle(88,99, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
