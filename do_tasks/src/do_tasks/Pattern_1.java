package do_tasks;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
//		Patten_2:
		
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
	}
}
