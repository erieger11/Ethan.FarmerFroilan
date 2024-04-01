package com.zipcodewilmington.froilansfarm.TheInterfaces;


import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Crop.Storage;


import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;
public interface Eater_Interface<EdibleType> {
    public default Integer eat(Storage storage, Food food, Integer amountOfEat){

        return storage.put(food, storage.get(food) - amountOfEat);

       // return storage.get(food) - amountOfEat;
    }
    public default void eat(EdibleType food, Integer amountOfEat){
        return food.get(food) - amountOfEat;
      }
    }

  }
}


