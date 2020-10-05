import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		char x1 = input.next().charAt(0);
		
		if (x1 == 'A') {
			System.out.print("The numeric value for grade A is 4");
		}
		else if (x1 == 'B') {
			System.out.print("The numeric value for grade B is 3");
		}
		else if (x1 == 'C') {
			System.out.print("The numeric value for grade C is 2");
		}
		else if (x1 == 'D') {
			System.out.print("The numeric value for grade D is 1");
		}
		else if (x1 == 'F') {
			System.out.print("The numeric value for grade F is 0");
		}
		else {
			System.out.println(x1 + " is an invalid grade");
		}
	}
}
