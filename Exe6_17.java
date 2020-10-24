import java.util.Scanner;

class Exe6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		int row = n;
		int column = n;
		int i = 1;
		int m = 1;
		
		while (m <= row) {
			i = 1;
			while (i <= column) {
				if (i % column != 0) {
					System.out.print((int)(Math.random() + 0.5) + " ");
				}
				else {
					System.out.println((int)(Math.random() + 0.5));	
				}
				i++;
			}
			m++;
		}
	}
}