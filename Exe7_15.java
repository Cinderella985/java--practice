import java.util.Scanner;

class Exe7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] list = new int[10];
		for (int x = 0; x < list.length; x++) {
			list[x] = input.nextInt();
		}
		
		int[] newlist = eliminateDuplicates(list);
		System.out.print("The distinct numbers are ");
		for (int u: newlist)
		System.out.print (u + " ");
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int count = 1;
		for (int i = 1; i < list.length; i++) {
			for (int i1 = i - 1; i1 >= 0; i1--) {
				if (list[i1] == list[i]) {
					break;
				}
				else if (i1 == 0) {
					count++;
				}
			}
		}
		
		int[] result = new int[count];
		result[0] = list[0];
		int count1 = 0;
		
		for (int i = 1; i < list.length; i++) {
			for (int i1 = i - 1; i1 >= 0; i1--) {
				if (list[i1] == list[i]) {
					break;
				}
				else if (i1 == 0) {
					count1++;
					result[count1] = list[i];
				}
			}
		}
		
		return result;
	}
}
