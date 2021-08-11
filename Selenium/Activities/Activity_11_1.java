package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.interactions.*;

public class Activity_11_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
        
		driver.findElement(By.xpath("//button[@id='simple']")).click();
	    //Alert
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert Text is: " +simpleAlert.getText());
		
		simpleAlert.accept();
		
		driver.close();
	}

}
