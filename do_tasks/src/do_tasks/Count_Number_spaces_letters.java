package do_tasks;

import java.util.Scanner;

public class Count_Number_spaces_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		 int letterCount = 0;
		 int spaceCount = 0;
		 int numCount = 0;
		 int otherCount = 0;
		 for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				numCount++;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}
		        System.out.println("Letters: " + letterCount);
		        System.out.println("Numbers: " + numCount);
		        System.out.println("Spaces: " + spaceCount);
		        System.out.println("Other characters: " + otherCount);
	
	}
}
