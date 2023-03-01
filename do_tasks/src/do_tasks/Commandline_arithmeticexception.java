package do_tasks;

public class Commandline_arithmeticexception {

	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.out.println("Please enter two numbers as command line arguments.");
	            return;
	        }
	        int num1 = Integer.parseInt(args[0]);
	        int num2 = Integer.parseInt(args[1]);
	        try {
	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	            System.out.println("Cannot divide by zero.");
	        }
	    }
	}

