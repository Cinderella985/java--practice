import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		int i;
		
		if (number == 1) {
			System.out.print("1 ");
		}
		
		for (i = 2; i <= number ; i++) {
			while (number % i == 0) {
				number = number / i;
				if (number != 1)
					System.out.print(i + ", ");
				else
					System.out.print(i);
			}
		}
	}
}
		 
