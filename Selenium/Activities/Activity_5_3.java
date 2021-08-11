package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
			
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Checkbox is selected: " + text1.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		
		System.out.println("Checkbox is selected: " + text1.isEnabled());
		
		driver.close();
	}
}
