package do_tasks;
import java.util.ArrayList;


public class Adding_two_arraylist {

	    public static void main(String[] args) {
	        // create an ArrayList
	        ArrayList<String> list1 = new ArrayList<String>();
	        list1.add("apple");
	        list1.add("banana");
	        list1.add("cherry");
	        list1.add("date");
	        list1.add("elderberry");

	        // create another ArrayList and copy the elements of list1 into it
	        ArrayList<String> list2 = new ArrayList<String>();
	        for (String s : list1) {
	            list2.add(s);
	        }

	        // print the elements of both ArrayLists
	        System.out.println("List 1: " + list1);
	        System.out.println("List 2: " + list2);
	    }
	}


