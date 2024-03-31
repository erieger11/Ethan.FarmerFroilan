package com.zipcodewilmington.froilansfarm.Animals;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;

public class Rufflet extends Animal implements Produce_Interface {
    String type;
    Double id;
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
}
