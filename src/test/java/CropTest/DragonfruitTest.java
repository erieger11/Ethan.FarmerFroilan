package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class DragonfruitTest {

    @Test

    @Test
    public void testInheritance(){
        Dragonfruit dragonfruit = new Dragonfruit();
        Assert.assertTrue(dragonfruit instanceof Crop);
    }
}
