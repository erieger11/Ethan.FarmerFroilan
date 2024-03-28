package FoodTest;
package com.zipcodewilmington.froilansfarm.crops.edibles;

import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.crops.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import jdk.jfr.snippets.Snippets;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TomatoTest
{
    @Test
    public void isInstanceOfTest()
    {
        Tomato tomato = new Tomato();
        assertTrue(tomato instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person();
        Tomato tomato = new Tomato();
        Storage storage = new Storage();

        //When
        storage.add(tomato, 1);
        person.eat(tomato);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEaten()
    {

    }
//    public void testEatenInitialized()
//    {
//        Tomato tomato = new Tomato();
//        assertFalse(tomato.isEaten(), "The 'eaten' should be initialized as false.");
//    }
//
//    @Test
//    public void testSetEatenProperty()
//    {
//        Tomato tomato = new Tomato();
//        tomato.setEaten(true);
//        assertTrue(tomato.isEaten(), "The 'eaten' should be initialized as true.");
//    }
//
//    @Test
//    public void testEatenProperty()
//    {
//        Tomato tomato = new Tomato();
//        assertFalse(tomato.isEaten(), "The 'eaten' should be initialized as false.");
//    }
}
