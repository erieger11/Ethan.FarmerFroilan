package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Zapdos;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.Animals.Animal;


public class ZapdosTest {
    @Test
    public void constructorTest() {
        String name = "Rufflet";
        String type = "Electric";
        Double id = 0.0145;

        Zapdos zapdos = new Zapdos(name, type, id);

        String retrievedName = zapdos.getName();
        String retrievedType = zapdos.getType();
        Double retrievedId = zapdos.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Zapdos zapdos = new Zapdos(null, null, null);
        String expected = "Zapdos";

        zapdos.setName(expected);
        String actual = zapdos.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Zapdos zapdos = new Zapdos(null, null, null);
        String expected = "Electric";

        zapdos.setType(expected);
        String actual = zapdos.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Zapdos zapdos = new Zapdos(null, null, null);
        Double expected = 0.0145;

        zapdos.setId(expected);
        Double actual = zapdos.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Zapdos zapdos = new Zapdos(null, null, null);
        Assert.assertTrue(zapdos instanceof Animal);
    }
    @Test
    public void testInstanceOfBotanist() {
        Zapdos zapdos = new Zapdos(null, null, null);
        Assert.assertTrue(zapdos instanceof Botanist);
    }
    @Test
    public void makeNoiseTest() {
        Zapdos zapdos = new Zapdos(null, null, null);
        String expected = "zap-zap!!!";
        String actual = zapdos.makeNoise();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void zapdosEventTest1() {
        Field field = new Field;
        Zapdos zapdos = new Zapdos(null, null, null);
        stormChance = 3
        if(stormChance =< 7){
            thunderStormEvent();
        }
        Assert.assertTrue(field.beenWatered());
    }
    @Test
    public void thunderStormEventTest(){
        Field field = new Field;
        Assert.assertTrue(field.beenWatered());
    }
}
