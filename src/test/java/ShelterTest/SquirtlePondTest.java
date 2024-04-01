package ShelterTest;
import com.zipcodewilmington.froilansfarm.Animals.Squirtle;
import com.zipcodewilmington.froilansfarm.Storages.Shelter;
import org.junit.Assert;
import org.junit.Test;

  public class SquirtlePondTest {

    @Test
    public void pondIsShelter() {
      Shelter<Squirtle> pond = new Shelter();

      Assert.assertTrue(pond instanceof Shelter);
    }

    @Test
    public void addBulbasaur() {
      Shelter<Squirtle> pond = new Shelter();
      Squirtle s = new Squirtle(null, null, null);

      pond.add(s);

      Integer actual = 1;
      Integer expected = pond.size();

      Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeBulbasaur() {
      Shelter<Squirtle> pond = new Shelter();
      Squirtle s = new Squirtle(null, null, null);

      pond.add(s);
      pond.remove(s);

      Integer expected = 0;
      Integer actual = pond.size();

      Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMembers() {
      Shelter<Squirtle> pond = new Shelter();
      Squirtle s = new Squirtle(null, null, null);

      pond.add(s);
      String expected = "s";
      String actual = pond.toString();

      Assert.assertEquals(expected, actual);
    }
  }