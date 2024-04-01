package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Pilot;


public class CropDuster extends AirCraft{

    public void addPilot(Pilot pilot) {
        super.addPilot(pilot);
    }

    public void fly() {
        super.fly();
    }

    public Boolean hasBeenRidden() {
        return super.hasBeenRidden();
    }


    public String makeNoise() {
        return "Vroom";
    }

    public boolean hasRidder() {
        return super.hasRidder();
    }


    public void fertilize(CropRow<Crop> cropRow) {
        super.fertilize(cropRow);
    }

    public void removeRider() {
        super.removeRider();
    }
}
