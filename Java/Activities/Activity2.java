package Activities;
import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		//initialize the Array
		int[] numArray = {10, 77, 10, 54, -11, 10};
		System.out.println("Original Array:" + Arrays.toString(numArray));
		
		//Set Constants
		int isearchnum = 10;
		int ifixedsum = 30;
		
		//print result
		System.out.println("Result:" + result(numArray, isearchnum, ifixedsum));
			}
	public static boolean result (int[] numbers, int isearchnum, int ifixedsum) {
		int itemp_sum = 0;
		//Loop through Array
		for (int i : numbers)
		{
			//if value is 10
		    if (i == isearchnum) {
		    	//add them
		    	itemp_sum = itemp_sum+isearchnum;    
		}
		if (itemp_sum > ifixedsum) {
			break;
				}
		//return true if condition satisfies
		return itemp_sum == ifixedsum;
	}
		return false;
	}
}
