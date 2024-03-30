package Vehicle;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {
    Tractor tractor;
    CropRow cropRow;
    Pilot pilot;
    @Before
    public void setup(){
        tractor = new Tractor();
        cropRow = new CropRow();
        pilot = new Pilot();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(tractor != null);
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
