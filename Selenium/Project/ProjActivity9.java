package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class ProjActivity9 {

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
		//click on my info link
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Info")));
        driver.findElement(By.linkText("My Info")).click();
        //click on Emergency contacts
        driver.findElement(By.xpath("//div[@id='sidebar']/ul/li[3]")).click();
        
        //fetch data
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='emgcontact_list']/thead/tr/th"));
        System.out.println("No.of.Columns: " + cols.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
        System.out.println("No.of.rows: " + rows.size());
       
        System.out.println("#" + driver.findElement(By.xpath("//table[@id='emgcontact_list']/thead/tr")).getText());        
        for (int i=1;i<=rows.size();i++) {
        	WebElement element = driver.findElement(By.xpath("//table[@id='emgcontact_list']/tbody/tr["+i+"]"));
        	System.out.println(i + "  " + element.getText());
        }
        //wait time
        Thread.sleep(10);
        //close the browser
        driver.close();
	}
}
