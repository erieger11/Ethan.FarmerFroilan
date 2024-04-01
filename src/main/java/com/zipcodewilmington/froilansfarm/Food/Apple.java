package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class Apple implements Edible
{
    public Boolean harvested;
    public Boolean fertilized;
    public Apple(){
        this.fertilized = false;
        this.harvested = false;
    }

    @Override
    public Boolean hasBeenHarvested()
    {
        return harvested = true;
    }

    @Override
    public Boolean hasBeenFertilized()
    {
        return fertilized = true;
    }
    @Override
    public String toString()
    {
        return "Apple";
    }
}
//return food.get(food) - amountOfEat;
