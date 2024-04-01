package FoodTest;

import com.zipcodewilmington.froilansfarm.Food.MilktankMilkGallon;

import com.zipcodewilmington.froilansfarm.Food.Edible;

import org.junit.Assert;
import org.junit.Test;

public class MilktankMilkGallonTest
{
    @Test
    public void testToString()
    {
        MilktankMilkGallon milktankMilkGallon = new MilktankMilkGallon();
        Assert.assertTrue(milktankMilkGallon.toString().equals("MilktankMilkGallon"));
    }
    @Test
    public void testHasBeenHarvested()
    {
        MilktankMilkGallon milktankMilkGallon = new MilktankMilkGallon();
        Assert.assertTrue(milktankMilkGallon.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        MilktankMilkGallon milktankMilkGallon = new MilktankMilkGallon();
        Assert.assertTrue(milktankMilkGallon.hasBeenFertilized());
    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        MilktankMilkGallon milktankMilkGallon = new MilktankMilkGallon();
//        assertTrue(milktankMilkGallon instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        Milk milk = new Milk();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(milk, 1);
//        person.eat(milk);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
