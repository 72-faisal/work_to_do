package do_tasks;
import java.util.HashSet;

public class Hashset_toarray {

	    public static void main(String[] args) {
	        // Create a HashSet
	        HashSet<String> set = new HashSet<>();
	        set.add("apple");
	        set.add("banana");
	        set.add("orange");
	        set.add("grape");

	        // Convert the HashSet to an array
	        String[] array = set.toArray(new String[set.size()]);

	        // Print the array
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	}


