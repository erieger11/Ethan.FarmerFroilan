package Vehicles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class AircraftTest {
    Aircraft aircraft;

    @Before
    public void setup(){
        aircraft = new Aircraft();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(aircraft instanceof Vehicle);
    }
    @Test
    public void addPilotTest(){}
    @Test
    public void flyTest(){}
    @Test
    public void makeNoiseTest(){}
    @Test
    public void addRidertest(){}
    @Test
    public void removeRiderTest(){}
    @Test
    public void fertilizeTest(){}
}

