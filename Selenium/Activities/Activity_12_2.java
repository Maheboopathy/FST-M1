package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_12_2 {

	public static void main(String[] args) {
		//open the browser
	    WebDriver driver = new FirefoxDriver();
	    
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		//frame on the page
		driver.switchTo().frame(0);
		
		//switch to first iframe on frame
		driver.switchTo().frame(0);
		//get the heading of the frame
		WebElement frameheading1 = driver.findElement(By.cssSelector("div.content"));
		System.out.println("heading of the frame: " + frameheading1.getText());
		
		//switch to parentpage
		driver.switchTo().defaultContent();
		
		//switch to frame in page
		driver.switchTo().frame(0);
		//switch to frame 1 in frame
		driver.switchTo().frame(1);
	    
		//Get the heading of the frame2
		WebElement frameheading2 = driver.findElement(By.cssSelector("div.content"));
	    System.out.println("Heading of the frame2: " + frameheading2.getText());
	    
	    //close browser
	    driver.close();
	}
}
