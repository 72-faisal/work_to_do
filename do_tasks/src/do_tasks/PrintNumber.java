package do_tasks;




public class PrintNumber {
    public void printn(int number) {
        System.out.println("Printing integer: " + number);
    }

    public void printn(float number) {
        System.out.println("Printing float: " + number);
    }

    public void printn(double number) {
        System.out.println("Printing double: " + number);
    }

    public void printn(long number) {
        System.out.println("Printing long: " + number);
    }

	public static void main(String[] args) {
	 
	 
		
		
	 
		PrintNumber pn = new PrintNumber();
		pn.printn(42);
		pn.printn(3.14f);
		pn.printn(2.71828);
		pn.printn(1234567890L);

	}
}
