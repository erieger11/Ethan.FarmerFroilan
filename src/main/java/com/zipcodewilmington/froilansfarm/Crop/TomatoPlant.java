package com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Edible;

public class TomatoPlant extends Crop {

    public void yield(CropRow cropRow, Storage storage) {
        if (hasBeenWatered() && hasBeenFertilized() && hasBeenFertilized()) {
            storage.add(new Tomato(), cropRow.size());
        }
    }
}