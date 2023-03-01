package do_tasks;

import java.util.ArrayList;


public class Remove_elements_arraylist {

	  public static void main(String[] args) {
	    // create an ArrayList of integers
	    ArrayList<Integer> numbers = new ArrayList<Integer>();

	    // add some numbers to the ArrayList
	    numbers.add(10);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    numbers.add(50);

	    // print the ArrayList before removing the third element
	    System.out.println("Before removing the third element: " + numbers);

	    // remove the third element from the ArrayList
	    numbers.remove(2);

	    // print the ArrayList after removing the third element
	    System.out.println("After removing the third element: " + numbers);
	  }
	}


