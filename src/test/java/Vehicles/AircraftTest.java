package Vehicles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class AircraftTest {
    Aircraft aircraft;
    Pilot pilot;
    CropRow cropRow;

    @Before
    public void setup(){
        aircraft = new Aircraft();
        pilot = new Pilot();
        cropRow = new Croprow();
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(aircraft instanceof Vehicle);
    }
    @Test
    public void addPilotTest(){
        airCraft.addPilot(pilot);

        Assert.assertTrue(airCraft.hasBeenRidden());
    }
    @Test
    public void flyTest(){
        aircraft.fly();
        String noise = aircraft.makeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void makeNoiseTest(){
        aircraft.fly();
        String noise = aircraft.makeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRiderTest(){
        aircraft.addRider(pilot);

        Assert.assertTrue(aircraft.hasRidder());
    }
    @Test
    public void removeRiderTest(){
        aircraft.addRider(pilot);
        aircraft.removeRider();

        Assert.assertFalse(aircraft.haspilot);
    }
    @Test
    public void fertilizeTest(){
        aircraft.addRider(pilot);
        aircraft.fertilize(cropRow);

        Assert.assertTrue(cropRow.beenFertalized());
    }
}

