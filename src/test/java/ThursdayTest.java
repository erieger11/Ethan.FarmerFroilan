import com.zipcodewilmington.froilansfarm.Animals.Rapidash;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Food.Storage;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThursdayTest {
//    Every morning, Froilan and Froilanda begin their morning by
//
//    Riding each Horse in each Stable.
//    Feeding each Horse 3 ear of Corn.
//            For breakfast,
//    Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
//    Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.

    Person froilan;
    Person froilanda;
    EarCorn earCorn;
    Tomato tomato;
    RuffletEgg ruffletEgg;
    Animal charizad;
    Animal rapidash;


    @Before
    public void setup(){
        froilan = new Person();
        earCorn = new EarCorn();
        tomato = new Tomato();
        ruffletEgg = new RuffletEgg();
        charizad = new Charizad();
        rapidash = new Rapidash();

    }

    @Test
    public void testEatEggsFroilan(){
        Farmer froilan = new Farmer();
        RuffletEgg ruffletEgg = new RuffletEgg();
        froilan.eat(ruffletEgg, 5);

        int expectedEggsEaten = 5;
        boolean expectedIsFed = true;

        int actualEggsEaten = froilan.eggsEaten();
        boolean actualIsFed = froilan.isFed();

        Assert.assertEquals(expectedEggsEaten, actualEggsEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }
    @Test
    public void testEatEggsFroilanda(){
        Pilot froilanda = new Pilot();
        RuffletEgg ruffletEgg = new RuffletEgg();
        froilanda.eat(ruffletEgg, 2);

        int expectedEggsEaten = 2;
        boolean expectedIsFed = true;

        int actualEggsEaten = froilanda.eggsEaten();
        boolean actualIsFed = froilanda.isFed();

        Assert.assertEquals(expectedEggsEaten, actualEggsEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }

    @Test
    public void testFroilanEatTomato(){
        Farmer froilan = new Farmer();
        Tomato tomato = new Tomato();
        froilan.eat(tomato, 2);

        int expectedTomatoesEaten = 2;
        boolean expectedIsFed = true;

        int actualTomatoesEaten = froilan.tomatoesEaten();
        boolean actualIsFed = froilan.isFed();

        Assert.assertEquals(expectedTomatoesEaten, actualTomatoesEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }



    @Test
    public void testFroilandaEatTomato(){
        Pilot froilanda = new Pilot();
        Tomato tomato = new Tomato();
        froilanda.eat(tomato, 2);

        int expectedTomatoesEaten = 2;
        boolean expectedIsFed = true;

        int actualTomatoesEaten = froilanda.tomatoesEaten();
        boolean actualIsFed = froilanda.isFed();

        Assert.assertEquals(expectedTomatoesEaten, actualTomatoesEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }

    @Test
    public void testFroilanEatEarCorn(){
        Farmer froilan = new Farmer();
        EarCorn earCorn = new EarCorn();
        froilan.eat(earCorn, 1);

        int expectedEarcornsEaten = 1;
        boolean expectedIsFed = true;

        int actualTEarCornsEaten = froilan.earCornsEaten();
        boolean actualIsFed = froilan.isFed();

        Assert.assertEquals(expectedEarCornsEaten, actualEarCornsEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }


    @Test
    public void testFroilandaEatEarCorn(){
        Pilot froilanda = new Pilot();
        EarCorn earCorn = new EarCorn();
        froilanda.eat(earCorn, 2);

        int expectedEarcornsEaten = 2;
        boolean expectedIsFed = true;

        int actualTEarCornsEaten = froilanda.earCornsEaten();
        boolean actualIsFed = froilanda.isFed();

        Assert.assertEquals(expectedEarCornsEaten, actualEarCornsEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }



    @Test
    public void testRidingHorse(){
        Farmer froilan = new Farmer();
        Animal charizad = new Animal();
        froilan.ride(charizad);

        boolean expectedHasBeenRidden = true;

        boolean actualHasBeenRidden = charizad.hasBeenRidden();

        Assert.assertEquals(expectedHasBeenRidden, actualHasBeenRidden);
    }



    @Test
    public void testFeedingHorse(){
        Farmer froilan = new Farmer();
        Animal rapidash = new Animal();
        froilan.feed(rapidash, earCorn, 3);

        int expectedEarcornsEaten = 3;
        boolean expectedIsFed = true;

        int actualTEarCornsEaten = rapidash.earCornsEaten();
        boolean actualIsFed = rapidash.isFed();

        Assert.assertEquals(expectedEarCornsEaten, actualEarCornsEaten);
        Assert.assertEquals(expectedIsFed, actualIsFed);

    }

}