public class D {
	public static void main(String[] args) {
		
		double tuition = 10000;
		int year = 0;
		int count = 0;
		
		while (year < 10 ) {
			tuition = tuition * 1.05;
			year++;
		}
		
		System.out.printf("Tuition will be $%.2f in %1d years\n",tuition,year);
		
		double total = tuition;
		while (count < 3) {
			tuition = tuition * 1.05;
			total += tuition;
			count++;
		}
		
		System.out.printf("The total tuition will be $%.2f" , total);
	}
}