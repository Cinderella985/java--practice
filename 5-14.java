import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int temp,gcd = -1;
		
		if (n1 > n2) {
			temp = n2;
		}
		else
			temp = n1;
		
		while (temp >= 1) {
			if (n1 % temp == 0 && n2 % temp == 0 && gcd < temp) {
				gcd = temp;	
			System.out.print("The greastest common divisior for " + n1 + " and " + n2 + " is " + gcd);
			}
			temp--;
		}
	}
}
		 