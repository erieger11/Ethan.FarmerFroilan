package com.zipcodewilmington.froilansfarm.TheInterfaces;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;


public interface Eater_Interface<EdibleType> {
    void eat(EarCorn earCorn, int i);
    public Boolean eat(Integer amountOfEat, EdibleType edibleType);

public interface Eater_Interface {

    public static Integer eat(Edible<T> food, Integer valueToChange) {
        return food.get() - valueToChange;
    }

}
}
