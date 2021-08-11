package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Activity_8_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
								
		driver.get("https://training-support.net/selenium/tables");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		List <WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		List <WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		
		System.out.println("No.of Columns are: " +cols.size());
		System.out.println("No.of.Rows are: " +rows.size());
		
		
		//get thirdrow values
		List <WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for (WebElement rowvalue:thirdrow)
		{
			System.out.println("third row value: " + rowvalue.getText());
		}
        //get second row and second column value
		WebElement secrowcol = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("second row and second column value: " + secrowcol.getText());
		
		driver.close();
		
	}

}
