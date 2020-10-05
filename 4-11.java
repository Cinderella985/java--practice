import java.util.Scanner;

public class Hex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int x = input.nextInt();
		
		if(x > 15 || x < 0) {
			System.out.print(x + " is an invalid input");
		}
		else if (0 <= x && x < 10 ){
			System.out.print("The hex value is " + x);
		}
		else {
			char a = (char)(x - 10 + 65);
			System.out.print("The hex value is " + a);
		}
	}
}
