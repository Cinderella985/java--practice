class Exe6_33 {
	public static void main(String[] args) {
		long second = System.currentTimeMillis() / 1000;
		long currentSecond = second % 60;
		long minute = second / 60;
		long currentMinute = minute % 60;
		long hours = minute / 60;
		long currentHour = hours % 24; 
		long day = hours / 24 + 1;
		
		int year = 1970;
		
		while (day >= (isLeapYear(year) ? 366 : 365)) {
			day = day - ((isLeapYear(year)) ? 366 : 365);
			year++;
		}
		
		int month = 1;
		
		while (day >= days(year, month)) {
			day = day - (days(year, month));
			month++;
		}

		System.out.println("Current date and time is " + getMonth(month) + " " + day + ", " + year + " " + currentHour + " : " + currentMinute + " : " + currentSecond);
	}
	
	public static String getMonth(int month) {
		String name1 = "";
		
		switch(month){
			case 1: name1 = "January";
			break;
			case 2: name1 = "Februry";
			break;
			case 3: name1 = "March";
			break;
			case 4: name1 = "Apirl";
			break;
			case 5: name1 = "May";
			break;
			case 6: name1 = "June";
			break;
			case 7: name1 = "July";
			break;
			case 8: name1 = "August";
			break;
			case 9: name1 = "September";
			break;
			case 10: name1 = "October";
			break;
			case 11: name1 = "November";
			break;
			case 12: name1 = "December";
			break;
		}
		
		return name1;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	public static int days(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 31;
		}
		else if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}
		else
			return 0;	
	}	
}
