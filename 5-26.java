class Calculate2 {
	public static void main(String[] args) {	
		int i = 1; 
		double e = 1;
		double number = 1;

		for (int x =1; x <= 10; x++) {
			for (i = 1; i <= 10000 * x; i++) {
				number = number / i;
				e += number;
			}
			System.out.println(e);
		}
	}
}