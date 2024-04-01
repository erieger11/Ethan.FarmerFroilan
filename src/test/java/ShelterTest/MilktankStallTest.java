package ShelterTest;
import com.zipcodewilmington.froilansfarm.Animals.Miltank;
import com.zipcodewilmington.froilansfarm.Storages.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class MilktankStallTest {

  @Test
  public void stallIsShelter() {
    Shelter<Miltank> stall = new Shelter();

    Assert.assertTrue(stall instanceof Shelter);
  }

  @Test
  public void addMilktank() {
    Shelter<Miltank> stall = new Shelter();
    Miltank b = new Miltank(null, null, null);

    stall.add(b);

    Integer expected = 1;
    Integer actual = stall.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeMilktank() {
    Shelter<Miltank> stall = new Shelter();
    Miltank bessie = new Miltank(null, null, null);
    Miltank cooper = new Miltank(null, null, null);

    stall.add(bessie);
    stall.add(cooper);
    stall.remove(cooper);

    Integer expected = 1;
    Integer actual = stall.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getMembers() {
    Shelter<Miltank> stall = new Shelter();
    Miltank bessie = new Miltank(null, null, null); // not sure if it's gonna print out with these values!

    String expected = "bessie";
    String actual = stall.toString();
  }
}

