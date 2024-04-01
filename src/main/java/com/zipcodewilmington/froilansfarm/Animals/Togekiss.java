package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Storages.Storage;
import com.zipcodewilmington.froilansfarm.Food.Food;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;

public class Togekiss extends Animal implements Produce_Interface {
    String type;
    Double id;
    public Togekiss(String name,String type, Double id) {
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
        return "toge!!!";
    }

    @Override
    public Boolean hasBeenFertilized() {
        return Rufflet.hasBeenFertilized = true;
    }

    @Override
    public Boolean hasBeenHarvested() {
        return Rufflet.hasBeenHarvested = true;
    }
    public Integer getTogekissEgg(Storage storage, Food TogekissEgg, Togekiss togekiss) {
        if (togekiss.hasBeenFertilized() && togekiss.hasBeenHarvested()) {
            storage.put(TogekissEgg, storage.get(TogekissEgg) + 1);
        }
        return storage.get(TogekissEgg);
    }
}
