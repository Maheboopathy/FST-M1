package selenium_activities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.*;
 
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
 
public class Activity_13_1 {

	public static void main(String[] args) throws IOException, CsvException {
		//load csv file
		CSVReader reader = new CSVReader(new FileReader("src/activity13.csv"));
		//list content to list
		List <String[]> list = reader.readAll();
		System.out.println("total number of Rows: " +list.size());
	
		//create iterator
		Iterator <String []> itr = list.iterator();
		
		while (itr.hasNext()) {
			String[] str = itr.next();
			 
            System.out.print("Values are: ");
            for(int i=0;i<str.length;i++) {
                System.out.print(" " + str[i]);
            }
            System.out.println(" ");	
		}
		reader.close();
	}
}