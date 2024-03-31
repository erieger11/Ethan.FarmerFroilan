package ShelterTest;

import com.zipcodewilmington.froilansfarm.Animals.Bulbasaur;
import com.zipcodewilmington.froilansfarm.Animals.Rufflet;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class RuffletNestTest {

  @Test
  public void meadowIsShelter() {
    Shelter<Rufflet> nest = new Shelter();

    Assert.assertTrue(nest instanceof Shelter);
  }

  @Test
  public void addBulbasaur() {
    Shelter<Rufflet> nest = new Shelter();;
    Rufflet r = new Rufflet(null, null, null);

    nest.add(r);

    Integer actual = 1;
    Integer expected = nest.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeBulbasaur() {
    Shelter<Rufflet> nest = new Shelter();;
    Rufflet r = new Rufflet(null, null, null);

    nest.add(r);
    nest.remove(r);

    Integer expected = 0;
    Integer actual = nest.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void getMembers() {
    Shelter<Rufflet> nest = new Shelter();;
    Rufflet r = new Rufflet(null, null, null);

    nest.add(r);

    String expected = "r";
    String actual = nest.toString();

    Assert.assertEquals(expected, actual);
  }
}