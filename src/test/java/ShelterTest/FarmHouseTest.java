package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {
  @Test
  public void farmHouseisShelter() {
    FarmHouse farmhouse = new FarmHouse();

    Assert.assertTrue(farmhouse instanceof Shelter);
  }

  @Test
  public void addBulbasaur() {
    FarmHouse farmhouse = new FarmHouse();
    Person froilan = new Person();

    farmhouse.add(froilan);

    Integer actual = 1;
    Integer expected = froilan.size();

    Assert.assertEquals(expected, actual);
  }


  @Test
  public void removeBulbasaur() {
    FarmHouse farmhouse = new FarmHouse();
    Person froilan = new Person();
    Person froilanda = new Person();

    farmhouse.add(froilan, froilanda);
    froilan.remove(froilanda);

    Integer expected = 1;
    Integer actual = farmhouse.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void bulbasaursOnly() {
    FarmHouse farmhouse = new FarmHouse();
    Person froilan = new Person();
    Charizard draco = new Charizard();

    farmhouse.add(froilan, draco);

    Assert.assertThrows(new ClassCastException.class); // something like that. might have to make this expected
  }

}
