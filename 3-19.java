import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three numbers of triangle : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if ((a + b > c) && (a + c > b) && (b + c > a))
			System.out.print(a + b + c);
		else
			System.out.print("Invalid input");
	}
}