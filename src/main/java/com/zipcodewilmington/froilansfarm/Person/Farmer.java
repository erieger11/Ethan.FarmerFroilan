package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Botanist_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rider_Interface;

public class Farmer extends Person implements Rider_Interface, Botanist_Interface {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public Person mount() {
        return null;
    }

    @Override
    public Boolean hasRidden() {
        return null;
    }

    @Override
    public void plant(CropRow<Crop> croprow) {

    }

    @Override
    public void water(CropRow<Crop> croprow) {

    }

    @Override
    public void nurture(CropRow<Crop> croprow) {

    }

    @Override
    public void burn(CropRow<Crop> croprow) {

    }
}
