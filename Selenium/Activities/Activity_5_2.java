package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("checkbox1 is selected: " + checkbox1.isSelected());
		
		checkbox1.click();
		System.out.println("checkbox1 is selected: " + checkbox1.isSelected());
		
		driver.close();
	}
}
