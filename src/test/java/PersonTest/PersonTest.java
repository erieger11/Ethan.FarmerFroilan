package PersonTest;

import org.junit.Assert;
import org.junit.Test;
import sun.font.TrueTypeFont;

public class PersonTest {
    Person person = new Person();
    @Test
    public void testInheritance() {
        Person person = new Person();
        Assert.assertTrue(person instanceof Person);
        Assert.assertTrue(person instanceof Animal);
        Assert.assertTrue(person instanceof Pilot);
    }

    @Test
    public void addTest(){
        Person person = new Person("Dave");
        String expectedPerson = "Dave";

        person.add(person);
        String actualPerson = getName();

        Assert.assertTrue(expectedPerson, actualPerson);
    }
    @Test
    public void setNameTest(){
        Person person = new person("froilanda");
        String expectedName = "froilanda";

        person.add(person);
        person.setName("froilanda");
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getNameTest(){
        Person person = new person();
        String expectedName = "Froilan";

        person.setName("Froilan");
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void eatTest(){
        Person person = new person();

        person.eat();

        Assert.assertTrue(True);
    }




}
