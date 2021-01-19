import java.util.*;

class Exe8_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of row: ");
		int row = input.nextInt();
		
		System.out.print("Enter the number of column: ");
		int col = input.nextInt();
		
		int[][] values = new int[row][col];
		System.out.println("Enter the number in the array: ");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[0].length; j++) {
				values[i][j] = input.nextInt();
			}
		}
		
		System.out.print(isConsecutiveFour(values));
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		int numberOfRows = values.length;
		int numberOfColumns = values[0].length;
		
		for (int i = 0; i < values.length; i++) {
			if (isConsecutiveFour(values[i])) {
				return true;
			}
		}
		
		for (int j = 0; j < numberOfColumns; j++) {
			int[] column = new int[numberOfRows];
			for (int i = 0; i < numberOfRows; i++) {
				column[i] = values[i][j];
			}
			
			if (isConsecutiveFour(column)) {
				return true;
			}
		}
		
		return false;	
	}
	
	public static boolean isConsecutiveFour(int[] values) {
		for (int i = 0; i < values.length - 3; i++) {
			boolean isEqual = true;
			for (int j = i; j < i + 3; j++) {
				if (values[j] != values[j + 1]) {
					isEqual = false;
					break;
				}
			}
			
			if (isEqual) {
				return true;
			}
		}	
			return false;
	}
}





















