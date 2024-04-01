package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;

public abstract class Crop implements Produce_Interface {
    private boolean isFertilized = false;
    private boolean isHarvested = false;
    public abstract Edible yield();

    public boolean hasBeenFertilized(){

        return isFertilized;

    }

    public boolean hasBeenHarvested(){

        return isHarvested;
    }

    public void fertilize(){
        isFertilized = true;
    }

    public void harvest(){

        isHarvested = true;
    }
    //hi


}
