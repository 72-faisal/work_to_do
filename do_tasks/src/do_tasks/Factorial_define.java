package do_tasks;

import java.util.Scanner;

public class Factorial_define {
	public class Factorial {
	    public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n :");
	int n=sc.nextInt();
//	int n = 4;
	int result = Factorial.factorial(n);
	System.out.println("Factorial of " + n + " is " + result);

}
}
