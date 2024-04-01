
package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;


public class CornStalk extends Crop {
    public void yield(CropRow cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new EarCorn(), cropRow.size());
        }
    }
}