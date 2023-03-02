package do_tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_arraylist {

	

	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("apple");
	        list.add("banana");
	        list.add("cherry");
	        list.add("date");
	        list.add("elderberry");
	        System.out.println("Original list: " + list);

	        Collections.reverse(list);
	        System.out.println("Reversed list: " + list);
	    }
	}

	

