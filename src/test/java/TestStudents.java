import io.zipcoder.interfaces.People;
import io.zipcoder.interfaces.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    Students test;
    People peopleList = new People();

    @Test
    public void test(){
        test.getINSTANCE();

        peopleList.adder(test.findByID(0));

       Assert.assertTrue( test.contains(test.findByID(0)));
    }
}
