class Exe6_11 {
	public static void main(String[] args) {
		System.out.println("total sales               reward");
		System.out.println("________________________________");
		
		int salesAmount = 10000;
		while (salesAmount <= 100000) {
			System.out.printf("%7d%25.1f \n",salesAmount,computeCommission(salesAmount));
			salesAmount += 5000;
		}
	}
		
		public static double computeCommission(double salesAmount) {
			if (salesAmount == 10000) {
				return (salesAmount - 5000) * 0.1 + 5000 * 0.08; 
			}
			else
				return (salesAmount - 10000) * 0.12 + 10000 * 0.1;
		}
	}


