package do_tasks;
import java.util.ArrayList;


public class Increase_arraylist {

	    public static void main(String[] args) {
	        // create an ArrayList with initial capacity of 5
	        ArrayList<String> list = new ArrayList<>(5);
	        
	        // add some elements to the list
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        
	        // check current capacity
	        System.out.println("Current capacity: " + list.size());
	        
	        // increase capacity to 10
	        list.ensureCapacity(10);
	        
	        // check new capacity
	        System.out.println("New capacity: " + list.size());
	    }
	}


