package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Activity_8_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
								
		driver.get("https://training-support.net/selenium/tables");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		List <WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		List <WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		
		System.out.println("No.of Columns are: " +cols.size());
		System.out.println("No.of.Rows are: " +rows.size());
		//print the value before sort
		WebElement beforesrt = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("second row, second column value before sorting: " + beforesrt.getText());
		//sort the table
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();
        //print the value again
        WebElement aftersrt = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("second row, second column value after sorting: " + aftersrt.getText());
		//footer values
		WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println("footer value: " + footer.getText());
	
		driver.close();
	}

}
