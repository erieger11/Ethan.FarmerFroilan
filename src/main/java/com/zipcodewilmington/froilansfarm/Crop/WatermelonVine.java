
package com.zipcodewilmington.froilansfarm.Crop;


import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class WatermelonVine extends Crop{

    public void yield(CropRow cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Watermelon(), cropRow.size());
        }
    }
}