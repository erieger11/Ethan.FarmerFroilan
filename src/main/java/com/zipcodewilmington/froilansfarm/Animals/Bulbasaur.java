package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;

public class Bulbasaur extends Animal {
    String type;
    Double id;
    public Bulbasaur(String name,String type, Double id) {
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
    public String makeNoise() {
        return "BULBASAUR!!!";
    }

    public void nurtureCrops(CropRow croprow) {
        croprow.hasBeenNurtured = true;
    }

}
