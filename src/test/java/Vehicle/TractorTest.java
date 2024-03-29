package Vehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {
    Tractor tractor = new Tractor;

    @Before
    public void setup(){
        tractor = new Tractor();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(tractor instanceof Tractor);
    }
    @Test
    public void harvestTest(){
        tractor.harvest();
        Assert.assertTrue(True);
    }
    @Test
    public void makeNoiseTest(){
        tractor.fly();
        String noise = tractor.makeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRiderTest(){
        tractor.addRider(pilot);
        tractor.removeRider();
        Assert.assertFalse(tractor.haspilot);
    }
    @Test
    public void removeRiderTest(){
        tractor.addRider(pilot);
        tractor.fertilize(cropRow);
        Assert.assertTrue(tractor.beenFertalized());
    }

}
