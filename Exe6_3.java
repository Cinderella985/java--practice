import java.util.Scanner;

class Exe6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		reverse(number);
		System.out.print("It is " + isPalindrome(number));
	}
	
	public static int reverse(int number) {
		int x1 = 0;
		while (number > 0) {
			x1 = x1 * 10 + number % 10;
			number /= 10;
		}
		return x1;	
	}
	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}
}