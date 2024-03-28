package AnimalTests;
import org.junit.Assert;
import org.junit.Test;

public class TogeKissTest {
    @Test
    public void constructorTest() {
        String name = "Rufflet";
        String type = "Fairy";
        Double id = 0.0468;

        Togekiss togekiss = new Togekiss(name, type, id);

        String retrievedName = togekiss.getName();
        String retrievedType = togekiss.getType();
        Double retrievedId = togekiss.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Togekiss togekiss = new Togekiss(null, null, null);
        String expected = "Rufflet";

        togekiss.setName(expected);
        String actual = togekiss.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Togekiss togekiss = new Togekiss(null, null, null);
        String expected = "Fairy";

        togekiss.setType(expected);
        String actual = togekiss.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Togekiss togekiss = new Togekiss(null, null, null);
        Double expected = 0.0468;

        togekiss.setId(expected);
        String actual = togekiss.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Togekiss togekiss = new Togekiss(null, null, null);
        Assert.assertTrue(togekiss instanceof Animal);
    }
    @Test
    public void testInstanceOfProduce() {
        Togekiss togekiss = new Togekiss(null, null, null);
        Assert.assertTrue(togekiss instanceof Produce);
    }
    @Test
    public void makeNoiseTest() {
        Togekiss togekiss = new Togekiss(null, null, null);
        String expected = "toge!!!";
        String actual = togekiss.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void togepiEggTest() {
        if(hasBeenFertilized) {
            TogekissEgg togepi = new TogekissEgg();
        }
    }
}
