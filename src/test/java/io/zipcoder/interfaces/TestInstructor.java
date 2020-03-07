package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor test = new Instructor(33,"teacha");
    Student kid = new Student(12,"jimbo");
    Student kid2 = new Student(11,"tom");
    Student kid3 = new Student(10,"jambo");
    Student[] classOfKids = {kid,kid3,kid2};

    @Test
    public void testImplementation(){
        Assert.assertTrue(test instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(test instanceof Person);
    }

    @Test
    public void testTeach(){
        test.teach(kid,15);

        double expected = 15;
        double actual = kid.getTotalStudyTime();

        Assert.assertEquals(actual,expected,0.00);
    }

    @Test
    public void testLecture(){
        test.lecture(classOfKids,30);
        double kidOneExpected = 10;
        double kidTwoExpected = 10;
        double kidThreeExpected = 10;
        double kidOneActual = kid.totalStudyTime;
        double kidTwoActual = kid2.totalStudyTime;
        double kidThreeActual = kid2.totalStudyTime;
      Assert.assertEquals(kidOneActual,kidOneExpected,0.00);
      Assert.assertEquals(kidTwoActual,kidTwoExpected,0.00);
      Assert.assertEquals(kidThreeActual,kidThreeExpected,0.00);
    }
}
