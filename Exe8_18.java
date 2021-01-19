class Exe8_18 {
	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		shuffle(m);
	}
	
	public static void shuffle(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int k = (int)(Math.random() * m.length);
			int[] temp = m[i];
			m[i] = m[k];
			m[k] = temp;
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
