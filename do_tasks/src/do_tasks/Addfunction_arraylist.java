package do_tasks;
import java.util.ArrayList;
import java.util.Iterator;


public class Addfunction_arraylist {

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<String>();
	        
	        // Adding elements to the array list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        
	        // Inserting an element at the first position
	        colors.add(0, "Yellow");
	        
	        // Printing the array list after insertion
	        System.out.println("Array list after inserting element at the first position:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        Iterator itr =colors.iterator();
	        while(itr.hasNext()) {
	        	System.out.println(itr.next());
	        }
	    }
	}


