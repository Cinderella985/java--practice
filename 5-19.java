class Triangle2 {
	public static void main(String[] args) {
		int number = 8;
		int width = 4;
		
		for (int row = 0; row < number; row++) {
			for (int x = 0; x < (number - row) * width; x++) 
				System.out.print(" ");
			for (int column = 0 ; column <= row; column++) {
				if ((int)Math.pow(2, column) / 10 == 0)
					System.out.print("   ");
				else if ((int)Math.pow(2, column) / 10 > 0 && (int)Math.pow(2, column) / 10 < 10)
					System.out.print("  ");
				else if ((int)Math.pow(2, column) / 10 > 10)
					System.out.print(" ");	
			System.out.print((int)Math.pow(2, column));	
			}
			for (int column = row; column > 0; column--) {
				if ((int)Math.pow(2, column - 1) / 10 == 0)
					System.out.print("   ");
				else if ((int)Math.pow(2, column - 1) / 10 > 0 && (int)Math.pow(2, column - 1) / 10 < 10)
					System.out.print("  ");
				else if ((int)Math.pow(2, column - 1 ) / 10 > 10)
					System.out.print(" ");	
			System.out.print((int)Math.pow(2, column-1));	
			}
		System.out.println();
		}
	}
}