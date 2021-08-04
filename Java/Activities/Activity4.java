package Activities;
import java.util.*;
public class Activity4 {

	public static void main(String[] args) {
		//initialize the array
		int [] srtarray = {6,9,8,10,30,25,42,50,65,38};
		ascendingsort(srtarray);
		System.out.println("Array sorted in Ascending order:");
		System.out.println(Arrays.toString(srtarray));
	}
public static void ascendingsort(int [] array) {
	int size = array.length;
	for (int i = 1; i < size; i++) {
		int key = array[i];
		int j = i-1;
		
		while (j>=0 && key < array[j]) {
			array [j+1] = array [j];
			--j;
			}
		array[j+1] = key;
	}
}
}
