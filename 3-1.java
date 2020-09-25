import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (b * b - 4 * a * c > 0){
			double x1 = ((- b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a);
			double x2 = ((- b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a);
		
			System.out.print("The equation has two roots" + x1 + "and" + x2);
		}
		else if (b * b - 4 * a * c == 0){
			double x3 = ((- b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a);
			System.out.print("The equation has one roots" + x3);
		}
		else{
			System.out.print("The equation has no real roots");
		}

	}	
	
}

