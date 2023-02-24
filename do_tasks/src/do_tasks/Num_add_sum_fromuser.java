package do_tasks;

import java.util.Scanner;

public class Num_add_sum_fromuser {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int n = sc.nextInt();
	        int n1 = n;
	        int n2 = n * 11;
	        int n3 = n * 111;
	        int sum = n1 + n2 + n3;
	        System.out.println(n1+ " + " +n2+ " + " +n3+ " = " +sum);
	         
	  }
}
