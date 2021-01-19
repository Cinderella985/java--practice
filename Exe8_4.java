import java.util.*;

class Exe8_4 {
	public static void main(String[] args) {
		int[][] workHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9},
		};
		
		int[] singleHour = {0, 0, 0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < workHours.length; i++) {
			for (int j = 0; j < workHours[0].length; j++) {
				singleHour[i] += workHours[i][j];
			}
		}
		
		for (int i = 0; i < singleHour.length - 1; i++) {
			int currentMaxIndex = i;
			int currentMax = singleHour[i];
			
			for (int j = i + 1; j < singleHour.length; j++) {
				if (currentMax < singleHour[j]) {
					currentMax = singleHour[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i) {
				singleHour[currentMaxIndex] = singleHour[i];
				singleHour[i] = currentMax;
				
			}
		}
		
		for (int i = 0; i < singleHour.length; i++) {
			System.out.print(singleHour[i] + " ");	
		}
	}
}
