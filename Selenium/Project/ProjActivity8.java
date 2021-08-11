package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjActivity8 {

	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,15);
		//navigate to the link
		driver.get("http://alchemy.hguy.co/orangehrm");
		//Username and password
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(5);
		//navigate to Dashboard link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dashboard")));
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(2);
		//click on Applyleave image
		driver.findElement(By.xpath("//table[@class='quickLaungeContainer']/tbody/tr/td[4]")).click();
		Thread.sleep(1);
		//Leave details
		Select select = new Select(driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']")));
		select.selectByVisibleText("privilege leaves");
		driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).clear();
		driver.findElement(By.xpath("//input[@id='applyleave_txtFromDate']")).sendKeys("2021-08-09");
		driver.findElement(By.xpath("//div[@class='inner']/form/fieldset/ol/li[3]/img")).click();
		driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).clear();
		driver.findElement(By.xpath("//input[@id='applyleave_txtToDate']")).sendKeys("2021-08-11");
		driver.findElement(By.xpath("//li[@class='largeTextBox']")).click();
		driver.findElement(By.id("applyBtn")).click();
		Thread.sleep(5);
		//navigate to Leave link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leave")));
		driver.findElement(By.linkText("Leave")).click();
		Thread.sleep(5);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Leave")));
		driver.findElement(By.linkText("My Leave")).click();
		Thread.sleep(5);
		driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr/td[6]/a")).click();
		Thread.sleep(5);
		
		//wait time		
		Thread.sleep(10000);
		//close the browser
        driver.close();
	}

}
