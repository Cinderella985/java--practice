import java.util.Scanner;

 class Pounds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = gratuityRate / 100 * subtotal;
		double total = subtotal + gratuity;
		System.out.print("The gratuity is $ " + gratuity + " and total is $ " + total);
	
		}
 }
