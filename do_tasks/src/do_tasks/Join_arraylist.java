package do_tasks;
import java.util.ArrayList;
import java.util.Collections;
public class Join_arraylist {
	

	    public static void main(String[] args) {
	        // create the first ArrayList
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        // create the second ArrayList
	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);

	        // using the addAll() method of ArrayList
	        list1.addAll(list2);
	        System.out.println("Joined list using addAll() method: " + list1);

	        // using the addAll() method of Collections class
	        Collections.addAll(list1, 7, 8, 9);
	        System.out.println("Joined list using Collections.addAll() method: " + list1);
	    }
	}


