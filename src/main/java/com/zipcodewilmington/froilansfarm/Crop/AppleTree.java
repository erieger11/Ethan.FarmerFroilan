
package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public class AppleTree extends Crop{
    @Override
    public Edible yield() {
        if(hasBeenFertilized() && !hasBeenHarvested()){
//            return new Apple();
        }
        return null;
    }
}
