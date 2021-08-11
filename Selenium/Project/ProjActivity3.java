package HRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class ProjActivity3 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new FirefoxDriver ();
		
		//navigate to link
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		//login using username and password
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	    driver.findElement(By.id("btnLogin")).submit();
	    System.out.println("Logged in");
	    
	    //wait time
	    Thread.sleep(5000);
	    
	    //get the title of the homepage
	    String pagetitle = driver.getTitle();
	    System.out.println("Page title: " + pagetitle);
		
		//close the browser
		driver.close();
	}
}
