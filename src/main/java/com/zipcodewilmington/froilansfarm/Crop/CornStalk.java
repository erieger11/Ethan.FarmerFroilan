
package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Storages.Storage;


public class CornStalk extends Crop {
    public void yield(CropRow<Crop> cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new EarCorn(), cropRow.size());
        }
    }
}