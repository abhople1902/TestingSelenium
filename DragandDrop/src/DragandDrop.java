import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import org.junit.jupiter.api.Test;

class DragandDrop {

	    @Test
	    void test() {
	        // Initialize WebDriver
	        WebDriver driver = new FirefoxDriver();

	        try {
	            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

	            // Locate the draggable element
	            WebElement draggable = driver.findElement(By.id("draggable"));

	            // Locate the droppable element
	            WebElement droppable = driver.findElement(By.id("droppable"));

	            // Perform drag and drop
	            Actions actions = new Actions(driver);
	            actions.dragAndDrop(draggable, droppable).build().perform();
	        } catch (Exception e) {
	            e.printStackTrace();
	            fail("An exception occurred: " + e.getMessage());
	        } finally {
	            // Close the WebDriver instance
	            driver.quit();
	        }
	    }

	}



