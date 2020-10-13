class Exe5_39 {
	public static void main(String[] args) {
		
		double x1 = 5000 * 0.08;
		double x2 = 5000 * 0.1;
		double x3 = x1 + x2;
		double x4 = 10000;
		
		while ((x4 - 10000) * 0.12 + x3 <= 30000) {
			x4++;
		}
		System.out.print(x4 + 10000);	
	}
}