package do_tasks;
import java.util.HashSet;


public class Append_hashset {

	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        
	        // Adding elements to the HashSet
	        set.add("apple");
	        set.add("banana");
	        set.add("cherry");
	        
	        // Printing the HashSet before appending an element
	        System.out.println("HashSet before appending: " + set);
	        
	        // Appending an element to the end of the HashSet
	        set.add("orange");
	        
	        // Printing the HashSet after appending an element
	        System.out.println("HashSet after appending: " + set);
	    }
	}


