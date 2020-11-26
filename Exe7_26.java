import java.util.Scanner;

class Exe7_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		 
		System.out.print("Enter list1 size and contents: ");
		int length = input.nextInt();
		int[] list1 = new int[length];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2 size and contents: ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		if (equals(list1, list2)) {
			System.out.print("Two lists are strictly identical");
		}
		else {
			System.out.print("Two lists are not strictly identical");
		}
	}
		
	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length == list2.length) {
			for (int i = 0; i < list1.length; i++) {
				if (list1[i] == list2[i]) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		
		return false;
	}
}
