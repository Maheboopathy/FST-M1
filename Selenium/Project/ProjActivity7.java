package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjActivity7 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new FirefoxDriver();;
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//to get current date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		LocalDate localDate = LocalDate.now();
	    //navigate to the link
		driver.get("http://alchemy.hguy.co/orangehrm");
		//username and password
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		//click on My info
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Info")));
		driver.findElement(By.linkText("My Info")).click();
		
		//click on Qualifications link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Qualifications")));
		driver.findElement(By.linkText("Qualifications")).click();
		System.out.println("Clicked");
		Thread.sleep(5);
		
		//Add work Experience
		driver.findElement(By.id("addWorkExperience")).click();
		driver.findElement(By.id("experience_employer")).sendKeys("IBM");
		driver.findElement(By.id("experience_jobtitle")).sendKeys("Application Developer");
		driver.findElement(By.id("experience_from_date")).clear();
		driver.findElement(By.id("experience_from_date")).sendKeys("2013-03-14");
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		System.out.println(localDate); 
		driver.findElement(By.id("experience_to_date")).clear();
		driver.findElement(By.id("experience_to_date")).sendKeys(localDate.toString());
		driver.findElement(By.xpath("//li[@class='largeTextBox']")).click();
		
		driver.findElement(By.id("btnWorkExpSave")).click();
		
		//wait time
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
	}
}
