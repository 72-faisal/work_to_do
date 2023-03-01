package do_tasks;

public class Tringle {
	
	    int side1 = 3, side2 = 4, side3 = 5;

	    public double getArea() {
	        double s = (side1 + side2 + side3) / 2.0;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    public double getPerimeter() {
	        return side1 + side2 + side3;
	    }

	    public static void main(String[] args) {
	        Tringle t = new Tringle();
	        System.out.println("Area of the triangle is: " + t.getArea());
	        System.out.println("Perimeter of the triangle is: " + t.getPerimeter());
	    }

}
