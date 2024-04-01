package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public class DragonfruitTree extends Crop {
    @Override
    public Edible yield() {
        if(hasBeenFertilized() && !hasBeenHarvested()){
//            return new Dragonfruit();
        }

        return null;
    }
}