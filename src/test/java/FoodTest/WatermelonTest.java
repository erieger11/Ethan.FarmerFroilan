package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.Person.Person;
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
        Person person = new Person(null);
        Watermelon watermelon = new Watermelon();
        Storage storage = new Storage();

        //When
        storage.put(watermelon, 1);
        person.eat(watermelon);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(watermelon);

        Assert.assertEquals(expected, actual);
    }
}
