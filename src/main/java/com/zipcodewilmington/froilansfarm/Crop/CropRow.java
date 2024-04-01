package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;

import java.util.ArrayList;


public class CropRow<T extends ArrayList<Crop>>  implements Produce_Interface {

ArrayList<Crop> plant = new ArrayList<>();
    boolean isFertilized;
    boolean isHarvested;
//    public boolean isWatered;

    public Boolean hasBeenFertilized(){
        return isFertilized;
    }

    public Boolean hasBeenHarvested(){
        return isHarvested;
    }

//    public Boolean hasBeenWatered(){
//        return isWatered;
//    }

    public void fertilize(){
        this.isFertilized = true;
    }

    public void harvest(){
        this.isHarvested = true;
    }

//    public void waterCrops(){
//        this.isWatered = true;
//    }

}

// size method, return how many crops are in the row
// is empty, same as above just a boolean if its empty


