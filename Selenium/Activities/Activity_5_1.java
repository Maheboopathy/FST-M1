package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
        
		WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The Checkbox Input is displayed: " + checkboxInput.isDisplayed());
		
		driver.findElement(By.id("togglecheckbox")).click();
		
		System.out.println("The Check box Input is displayed: " + checkboxInput.isDisplayed());
		
		//Close the browser
		driver.close();
	}

}
