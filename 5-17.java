import java.util.Scanner;

class Exe5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter an integer from 1 to 15: ");
		int number = input.nextInt(),width=3;
		
		if (number > 15 || number <= 0)
			System.out.print("invalid number");
		
		for (int row = 0; row < number; row++) {
			for (int x = 0; x < (number - row - 1) * width; x++) 
				System.out.print(" ");
			for (int column = row ; column >= 0; column--) {
				for (int y = 0; y < width - 1 - (column + 1) / 10; y++)
					System.out.print(" ");
				System.out.print(column + 1);	
			}
			for (int column = 1; column < row + 1; column++) {
				for (int y = 0; y < width - 1 - (column + 1) / 10;y++)
					System.out.print(" ");
				System.out.print(column + 1);	
			}
			System.out.println();	
		}
	}
}

