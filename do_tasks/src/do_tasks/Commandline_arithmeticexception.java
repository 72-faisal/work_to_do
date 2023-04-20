package do_tasks;

import java.util.Scanner;

public class Commandline_arithmeticexception {

	    public static void main(String[] args) {
//	        if (args.length < 2) {
//	            System.out.println("Please enter two numbers as command line arguments.");
//	            return;
//	        }
	        Scanner sc= new Scanner(System.in);
	        
	        int num1, num2;
	        System.out.println("enter the value of num1 : ");
	        num1=sc.nextInt();
	        System.out.println("enter the vlaue of num2 : ");
	        num2=sc.nextInt();
	        try {
	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	            System.out.println("Cannot divide by zero.");
	        }
	        sc.close();
	    }
	}

