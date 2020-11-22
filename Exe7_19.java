import java.util.Scanner;

class Exe7_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sizes of the list: ");
		int n = input.nextInt();
		int[] list = new int[n];
		int[] list2 = new int[n];
		System.out.print("Enter the contents of the list: ");
		for (int x = 0; x < list.length; x++) {
			list[x] = input.nextInt();
		}
		for (int x = 0; x < list2.length; x++) {
			list2[x] = list[x];
		} 
		System.out.print("The list has " + n + " integers ");
		for (int u: list2) {
			System.out.print (u + " ");
		}
		System.out.println();
		
		if (isSorted(list)) {
			System.out.print("The list is already sorted");	
		}
		else {
			System.out.print("The list is not sorted");	
		}
	}
	
	public static boolean isSorted(int[] list) {
		int n = list.length;
		int[] list2 = new int[n];
		
		for (int x = 0; x < list2.length; x++) {
			list2[x] = list[x];
		} 
		for (int i = 0; i < list2.length; i++) {
			int currentMin = list2[i];
			int currentMinIndex = i;
		
			for (int j = i + 1; j < list2.length; j++) {
				if (currentMin > list2[j]) {
					currentMin = list2[j];
					currentMinIndex = j;
				}
			}
		
			if (currentMinIndex != i) {
				list2[currentMinIndex] = list2[i];
				list2[i] = currentMin;
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == list2[i]) {
				return true;
			}
		}
		return false;
	}
}