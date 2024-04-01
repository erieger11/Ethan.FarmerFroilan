package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Food.Tomato;

public class Person extends Animal {
    String name;

    public Person(String name) {
        super(name);
    }

    public void add(Person  person) {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) { this.name = name;
    }

    public boolean eat() {
        return false;
    }

}
