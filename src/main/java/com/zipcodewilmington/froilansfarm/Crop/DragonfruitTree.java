package com.zipcodewilmington.froilansfarm.Crop;


import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;


public class DragonfruitTree extends Crop {

    public void yield(CropRow cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Dragonfruit(), cropRow.size());
        }
    }
}

// return what's in the array list of crops into storage as food.