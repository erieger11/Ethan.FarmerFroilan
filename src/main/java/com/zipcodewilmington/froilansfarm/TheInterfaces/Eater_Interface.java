package com.zipcodewilmington.froilansfarm.TheInterfaces;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;

public interface Eater_Interface<EdibleType> {
    void eat(EarCorn earCorn, int i);
    public Boolean eat(Integer amountOfEat, EdibleType edibleType);
}
