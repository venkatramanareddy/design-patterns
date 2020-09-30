package com.venkat.learn.gofpatterns.creational.builder;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0.00f;
        for (Item item: itemList) {
            cost += item.cost();
        }
        return cost;
    }

    public String getItemNames(){
        String str = "";
        for(Item item: itemList){
            str += item.name() + ",";
        }
        return str;
    }
}
