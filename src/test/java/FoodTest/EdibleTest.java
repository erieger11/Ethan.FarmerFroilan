package FoodTest;
import org.junit.Assert;
import org.junit.Test;

public class EdibleTest
{
    @Test
    public void eatTest()
    {
        //Given
        Storage storage = new Storage();
        Farmer froilan = new Farmer();

        //When
        Storage.put(tomato,3);
        froilan.eat(tomato,3);
        Integer expected = 0;
        Integer actual = storage.get(tomato);
        Assert.assertEquals(expected,actual);
    }
}
