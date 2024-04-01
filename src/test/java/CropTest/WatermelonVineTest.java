package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.WatermelonVine;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class WatermelonVineTest {


    @Test
    public void testInheritance(){
        WatermelonVine watermelonVine = new WatermelonVine();
        Assert.assertTrue(true);
    }

    @Test
    public void testYield1(){
        WatermelonVine watermelonVine = new WatermelonVine();
        watermelonVine.fertilize();
        Assert.assertTrue(watermelonVine.yield() instanceof Watermelon);
    }

    @Test
    public void testBeenHarvested() {
        Crop crop = new WatermelonVine();
        WatermelonVine watermelonVine = new WatermelonVine();
        Tractor tractor = new Tractor();

        tractor.harvest(watermelonVine);

        Assert.assertTrue(watermelonVine.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new WatermelonVine();
        WatermelonVine watermelonVine = new WatermelonVine();
        Tractor tractor = new Tractor();

        tractor.harvest(watermelonVine);

        Assert.assertTrue(watermelonVine.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new WatermelonVine();
        WatermelonVine watermelonVine = new WatermelonVine();
        CropRow<Watermelon> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(watermelonVine.hasBeenFertilized());
    }

    @Test
    public void testBeenFertilized(){
        Crop crop = new WatermelonVine();
        WatermelonVine watermelonVine = new WatermelonVine();
        CropRow<Watermelon> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(watermelonVine.hasBeenFertilized());
    }


//    @Test
//    public void testHarvest(){
//        Crop crop = new WatermelonVine();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new WatermelonVine();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new WatermelonVine();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new WatermelonVine();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//





}