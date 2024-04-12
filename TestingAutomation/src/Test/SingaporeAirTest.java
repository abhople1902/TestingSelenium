package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingaporeAirTest {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
        	
            driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");

            // ID Locator
            WebElement searchBarById = driver.findElement(By.id("bookFlightDestination"));
            searchBarById.sendKeys("New York");


            // XPath Locator
//            WebElement privacyPolicyLinkByXPath = driver.findElement(By.xpath("//a[contains(text(),'Learn More')]"));

            // Print some information about the elements found
            //System.out.println("Search bar found by ID: " + searchBarById.getAttribute("name"));
//            System.out.println("Privacy Policy link found by XPath: " + privacyPolicyLinkByXPath.getAttribute("href"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }
    }
}
