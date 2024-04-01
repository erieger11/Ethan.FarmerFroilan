package ShelterTest;
import com.zipcodewilmington.froilansfarm.Animals.Togekiss;
import com.zipcodewilmington.froilansfarm.Storages.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class TogeKissCoopTest {

  @Test
  public void coopIsShelter() {
    Shelter<Togekiss> coop = new Shelter();

    Assert.assertTrue(coop instanceof Shelter);
  }

  @Test
  public void addTogekiss() {
    Shelter<Togekiss> coop = new Shelter();
    Togekiss s = new Togekiss(null, null, null);

    coop.add(s);

    Integer actual = 1;
    Integer expected = coop.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeTogekiss() {
    Shelter<Togekiss> coop = new Shelter();
    Togekiss s = new Togekiss(null, null, null);

    coop.add(s);
    coop.remove(s);

    Integer actual = 0;
    Integer expected = coop.size();


    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getMembers() {
    Shelter<Togekiss> coop = new Shelter();
    Togekiss s = new Togekiss(null, null, null);

    coop.add(s);

    String expected = "s";
    String actual = coop.toString();

    Assert.assertEquals(expected, actual);
  }
}