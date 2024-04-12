package calculatorTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class Calpage {
	public static WebElement searchInput (WebDriver driver) {
		WebElement searchInput= driver.findElement(By.id("calcSearchTerm"));
		return searchInput;
		
	}
}
