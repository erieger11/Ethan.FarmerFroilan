package ShelterTest;
import org.junit.Assert;
import org.junit.Test;

public class MilktankStallTest {

  @Test
  public void stallIsShelter() {
    MilktankStall stall = new MilktankStall();

    Assert.assertTrue(stall instanceof Shelter);
  }

  @Test
  public void addMilktank() {
    MilktankStall stall = new MilktankStall();
    Milktank bessie = new Milktank();

    stall.add(bessie);

    Integer expected = 1;
    Integer actual = stall.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void removeMilktank() {
    MilktankStall stall = new MilktankStall();
    Milktank bessie = new Milktank();
    Milktank cooper = new Milktank();

    stall.add(bessie, cooper);
    stall.remove(cooper);

    Integer expected = 1;
    Integer actual = stall.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void onlyMilktank() {
    MilktankStall stall = new MilktankStall();
    Milktank bessie = new Milktank();
    Squirtle bubbles = new Squirtle();

    stall.add(bessie, bubbles);

    Assert.assertThrows(new ClassCastException.class);
  }
}
