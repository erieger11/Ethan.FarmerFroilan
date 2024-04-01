
package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.Apple;
import com.zipcodewilmington.froilansfarm.Storages.Storage;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class AppleTree extends Crop implements Edible{
    public void yield(CropRow<Crop> cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Apple(), cropRow.size());
        }
    }
}


