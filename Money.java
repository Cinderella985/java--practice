import java.util.Scanner;

class Money{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the number of people(from 1 to 50): ");
		int number = input.nextInt();
		
		System.out.print("Enter the money in envolope(from 0.01 to 200): ");
		double number1 = input.nextDouble();
		
		int count = 0;
		
		if (number1 < number * 0.01 || number < 1 || number > 50) {
			System.out.println("Invalid input");
		}
		else {
			while (number1 >= number * 0.01 && count < number) {
				double getMoney = (Math.random() * (number1 - 0.01)) + 0.01;
				System.out.printf ("%.2f\n",getMoney);
				count++;
			}
		}	
	}
}
