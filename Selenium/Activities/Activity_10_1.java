package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.*;
//import java.util.List;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_10_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
										
		driver.get("https://www.training-support.net/selenium/input-events");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
        
		//find cube
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		//Left-click
		actions.click(cube);
		WebElement cubeval = driver.findElement(By.className("active"));
		System.out.println("Left-Click: " + cubeval.getText());
		//double-click
		actions.doubleClick(cube).perform();
		cubeval = driver.findElement(By.className("active"));
		System.out.println("Double-Click: " + cubeval.getText());
		//Right-Click
		actions.contextClick(cube).perform();
		cubeval = driver.findElement(By.className("active"));
		System.out.println("Right-Click: " + cubeval.getText());
		
		driver.close();
		
	}

}
