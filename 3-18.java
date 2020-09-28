import java.util.Scanner;

public class Profit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a weight of package: ");
		int w = input.nextInt();
		
		if (0 < w && w <= 1)
			System.out.print("3.5");
		else if (1 < w && w <= 3)
			System.out.print("5.5");
		else if (3 < w && w <= 10)
			System.out.print("8.5");
		else if (10 < w && w <= 20)
			System.out.print("10.5");
		else if (10 < w && w <= 20)
			System.out.print("10.5");
		else if (w > 20)
			System.out.print("the package cannot be shipped");
		else if (w <= 0)
			System.out.print("Invaild input");
	}
}