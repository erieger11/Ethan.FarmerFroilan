package CropTest;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
     @Test

     @Test
     public void testInheritance(){
         Tomatoe tomatoe  = new Tomatoe();
         Assert.assertTrue(tomatoe instanceof Crop);
     }
//      @Test
//
//    public void TestYieldTomatoe() {
//         Tomatoe tomatoe  = new Tomatoe();
//         int yield = tomatoe.yieldTomatoe();
//         int expected = 30;
//         Assert.assertEquals(expected, yield);


      }







}
