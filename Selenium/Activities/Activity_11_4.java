package selenium_activities;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.*;
//import org.openqa.selenium.interactions.*;

public class Activity_11_4 {

	public static void main(String[] args) throws InterruptedException{
		//open the browser
	    WebDriver driver = new FirefoxDriver();
	    WebDriverWait wait = new WebDriverWait(driver,5);
		//navigate to link        
		driver.get("https://www.training-support.net/selenium/tab-opener");
		//get title
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window: " +parentwindow);
		
		//find link to open new tab
		driver.findElement(By.linkText("Click Me!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//get all windowhandles
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("print all windows: " + windowhandles.toString());
		//Loop through each handle
		for (String handle : driver.getWindowHandles())
		{
			driver.switchTo().window(handle);
		}
		//print the handle of the window
		System.out.println("Current Window Handle: " + driver.getWindowHandle().toString());
		//wait for page load completely
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Open Another One!")));
		//print new tab title
		System.out.println("Window newtab title is: " + driver.getTitle());
	    
		String newtabtext = driver.findElement(By.cssSelector("div.content")).getText();	
		System.out.println("New tab heading is: " +newtabtext);
		driver.switchTo().activeElement();
		
		driver.findElement(By.xpath("//a[@id='actionButton']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		windowhandles = driver.getWindowHandles();
		System.out.println("All Window Handles: " + windowhandles);
		
		for (String Handle: driver.getWindowHandles()) {
			driver.switchTo().window(Handle);
		}
		//print the handle
		System.out.println("New tab handle: " + driver.getWindowHandle());
	    //wait for the new tab
		wait.until(ExpectedConditions.titleIs("Newtab2"));
		//print new tab title
		System.out.println("New Tab title is: " + driver.getTitle());
		//get heading on new page
		newtabtext = driver.findElement(By.cssSelector("div.content")).getText();
		System.out.println("new tab heading is: " +newtabtext);
		//close the browser
        driver.quit();
	}
	}
