package TheInterfaces;

import com.zipcodewilmington.froilansfarm.Food.Edible;

public interface Eater_Interface {

    public static Integer eat(Edible<T> food, Integer valueToChange) {
    return food.get() - valueToChange;
}
}
