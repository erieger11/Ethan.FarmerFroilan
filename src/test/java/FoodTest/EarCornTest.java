package FoodTest;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class EarCornTest
{
    @Test
    public void testToString()
    {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn.toString().equals("EarCorn"));
    }
    @Test
    public void testHasBeenHarvested()
    {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn.hasBeenFertilized());
    }
}


//import com.zipcodewilmington.froilansfarm.Food.EarCorn;
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class EarCornTest
//{
//    @Test
//    public void isInstanceOfTest()
//    {
//        EarCorn earCorn = new EarCorn();
//        assertTrue(earCorn instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        EarCorn earCorn = new EarCorn();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(earCorn, 1);
//        person.eat(earCorn);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
//}
