package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Food.Food;
import com.zipcodewilmington.froilansfarm.Food.MilktankMilkGallon;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;
import com.zipcodewilmington.froilansfarm.Crop.Storage;

public class Miltank extends Animal implements Produce_Interface {
    String type;
    Double id;
    public Miltank(String name,String type, Double id) {
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
        return "mooooooooooo!!!";
    }

    @Override
    public Boolean hasBeenFertilized() {
        return Rufflet.hasBeenFertilized = true;
    }

    @Override
    public Boolean hasBeenHarvested() {
        return Rufflet.hasBeenHarvested = true;
    }
    public Integer creatingMilk(Storage storage, Food MilktankMilkGallon, Miltank miltank) {
        if (miltank.hasBeenFertilized() && miltank.hasBeenHarvested()) {
            storage.put(MilktankMilkGallon, storage.get(MilktankMilkGallon) + 1);
        }return storage.get(MilktankMilkGallon);
    }

}






