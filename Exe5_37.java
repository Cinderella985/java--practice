import java.util.Scanner;

public class Exe5_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer in decimal system: ");
		int x1 = input.nextInt();
		
		int x3 = 0;
		int x2;
		
		while (x3 <= x1) {
			if (x3 <= 3)	
				x3 += 1;
			x2 = x3 % 2;
			System.out.print(x2 + " ");
			x3 = x3 * 2;
		}
	}	
}
				
		
		
		
		
		

