package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Food;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;

public class Rufflet extends Animal implements Produce_Interface {
    String type;
    Double id;
    public static boolean hasBeenFertilized = false;
    public static boolean hasBeenHarvested = false;
    public Rufflet(String name,String type, Double id) {
        super(name);
        this.type = type;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setId(Double id){
        this.id = id;
    }
    public Double getId(){
        return id;
    }
    public String makeNoise(){
        return "rrrrrrruffleee!!!";
    }

    @Override
    public Boolean hasBeenFertilized() {
        return Rufflet.hasBeenFertilized = true;
    }

    @Override
    public Boolean hasBeenHarvested() {
        return Rufflet.hasBeenHarvested = true;
    }
    public Integer getRuffletEgg(Storage storage, Food RuffletEgg, Rufflet rufflet) {
        if (rufflet.hasBeenFertilized() && rufflet.hasBeenHarvested()) {
            storage.put(RuffletEgg, storage.get(RuffletEgg) + 1);
        }return storage.get(RuffletEgg);
    }

}
