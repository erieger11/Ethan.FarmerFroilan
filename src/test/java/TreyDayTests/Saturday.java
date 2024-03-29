package TreyDayTests;
import AnimalTests.RapidashTest;
import AnimalTests.SquirtleTest;
import PersonTest.FarmerTest;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;
// Froilan & Froilanda wake up and eat 2 Togekiss eggs and 1 watermelon. They then go out to catch Pokemon.
// Froilan catches a Squirtle. He puts the Squirtle in its shelter.
// Froilanda catches a Togekiss and a Bulbasaur. She puts them in their shelter.
// Froilan rides a Rapidash. Afterwards, it is hungry, so Froilan feeds it 2 Tomato.

public class Saturday {

  @Test
  public void eggsForBreakfastTest() {
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();

    froilan.eat(TogekissEgg, -2);
    froilanda.eat(TogekissEgg, -2);

    Integer expected = -4; // this is just a placeholder.
    Integer actual = storage.get(TogekissEgg); // this will return a value for Togekiss eggs

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void watermelonForBreakFastTest() {
    Farmer froilan = new Farmer();
    Pilot froilanda = new Pilot();

    froilan.eat(Watermelon, -1);
    froilanda.eat(Watermelon, -1);

    Integer expected = -2;
    Integer actual = storage.get(Watermelon);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void froilanCatchesSquirtle() {
    Squirtle wildSquirtle = new Squirtle();
    SquirtlePond pond = new SquirtlePond();

    pond.add(wildSquirtle);

    Assert.assertTrue(pond.contains(wildSquirtle));
  }

  @Test
  public void froilandaCatchesTogekissAndBulbasaur() {
    Togekiss wildTogekiss = new Togekiss();
    Bulbasaur wildBulbasaur = new Bulbasaur();

    TogekissCoop coop = new TogekissCoop();
    BulbasaurMeadow meadow = new BulbasaurMeadow();

    coop.add(wildTogekiss);
    meadow.add(wildBulbasaur);

    Assert.assertTrue(coop.contains(wildTogekiss) && meadow.contains(wildBulbasaur));
  }

  @Test
  public void froilanRidesRapidashTest() {
    Farmer froilan = new Farmer();
    Rapidash rapidash = new Rapidash();

    froilan.ride(rapidash);

    Assert.assertTrue(rapidash.hasBeenRidden);
  }

  @Test
  public void froilanFeedsRapidash() {
    Rapidash rapidash = new RapidashTest();

    rapidash.eat(Tomato, -1);

    Integer expected = -1;
    Integer actual = storage.get(Tomato);

    Assert.assertEquals(expected, actual);
  }
}
