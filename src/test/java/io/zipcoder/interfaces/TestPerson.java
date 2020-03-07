package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {


    @Test
    public void personConstructorTest(){
        Person testPerson = new Person(1L,"Bob");

        String actualName = testPerson.getName();
        long actualId =  testPerson.getId();
        long expectedId = 1;
        String expectedName = "Bob";

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(actualName,expectedName);
    }
}
