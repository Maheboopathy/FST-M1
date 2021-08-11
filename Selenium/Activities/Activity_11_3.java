package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.interactions.*;

public class Activity_11_3 {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new FirefoxDriver();
				
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		//find confirm button
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		//Alert
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Prompt Alert Text: " + promptAlert.getText());
        promptAlert.sendKeys("Yes, you are!");
        //alert accept
        promptAlert.accept();
        //close the browser
        driver.close();
	}

}
