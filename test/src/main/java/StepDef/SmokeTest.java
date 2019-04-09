package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by u.8005353-1 on 09/04/2019.
 */
public class SmokeTest {

    WebDriver driver;

    @Given("^Open chrome and start app$")
    public void open_chrome_and_start_app() throws Throwable {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gov.uk/");
    }

    @When("^I navigate to vehicle tax$")
    public void i_navigate_to_vehicle_tax() throws Throwable {

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
    }

    @Then("^I enter a reg$")
    public void i_enter_a_reg() throws Throwable {

        // Enters Registration
        WebElement enterReg = driver.findElement(By.cssSelector("#Vrm"));
        enterReg.sendKeys("k665xwo");
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
    }
}
