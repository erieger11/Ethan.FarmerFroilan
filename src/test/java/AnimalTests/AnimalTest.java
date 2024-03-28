package AnimalTests;
import org.junit.Assert;
import org.junit.Test;
public class AnimalTest {

    @Test
    public void testInstanceOfEater() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Assert.assertTrue(bulbasaur instanceof Eater);
    }
    @Test
    public void testInstanceOfNoiseMaker() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Assert.assertTrue(bulbasaur instanceof NoiseMaker);
    }
}
