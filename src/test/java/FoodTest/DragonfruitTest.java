package FoodTest;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonfruitTest
{
    @Test
    public void isInstanceOfTest()
    {
        Dragonfruit dragonfruit = new Dragonfruit();
        assertTrue(dragonfruit instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        Dragonfruit dragonfruit = new Dragonfruit();
        Storage storage = new Storage();

        //When
        storage.add(dragonfruit, 1);
        person.eat(dragonfruit);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
