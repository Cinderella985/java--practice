class Exe6_16 {
	public static void main(String[] args) {
		System.out.println("2000 2001 2002 2003 2004 2005 2006 2007 2008 2009 2010 2011 2012 2013 2014 2015 2016 2017 2018 2019 2020");
		System.out.println("________________________________________________________________________________________________________");
		
		int year = 2000;
		while (year <= 2020) {
			System.out.print("  " + numberOfDaysInAYear(year));
			year++;
		}	
	}
	
	public static int numberOfDaysInAYear(int year) {
		int sum = 0;
			if (year % 4 == 0 && year % 100 != 0) 
				sum = 366;
			else
				sum = 365;
		return sum;
	}
}