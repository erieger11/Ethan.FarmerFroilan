package Vehicles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class FarmVehicleTest {
    FarmVehicle farmVehicle;

    @Before
    public void setup(){
        farmVehicle = new FarmVehicle();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(farmVehicle instanceof FarmVehicle);
    }
    @Test
    public void makeNoiseTest(){}
    @Test
    public void addRiderTest(){}
    @Test
    public void removeRiderTest(){}
}
