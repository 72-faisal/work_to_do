package do_tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Searching_elements_arraylist {
	

	    public static void main(String[] args) {
	        // Creating an array list of integers
	        ArrayList<Integer> numbers = new ArrayList<Integer>();

	        // Adding some numbers to the array list
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Getting the number to search from user input
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to search: ");
	        int numToSearch = scanner.nextInt();

	        // Searching the number in the array list
	        int index = numbers.indexOf(numToSearch);
	        if (index == -1) {
	            System.out.println(numToSearch + " not found in the array list.");
	        } else {
	            System.out.println(numToSearch + " found at index " + index + " in the array list.");
	        }
	    }
	}


