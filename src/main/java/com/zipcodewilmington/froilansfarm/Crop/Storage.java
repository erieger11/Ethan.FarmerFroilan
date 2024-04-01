package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.Apple;
import com.zipcodewilmington.froilansfarm.Food.Food;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;
import java.util.HashMap;



public class Storage<T extends Food>
{
   HashMap<T, Integer> storage = new HashMap<>();

    public void add(T food, Integer numberofItems) {
      storage.put(food, numberofItems);
    }
  }
