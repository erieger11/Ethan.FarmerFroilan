package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class TogeKissCoopTest {
  @Test
  public void coopIsShelter() {
    TogekissCoop coop = new TogekissCoop();

    Assert.assertTrue(coop instanceof Shelter);
  }

  @Test
  public void addTogekiss() {
    TogekissCoop coop = new TogekissCoop();
    Togekiss sora = new Togekiss();

    coop.add(sora);

    Integer expected = 1;
    Integer actual = coop.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeTogekiss() {
    TogekissCoop coop = new TogekissCoop();
    Togekiss sora = new Togekiss();
    Togekiss aerie = new Togekiss();

    coop.add(sora, aerie);
    coop.remove(aerie);

    Integer expected = 1;
    Integer actual = coop.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void onlyTogekiss() {
    TogekissCoop coop = new TogekissCoop();
    Togekiss sora = new Togekiss();
    Bulbasaur bulby = new Bulbasaur();

    coop.add(sora, bulby);

    Assert.assertThrows(new ClassCastException.class);
  }
}

