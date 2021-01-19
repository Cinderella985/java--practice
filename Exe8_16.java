import java.util.*;

class Exe8_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of points: ");
		int points = input.nextInt();
		
		int[][] list = new int[points][2];
		System.out.print("Enter " + points + " points: ");
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				list[i][j] = input.nextInt();
			}
		}
		 
		sort(list);
	}
	
	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int currentMin = m[i][0];
			int currentMinIndex = i;
			
			for (int j = i; j < m.length; j++) {
				if (m[j][0] < currentMin || m[j][0] == currentMin && m[j][1] < m[currentMinIndex][1]) {
					currentMin  = m[j][0];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				int temp0 = m[currentMinIndex][0];
				int temp1 = m[currentMinIndex][1];
				m[currentMinIndex][0] = m[i][0];
				m[currentMinIndex][1] = m[i][1];
				m[i][0] = temp0;
				m[i][1] = temp1;
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
