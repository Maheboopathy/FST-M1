package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		driver.get("https://training-support.net/selenium/ajax");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		WebElement btn1 = driver.findElement(By.xpath("//button[@class='ui violet button']"));
		btn1.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		
		String ajaxtxt = driver.findElement(By.id("ajax-content")).getText();
		System.out.println(ajaxtxt);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
	    
		String latetxt = driver.findElement(By.id("ajax-content")).getText();
	    System.out.println(latetxt);
	 
	    driver.close();
	}

}
