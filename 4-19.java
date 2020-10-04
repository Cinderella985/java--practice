import java.util.Scanner;

public class Isbn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as a character : ");
		String x1 = input.next();
		
		int x2 = x1.charAt(0) - '0';
		int x3 = x1.charAt(1) - '0';
		int x4 = x1.charAt(2) - '0';
		int x5 = x1.charAt(3) - '0';
		int x6 = x1.charAt(4) - '0';
		int x7 = x1.charAt(5) - '0';
		int x8 = x1.charAt(6) - '0';
		int x9 = x1.charAt(7) - '0';
		int x0 = x1.charAt(8) - '0';
		
		int a = (x2 * 1 + x3 * 2 + x4 * 3 + x5 * 4 + x6 * 5 + x7 * 6 + x8 * 7 + x9 * 8 + x0 * 9) % 11;
		
		if (a == 10) {
			System.out.print(x1 + "X");
		}
		else if (a != 10){
			System.out.print(x1 + a);
		}
		else {
			System.out.print("Invalid input");
		}
	}
}