package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity_2 {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new FirefoxDriver();
		//navigate to the link
		driver.get("https://www.training-support.net");
		//get title
		String pagetitle = driver.getTitle();
		//print the title
		System.out.println("Title of the page: " + pagetitle);
		
	    //to locate About us using id()
		WebElement linkid = driver.findElement(By.id("about-link"));
		System.out.println("About us link id: " + linkid.getText());

		//to locate about us using classname
		WebElement linkbyclass = driver.findElement(By.className("green"));
		System.out.println("About us link by class: " + linkbyclass.getText());
		
		//to locate aout us using linktext
		WebElement linkbytext = driver.findElement(By.linkText("About Us"));
	    System.out.println("About us link by linktext: " + linkbytext.getText());
	    
	    driver.close();
	    }
}
