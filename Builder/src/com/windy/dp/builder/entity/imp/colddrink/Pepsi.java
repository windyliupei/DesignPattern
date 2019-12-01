package com.windy.dp.builder.entity.imp.colddrink;

import com.windy.dp.builder.entity.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
