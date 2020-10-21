import java.util.Scanner;

class Exe6_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		reverse(number);
	}
	
	public static void reverse(int number) {
		String x2 = "";
		String x1 = number + x2;
		int low = 0;
		int high = x1.length() - 1;
		
		while (low <= high) {
			System.out.print(x1.charAt(high));	
			high--;
		}
	}
}