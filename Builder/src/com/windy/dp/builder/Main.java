package com.windy.dp.builder;

import com.windy.dp.builder.builderwindy.Burger;
import com.windy.dp.builder.entity.Meal;
import com.windy.dp.builder.entity.builder.MealBuilder;

public class Main {

    public static void main(String[] args){

        //网上介绍的Builder 模式
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

        //写一个我理解的
        Burger windyBurger = new Burger();
        windyBurger.big(false)
        .name("This is a small Burger")
        .build();




    }

}
