package JUnit_Activities;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Activity1 {
	// Test fixtures
    static ArrayList<String> list;
    
		@BeforeEach
		void setUp() throws Exception {
			//initialize arraylist
		    list = new ArrayList<String>();
		    
		    //Add values to the list
		    list.add("alpha");
		    list.add("beta");
		}
		
		@Test
		public void insertTest() {
			//check the size of list
			assertEquals(2, list.size(), "Wrong size");
			//to add new element 
			list.add("apple");
			//check new size
			assertEquals(3, list.size(),"Wrong Size");
			//check the data
			assertEquals("alpha", list.get(0), "Wrong Element");
			assertEquals("beta", list.get(1), "Wrong Element");
			assertEquals("apple", list.get(2), "Wrong Element");
		}
		
		@Test
		public void replaceTest() {
			//check the element in the list
			//check the size of list
			assertEquals(2, list.size(), "Wrong size");
			//to add new element 
			list.add("apple");
			//check new size
			assertEquals(3, list.size(),"Wrong Size");
			//replace data
			list.set(1, "Man");
			assertEquals("alpha", list.get(0), "Wrong Element");
			assertEquals("Man", list.get(1), "Wrong Element");
			assertEquals("apple", list.get(2), "Wrong Element");
		}

	}
