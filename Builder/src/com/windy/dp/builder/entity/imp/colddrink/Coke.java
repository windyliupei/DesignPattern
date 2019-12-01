package com.windy.dp.builder.entity.imp.colddrink;

import com.windy.dp.builder.entity.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
