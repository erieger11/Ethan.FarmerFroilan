package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class SquirtlePondTest {

  @Test
  public void pondIsShelter() {
    SquirtlePond pond = new SquirtlePond();

    Assert.assertTrue(pond instanceof Shelter);
  }

  @Test
  public void addSquirtle() {
    SquirtlePond pond = new SquirtlePond();
    Squirtle bubbles = new Squirtle();

    pond.add(bubbles);

    Integer expected = 1;
    Integer actual = pond.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeSquirtle() {
    SquirtlePond pond = new SquirtlePond();
    Squirtle bubbles = new Squirtle();
    Squirtle nico = new Squirtle();

    pond.add(bubbles, nico);

    pond.remove(nico);

    Integer expected = 1;
    Integer actual = pond.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void onlySquirtle() {
    Squirtle pond = new SquirtlePond();
    Squirtle bubbles = new Squirtle();
    Milktank bessie = new Milktank();

    pond.add(bubbles, bessie);

    Assert.assertThrows(new ClassCastException.class);
  }
}
