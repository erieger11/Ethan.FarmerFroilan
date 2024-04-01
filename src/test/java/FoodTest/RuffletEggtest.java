package FoodTest;
//import com.zipcodewilmington.froilansfarm.Food.Edible;

import com.zipcodewilmington.froilansfarm.Food.RuffletEgg;
        import org.junit.Assert;
import org.junit.Test;

public class RuffletEggtest
{

    @Test
    public void testToString()
    {
        RuffletEgg ruffletEgg = new RuffletEgg();
        Assert.assertTrue(ruffletEgg.toString().equals("RuffletEgg"));
    }
    @Test
    public void testHasBeenHarvested()
    {
        RuffletEgg ruffletEgg = new RuffletEgg();
        Assert.assertTrue(ruffletEgg.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        RuffletEgg ruffletEgg = new RuffletEgg();
        Assert.assertTrue(ruffletEgg.hasBeenFertilized());
    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        RuffletEgg ruffletEgg = new RuffletEgg();
//        assertTrue(ruffletEgg instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        RuffletEgg ruffletEgg = new RuffletEgg();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(ruffletEgg, 1);
//        person.eat(ruffletEgg);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
