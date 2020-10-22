import java.util.Scanner;

class Exe6_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		displayPattern(n);
	}
	
	public static void displayPattern(int n) {
		for (int row = 1; row <= n; row++) {
			for (int x = row; x < n; x++)
				System.out.print("\t");
			for (int column = row ; column >= 1; column--) 
				System.out.print(column + "\t");
			System.out.print("\n");		
		}
	}
}