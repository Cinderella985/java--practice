class Exe5_39 {
	public static void main(String[] args) {
		
		final  double x0 = 5000;
		double x1 = 5000 * 0.08;
		double x2 = 5000 * 0.1;
		double x3 = x1 + x2;
		double x4 = 10000;
		
		while ((x4 - 10000) * 0.12 + x3 + x0 < 30000) {
			x4 += 0.01;
		}
		System.out.printf("%.2f",(x4 + 10000));	
	}
}
