package Vehicles;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CropDusterTest
{
    CropDuster cropDuster;

    @Before
    public void setup(){
        cropDuster = new CropDuster();
    }
    @Test
    public void inheritanceTest(){
        Assert.assertTrue(cropDuster instanceof CropDuster);}
    @Test
    public void addPilotTest(){}
    @Test
    public void fly(){}
    @Test
    public void makeNoiseTest(){}
    @Test
    public void addRider(){}
    @Test
    public void removeRider(){}

}
