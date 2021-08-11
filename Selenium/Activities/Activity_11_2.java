package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.interactions.*;

public class Activity_11_2 {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new FirefoxDriver();
		
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		//find confirm button
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
        //Alert
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Confirm Alert Text: " + confirmAlert.getText());
		
		//confirm alert accept
		confirmAlert.accept();
		//confirm alert cancel
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		confirmAlert.dismiss();
		System.out.println("Alert cancelled");
		
		//close the browser
		driver.close();
	}

}
