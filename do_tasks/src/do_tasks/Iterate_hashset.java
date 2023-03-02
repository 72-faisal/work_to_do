package do_tasks;

import java.util.HashSet;
import java.util.Iterator;

public class Iterate_hashset {
	

	
	   public static void main(String[] args) {
	      // create a hash set
	      HashSet<String> set = new HashSet<String>();

	      // add elements to the hash set
	      set.add("apple");
	      set.add("banana");
	      set.add("orange");
	      set.add("pear");

	      // iterate through all elements using enhanced for loop
	      System.out.println("Using enhanced for loop:");
	      for (String s : set) {
	         System.out.println(s);
	      }

	      // iterate through all elements using iterator
	      System.out.println("Using iterator:");
	      Iterator<String> iterator = set.iterator();
	      while (iterator.hasNext()) {
	         System.out.println(iterator.next());
	      }
	   }
	}