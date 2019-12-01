package com.windy.dp.builder.entity;

import com.windy.dp.builder.entity.imp.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
