package PersonTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.font.TrueTypeFont;

public class PersonTest {
    Person person;
    @Before
    public void setup(){
        person = new Person();
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(person instanceof Person);
        Assert.assertTrue(person instanceof Animal);
        Assert.assertTrue(person instanceof Pilot);
    }

    @Test
    public void addTest(){
        String expectedPerson = "Dave";
        person.add(person);
        String actualPerson = getName();

        Assert.assertTrue(expectedPerson, actualPerson);
    }
    @Test
    public void setNameTest(){;
        String expectedName = "froilanda";
        person.add(person);
        person.setName("froilanda");
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getNameTest(){
        String expectedName = "Froilan";
        person.setName("Froilan");
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void eatTest(){
        person.add("Frances");
        person.eat();

        Assert.assertTrue(person.eat());
    }




}
