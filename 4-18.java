import java.util.Scanner;

public class Haha {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String x1 = input.next();
		
		char x2 = x1.charAt(0);
		char x3 = x1.charAt(1);
		
		if (x2 == 'M') {
			System.out.print("Mathematics");
		}
		else if (x2 == 'C') {
			System.out.print("Computer Science");
		}
		else if (x2 == 'I') {
			System.out.print("Information");
		}
		else {
			System.out.print("Invalid input");
			System.exit(0);
		}
		
		if (x3 == '1') {
			System.out.print(" Freshman");
		}
		else if (x3 == '2') {
			System.out.print(" Sophomore");
		}
		else if (x3 == '3') {
			System.out.print(" Junior");
		}
		else if (x3 == '4'){
			System.out.print(" Senior");
		}
		else {
			System.out.print("Invalid input");
			System.exit(1);
		}
	}
}
