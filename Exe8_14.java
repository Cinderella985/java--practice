import java.util.*;

class Exe8_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		
		int[][] list = new int[size][size];
		
		for (int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[0].length; j++) {
				list[i][j] = (int)(Math.random() * 2);
				System.out.print(list[i][j] + " ");
			}
			System.out.println();	
		}
		
		row(list);
		col(list);
		majorDiagonal(list);
		subDiagonal(list);
	}
	
	public static void row(int[][] a) {
		int total = 0;
		boolean happy = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				total += a[i][j];
			}
			if (total == 0) {
				System.out.println("All 0s on row " + i);
				happy = false;
				break;
			}
			else if (total == a.length) {
				System.out.println("All 1s on row " + i);
				happy = false;
				break;
			}
			total = 0;
		}
		if (happy) {
			System.out.println("No same numbers on a row");
		}
	}
	
	public static void col(int[][] b) {
		int total = 0;
		boolean happy = true;
		for (int i = 0; i < b[0].length; i++) {
			for (int j = 0; j < b.length; j++) {
				total += b[j][i];
			}
			if (total == 0) {
				System.out.println("All 0s on column " + i);
				happy = false;
				break;
			}
			else if (total == b.length) {
				System.out.println("All 1s on column " + i);
				happy = false;
				break;	
			}
			total = 0;
		}
		if (happy) {
			System.out.println("No same numbers on a column");
		}
	}
	
	public static void majorDiagonal(int[][] c) {
		int total = 0;
		for (int i = 0; i < c[0].length; i++) {
			total += c[i][i];
		}	
		if (total != c.length) {
			System.out.println("No same numbers on a major diagonal");
		}
		else {
			System.out.println("Same numbers on a major diagonal");
		}
	}
	
	public static void subDiagonal(int[][] d) {
		int total = 0;
		for (int i = d.length - 1; i > 0; i--) {
			total += d[i][i];
		}	
		if (total != d.length) {
			System.out.println("No same numbers on a sub-diagonal");
		}
		else {
			System.out.println("Same numbers on a sub-diagonal");
		}	
	}
}
