package ShelterTest;
import com.zipcodewilmington.froilansfarm.Animals.Charizard;
import com.zipcodewilmington.froilansfarm.Storages.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class CharizardCaveTest {
  @Test
  public void meadowIsShelter() {
    Shelter<Charizard> cave = new Shelter();

    Assert.assertTrue(cave instanceof Shelter);
  }
  @Test
  public void addCharizard() {
    Shelter<Charizard> cave = new Shelter();
    Charizard c = new Charizard(null, null, null);

    cave.add(c);

    Integer actual = 1;
    Integer expected = cave.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeCharizard() {
    Shelter<Charizard> cave = new Shelter();
    Charizard c = new Charizard(null, null, null);

    cave.add(c);
    cave.remove(c);

    Integer expected = 0;
    Integer actual = cave.size();

    Assert.assertEquals(expected, actual);
  }
  @Test
  public void getMembers() {
    Shelter<Charizard> cave = new Shelter();
    Charizard c = new Charizard(null, null, null);

    cave.add(c);

    String expected = "c";
    String actual = cave.toString();

    Assert.assertEquals(expected, actual);
  }
  }
