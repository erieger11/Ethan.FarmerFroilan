
package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.AppleTree;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {



    @Test
    public void testInheritance(){
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cornStalk instanceof Crop);
    }

    @Test
    public void testBeenHarvested() {
        Crop crop = new CornStalk();
        CornStalk cornStalk = new CornStalk();
        Tractor tractor = new Tractor();

        tractor.harvest(cornStalk);

        Assert.assertTrue(cornStalk.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new CornStalk();
        CornStalk cornStalk = new CornStalk();
        Tractor tractor = new Tractor();

        tractor.harvest(cornStalk);

        Assert.assertTrue(cornStalk.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new CornStalk();
        CornStalk cornStalk = new CornStalk();
        CropRow<CornStalk> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(cornStalk.hasBeenFertilized());
    }
    @Test
    public void testBeenFertilized(){
        Crop crop = new CornStalk();
        CornStalk cornStalk = new CornStalk();
        CropRow<CornStalk> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(cornStalk.hasBeenFertilized());
    }


    @Test
    public void testYield1(){
        CornStalk cornStalk = new CornStalk();
        cornStalk.fertilize();
        Assert.assertTrue(cornStalk.yield() != null);
    }
//
//    @Test
//    public void testHarvest(){
//        Crop crop = new CornStalk();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new CornStalk();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new CornStalk();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new CornStalk();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }

}
