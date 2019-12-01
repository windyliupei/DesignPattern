package com.windy.dp.builder.entity.imp.burger;

import com.windy.dp.builder.entity.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
