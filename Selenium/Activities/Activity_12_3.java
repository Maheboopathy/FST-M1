package selenium_activities;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class Activity_12_3 {

	public static void main(String[] args) {
		//open the browser
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    Actions actions = new Actions(driver);
	    
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/popups");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
        //find sign in button
		WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
		//hover over button
		actions.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
		String tooltip = button.getAttribute("data-tooltip");
		System.out.println("ToolTip message: " + tooltip);
		//click on button
		button.click();
		//wait till signinmodal appears
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		//find elements username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
		
		//Read the login message
		String loginmsg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("login message: " +loginmsg);
		
		//close the browser
		driver.close();	
	}
}
