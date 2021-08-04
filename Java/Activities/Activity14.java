package Activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException{
     try {  
		//create a file
		
		  File file = new File("src/Activities/newfile.txt"); 
			  boolean fstatus = file.createNewFile(); 
			  if(fstatus) {
			  System.out.println("File Created successfully."); 
			  } else {
			  System.out.println("File already exists in this path."); 
			  }
		
		//get file object
        File fileutil = FileUtils.getFile("src/Activities/newfile.txt");
        //read file
        System.out.println("Data in file: " + FileUtils.readFileToString(fileutil, "UTF8"));
        
        //create directory
        File destDir = new File ("newfile2");
       
        //copy file to directory
        FileUtils.copyFileToDirectory (file, destDir);
             
        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, file.getName());
                      
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
               
        //print the data
        System.out.println("Data in new file: " + newFileData);
	}
     catch (IOException errMessage) {
    	 System.out.println(errMessage);
     }
}
}
