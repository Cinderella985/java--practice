import java.util.Scanner;

public class Hi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		System.out.print("What is " + number1 + " + " + number2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 + number2 == answer)
			System.out.print("You are correct!");
		else {
			System.out.print("You are wrong!");
			System.out.print("The answer is" + (number1 + number2));
		}	
	}

}
