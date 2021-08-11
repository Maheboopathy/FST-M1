package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_9_2 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
										
		driver.get("https://www.training-support.net/selenium/selects");
		
		//weelement chosen
		WebElement chosen = driver.findElement(By.id("multi-value"));
		//find multiple
		Select multilist = new Select (driver.findElement(By.id("multi-select")));

		if(multilist.isMultiple())
		{
			//selectby visible text
			multilist.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			//selectbyvalue
			multilist.selectByValue("node");
			System.out.println(chosen.getText());
			//select by index
			for (int i=4; i<=6; i++)
			{
				multilist.selectByIndex(i);
				System.out.println(chosen.getText());
			}
			//deselect
			multilist.deselectByValue("node");
			System.out.println(chosen.getText());
			//deselectby index
			multilist.deselectByIndex(7);
			System.out.println(chosen.getText());
			//get all options
			List <WebElement> selectedoptions = multilist.getAllSelectedOptions();
			for (WebElement selectedoption:selectedoptions)
			{
				System.out.println("selectedoption: " + selectedoption.getText());
			}
		    //deselect all options
			multilist.deselectAll();
			System.out.println(chosen.getText());
		}
		
	}

}
