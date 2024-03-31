package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Bulbasaur;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Eater_Interface;
import com.zipcodewilmington.froilansfarm.TheInterfaces.NoiseMaker_Interface;
import org.junit.Assert;
import org.junit.Test;
public class AnimalTest {

    @Test
    public void testInstanceOfEater() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Assert.assertTrue(bulbasaur instanceof Eater_Interface);
    }
    @Test
    public void testInstanceOfNoiseMaker() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Assert.assertTrue(bulbasaur instanceof NoiseMaker_Interface);
    }
}
