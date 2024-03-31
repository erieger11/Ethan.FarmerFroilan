package CropTest;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void testInheritance(){
        Crop crop = new Crop();
        Assert.assertTrue(crop instanceof Crop);
    }



    @Test
    public void testImplementation() {
        Crop crop= new Crop();
        Assert.assertTrue(crop instanceof Produce);}

        @Test
     public void testHasBeenFertilized(){
            CropDuster cropDuster = new CropDuster();
            CropRow cr = new CropRow(tomatoe, tomatoe, tomatoe);
            boolean result = cropDuster.hasBeenFertilized();
            Assert.assertTrue(hasBeenFertilized());
        }

        @Test
     public void testHasBeenHarvested(){
            Tractor tractor = new Tractor();
            CropRow cr = new CropRow(tomatoe, tomatoe, tomatoe);
            boolean result = tractor.hasBeenHarvested();
            Assert.assertTrue( hasBeenHarvested());
    }

        @Test
        public void testYield(){
       int  randomNumber = 7;
       int yield = 1*randomNumber;
       Assert.assertEquals(7, yield);
    }

        @Test
    public void testYield1(){
        CropRow<P> cr = new CropRow();
        if(cr.hasBeenFertilized = true && cr.hasBeenHarvested = false){
           Assert.assertEquals();
        }
        }


    @Test
    public void testYield2(){
        CropRow<P> cr = new CropRow();
        if(cr.hasBeenFertilized = false && cr.hasBeenHarvested = true){
            Assert.assertEquals();
        }
    }

    @Test
    public void testYield3(){
        CropRow<P> cr = new CropRow();

    }
}

















