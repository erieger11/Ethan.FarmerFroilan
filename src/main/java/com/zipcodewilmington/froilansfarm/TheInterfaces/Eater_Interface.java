package com.zipcodewilmington.froilansfarm.TheInterfaces;
import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Crop.Storage;

public interface Eater_Interface<EdibleType> {

    public default void eat(Storage storage, Food food, Integer amountOfEat){

      //  return storage.put(food, storage.get(food) - amountOfEat);

        // return storage.get(food) - amountOfEat;
    }
}



