
package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.DragonfruitTree;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {


    @Test
    public void testInheritance(){
        TomatoPlant tomatoePlant  = new TomatoPlant();
        Assert.assertTrue(tomatoePlant instanceof Crop);
    }

    @Test
    public void testYield1(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }




    @Test
    public void testBeenHarvested() {
        Crop crop = new TomatoPlant();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tractor tractor = new Tractor();

        tractor.harvest(tomatoPlant);

        Assert.assertTrue(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new TomatoPlant();
        TomatoPlant tomatoPlant = new TomatoPlant();
        Tractor tractor = new Tractor();

        tractor.harvest(tomatoPlant);

        Assert.assertTrue(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new TomatoPlant();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(tomatoPlant.hasBeenFertilized());
    }

    @Test
    public void testBeenFertilized(){
        Crop crop = new TomatoPlant();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(tomatoPlant.hasBeenFertilized());
    }


//    @Test
//    public void testHarvest(){
//        Crop crop = new TomatoPlant();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new TomatoPlant();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new TomatoPlant();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new TomatoPlant();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//

//      @Test
//
//    public void TestYieldTomatoe() {
//         Tomatoe tomatoe  = new Tomatoe();
//         int yield = tomatoe.yieldTomatoe();
//         int expected = 30;
//         Assert.assertEquals(expected, yield);


}
