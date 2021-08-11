package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.*;

public class Activity_10_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
        String pressedKeyText;
        
		driver.get("https://www.training-support.net/selenium/input-events");
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		//first actionseq
		Action actionsequence1 = actions.sendKeys("S").build();
		actionsequence1.perform();
		pressedKeyText = pressedKey.getText();
		System.out.println("Pressed Key is: " +pressedKeyText);
		
		//second actionseq
		Action actionsequence2 = actions.keyDown(Keys.CONTROL)
				.sendKeys("a")
				.sendKeys("c")
				.keyUp(Keys.CONTROL)
				.build();
		actionsequence2.perform();
		pressedKeyText = pressedKey.getText();
		System.out.println("Pressed Key is: " +pressedKeyText);
		
		driver.close();
	}

}
