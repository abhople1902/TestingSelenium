package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
        	
            driver.get("https://www.calculator.net/");

            // ID Locator
            WebElement searchBarById = driver.findElement(By.id("calcSearchTerm"));
            searchBarById.sendKeys("abcd");
            // Class Name Locator
            WebElement homeListDivByClassName = driver.findElement(By.className("homelisttile"));



            // Link Text Locator
            WebElement aboutUsLinkByLinkText = driver.findElement(By.linkText("about us"));


            // XPath Locator
            WebElement privacyPolicyLinkByXPath = driver.findElement(By.xpath("//a[contains(text(),'BMI Calculator')]"));

            // Print some information about the elements found
            System.out.println("Search bar found by ID: " + searchBarById.getAttribute("name"));
            System.out.println("Home list div found by Class Name: " + homeListDivByClassName.getText());
            System.out.println("About Us link found by Link Text: " + aboutUsLinkByLinkText.getAttribute("href"));
            System.out.println("Privacy Policy link found by XPath: " + privacyPolicyLinkByXPath.getAttribute("href"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
//            driver.quit();
        }
    }
}