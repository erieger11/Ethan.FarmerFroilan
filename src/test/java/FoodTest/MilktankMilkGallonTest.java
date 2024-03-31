package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MilktankMilkGallonTest
{
    @Test
    public void isInstanceOfTest()
    {
        MilkGallon milkGallon = new MilkGallon();
        assertTrue(milk instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        Milk milk = new Milk();
        Storage storage = new Storage();

        //When
        storage.add(milk, 1);
        person.eat(milk);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
