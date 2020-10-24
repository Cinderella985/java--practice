import java.util.Scanner;

class Exe6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println("The number of letters is " + countLetters(s));
	}
	
	public static int countLetters(String s) {
		int count = 0;
		int low = 0;
		int high = s.length() - 1;
		while (low <= high) {
			char m = s.charAt(low);
			if (((int) m >= 65 && (int)m <= 90) || ((int)m >= 97 && (int)m <= 122)) {
				count++;
			}
			low++;
		}
		return count;
	}
}
