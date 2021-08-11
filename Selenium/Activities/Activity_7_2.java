package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
						
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("newuser");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("password");
		driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("test@example.com");
		
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		
		//print the login message
		String loginmsg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Login message:" + loginmsg);
				
		driver.close();
        
	}

}
