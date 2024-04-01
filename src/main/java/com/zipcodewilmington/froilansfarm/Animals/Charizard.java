package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Botanist_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Rideable_Interface;

public class Charizard extends Animal implements Rideable_Interface, Botanist_Interface {
    String type;
    Double id;
    public Charizard(String name,String type, Double id) {
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
        return "RAWRRRRR!!!";
    }


    @Override
    public Boolean hasBeenRidden() {
        return null;
    }

    @Override
    public Person addRider() {
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
        croprow.hasBeenBurned = true;
    }
}
