package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class RuffletNestTest {

  @Test
  public void nestIsShelter() {
    RuffletNest nest = new RuffletNest();

    Assert.assertTrue(nest instanceof Shelter);
  }

  @Test
  public void addRufflet() {
    RuffletNest nest = new RuffletNest();
    Rufflet birdo = new Rufflet();

    nest.add(birdo);

    Integer expected = 1;
    Integer actual = nest.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeTogekiss() {
    RuffletNest nest = new RuffletNest();
    Rufflet birdo = new Rufflet();
    Togekiss aerie = new Togekiss();

    nest.add(birdo, aerie);
    nest.remove(aerie);

    Integer expected = 1;
    Integer actual = nest.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void onlyTogekiss() {
    RuffletNest nest = new RuffletNest();
    Rufflet birdo = new Rufflet();
    Bulbasaur bulby = new Bulbasaur();

    nest.add(birdo, bulby);

    Assert.assertThrows(new ClassCastException. class);
  }
}