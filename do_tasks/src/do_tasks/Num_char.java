package do_tasks;

public class Num_char {
	
	    
	    public void print(int n, char c) {
	        System.out.println(n + "  " + c);
	    }
	    
	    public void print(char c, int n) {
	        System.out.println(c + "  " + n);
	    }
	    


public static void main(String[] args) {
	Num_char p = new Num_char();
	p.print(10, 'A'); // prints "10 A"
	p.print('B', 20); // prints "B 20"

}
}
