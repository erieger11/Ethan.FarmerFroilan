package com.zipcodewilmington.froilansfarm.Food;

import java.util.HashMap;

public class Edible
{
    Storage storage;
    int stock;
    int amount;
    Object food;
    boolean hasBeenEaten = false;

    //generic method
//    public void eat(Edible food, Integer amount){
//        stock = storage.get(food);
//        storage.put(food,stock - amount);
//        hasBeenEaten = true;
//    }
}
