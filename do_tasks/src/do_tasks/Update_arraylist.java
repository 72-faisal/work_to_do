package do_tasks;
import java.util.ArrayList;

public class Update_arraylist {

	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();

	        list.add("apple");
	        list.add("banana");
	        list.add("orange");
	        list.add("grape");

	        System.out.println("Original ArrayList: " + list);

	        // Updating the second element in the ArrayList
	        list.set(1, "mango");

	        System.out.println("Updated ArrayList: " + list);
	    }
	}


