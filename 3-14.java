import java.util.Scanner;

public class Ij {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number 0 or 1: ");
		int number = input.nextInt();
		int number1 = (int)(Math.random() * 2);
			if (number == number1)
				System.out.print("true");
			else
				System.out.print("false");	
	}
}