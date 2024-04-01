
package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public class CornStalk extends Crop{
    @Override
    public Edible yield() {
        if(hasBeenFertilized() && !hasBeenHarvested()){
//            return new EarCorn();
        }
        return null;
    }
}
