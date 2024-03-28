package PersonTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class PilotTest {
    Rider rider = new Rider;

    @Before
    public void setup(){
        rider = new Rider();
    }

    @Test
    public void inheritsRiderTest(){
        Assert.assertTrue(rider instanceof Rider);
    }

    @Test
    public void harvestTest(){
        crop.harvest();
        Assert.assertTrue();
    }
    @Test
    public void makeNoiseTest(){}
    @Test
    public void addRiderTest(){
        Person.add(Rider);
    }
    @Test
    public void removeRiderTest(){}
    @Test
    public void fertilizeTest(){}
    @Test
    public void mountTest(){}
    @Test
    public void hasRiddenTest(){}
}
