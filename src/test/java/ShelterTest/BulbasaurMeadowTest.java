package ShelterTest;

import com.zipcodewilmington.froilansfarm.Animals.Bulbasaur;
import com.zipcodewilmington.froilansfarm.Animals.Charizard;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BulbasaurMeadowTest {

  @Test
  public void meadowIsShelter() {
    Shelter<Bulbasaur> meadow = new Shelter();

    Assert.assertTrue(meadow instanceof Shelter);
  }

  @Test
  public void addBulbasaur() {
    Shelter<Bulbasaur> meadow = new Shelter();
    Bulbasaur b = new Bulbasaur(null, null, null);

    meadow.add(b);

    Integer actual = 1;
    Integer expected = meadow.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeBulbasaur() {
    Shelter<Bulbasaur> meadow = new Shelter();
    Bulbasaur b = new Bulbasaur(null, null, null);

    meadow.add(b);
    meadow.remove(b);

    Integer expected = 0;
    Integer actual = meadow.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getMembers() {
    Shelter<Bulbasaur> meadow = new Shelter();
    Bulbasaur b = new Bulbasaur(null, null, null); // not sure if it's gonna print out with these values!

    meadow.add(b);
    String expected = "b";
    String actual = meadow.toString();

    Assert.assertEquals(expected, actual);
    }
  }