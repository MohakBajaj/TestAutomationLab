package lab.ta;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {

    private WebDriver driver;
    private String baseUrl = "file:///D:/Programming/Labs/TestAutomation/webpages/lab6.html";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Programming\\Labs\\TestAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "user1", "password1", "Login successful" },
                { "user1", "wrongpassword", "Incorrect password" },
                { "nonexistentuser", "password", "User does not exist" }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedMessage) {
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        submitButton.click();

        WebElement messageElement = driver.findElement(By.id("message"));
        Assert.assertEquals(messageElement.getText(), expectedMessage);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
