package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;

public class TomatoPlant extends Crop {


    @Override
    public Edible yield() {
        if(hasBeenFertilized() && !hasBeenHarvested()){
//            return new Tomato();
        }
        return null;
    }
}