package HRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ProjActivity2 {

	public static void main(String[] args) {
		//open the browser
	    WebDriver driver = new FirefoxDriver();
	    
	    //navigate to link
	    driver.get("http://alchemy.hguy.co/orangehrm");
	    
	    //get the link of image
	    WebElement linkImg = driver.findElement(By.tagName("img"));
        String src = linkImg.getAttribute("src");
        System.out.println("Link of Image: " +src);
        
        //close the browser
        driver.close();
	}
}
