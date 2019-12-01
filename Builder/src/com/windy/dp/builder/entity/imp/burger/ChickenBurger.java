package com.windy.dp.builder.entity.imp.burger;

import com.windy.dp.builder.entity.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
