import java.util.*;

class Exe8_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int[][] list1 = new int[3][3];
		
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[0].length; j++) {
				list1[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter list2: ");
		int[][] list2 = new int[3][3];
		
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[0].length; j++) {
				list2[i][j] = input.nextInt();
			}
		}
		
		if (equals(list1, list2)) {
			System.out.print("The two arrays are identical");
		}
		else {
			System.out.print("The two arrays are not identical");
		}
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		if (m1.length * m1[0].length != m2.length * m2[0].length) {
			return false;	
		}
		
		int[] k = new int[m1.length * m1[0].length];
		int n = 0;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				k[n] = m1[i][j];
				n++;
			}
		}
		
		Arrays.sort(k);
		
		int[] k1 = new int[m2.length * m2[0].length];
		int m = 0;
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
				k1[m] = m2[i][j];
				m++;
			}
		}
		
		Arrays.sort(k1);
		
		return Arrays.equals(k, k1);
		
	}

}
