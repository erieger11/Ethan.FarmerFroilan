package FoodTest;
import com.zipcodewilmington.froilansfarm.Food.Apple;

//import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Storages.Storage;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest
{
    @Test
    public void testToString()
    {
        Apple apple = new Apple();
        Assert.assertTrue(apple.toString().equals("Apple"));
    }
    @Test
    public void testHasBeenHarvested()
    {

        Apple apple = new Apple();
        Assert.assertTrue(apple.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        Apple apple = new Apple();
        Assert.assertTrue(apple.hasBeenFertilized());

        //Given
        Person person = new Person(null);
        Storage storage = new Storage();

        //When
        storage.put(apple, 1);
        person.eat(apple);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(apple);

        Assert.assertEquals(expected, actual);

    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        Apple apple = new Apple();
//        assertTrue(apple instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        Apple apple = new Apple();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(apple, 1);
//        person.eat(apple);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
