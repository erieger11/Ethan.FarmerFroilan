package FoodTest;
import com.zipcodewilmington.froilansfarm.Food.Apple;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest
{
    @Test
    public void isInstanceOfTest()
    {
        Apple apple = new Apple();
        assertTrue(apple instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        Apple apple = new Apple();
        Storage storage = new Storage();

        //When
        storage.add(apple, 1);
        person.eat(apple);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
