package ta.lab;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AppTest {
    // @DataProvider()
    // public Object[][] renumerationData() {
    // return new Object[][] {
    // {4000, 1000, 1000},
    // {6000, 1000, 1120},
    // {10000, 1000, 1600},
    // {0, 1000, 1000},
    // {5000, 1000,1000}
    // };
    // }
    // @Test(dataProvider = "renumerationData")
    // public void testCalculateRenumeration(double sales, double fixedSalary,
    // double expected) {
    // double actual = App.calculateRenumeration(sales, fixedSalary);
    // assertEquals(actual, expected, 0.01, "Expected " + expected + " but got " +
    // actual);
    // }

    @DataProvider()
    public Object[][] testData() {
        return new Object[][] {
                {
                        100, 2000, 300, 73.5
                },
                {
                        5000, 5000, 2875, 2000
                },
                {
                        1000, 2000, 575, 735
                },
                {
                        2000, 2475, 1150, 1470
                }
        };
    }

    @Test(dataProvider = "testData")
    public void test(int BP, double CL, double TA, double MA) {
        Allowance app = new Allowance();
        double actualCL = app.calcCL(BP);
        double actualTA = app.calcTA(BP);
        double actualMA = app.calcMA(BP);
        assertEquals(actualCL, CL);
        assertEquals(actualMA, MA);
        assertEquals(actualTA, TA);
    }

}
