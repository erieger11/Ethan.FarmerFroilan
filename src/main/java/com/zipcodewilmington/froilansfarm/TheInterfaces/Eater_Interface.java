package com.zipcodewilmington.froilansfarm.TheInterfaces;


import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;
public interface Eater_Interface<EdibleType> {
    public default void eat(EdibleType food, Integer amountOfEat){
        return food.get(food) - amountOfEat;
      }
    }
