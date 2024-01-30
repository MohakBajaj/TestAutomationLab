# Java Selenium with Maven 

## Get Started

### Step-1

Download the latest Chrome Driver.
[Here](https://chromedriver.chromium.org/downloads)

### Step-2 

Create a new Maven Project

```powershell
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app \
-DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 \
-DinteractiveMode=false
```

### Step-3 

Go to the POM.xml and get the following changes done.

```diff
 <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
-    <maven.compiler.source>1.7</maven.compiler.source>
-   <maven.compiler.target>1.7</maven.compiler.target>
+    <maven.compiler.source>1.8</maven.compiler.source>
+   <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
```

### Step-4

Add selenium as the dependency of the project

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>
```

### Step-5

Run Maven Goals: Clean, Install

```bash
mvn clean install
```

### And that's it your selenium setup is done. Now go to your App.java and start coding.

## Lab-1

### Create a HTML number input that takes input numbers from 1-20

```html
<!DOCTYPE html>
<html>
<head>
    <title>Number Form</title>
</head>
<body>
    <h1>Number Form</h1>
    <label for="numberInput">Enter a number between 1 and 20:</label>
    <input type="number" id="numberInput" name="numberInput" required>
    <button id="submit" type="submit" onclick="validateNumber()">Submit</button>
    <p id="result"></p>

    <script>
        function validateNumber() {
            var number = document.getElementById("numberInput").value;
            if (number >= 1 && number <= 20) {
                document.getElementById("result").innerHTML = "Valid";
            } else {
                document.getElementById("result").innerHTML = "Invalid";
            }
        }
    </script>
</body>
</html>
```

### Create a Selenium script to input the various test cases into your HTML form.

```java
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
```

### Run a Local HTTP server on port 5500 and then run this selenium script.