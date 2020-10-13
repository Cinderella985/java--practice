class Exe5_18 {
	public static void main(String[] args) {
		int number = 6;
		
		for (int row = 1; row <= number; row++) {
			for (int column = 1; column <= row; column++)
				if (column >= 10)
					System.out.print(column + " ");
				else 
					System.out.print(column + "  ");
			System.out.print("\n");
		}
	}
}
