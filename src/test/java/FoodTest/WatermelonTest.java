package FoodTest;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WatermelonTest
{
    @Test
    public void isInstanceOfTest()
    {
        Watermelon watermelon = new Watermelon();
        assertTrue(watermelon instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        Watermelon watermelon = new Watermelon();
        Storage storage = new Storage();

        //When
        storage.add(watermelon, 1);
        person.eat(watermelon);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
