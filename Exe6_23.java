import java.util.Scanner;

class Exe6_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string and a char: ");
		String str = input.nextLine();
		String str1 = input.next();
		char a = str1.charAt(0);
		
		System.out.print("The number is " + count(str, a));	
	}
	
	public static int count(String str, char a) {
		int high = str.length() - 1;
		int low = 0;
		int count = 0;
		
		while (low <= high) {
			if (str.charAt(low) == a) {
				count++; 
			}
			low++;
		}
		
		return count;
	}
}