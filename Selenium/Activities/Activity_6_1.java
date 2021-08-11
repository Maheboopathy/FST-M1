package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement togglecheckbox1 = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		togglecheckbox1.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox1));
		togglecheckbox1.click();
		
		wait.until(ExpectedConditions.visibilityOf(checkbox1));
		checkbox1.click();
		
		driver.close();
		

	}

}
