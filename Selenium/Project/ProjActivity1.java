package HRMProject;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.openqa.selenium.WebElement;

public class ProjActivity1 {

	public static void main(String[] args) {
		//Verify the website Title
		WebDriver driver = new FirefoxDriver();

		//Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
             
        //Get title of the webpage
        String pagetitle = driver.getTitle();
        System.out.println("Title of the page: "+pagetitle);
        
        //WebElement element = driver.findElement(By.tagName("title"));
        
        //checking if title matches OrangeHRM
        if(pagetitle.equals("OrangeHRM"))
        {
        	System.out.println("Title Matches");
        }
        else
        {
        	System.out.println("Title not matches");
        }
                        
        //close the browser
        driver.close();
	}
}