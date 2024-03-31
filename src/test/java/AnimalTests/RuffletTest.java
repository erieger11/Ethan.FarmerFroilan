package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Rufflet;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Produce_Interface;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.Animals.Animal;


public class RuffletTest {
    @Test
    public void constructorTest() {
        String name = "Rufflet";
        String type = "Normal";
        Double id = 0.0627;

        Rufflet rufflet = new Rufflet(name, type, id);

        String retrievedName = rufflet.getName();
        String retrievedType = rufflet.getType();
        Double retrievedId = rufflet.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Rufflet rufflet = new Rufflet(null, null, null);
        String expected = "Rufflet";

        rufflet.setName(expected);
        String actual = rufflet.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Rufflet rufflet = new Rufflet(null, null, null);
        String expected = "Normal";

        rufflet.setType(expected);
        String actual = rufflet.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Rufflet rufflet = new Rufflet(null, null, null);
        Double expected = 0.0627;

        rufflet.setId(expected);
        Double actual = rufflet.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Rufflet rufflet = new Rufflet(null, null, null);
        Assert.assertTrue(rufflet instanceof Animal);
    }
    @Test
    public void testInstanceOfProduce() {
        Rufflet rufflet = new Rufflet(null, null, null);
        Assert.assertTrue(rufflet instanceof Produce_Interface);
    }
    @Test
    public void makeNoiseTest() {
        Rufflet rufflet = new Rufflet(null, null, null);
        String expected = "rrrrrrruffleee!!!";
        String actual = rufflet.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ruffletEggTest() {
        if(hasBeenFertilized){
            RuffletEgg ruffletEgg = new RuffletEgg();
             }
        }
    }
