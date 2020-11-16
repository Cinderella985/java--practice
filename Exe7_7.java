class Exe7_7 {
	public static void main(String[] args) {
		int[] integers = creatArray();
		int[] counts = countNumber(integers);
		System.out.println();
		System.out.println("The occurrences of each number are: ");
		displayCounts(counts);
	}
	
	public static int[] creatArray() {
		int[] integers = new int[100];
		for (int i = 0; i < integers.length; i++) {
			integers[i] = (int)(Math.random() * 10);
		}
		
		return integers;
	}
	
	public static int[] countNumber(int[] integers) {
		int[] counts = new int[10];
		
		for (int i = 0; i < 100; i++) {
			if (integers[i] == 0) {
				counts[0]++;
			}
			else if (integers[i] == 1) {
				counts[1]++;
			}
			else if (integers[i] == 2) {
				counts[2]++;
			}
			else if (integers[i] == 3) {
				counts[3]++;
			}
			else if (integers[i] == 4) {
				counts[4]++;
			}
			else if (integers[i] == 5) {
				counts[5]++;
			}
			else if (integers[i] == 6) {
				counts[6]++;
			}
			else if (integers[i] == 7) {
				counts[7]++;
			}
			else if (integers[i] == 8) {
				counts[8]++;
			}
			else if (integers[i] == 9) {
				counts[9]++;
			}
		}
		
		return counts;
	}
	
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + i);
			}
			else {
				System.out.print(counts[i] + " " + i + " ");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
