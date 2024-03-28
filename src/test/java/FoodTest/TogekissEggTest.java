package FoodTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TogekissEggTest
{
    @Test
    public void isInstanceOfTest()
    {
        TogekissEgg togepi = new TogekissEgg();
        assertTrue(togepi instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        TogekissEgg togepi = new TogekissEgg();
        Storage storage = new Storage();

        //When
        storage.add(togepi, 1);
        person.eat(togepi);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
