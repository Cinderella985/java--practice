import java.util.Scanner;

class Exe5_49 { 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String x1 = input.nextLine();
		
		int low = 0;
		int high = x1.length();
		int count1 = 0;
		int count2 = 0;
		
		while (low < high) {
			char x2 = x1.charAt(low);
			if (x2 == 'a' || x2 == 'e' || x2 == 'i' || x2 == 'o' || x2 == 'u' || x2 == 'A' || x2 == 'E' || x2 == 'I' || x2 == 'O' || x2 =='U') {
				count1++;
			}
			else if (x2 != ' ') {
				count2++;
			}
			low++;
		}
		System.out.println("The number of vowels is " + count1);
		System.out.println("The number of consonants is " + count2);
	}
}