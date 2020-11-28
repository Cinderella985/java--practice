import java.util.Scanner;

class Exe7_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter a string: ");
		String s = input.next();
		System.out.print(sort(s));
	}
	
	public static String sort(String s) {
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			for(int j = 0; j < i; j++) {
				if(s1[i] < s1[j]) {
					char temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
		
		return String.valueOf(s1);
	}
}