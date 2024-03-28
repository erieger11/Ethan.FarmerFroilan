package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class BulbasaurMeadowTest {

  @Test
  public void meadowIsShelter() {
    BulbasaurMeadow meadow = new BulbasaurMeadow();

    Assert.assertTrue(meadow instanceof Shelter);
  }

  @Test
  public void addBulbasaur() {
    BulbasaurMeadow meadow = new BulbasaurMeadow();
    Bulbasaur bulby = new Bulbasaur();

    meadow.add(bulby);

    Integer actual = 1;
    Integer expected = meadow.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeBulbasaur() {
    BulbasaurMeadow meadow = new BulbasaurMeadow();
    Bulbasaur bulby = new Bulbasaur();

    meadow.add(bulby);
    meadow.remove(bulby);

    Integer expected = 0;
    Integer actual = meadow.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void bulbasaursOnly() {
    BulbasaurMeadow meadow = new BulbasaurMeadow();
    Bulbasaur bulby = new Bulbasaur();
    Charizard draco = new Charizard();

    meadow.add(bulby, draco);

    Assert.assertThrows(new ClassCastException.class); // something like that. might have to make this expected
  }
  }