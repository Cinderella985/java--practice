import java.util.Scanner;

class Exe5_51 { 	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String x1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String x2 = input.nextLine();
		
		int low1 = 0;
		int high1 = x1.length();
		String x3 = "";
		
		while (low1 < high1) {
			if (x1.charAt(low1) == x2.charAt(low1)) 
				x3 += x1.charAt(low1);
			else
				break;
			low1++;
		} 
		
		if (x3.length() > 0)
		System.out.print("The common prefix is " + x3);	
		else
		System.out.print(x1 + " and " + x2 + " have no common prefix");	
	}	
}