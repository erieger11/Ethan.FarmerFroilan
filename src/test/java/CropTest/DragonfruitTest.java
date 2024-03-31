package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import org.junit.Assert;
import org.junit.Test;

public class DragonfruitTest {

    @Test
    public void testInheritance(){
        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit instanceof Crop);
    }
}
