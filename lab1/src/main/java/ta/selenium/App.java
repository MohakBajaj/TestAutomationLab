package ta.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Programming\\Labs\\TestAutomation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/webpages/lab1.html");

        // check all the test cases
        // check for 0
        driver.findElement(By.id("numberInput")).sendKeys("0");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Invalid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        // check for 1
        driver.findElement(By.id("numberInput")).sendKeys("1");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Valid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        // check for 2
        driver.findElement(By.id("numberInput")).sendKeys("2");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Valid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        // check for 19
        driver.findElement(By.id("numberInput")).sendKeys("19");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Valid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        // check for 20
        driver.findElement(By.id("numberInput")).sendKeys("20");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Valid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        // check for 21
        driver.findElement(By.id("numberInput")).sendKeys("21");
        driver.findElement(By.id("submit")).click();
        if (!driver.findElement(By.id("result")).getText().equals("Invalid")) {
            System.out.println("Test failed");
        }
        driver.findElement(By.id("numberInput")).clear();

        driver.quit();
    }
}
