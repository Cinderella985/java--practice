import java.util.Scanner;

public class Op {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		int lottery = (int)(Math.random() * 100);
		
		if (number == lottery)
			System.out.print("you get $10000");
		else if ((number / 100 == lottery % 10 || number / 100 == lottery /100 || number / 100 == lottery/ 10 % 10) && (number % 10 == lottery % 10 || number % 10 == lottery /100 || number % 10 == lottery/ 10 % 10) &&(number / 10 % 10 == lottery % 10 || number / 10 % 10 == lottery /100 || number / 10 % 10 == lottery/ 10 % 10 ))
			System.out.print("you get $3000");
		else if ((number / 100 == lottery % 10) ||( number / 100 == lottery /100 )|| (number / 100 == lottery/ 10 % 10) ||( number % 10 == lottery % 10) || (number % 10 == lottery /100) || (number % 10 == lottery/ 10 % 10) || (number / 10 % 10 == lottery % 10 )||( number / 10 % 10 == lottery /100) ||( number / 10 % 10 == lottery/ 10 % 10))
			System.out.print("you get $1000");
		else
			System.out.print("you get nothing");
	}
}
