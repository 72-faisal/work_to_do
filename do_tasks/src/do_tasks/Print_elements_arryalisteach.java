package do_tasks;
import java.util.ArrayList;

public class Print_elements_arryalisteach {

	    public static void main(String[] args) {
	        // Creating an ArrayList of strings
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding elements to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Printing the elements of the ArrayList with their positions
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Element at position " + i + ": " + colors.get(i));
	        }
	    }
	}


