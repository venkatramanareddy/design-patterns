package com.venkat.learn.gofpatterns.creational.builder;

// Implemented with the help of tutorials point
// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
public class MealBuilder {
    public Meal prepareVegCombo(){
        Meal meal = new Meal();
        meal.addItem(new VegPizza());
        return meal;
    }

    public Meal prepareNonVegCombo(){
        Meal meal = new Meal();
        meal.addItem(new NonVegPizza());
        return meal;
    }
}
