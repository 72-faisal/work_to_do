package do_tasks;
import java.util.ArrayList;
import java.util.Collections;


public class Sort_arraylist {

	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(5);
	        list.add(2);
	        list.add(8);
	        list.add(3);
	        list.add(1);

	        System.out.println("Before sorting: " + list);

	        Collections.sort(list);

	        System.out.println("After sorting: " + list);
	    }
	}

