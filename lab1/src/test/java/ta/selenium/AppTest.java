package ta.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void SeleniumTestsFromMain()
    {
        App app = new App();
        assertEquals("Selenium Tests Passed!", app.seleniumTest());
    }

    @Test
    public void test0() {
        assertTrue(true);
    }

}