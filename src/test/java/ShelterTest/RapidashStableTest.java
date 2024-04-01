package ShelterTest;
import com.zipcodewilmington.froilansfarm.Animals.Rapidash;
import com.zipcodewilmington.froilansfarm.Storages.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class RapidashStableTest {
  @Test
  public void addRapidash() {
    Shelter<Rapidash> stable = new Shelter();
    Rapidash r = new Rapidash(null, null, null);

    stable.add(r);

    Integer actual = 1;
    Integer expected = stable.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeRapidash() {
    Shelter<Rapidash> stable = new Shelter();
    Rapidash r = new Rapidash(null, null, null);

    stable.add(r);
    stable.remove(r);

    Integer expected = 0;
    Integer actual = stable.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getMembers() {
    Shelter<Rapidash> stable = new Shelter();
    Rapidash r = new Rapidash(null, null, null);

    stable.add(r);

    String expected = "r";
    String actual = stable.toString();

    Assert.assertEquals(expected, actual);
  }
}