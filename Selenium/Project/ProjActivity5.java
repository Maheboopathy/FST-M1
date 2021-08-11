package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProjActivity5 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait;
				wait = new WebDriverWait(driver,15);
				
				//navigate the link
				driver.get("http://alchemy.hguy.co/orangehrm");
				
				//username and password
				driver.findElement(By.id("txtUsername")).sendKeys("orange");
				driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
				driver.findElement(By.id("btnLogin")).submit();
				
				System.out.println("logged in");
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Info")));
		        driver.findElement(By.linkText("My Info")).click();
		        System.out.println("clicked");
				
		        driver.findElement(By.id("btnSave")).click();
		        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		        driver.findElement(By.id("personal_txtEmpLastName")).clear();
		        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Jeeva");
		        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Priya");
		        driver.findElement(By.id("personal_optGender_2")).click();
				Select select = new Select(driver.findElement(By.xpath("//li[@class='new']/select")));
				select.selectByVisibleText("American");
				driver.findElement(By.id("personal_DOB")).click();
				//Select select1 = new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[1]")));
				//select1.selectByIndex(2);
				//Select select2 = new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/select[2]")));
		        //select2.selectByValue("1992");
				driver.findElement(By.id("personal_DOB")).clear();
				driver.findElement(By.id("personal_DOB")).sendKeys("1992-03-13");
				driver.findElement(By.id("btnSave")).click();
						
		        //wait time
				Thread.sleep(5000);
				
				//close the brwoser
				driver.close();
	}
}
