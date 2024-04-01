package GenericsTest;
import com.zipcodewilmington.froilansfarm.Animals.Squirtle;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

   @Before
    public void testCropRow(){
        CropRow<Crop> croprow = new CropRow<Crop>();
        Assert.assertTrue(croprow instanceof Crop);
    }

    @Test
    public void testHasBeenPlanted(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        Farmer froilan = new Farmer();
        TomatoPlant tPlant = new TomatoPlant();

        froilan.plant(tPlant, rowOne);

        Assert.assertTrue(rowOne.hasBeenPlanted);
    }
//
//     @Test
//     public void testGetHowManyPlanted(){
//         CropRow<TomatoPlant> rowOne = new CropRow<>();
//         TomatoPlant tPlant = new TomatoPlant();
//         Farmer froilan = new Farmer();
//
//         froilan.plant(tPlant, rowOne);
//         froilan.plant(tPlant, rowOne);
//         froilan.plant(tPlant, rowOne);
//         froilan.plant(tPlant, rowOne);
//         froilan.plant(tPlant, rowOne);
//
//         Integer expected = 5;
//         Integer actual = rowOne.size();
//
//         Assert.assertEquals(actual, expected);
//     }

    @Test
    public void testBeenFertilized(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        //TomatoPlant tPlant = new TomatoPlant();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(rowOne.hasBeenFertilized());
    }

    @Test
    public void testAddCrop(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        Farmer froilan = new Farmer();
        TomatoPlant tPlant = new TomatoPlant();

        froilan.plant(tPlant, rowOne);

        Assert.assertTrue(rowOne.contains(tPlant));

    }

    @Test
    public void testBeenHarvested(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        TomatoPlant tPlant = new TomatoPlant();
        Tractor tractor = new Tractor();

        tractor.harvest(rowOne);

        Assert.assertTrue(rowOne.hasBeenHarvested());
    }


    @Test
    public void testWasWatered(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        TomatoPlant tPlant = new TomatoPlant();
        Squirtle squirtle = new Squirtle();

        squirtle.water(rowOne);

        Assert.assertTrue(rowOne.hasBeenWatered());
    }


    @Test
    public void testisRowEmpty(){
        CropRow<TomatoPlant> rowOne = new CropRow<>();
        TomatoPlant tPlant = new TomatoPlant();

        rowOne.clear();

        Assert.assertTrue(rowOne.isRowEmpty());
//Hello

    }

//     @Test
//    public void testAddCrop(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        TomatoPlant tomatoPlant = new TomatoPlant();
//        cropRow.addCrop(tomatoPlant);
//        int actual =  cropRow.getCropRowSize();
//        int expected = 1;
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testGetCropRowSize(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        TomatoPlant tomatoPlant = new TomatoPlant();
//        cropRow.addCrop(tomatoPlant);
//        int actual =  cropRow.getCropRowSize();
//        int expected = 1;
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testRowEmpty(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertTrue(cropRow.isRowEmpty());
//
//    }
//
//    @Test
//    public void testFertilize(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenFertilized());
//
//        cropRow.fertilizeRow();
//        Assert.assertTrue(cropRow.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenFertilized());
//
//        cropRow.fertilizeRow();
//        Assert.assertTrue(cropRow.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHarvestRow(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenHarvested());
//
//        cropRow.harvestRow();
//        Assert.assertTrue(cropRow.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenHarvested());
//
//        cropRow.harvestRow();
//        Assert.assertTrue(cropRow.hasBeenHarvested());
//    }
//
//    @Test
//    public void testWaterRow(){
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenWatered());
//
//        cropRow.waterRow();
//        Assert.assertTrue(cropRow.hasBeenWatered());
//    }
//
//
//    @Test
//    public void testHasBeenWatered() {
//        CropRow<TomatoPlant> cropRow = new CropRow<>();
//        Assert.assertFalse(cropRow.hasBeenWatered());
//
//        cropRow.waterRow();
//        Assert.assertTrue(cropRow.hasBeenWatered());
//    }
//

//    @Test
//    public void testYieldProduce() {
//        CropRow<TomatoPlant> cropRow1 = new CropRow<>();
//        TomatoPlant tomatoPlant = new TomatoPlant();
//        tomatoPlant.addCrop(tomatoPlant);
//        cropRow1.fertilizeRow();
//        Assert.assertTrue(cropRow1.yieldProduce() instanceof Tomato);
//
//    }
}