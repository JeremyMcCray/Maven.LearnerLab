package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    People testPeople = new People();
    Person testPerson = new Person(1,"how");

    @Test
    public void addTest(){
        testPeople.adder(testPerson);
        Assert.assertTrue(testPeople.contains(testPerson));

    }

    @Test
    public void addRemoveTest(){
        testPeople.adder(testPerson);
        testPeople.remover(testPerson);
        Assert.assertFalse(testPeople.contains(testPerson));

    }

    @Test
    public void testFindById(){
        testPeople.adder(testPerson);
        Person expected = testPerson;
       Person actual = testPeople.findByID(1);

       Assert.assertEquals(actual,expected);
    }
}
