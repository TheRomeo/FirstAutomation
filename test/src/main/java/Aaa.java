//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;




class Example  {
    public static void main(String[] args) throws InterruptedException {

        // Create an instance of the driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Navigate to a web page
        driver.get("https://www.gov.uk/");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("gov.uk"))
            System.out.println("Title matches");
        else
            System.out.println(title);

        // Clicks on Driving and transport
        driver.findElement(By.cssSelector("#services-and-information > div > div.categories-lists > ul:nth-child(2) > li:nth-child(2) > h3 > a")).click();
        Thread.sleep(1000);

        //Clicks Vehicle tax, MOT and Insurance
        WebElement drivingAndTransport = driver.findElement(By.cssSelector("#section > div"));
        Actions action = new Actions(driver);
        action.moveToElement(drivingAndTransport);
        driver.findElement(By.partialLinkText("Vehicle tax")).click();
        Thread.sleep(2000);

        //Clicks Check if a Vehicle is taxed
        WebElement vehicleTaxDiv = driver.findElement(By.cssSelector("#subsection > div"));
        action.moveToElement(vehicleTaxDiv);
        driver.findElement(By.cssSelector("#subsection > div > ul:nth-child(3) > li:nth-child(3) > a")).click();
        Thread.sleep(2000);

        //Clicks start now button
        driver.findElement(By.cssSelector("#get-started > a")).click();
        Thread.sleep(1000);

        // Enters Registration
        WebElement enterReg = driver.findElement(By.cssSelector("#Vrm"));
        enterReg.sendKeys("1234");
        Thread.sleep(1000);

        // Clicks Continue
        driver.findElement(By.cssSelector("#content > form > div > div > div.form-group.no-bottom > fieldset > button")).click();
        Thread.sleep(1000);

        //Click Incorrect vehicle details
        driver.findElement(By.cssSelector("#pr3 > div > details > summary > span")).click();
        Thread.sleep(1000);

        // Clicks yes to proceed with check
        driver.findElement(By.cssSelector("#Correct_True")).click();
        Thread.sleep(1000);

        // Clicks continue
        driver.findElement(By.name("Continue")).click();
        Thread.sleep(1000);






//        WebElement searchElement = driver.findElement(By.cssSelector("#content > header > div > div > div > div.welcome-text > div > form > div > label"));
//        Thread.sleep(2000);
//        searchElement.sendKeys("Car Tax Check");




        // Perform actions on HTML elements, entering text and submitting the form

//        WebElement searchElement     = driver.findElement(By.id("search-main-19169d7f"));
//        WebElement passwordElement     = driver.findElement(By.name("password"));
//        WebElement formElement        = driver.findElement(By.id("loginForm"));


//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement messageElement = wait.until(
//                ExpectedConditions.presenceOfElementLocated(By.id("search-main-19169d7f"))
//        );


//        searchElement.sendKeys("car tax check");
//        passwordElement.sendKeys("twilightZone");

        //passwordElement.submit(); // submit by text input element
//        formElement.submit();        // submit by form element


        // Anticipate web browser response, with an explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement messageElement = wait.until(
//                ExpectedConditions.presenceOfElementLocated(By.id("loginResponse"))
//        );

        // Run a test
//        String message                 = messageElement.getText();
//        String successMsg             = "Welcome to foo. You logged in successfully.";
//        Assert.assertEquals (message, successMsg);

        // Conclude a test
//        driver.quit();

    }
}