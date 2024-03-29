package FoodTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RuffletEggtest
{
    @Test
    public void isInstanceOfTest()
    {
        RuffletEgg ruffletEgg = new RuffletEgg();
        assertTrue(ruffletEgg instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        RuffletEgg ruffletEgg = new RuffletEgg();
        Storage storage = new Storage();

        //When
        storage.add(ruffletEgg, 1);
        person.eat(ruffletEgg);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
