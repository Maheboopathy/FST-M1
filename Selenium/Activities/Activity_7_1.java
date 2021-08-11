package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
						
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//print the login message
		String loginmsg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Login message:" + loginmsg);
		
		driver.close();
	}
}
