package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Squirtle;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.Animals.Animal;


public class SquirtleTest {
    @Test
    public void constructorTest() {
        String name = "Squirtle";
        String type = "Water";
        Double id = 0.0007;

        Squirtle squirtle = new Squirtle(name, type, id);

        String retrievedName = squirtle.getName();
        String retrievedType = squirtle.getType();
        Double retrievedId = squirtle.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Squirtle squirtle = new Squirtle(null, null, null);
        String expected = "Squirtle";

        squirtle.setName(expected);
        String actual = squirtle.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Squirtle squirtle = new Squirtle(null, null, null);
        String expected = "Water";

        squirtle.setType(expected);
        String actual = squirtle.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Squirtle squirtle = new Squirtle(null, null, null);
        Double expected = 0.0007;

        squirtle.setId(expected);
        Double actual = squirtle.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Squirtle squirtle = new Squirtle(null, null, null);
        Assert.assertTrue(squirtle instanceof Animal);
    }
    @Test
    public void makeNoiseTest() {
        Squirtle squirtle = new Squirtle(null, null, null);
        String expected = "SQUIRTLEEEEE!!!";
        String actual = squirtle.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void waterCropRowTest() {
        Squirtle squirtle = new Squirtle(null, null, null);
        CropRow<Crop> cr =  new CropRow<Crop>();
        squirtle.waterCrops(cr);
        Assert.assertTrue(cr.hasBeenWatered);
    }
}
