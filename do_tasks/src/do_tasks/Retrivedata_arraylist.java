package do_tasks;
import java.util.ArrayList;


public class Retrivedata_arraylist {

	    public static void main(String[] args) {
	        // Creating an ArrayList
	        ArrayList<String> fruits = new ArrayList<>();

	        // Adding elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Mango");
	        fruits.add("Pineapple");

	        // Retrieving an element from the ArrayList at index 2
	        String fruit = fruits.get(2);
	        System.out.println("Element at index 2: " + fruit);
	    }
	}
