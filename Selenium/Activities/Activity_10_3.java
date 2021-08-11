package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.*;

public class Activity_10_3 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//navigate to link        
		driver.get("https://training-support.net/selenium/drag-drop");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		//wait till ball appears
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		WebElement drop2 = driver.findElement(By.id("dropzone2"));
		
        //drag and drop
		actions.dragAndDrop(ball, drop1).build().perform();
		
		//wait till ball has moved to drop
		wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));		
		System.out.println("Ball dropped in dropzone1");
		
		//dropzone2
		actions.dragAndDrop(ball, drop2).build().perform();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
		System.out.println("Ball dropped in dropzone2");
		
		driver.close();
        
	}

}
