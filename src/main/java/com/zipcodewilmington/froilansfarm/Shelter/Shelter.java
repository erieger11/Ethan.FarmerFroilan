package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

import java.util.ArrayList;

public class Shelter<T extends Animal> {

  ArrayList<T> occupants = new ArrayList<>();

  public Integer size() {
    return occupants.size();
  }

  public void add(T animal) {
    occupants.add(animal);
  }

  public void remove(T animal) {
    occupants.remove(animal);
  }
}
