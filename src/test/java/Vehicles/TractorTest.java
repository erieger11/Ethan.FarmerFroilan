package Vehicles;
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
    public void makeNoiseTest(){}
    @Test
    public void addRiderTest(){}
    @Test
    public void removeRiderTest(){}

}
