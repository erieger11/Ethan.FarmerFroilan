
package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.Apple;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class AppleTree extends Crop implements Edible{
    public void yield(CropRow cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Apple(), cropRow.size());
        }
    }
}


