package selenium_activities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_13_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        //file path
		String filepath="src/sample1.xlsx";
		//create object
		Activity_13_3 srcexcel = new Activity_13_3();
		//read excel
		List<List<String>> data = srcexcel.readExcel(filepath);
		List<String> row;
		//open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        //get title
        String pagtitle = driver.getTitle();
        System.out.println(pagtitle);
        //get row data
        row=data.get(5);
        
        //find the input fields
        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement number = driver.findElement(By.xpath("//input[@id='number']"));
        
        firstname.sendKeys(row.get(1));
        lastname.sendKeys(row.get(2));
        email.sendKeys(row.get(3));
        number.sendKeys(row.get(4));
        //click submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        //alert msg
        Alert msg = driver.switchTo().alert();
        System.out.println("Message: " +msg.getText());
        //accept alert
        msg.accept();
        //close the browser
        driver.close();   
	}
	public List<List<String>> readExcel(String filepath) {
		List<List<String>> data = new ArrayList<List<String>>();
		try {
			FileInputStream file = new FileInputStream(filepath);
			//create workbook obj
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			//sheet
			XSSFSheet sheet = workbook.getSheetAt(0);
			//iterate through rows and cols
			Iterator<Row> rowIterator = sheet.rowIterator();
			while (rowIterator.hasNext()) {
				List<String> rowdata = new ArrayList<String>();
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (row.getLastCellNum()==5) {
					    rowdata.add(cell.getStringCellValue());
					}
					data.add(rowdata);
				}
				file.close();
				workbook.close();
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		return data;
		}
}
