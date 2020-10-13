import java.util.Scanner;

class Exe5_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String x1 = input.next();
		
		int low = 0;
		int high = x1.length() - 1;
		
		while (low <= high) {
			System.out.print(x1.charAt(high));	
			high--;
		}
	}
}