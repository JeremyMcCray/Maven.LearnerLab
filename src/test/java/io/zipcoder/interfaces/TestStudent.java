package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student testStudent = new Student(2,"test");

    @Test
    public void testImplementation(){

        Assert.assertTrue(testStudent instanceof Learner);
    }
    @Test
    public void testInheritance(){

        Assert.assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn(){
        testStudent.learn(100);
        Double actual = testStudent.getTotalStudyTime();
        Double expected = 100.;
        Assert.assertEquals(actual,expected);
    }
}
