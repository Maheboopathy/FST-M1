package Activities;

import java.util.*;

public class Activity13 {

	public static void main(String[] args) {
		//create scan object
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<Integer> ();
		Random indexgen = new Random ();
		
		System.out.print("Enter the integer: ");
		System.out.println("(EOF or non-integer to terminate):");
		
		while(scan.hasNextInt()) {
			List.add(scan.nextInt());
		}
		
		Integer [] nums = List.toArray(new Integer[0]);
        int index = indexgen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + nums[index]);
        
        scan.close();
	}

}
