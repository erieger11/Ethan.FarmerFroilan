package PersonTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class PilotTest {
    Rider rider;
    Pilot pilot;
    CropDuster cropDuster;
    CropRow cropRow;

    @Before
    public void setup(){
        rider = new Rider();
        pilot = new Pilot();
        cropDuster = new CropDuster();
        cropRow = new CropRow();
    }

    @Test
    public void inheritsRiderTest(){
        Assert.assertTrue(rider instanceof Rider);
    }

    @Test
    public void makeNoiseTest(){
        String noise = pilot.makeNoise();

        Assert.assertEquals("Weee!", noise);
    }
    @Test
    public void addRiderTest(){
        cropDuster.addRider(pilot);

        Assert.assertTrue(cropDuster.hasPilot);
    }
    @Test
    public void removeRiderTest(){
        cropDuster.addRider(pilot);
        cropDuster.removeRider();

        Assert.assertFalse(cropDuster.hasPilot);
    }
    @Test
    public void fertilizeTest(){
        cropDuster.addRider(pilot);
        cropDuster.fertilize(cropRow);

        Assert.assertTrue(cropRow.beenFertalized());

    }
    @Test
    public void mountTest(){
        cropDuster.addRider(pilot);
        cropDuster.hasBeenRidden();

        Assert.assertTrue(cropDuster.hasBeenRidden());
    }

}
