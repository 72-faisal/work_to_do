package do_tasks;
import java.util.*;

public class Values_map {


	    public static void main(String[] args) {
	        // Create a map
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "apple");
	        map.put(2, "banana");
	        map.put(3, "orange");

	        // Get a collection view of the values contained in the map
	        Collection<String> values = map.values();

	        // Print the values
	        System.out.println("Values: " + values);
	    }
	}

