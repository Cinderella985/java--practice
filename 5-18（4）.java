class Exe5_184 {
	public static void main(String[] args) {
		int number = 6;
		
		for (int row = number; row >= 1; row--) {
			for (int x = row; x < number; x++)
				System.out.print("  ");
			for (int column = 1; column <= row; column++)
				System.out.print(column + " ");
			System.out.print("\n");
		}
	}
}
