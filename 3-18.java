import java.util.Scanner;

public class Profit {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight of package: ");
		double w = input.nextDouble();
		
		if (0 < w && w <= 1)
			System.out.print("The shipping cost is $3.5");
		else if (w <= 3)
			System.out.print("The shipping cost is $5.5");
		else if (w <= 10)
			System.out.print("The shipping cost is $8.5");
		else if (w <= 20)
			System.out.print("The shipping cost is $10.5");
		else if (w > 20)
			System.out.print("the package cannot be shipped");
		else
			System.out.print("Invaild input");
	}
}
