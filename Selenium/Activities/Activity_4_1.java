package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {

	public static void main(String[] args) {
		//Activity4-1
		//open the browser
	    WebDriver driver = new FirefoxDriver();
		//navigate to the link
		driver.get("https://www.training-support.net");
		//get title
		String pagetitle = driver.getTitle();
		//print the title
		System.out.println("Title of the page: " + pagetitle);
		
		//to locate About us link using xpath
	    WebElement linkxpth = driver.findElement(By.xpath("/html/body/div/div//div/a"));
	    linkxpth.click();
		System.out.println("Title of current page: " + driver.getTitle());
		
		driver.close();
		
	}

}
