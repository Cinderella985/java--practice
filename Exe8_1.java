import java.util.*;

class Exe8_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		double[][] list = new double[3][4];
		
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < list[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(list, i));
		}
	}
		
	
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		
		for(int j = 0; j < m.length; j++){
			total += m[j][columnIndex];
		}
		
		return total;	
	}	
}
