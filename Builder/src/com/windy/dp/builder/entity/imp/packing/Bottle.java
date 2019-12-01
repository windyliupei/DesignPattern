package com.windy.dp.builder.entity.imp.packing;

import com.windy.dp.builder.entity.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
