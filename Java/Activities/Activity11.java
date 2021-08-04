package Activities;
import java.util.HashMap;
public class Activity11 {

	public static void main(String[] args) {
		//Create Hash Map Colours
		HashMap <Integer, String> colours = new HashMap <Integer, String>();
		//Adding values
		colours.put(1, "Red");
		colours.put(2,"Blue");
		colours.put(3,"Green");
		colours.put(4,"Yellow");
		colours.put(5,"Violet");
		
		//print the colours
		System.out.println("Colours: " + colours);
		
		//remove the color
		colours.remove(4);
		
		//check if Green is present
		System.out.println("Checking if Green is present: " + colours.containsValue("Green"));
		
		//Size of the Colours Map:
		System.out.println("Size of the Colours Map: " + colours.size());
	}

}
