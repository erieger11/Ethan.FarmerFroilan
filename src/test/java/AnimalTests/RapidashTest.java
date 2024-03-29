package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Rapidash;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.Animals.Animal;

public class RapidashTest {
    @Test
    public void constructorTest() {
        String name = "Rapidash";
        String type = "Fire";
        Double id = 0.0078;

        Rapidash rapidash = new Rapidash(name, type, id);

        String retrievedName = rapidash.getName();
        String retrievedType = rapidash.getType();
        Double retrievedId = rapidash.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Rapidash rapidash = new Rapidash(null, null, null);
        String expected = "Rapidash";

        rapidash.setName(expected);
        String actual = rapidash.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Rapidash rapidash = new Rapidash(null, null, null);
        String expected = "Fire";

        rapidash.setType(expected);
        String actual = rapidash.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Rapidash rapidash = new Rapidash(null, null, null);
        Double expected = 0.0078;

        rapidash.setId(expected);
        Double actual = rapidash.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Rapidash rapidash = new Rapidash(null, null, null);
        Assert.assertTrue(rapidash instanceof Animal);
    }
    @Test
    public void makeNoiseTest() {
        Rapidash rapidash = new Rapidash(null, null, null);
        String expected = "NEIGHHHH!!!";
        String actual = rapidash.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfRideable() {
        Rapidash rapidash = new Rapidash(null, null, null);
        Assert.assertTrue(rapidash instanceof Rideable);
    }
}
