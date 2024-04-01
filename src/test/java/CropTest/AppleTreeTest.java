package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.AppleTree;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {


    @Test
    public void testInheritance(){
        AppleTree appleTree = new AppleTree();
        Assert.assertTrue(appleTree instanceof Crop);
    }
    @Test
    public void testYield1(){
        AppleTree appleTree = new AppleTree();
        appleTree.fertilize();
        Assert.assertTrue(appleTree.yield() != null);
    }


    @Test
    public void testBeenHarvested() {
        Crop crop = new AppleTree();
        AppleTree appleTree = new AppleTree();
        Tractor tractor = new Tractor();

        tractor.harvest(appleTree);

        Assert.assertTrue(appleTree.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new AppleTree();
        AppleTree appleTree = new AppleTree();
        Tractor tractor = new Tractor();

        tractor.harvest(appleTree);

        Assert.assertTrue(appleTree.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new AppleTree();
        AppleTree appleTree = new AppleTree();
        CropRow<AppleTree> rowOne = new CropRow<AppleTree>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(appleTree.hasBeenFertilized());
    }
    @Test
    public void testBeenFertilized(){
        Crop crop = new AppleTree();
        AppleTree appleTree = new AppleTree();
        CropRow<AppleTree> rowOne = new CropRow<AppleTree>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(appleTree.hasBeenFertilized());
    }




//        Test
//        public void testHarvest(){
//            Crop crop = new AppleTree();
//            Assert.assertFalse(crop.hasBeenHarvested());
//
//            crop.harvest();
//            Assert.assertTrue(crop.hasBeenHarvested());
//        }
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new AppleTree();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new AppleTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new AppleTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }

}