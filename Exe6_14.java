class Exe6_14 {
	public static void main(String[] args) {
		System.out.println("i               m(i)");
		System.out.println("_______________________");
		
		int i = 1;		
		while (i <= 901) {
			if (i == 1)
				System.out.printf("%d%22.4f \n",i,m(i));
			else
				System.out.printf("%d%20.4f \n",i,m(i));
			i += 100;
		}
	}
	
	public static double m(double i) {
		double sum = 0;
			
		for (int m = 1; m <= i; m++) {
			sum += Math.pow(-1, m + 1) / (2 * m - 1);
		}	
		sum *= 4;
		return sum;
	}
}