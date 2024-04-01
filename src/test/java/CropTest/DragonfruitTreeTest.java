package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.CornStalk;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.DragonfruitTree;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class DragonfruitTreeTest {



    @Test
    public void testInheritance(){
        DragonfruitTree dragonfruitTree = new DragonfruitTree();
        Assert.assertTrue(dragonfruitTree instanceof Crop);
    }

    @Test
    public void testYield1(){
        DragonfruitTree dragonfruitTree = new DragonfruitTree();
        dragonfruitTree.fertilize();
        Assert.assertTrue(dragonfruitTree.yield() instanceof Dragonfruit);
    }

    @Test
    public void testBeenHarvested() {
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        Tractor tractor = new Tractor();

        tractor.harvest(dragonFruitTree);

        Assert.assertTrue(dragonFruitTree.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        Tractor tractor = new Tractor();

        tractor.harvest(dragonFruitTree);

        Assert.assertTrue(dragonFruitTree.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        CropRow<DragonfruitTree> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(dragonFruitTree.hasBeenFertilized());
    }

    @Test
    public void testBeenFertilized(){
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        CropRow<DragonfruitTree> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(dragonFruitTree.hasBeenFertilized());
    }


//    @Test
//    public void testHarvest(){
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
}
