package com.windy.dp.builder.entity.builder;

import com.windy.dp.builder.entity.Meal;
import com.windy.dp.builder.entity.imp.burger.ChickenBurger;
import com.windy.dp.builder.entity.imp.burger.VegBurger;
import com.windy.dp.builder.entity.imp.colddrink.Coke;
import com.windy.dp.builder.entity.imp.colddrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
