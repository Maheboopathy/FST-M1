package Activities;
import java.util.ArrayList;
public class Activity9 {

	public static void main(String[] args) {
		//creating Arraylist
		ArrayList<String> mylist = new ArrayList<String>();
		//adding 5 names
		mylist.add("Apple");
		mylist.add("Grapes");
		mylist.add("Pappaya");
		mylist.add(3, "Mango");
		mylist.add(4, "Orange");
		
		System.out.println("Print all the Objects:");
		for (String s:mylist) {
			System.out.println(s);
		}
		System.out.println("3rd element: " + mylist.get(2));
		System.out.println("does this contains: " + mylist.contains("Chicku"));
		System.out.println("Size of Array: " + mylist.size());
		
		mylist.remove("Pappaya");
		System.out.println("Size of Array: " + mylist.size());
	}

}
