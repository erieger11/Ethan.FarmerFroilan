
package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public class WatermelonVine extends Crop{
    @Override
    public Edible yield() {
        if(hasBeenFertilized() && !hasBeenHarvested()){
//            return new Watermelon();
        }
        return null;
    }
}
