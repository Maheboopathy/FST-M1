package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {

	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String pagtitle = driver.getTitle();
		System.out.println(pagtitle);
		
		WebElement header3 = driver.findElement(By.xpath("//h3[@id='third-header']"));
		System.out.println("third header: " + header3.getText());
		
		WebElement header5 = driver.findElement(By.xpath("//h5[@class='ui green header']"));
		System.out.println("fifth header: " + header5.getCssValue("color"));
		
		WebElement violetbtn = driver.findElement(By.xpath("//button[@class='ui violet button']"));
		System.out.println("Violet Button: " + violetbtn.getAttribute("class"));
		
		WebElement greybtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("Grey button: " + greybtn.getText());
		
		driver.close();
	}

}
