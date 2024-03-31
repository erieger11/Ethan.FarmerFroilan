package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class RuffletEgg implements Edible
{
    public Boolean harvested;
    public Boolean fertilized;
    public RuffletEgg(){
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
