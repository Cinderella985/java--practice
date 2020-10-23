class Exe6_12 {
	public static void main(String[] args) {
		System.out.println("i               m(i)");
		System.out.println("____________________");
		
		int i = 1;		
		while (i <= 20) {
			System.out.printf("%d%20.4f \n",i,m(i));
			i++;
		}
	}
	
	public static double m(double i) {
		double sum = 0;
			
		for (int m = 0; m <= i; m++) {
			sum += m / (m + 1.0);
		}	
		return sum;
	}
}