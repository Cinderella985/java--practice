import java.util.Scanner;

class Exe7_31 {
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
		
		System.out.print("list1 is ");
		for (int u: list1) {
			System.out.print (u + " ");
		}
		System.out.println();
		
		System.out.print("list2 is ");
		for (int u: list2) {
			System.out.print (u + " ");
		}
		System.out.println();

		System.out.print("The merged list is ");
		int[] result = merge(list1, list2);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int[] result = new int[list1.length + list2.length];
		
		int first = 0;
		int second = 0;
		int third = 0;
		
		while(first < list1.length && second < list2.length) {
			if(list1[first] < list2[second])
				result[third++] = list1[first++];
			else
				result[third++] = list2[second++];
		}
		
		while (first < list1.length) {
			result[third++] = list1[first++];
		}
		
		while (second < list2.length) {
			result[third++] = list2[second++];
		}
		
		return result;	
	}
}