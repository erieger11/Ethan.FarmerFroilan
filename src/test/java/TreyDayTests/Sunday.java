package TreyDayTests;
import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import org.junit.Assert;
import org.junit.Test;


// Froilan plants 3 type of crops in his first, second, and third crop row.

public class Sunday {

@Test
public void firstRowPlanted() {
  CropRow<Tomato> rowOne = new CropRow<Crop>();
  Farmer froilan = new Farmer();
  TomatoPlant tomatoPlant = new TomatoPlant();

  froilan.plant(rowOne, tomatoPlant);

  Assert.assertTrue(rowOne.contains(tomatoPlant));
}

@Test
public void secondRowPlanted() {
  CropRow<Dragonfruit> rowTwo = new CropRow<Crop>();
  Farmer froilan = new Farmer();
  DragonfruitPlant dragonfruitPlant = new DragonfruitPlant();

  froilan.plant(rowTwo, dragonfruitPlant);

  Assert.assertTrue(rowTwo.contains(dragonfruitPlant));
}

@Test
public void thirdRowPlanted() {
  CropRow<WatermelonVine> rowThree = new CropRow<Crop>();
  Farmer froilan = new Farmer();
  WatermelonVine watermelonPlant = new WatermelonVine();

  froilan.plant(rowThree, watermelonPlant);

  Assert.assertTrue(rowThree.contains(watermelonPlant));
}
}
// done

//trey