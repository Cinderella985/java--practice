class Exe8_10 {
	public static void main(String[] args) {
		int[][] list = new int[4][4];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = (int)(Math.random() * 2);
			}
		}
		
		int rowMaxIndex = 0;
		int row = 0;
		for (int i = 0; i < list[0].length; i++) {
			rowMaxIndex += list[0][i];
		}
		
		int columnMaxIndex = 0;
		int col = 0;
		for (int i = 0; i < list.length; i++) {
			columnMaxIndex += list[i][0];
		}
		
		int total = 0;
		for (int i = 1; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				total += list[i][j];
			}
			if (total > rowMaxIndex) {
				rowMaxIndex = total;
				row = i;
			}
			total = 0;
		}
		
		int total1 = 0;
		for (int i = 1; i < list[0].length; i++) {
			int j = 0;
			for (j = 0; j < list.length; j++) {
				total1 += list[j][i];
			}
			if (total1 > columnMaxIndex) {
				columnMaxIndex = total1;
				col = i;
			}
			total1 = 0;
		}
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The largest row index: " + row);
		System.out.println("The largest col index: " + col);		
	}
}
