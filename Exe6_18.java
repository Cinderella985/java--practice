import java.util.Scanner;

class Exe6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a password: ");
		String s = input.nextLine();
		
		if (letters(s) == 0)
			System.out.print("Valid password");
		else
			System.out.print("Invalid password");	
	}
	
	public static int letters(String s) {
		int count = 0;
		int low = 0;
		int high = s.length() - 1;
		
		while (low <= high) {
			char m = s.charAt(low);
			if (high > 8 && ((int) m >= 65 && (int)m <= 90) || ((int)m >= 97 && (int)m <= 122) || (int)m >= 48 && (int)m <=57) {
				if ((int)m >= 48 && (int)m <=57) {
					count++;
					if(count >= 2)
						return 0;	
				}
			}
			low++;
		}
		return 1;
	}
}
	