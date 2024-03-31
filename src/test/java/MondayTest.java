import org.junit.Assert;
import org.junit.Test;

public class MondayTest
{
    @Test
    public void testCropDusterRemoveFromList(){
        setup();
    }
    @Test
    public void testCropDusterFly(){
        //setup();
        Boolean actual = CropDuster.fly(field);
        Assert.assertTrue(actual);
    }
    @Test
    public void testCropDusterFertilize(){
        //setup();
        Boolean actual = CropDuster.fertilize(CropRow1);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCropRow1Fertilize(){
        //setup();
        Boolean actual = CropRow1.get(EarCorn).hasBeenFertilized;
        Assert.assertTrue(actual);
    }
    @Test
    public void testCropRow2Fertilize(){
        //setup();
        Boolean actual = CropRow1.get(Tomato).hasBeenFertilized;
        Assert.assertTrue(actual);
    }
}

