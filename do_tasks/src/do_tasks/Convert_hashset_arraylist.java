package do_tasks;

import java.util.*;


public class Convert_hashset_arraylist {

	    public static void main(String[] args) {
	        // Creating a hash set
	        Set<String> set = new HashSet<String>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Mango");
	        set.add("Grapes");
	        System.out.println("HashSet: " + set);

	        // Converting HashSet to ArrayList
	        List<String> list = new ArrayList<String>(set);
	        System.out.println("ArrayList: " + list);
	    }
	}

