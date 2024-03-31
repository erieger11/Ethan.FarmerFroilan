package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class Watermelon implements Edible
{
    public Boolean harvested;
    public Boolean fertilized;
    public Watermelon(){
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
}
