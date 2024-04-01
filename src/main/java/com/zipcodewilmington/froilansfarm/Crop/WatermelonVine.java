
package com.zipcodewilmington.froilansfarm.Crop;


import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.Storages.Storage;

public class WatermelonVine extends Crop{

    public void yield(CropRow<Crop> cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Watermelon(), cropRow.size());
        }
    }
}