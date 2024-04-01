package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
//import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonfruitTest
{
    @Test
    public void testToString()
    {
        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit.toString().equals("Dragonfruit"));
    }
    @Test
    public void testHasBeenHarvested()
    {

        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit.hasBeenFertilized());

        //Given
        Person person = new Person(null);
        Storage storage = new Storage();

        //When
        storage.put(dragonfruit, 1);
        person.eat(dragonfruit);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(dragonfruit);

        Assert.assertEquals(expected, actual);

    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        Dragonfruit dragonfruit = new Dragonfruit();
//        assertTrue(dragonfruit instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        Dragonfruit dragonfruit = new Dragonfruit();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(dragonfruit, 1);
//        person.eat(dragonfruit);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
