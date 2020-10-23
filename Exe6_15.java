class Exe6_15 {
	public static void main(String[] args) {
		System.out.println("Taxable        Single        Married Joint        Married        Head of");
		System.out.println("Income                       or Qualifying        Separate       House hold");
		System.out.println("                             Widow(er)");
		System.out.println("_____________________________________________________________________________");
		
		int taxableIncome = 50000;
		
		while (taxableIncome <= 60000) {
			System.out.print(taxableIncome);
			System.out.print("            " + Math.round(computeTax(1, taxableIncome)));
			System.out.print("            " + Math.round(computeTax(2, taxableIncome)));
			System.out.print("            " + Math.round(computeTax(3, taxableIncome)));
			System.out.println("            " + Math.round(computeTax(4, taxableIncome)));
			taxableIncome += 50;
		}
	}	
	
	public static double computeTax(int status, double taxableIncome) {
		if (status == 1) {
			return 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;	
		}
		if (status == 2) {
			return 16700 * 0.1 + (taxableIncome - 16700) * 0.15;	
		}
		if (status == 3) {
			return 8350 * 0.1 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;		
		}
		else {
			return 11950 * 0.1 + (45550 - 11950) * 0.15 + (taxableIncome - 45550) * 0.25;		
		}
	}
}
