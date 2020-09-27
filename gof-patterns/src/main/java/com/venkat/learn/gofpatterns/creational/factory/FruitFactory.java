package com.venkat.learn.gofpatterns.creational.factory;

public class FruitFactory {
    public IFruit getFruit(String fruitName){
        if(fruitName == null || fruitName.isEmpty()){
            return null;
        }
        else if(fruitName.equalsIgnoreCase("Apple")){
            return new Apple();
        }
        else if(fruitName.equalsIgnoreCase("Banana")){
            return new Banana();
        }
        else if(fruitName.equalsIgnoreCase("Grapes")){
            return new Grapes();
        }
        return null;
    }
}
