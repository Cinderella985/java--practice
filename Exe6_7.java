import java.util.Scanner;

class Exe6_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("\n");
		
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.printf("%-5s%21s\n","Years","Future Value");
		
		int years = 1;
		
		while (years <= 30) {
			double futureValue = futureInvestmentValue(investmentAmount, annualInterestRate / 1200, years);
			System.out.printf("%-5d%20.2f\n",years,futureValue);
			years++;
		}
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
