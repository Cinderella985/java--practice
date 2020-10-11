public class O {
	public static void main(String[] args) {
		int number = 6;
	
		for (int row = 1; row <= number; row++) {
			for (int x = row; x < number; x++)
				System.out.print("  ")；
			for (int column = row ; column >= 1; column--) 
				System.out.print(column + " ");
				System.out.print("\n");		
		}
	}
}
