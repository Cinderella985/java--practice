import java.util.Scanner;

class Exe7_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter 10 integers: ");
		int[] list1 = new int[10];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		for (int i = 0; i < list1.length; i++) {
			for (int j = i + 1; j < list1.length; j++) {
				System.out.println(list1[i] + " " + list1[j]);
			}
		}
	}
}