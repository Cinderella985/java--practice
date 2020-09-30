import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB : ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa : ");
		int number = input.nextInt();
		
		if (number == 0) {
			System.out.print("Enter the dollar amount : ");
			double dollar = input.nextDouble();
			double yuan = dollar * rate;
			System.out.print( " $ " + dollar + " is " + yuan + " yuan ");
		}
		else if (number == 1) {
			System.out.print("Enter the RMB amount : ");
			double yuan = input.nextDouble();
			double dollar1 = yuan / rate; 
			System.out.print(yuan + " yuan is $ " + (int)(dollar1 * 100) / 100.0 );
		}
		else
			System.out.print("Incorrect input");
	}
}	
		
