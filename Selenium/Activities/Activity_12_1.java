package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import java.util.Set;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.interactions.*;

public class Activity_12_1 {

	public static void main(String[] args) {
		//open the browser
	    WebDriver driver = new FirefoxDriver();
	    
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/iframes");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//perform operation
		WebElement firstheading1 = driver.findElement(By.cssSelector("div.content"));
		System.out.println("frameheading1: " + firstheading1.getText());

		//click button in iframe 1
		WebElement button1 = driver.findElement(By.cssSelector("button"));
		System.out.println(button1.getText());
	    System.out.println(button1.getCssValue("background-color"));
	    button1.click();
	    
	    //print new button
	    System.out.println(button1.getText());
	    System.out.println(button1.getCssValue("background-color"));
	    
	    //switch back to parent page
	    driver.switchTo().defaultContent();
	    
	    //switch to frame1
	    driver.switchTo().frame(1);
	    
	    //perform operation on second frame
	    WebElement frameheading2=driver.findElement(By.cssSelector("div.content"));
	    System.out.println(frameheading2.getText());
	    
	    //click button
	    WebElement button2 = driver.findElement(By.cssSelector("button"));
		System.out.println(button2.getText());
	    System.out.println(button2.getCssValue("background-color"));
	    button2.click();
	    
	    //print new button
	    System.out.println(button2.getText());
	    System.out.println(button2.getCssValue("background-color"));
	    
	    //switch back to parent page
	    driver.switchTo().defaultContent();
	    
	    //close the browser
	    driver.close();
	}

}
