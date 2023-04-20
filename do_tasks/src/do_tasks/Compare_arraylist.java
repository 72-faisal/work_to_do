package do_tasks;
import java.util.ArrayList;
import java.util.Arrays;

public class Compare_arraylist {
	

	  public static void main(String[] args) {
	    ArrayList<String> list1 = new ArrayList<>();
	    list1.add("apple");
	    list1.add("orange");
	    list1.add("banana");
	    ArrayList<String> list2 = new ArrayList<>();
	    list2.add("apple");
	    list2.add("orange");
	    list2.add("banana");

	    // Check if the two lists are equal
	    if (list1.equals(list2)) {
	      System.out.println("The two lists are equal.");
	    } else {
	      System.out.println("The two lists are not equal.");
	    }
	  }
	}

	

