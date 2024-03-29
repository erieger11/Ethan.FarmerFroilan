package Vehicle;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class FarmVehicleTest {
    FarmVehicle farmVehicle;
    Pilot pilot;

    @Before
    public void setup(){
        farmVehicle = new FarmVehicle();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(farmVehicle != null);
    }
    @Test
    public void makeNoiseTest(){
        farmVehicle.fly();
        String noise = farmVehicle.makeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRiderTest(){
        farmVehicle.addRider(pilot);
        Assert.assertTrue(farmVehicle.hasRidder());
    }
    @Test
    public void removeRiderTest(){
        farmVehicle.addRider(pilot);
        farmVehicle.removeRider();

        Assert.assertFalse(farmVehicle.haspilot);
    }
}
