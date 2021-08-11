package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebElement;

public class Activity_3 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		//navigate to the link
		driver.get("https://training-support.net/selenium/simple-form");
		//get title
		String pagetitle = driver.getTitle();
		System.out.println("Title of page: " + pagetitle);
		//find elements for names
		driver.findElement(By.id("firstName")).sendKeys("Shahil");
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.findElement(By.id("email")).sendKeys("abcde@xyz.com");
		driver.findElement(By.id("number")).sendKeys("9765357998");
		//submit
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();

	}

}
