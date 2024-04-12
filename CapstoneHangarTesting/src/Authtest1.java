import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authtest1 {
	public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
        	
            driver.get("http://localhost:4200/signup");

            // ID Locator
            WebElement searchUsernameById = driver.findElement(By.id("usernamefield"));
            searchUsernameById.sendKeys("abhople1902");
            
            WebElement searchEmailById = driver.findElement(By.id("emailfield"));
            searchEmailById.sendKeys("ayushbhople@gmail.com");
            
            WebElement searchPasswordById = driver.findElement(By.id("passfield"));
            searchPasswordById.sendKeys("Ayush19@");
            
            WebElement searchExpById = driver.findElement(By.id("expfield"));
            searchExpById.sendKeys("10");
            
            
            
            


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
