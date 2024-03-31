package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {


     @Test
     public void testInheritance(){
         Tomato tomato  = new Tomato();
         Assert.assertTrue(tomato instanceof Crop);
     }
//      @Test
//
//    public void TestYieldTomatoe() {
//         Tomatoe tomatoe  = new Tomatoe();
//         int yield = tomatoe.yieldTomatoe();
//         int expected = 30;
//         Assert.assertEquals(expected, yield);


}
