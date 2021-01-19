import java.util.Arrays;

class Exe8_3 {
	public static void main(String[] args) {
		
		char[] rightAnswer = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		char[][] studentAnswer = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},	
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		
		int[] rightNumber = {0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < studentAnswer.length; i++) {
			for (int j = 0; j < studentAnswer[0].length; j++) {
				if (studentAnswer[i][j] == rightAnswer[j]) {
					rightNumber[i]++;
				}
			}
		}
		
		Arrays.sort(rightNumber);
		System.out.println(Arrays.toString(rightNumber));

	}

}
