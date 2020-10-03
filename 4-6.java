import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		System.out.println("Three random points are");
		
		double x0 = Math.random() * (2 * Math.PI);
		double x1 = 40 * Math.cos(x0);
		double y1 = 40 * Math.sin(x0);
		System.out.println("(" + x1 + "," + y1 + ")");
		
		double b = Math.random() * (2 * Math.PI);
		double x2 = 40 * Math.cos(b);
		double y2 = 40 * Math.sin(b);
		System.out.println("(" + x2 + "," + y2 + ")");
		
		double c = Math.random() * (2 * Math.PI);
		double x3 = 40 * Math.cos(c);
		double y3 = 40 * Math.sin(c);
		System.out.println("(" + x3 + "," + y3 + ")");
	}
}