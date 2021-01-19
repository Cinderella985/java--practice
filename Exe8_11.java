import java.util.*;

class Exe8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		String binaryNumber = DecimalToBinary(num);
		
		while (binaryNumber.length() < 9) {
			binaryNumber = '0' + binaryNumber;
		}
		
		char[][] list = new char[3][3];
		int n = 0;
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0, m = 3 * n; j < list[0].length; j++, m++) {
				list[i][j] = binaryNumber.charAt(m);
			}
			n++;
		}
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				if (list[i][j] == '1') {
					System.out.print("T ");
				}
				else {
					System.out.print("H ");
				}
			}
			System.out.println();
		}
	}
	
	public static String DecimalToBinary(int n) {
		String str = "";	
		while (n > 0) {
			int num1 = n % 2;
			str = num1 + str;
			n /= 2;
		}
		
		return str;
	}

}
