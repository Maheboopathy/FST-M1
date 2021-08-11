package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjActivity6 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 15);
		//navigate to link
		driver.get("http://alchemy.hguy.co/orangehrm");
		//username and password
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		//Directory link
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@id, 'menu_directory_viewDirectory')]")));
		Thread.sleep(10);
		driver.findElement(By.xpath("//a[contains(@id, 'menu_directory_viewDirectory')]")).click();
		//verify the heading of Directory page
		String heading1 = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
		System.out.println("heading: " + heading1);
		if (heading1.equals("Search Directory"))
		{
			System.out.println("Heading Matches");
		}
		else
		{
			System.out.println("Heading is not matching");
		}
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
	}

}
