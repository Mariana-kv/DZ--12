package test2;

import com.rd.mv.Person;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DataDrivenTest {

    @Test(groups= "testGetSetMan", dataProvider = "inputManDataFromClass", dataProviderClass = TestData.class)
    public void getAgeMan(String firstName, String lastName,
                          int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(age, 43);
    }

    @Test(groups= "testGetSetMan", dataProvider = "inputManDataFromClass", dataProviderClass = TestData.class)
    public void getFirstNameMan(String firstName, String lastName,
                                int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(firstName, "Nick");
    }

    @Test(groups= "testGetSetMan", dataProvider = "inputManDataFromClass", dataProviderClass = TestData.class)
    public void getLastName(String firstName, String lastName,
                            int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(lastName, "J");
    }

    @Test(dataProvider = "inputManDataFromClass", dataProviderClass = TestData.class)
    public void isRetiredMan(String firstName, String lastName,
                             int age, Person partner) throws
            InterruptedException {
        Assert.assertTrue(age>65, "Man is retired");
    }



    @Test(groups = "testGetSetWoman1", dataProvider = "inputWomanDataFromClass", dataProviderClass = TestData.class)
    public void getAgeWoman(String firstName, String lastName,
                          int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(age, 38);
    }

    @Test(groups = "testGetSetWoman1", dataProvider = "inputWomanDataFromClass", dataProviderClass = TestData.class)
    public void getFirstNameWoman(String firstName, String lastName,
                                int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(firstName, "Anna");
    }

    @Test(groups = "testGetSetWoman1", dataProvider = "inputWomanDataFromClass", dataProviderClass = TestData.class)
    public void getLastNameWoman(String firstName, String lastName,
                            int age, Person partner) throws
            InterruptedException {
        Assert.assertEquals(lastName, "W");
    }

    @Test(dataProvider = "inputWomanDataFromClass", dataProviderClass = TestData.class)
    public void isRetiredWoman(String firstName, String lastName,
                             int age, Person partner) throws
            InterruptedException {
        Assert.assertTrue(age>60, "Woman is retired");
    }

}