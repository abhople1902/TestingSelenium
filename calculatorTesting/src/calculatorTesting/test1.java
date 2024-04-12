package calculatorTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		//08JECT METHOD VALUE
		Calpage.searchinput(driver).sendkeys("assdfdfg");
		
		StoreObject.loan(driver).click();
	}
}



