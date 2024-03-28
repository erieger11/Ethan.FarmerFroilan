package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class CharizardCaveTest {
  @Test
  public void caveIsShelter() {
    CharizardCave cave = new CharizardCave();

    Assert.assertTrue(cave instanceof Shelter);
  }

  @Test
  public void addCharizard() {
    CharizardCave cave = new CharizardCave();
    Charizard draco = new Charizard();

    cave.add(draco);

    Integer actual = 1;
    Integer expected = draco.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeCharizard() {
    CharizardCave cave = new CharizardCave();
    Charizard draco = new Charizard();

    cave.add(draco);
    cave.remove(draco);

    Integer expected = 0;
    Integer actual = meadow.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void charizardOnly() {
    CharizardCave cave = new CharizardCave();
    Bulbasaur bulby = new Bulbasaur();
    Charizard draco = new Charizard();

    cave.add(bulby, draco);

    Assert.assertThrows(new ClassCastException.class);
  }
}