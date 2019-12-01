package com.windy.dp.builder.builderwindy;

public class Burger {
    private String name;
    private Float price;
    private Boolean big;

    public Burger(String name, Float price, Boolean big) {
        this.name = name;
        this.price = price;
        this.big = big;
    }

    public Burger() {

    }

    public Burger name(String name){
        this.name = name;
        return this;
    }

    public Burger price(Float price){
        this.price = price;
        return this;
    }

    public Burger big(Boolean big){
        this.big = big;
        return this;
    }

    public Burger build(){
        return new Burger(name,price,big);
    }
}
