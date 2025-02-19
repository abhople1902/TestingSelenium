package schoolProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class school {

    @Test
    void test() {
        // Instantiate a WebDriver object (FirefoxDriver in this case)
        WebDriver driver = new FirefoxDriver();
        
        try {
        	driver.get("https://schooledn.py.gov.in/admission/hsc.html");

            Actions actions = new Actions(driver);

            // Locating the "Schools" link on the webpage
            WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']/self::A"));

            WebElement govt = driver.findElement(By.xpath("//A[@href='#'][text()='Government']/self::A"));

            WebElement state = driver.findElement(By.xpath("//A[@href='../schools/stateGovt.html'][text()='State Govt']/self::A"));

            actions.click(school).perform();

            actions.moveToElement(govt).click().perform();

//            actions.click(govt).perform();

            actions.moveToElement(state).perform();

            actions.click(state).perform();
        } catch (Exception e) {
            e.printStackTrace(); // Print any exceptions that occur during execution
            fail("Test failed: " + e.getMessage()); // Fail the test if an exception occurs
        } finally {
            // Close the browser after the test
            driver.quit();
        }
    }
}