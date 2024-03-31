package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest
{
    @Test
    public void isInstanceOfTest()
    {
        EarCorn earCorn = new EarCorn();
        assertTrue(earCorn instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person(null);
        EarCorn earCorn = new EarCorn();
        Storage storage = new Storage();

        //When
        storage.put(earCorn, 1);
        person.eat(earCorn);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(earCorn);

        Assert.assertEquals(expected, actual);
    }
}
