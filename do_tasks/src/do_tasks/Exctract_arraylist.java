package do_tasks;

import java.util.ArrayList;
import java.util.List;

public class Exctract_arraylist {


	   public static void main(String[] args) {
	      
	      // create an array list
	      List<String> originalList = new ArrayList<>();
	      
	      // add elements to the array list
	      originalList.add("apple");
	      originalList.add("banana");
	      originalList.add("cherry");
	      originalList.add("date");
	      originalList.add("elderberry");
	      originalList.add("fig");
	      
	      // extract a portion of the array list
	      List<String> extractedList = originalList.subList(2, 5);
	      
	      // print the extracted list
	      System.out.println("Original List: " + originalList);
	      System.out.println("Extracted List: " + extractedList);
	   }
	}

	

