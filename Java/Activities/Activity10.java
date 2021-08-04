package Activities;
import java.util.HashSet;
public class Activity10 {

	public static void main(String[] args) {
		//Creating Hashset
		HashSet<String> hs = new HashSet<String>();
		//adding values
		hs.add("M");
		hs.add("A");
		hs.add("N");
		hs.add("G");
		hs.add("O");
		hs.add("E");
		
		//print Hashset
		System.out.println("Original Hashset: " + hs);
		
		//print size of Hashset
		System.out.println("Size of HashSet: " + hs.size());
		
		hs.remove("E");
		
		if(hs.remove("S"))
		{
			System.out.println("S is removed from HashSet");
		}else
		{
			System.out.println("S is not present in the set");
		}
		
		//To check whether Z is present
		System.out.println("Does Hashet contains: " + hs.contains("Z"));
		
		//Updated Hashset
		System.out.println("Updated Hashet: " + hs);
		System.out.println("Updated Hashset size: " +hs.size());
	}
}
