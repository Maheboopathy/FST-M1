package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		//navigate to link
		driver.get("https://www.training-support.net/selenium/simple-form");
		String pagtitle = driver.getTitle();
		
		System.out.println("Title of the page: " + pagtitle);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shahil");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sharma");
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@example.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9810345670");
		
		driver.findElement(By.xpath("//input[@class='ui green button']")).click();
		
		driver.close();

	}
}
