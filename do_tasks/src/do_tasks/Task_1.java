package do_tasks;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find the Greatest number:
		
		int i ,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number i :");
		i=sc.nextInt();
		System.out.println("enter the number j :");
		j=sc.nextInt();
		System.out.println("enter the number k :");
		k=sc.nextInt();
//		now we apply the conditions:
		if(i>j) {
			if(i>k) {
				System.out.println("i is greater than j");
			}
			System.out.println("i is greater than k");
		
		}else {
			System.out.println("i is less than j and k");
			
		}
		
		
	}

}
