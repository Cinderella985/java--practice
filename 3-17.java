import java.util.Scanner;

public class Lo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = (int)(Math.random() * 3);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter scissor (0), rock (1), paper (2) : ");
		int a = input.nextInt();
		
		if (a == 0 && b == 1)
			System.out.print("You won");
		else if (a == 0 && b == 0)
			System.out.print("It is a draw");	
		else if (a == 0 && b == 2)
			System.out.print("You lose");	
		else if (a == 1 && b == 0)
			System.out.print("You win");	
		else if (a == 1 && b == 2)
			System.out.print("You lose");	
		else if (a == 1 && b == 1)
			System.out.print("It is a draw");
		else if (a == 2 && b == 1)
			System.out.print("You win");	
		else if (a == 2 && b == 0)
			System.out.print("You lose");	
		else if (a == 2 && b == 2)
			System.out.print("It is a draw");
	}
}
	
		
		
		
		
		
		
		
		
	