package FoodTest;
import com.zipcodewilmington.froilansfarm.Storages.Storage;
import com.zipcodewilmington.froilansfarm.Person.Person;

import com.zipcodewilmington.froilansfarm.Food.TogekissEgg;
import org.junit.Assert;
import org.junit.Test;

public class TogekissEggTest
{
    @Test
    public void testToString()
    {
        TogekissEgg togekissEgg = new TogekissEgg();
        Assert.assertTrue(togekissEgg.toString().equals("TogekissEgg"));
    }
    @Test
    public void testHasBeenHarvested()
    {
        //Given
        Person person = new Person(null);
        TogekissEgg togepi = new TogekissEgg();
        Storage storage = new Storage();

        //When
        storage.put(togepi, 1);
        person.eat(togepi);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
        TogekissEgg togekissEgg = new TogekissEgg();
        Assert.assertTrue(togekissEgg.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        TogekissEgg togekissEgg = new TogekissEgg();
        Assert.assertTrue(togekissEgg.hasBeenFertilized());
    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        TogekissEgg togepi = new TogekissEgg();
//        assertTrue(togepi instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        TogekissEgg togepi = new TogekissEgg();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(togepi, 1);
//        person.eat(togepi);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
