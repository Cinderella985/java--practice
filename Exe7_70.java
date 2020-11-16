
public class Exe7_70 {
	public static void main(String[] args) {
		int[] counts = new int[10];
		
		for (int i = 0; i < 100; i++) {
			int value = (int)(Math.random() * 10);
			counts[value]++;
		}
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Count for " + i + " is " + counts[i]);
		}
	}

}
