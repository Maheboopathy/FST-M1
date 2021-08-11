package HRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjActivity4 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 15);
		
		//navigate the link
		driver.get("http://alchemy.hguy.co/orangehrm");
		
		//username and password
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		
		//click on the PIM link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PIM")));
        driver.findElement(By.linkText("PIM")).click();
        
        //Click Add button
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Employee List")));
        driver.findElement(By.linkText("Employee List")).click();
        driver.findElement(By.id("btnAdd")).click();
        
        //fill in the employee details
        driver.findElement(By.id("firstName")).sendKeys("Sathish");
        driver.findElement(By.id("lastName")).sendKeys("Kumar");
        driver.findElement(By.id("btnSave")).submit();
        
        //navigate to PIM link
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PIM")));
        driver.findElement(By.linkText("PIM")).click();
        
        //Search for the Employee
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Sathish");
        driver.findElement(By.id("searchBtn")).submit();
        
        //wait time
		Thread.sleep(5000);
		
		//close the browser
		driver.close();

	}

}
