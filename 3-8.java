import java.util.Scanner;

public class Ed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a >= b && a >= c && b >= c)
			System.out.print("a=" + a + "b=" + b + "c=" + c );
		else if (a >= b && a >= c && b <= c)
			System.out.print("a=" + a + "c=" + c + "b=" + b );
		else if (a <= b && a <= c && b <= c)
			System.out.print("c=" + c + "b=" + b + "a=" + a );
		else if (a >= b && a <= c && b <= c)
			System.out.print("c=" + c + "a=" + a + "b=" + b );
		else if (a <= b && a <= c && b >= c)
			System.out.print("b=" + b + "c=" + c + "a=" + a );
		else
			System.out.print("b=" + b + "a=" + a + "c=" + c );
		
		
		
		
		
		
	}

}
