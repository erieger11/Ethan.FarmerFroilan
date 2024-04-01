package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rideable_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rider_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Vehicle_Interface;

public class Pilot extends Person implements Rider_Interface {
    boolean airCraft;
    public Pilot(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Vroom!";
    }

    @Override
    public Person mount() {

        return null;
    }

    @Override
    public Boolean hasRidden() {
        return null;
    }
}
