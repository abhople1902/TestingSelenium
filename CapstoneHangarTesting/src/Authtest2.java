import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authtest2 {
	public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
        	
            driver.get("http://localhost:4200/signin");

            // ID Locator
            WebElement searchPasswordById = driver.findElement(By.id("passwordfieldsignin"));
            searchPasswordById.sendKeys("Ayush19@");
            
            WebElement searchEmailById = driver.findElement(By.id("emailfieldsignin"));
            searchEmailById.sendKeys("tim@apple.com");
            
            WebElement searchSignButtonById = driver.findElement(By.id("signinbutton"));
            searchSignButtonById.click();


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
