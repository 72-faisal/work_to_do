package do_tasks;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String input = sc.nextLine().toLowerCase();
		        
		if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
			System.out.println("Error: Invalid input. Please enter a single letter.");
		} else {
			char c = input.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		}
			
	}	
	
}	
