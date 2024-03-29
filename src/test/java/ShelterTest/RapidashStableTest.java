package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class RapidashStableTest {
  @Test
  public void stableIsShelter() {
    RapidashStable stable = new RapidashStable();

    Assert.assertTrue(stable instanceof Shelter);
  }

  @Test
  public void addRapidash() {
    RapidashStable stable = new RapidashStable();
    Rapidash skipper = new Rapidash();

    stable.add(skipper);

    Integer expected = 1;
    Integer actual = nest.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeTogekiss() {
    RapidashStable stable = new RapidashStable();
    Rapidash blitz = new Rapidash();
    Rapidash skipper = new Rapidash();

    stable.add(blitz, skipper);
    stable.remove(blitz);

    Integer expected = 1;
    Integer actual = stable.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void onlyTogekiss() {
    RapidashStable stable = new RapidashStable();
    Rapidash blitz = new Rapidash();
    Bulbasaur bulby = new Bulbasaur();

    stable.add(blitz, bulby);

    Assert.assertThrows(new ClassCastException class);
  }
}
