package test2;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "inputManDataFromClass")
    public Object[][] testData() {
        return new Object[][]{
                {"Mark", "K", 55, null},
                {"John", "T", 43, null},
                {"Nick", "J", 18, null},
                {"Nick", "B", 66, null}
        };
    }

    @DataProvider(name = "inputWomanDataFromClass")
    public Object[][] testDataWoman() {
        return new Object[][]{
                {"Anna", "G", 55, null},
                {"Olha", "S", 24, null},
                {"Maria", "J", 70, null},
                {"Lana", "W", 38, null}
        };
    }
}


