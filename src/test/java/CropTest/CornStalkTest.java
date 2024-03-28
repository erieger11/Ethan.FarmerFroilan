package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test

    @Test
    public void testInheritance(){
        Corn corn = new Corn();
        Assert.assertTrue(corn instanceof Crop);
    }
}
