package Vehicles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CropDusterTest  {
    CropDuster cropDuster;
    Pilot pilot;

    @Before
    public void setup(){
        cropDuster = new CropDuster();
    }
    @Test
    public void inheritanceTest(){
        Assert.assertTrue(cropDuster instanceof CropDuster);}
    @Test
    public void addPilotTest(){
        cropDuster.addPilot(pilot);

        Assert.assertTrue(cropDuster.hasBeenRidden());
    }
    @Test
    public void fly(){
        cropDuster.fly();
        String noise = cropDuster.MakeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void makeNoiseTest(){
        cropDuster.fly();
        String noise = cropDuster.makeNoise();

        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRider(){
        cropDuster.addRider(pilot);

        Assert.assertTrue(cropDuster.hasRidder());
    }
    @Test
    public void removeRider(){
        cropDuster.addRider(pilot);
        cropDuster.fertilize(cropRow);

        Assert.assertTrue(cropDuster.beenFertalized());
    }
}
