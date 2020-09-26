import java.util.Scanner;

public class Hj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		int a = number / 100;
		int b = number % 10;
		int c = number / 10 % 10;
		int number1 = b * 100 + c * 10 + a;
		
		System.out.print((number == number1) ?  number + " is a palindrome" : number + " is not a palindrome");
	}
}