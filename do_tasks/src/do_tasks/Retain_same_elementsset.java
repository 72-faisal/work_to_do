package do_tasks;
import java.util.HashSet;
import java.util.Set;

public class Retain_same_elementsset {
	
	    public static void main(String[] args) {
	        // Create two sets
	        Set<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        
	        Set<Integer> set2 = new HashSet<>();
	        set2.add(2);
	        set2.add(4);
	        set2.add(6);
	        set2.add(8);
	        
	        // Retain only the common elements in set1
	        set1.retainAll(set2);
	        
	        // Print the common elements
	        System.out.println("Common elements: " + set1);
	    }
	
}
