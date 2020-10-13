import java.util.Scanner;

class Exe5_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Loan Amount: ");
		double loan = input.nextDouble();
		
		System.out.print(" Number of Years: ");
		double year = input.nextDouble();
		
		System.out.print(" Annual Interest Rate: ");
		double rate = input.nextDouble();
		
		double monthlyRate = rate / 1200;
		
		double monthlyPayment = loan * monthlyRate / (1 - (Math.pow(1 / (1 + monthlyRate), year * 12)));
		
		double totalPayment = monthlyPayment * year * 12;
		
		System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100)/100.0);
		System.out.printf("Total Payment: %.2f" ,totalPayment);
		System.out.println("\n");
		
		double interest;
		double principal;
		double balance = loan;
		
		for (int i = 1; i <= year * 12; i++) {
			interest = (int)(monthlyRate * balance * 100) / 100.0;
			principal = (int)((monthlyPayment - interest) * 100) / 100.0;
			balance = (int)((balance - principal) * 100) / 100.0;
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}	
	}
}