package PersonTest;
import org.junit.Assert;

import org.junit.Test;

public class FarmerTest {
    @Test
    public void testInheritance() {
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Farmer);
    }
}
//