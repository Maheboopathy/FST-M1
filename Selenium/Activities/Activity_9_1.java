package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_9_1 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
										
		driver.get("https://www.training-support.net/selenium/selects");
		
		//weelement chosen
		WebElement chosen = driver.findElement(By.id("single-value"));
		//dropdown
		Select dropdown = new Select (driver.findElement(By.id("single-select")));
        //selectbyvisible
		dropdown.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		//selectbyindex
		dropdown.selectByIndex(3);
		System.out.println(chosen.getText());
		//selectbyvalue
		dropdown.selectByValue("4");
		System.out.println(chosen.getText());
		
		//get all the options
		List <WebElement> options = dropdown.getOptions();
		//print them
		for (WebElement option:options)
		{
		System.out.println("Option: " + option.getText());	
		}
		
		driver.close();
		
		
		
		
		

	}

}
