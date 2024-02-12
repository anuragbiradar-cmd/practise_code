package interview;

public class LeapYear {
	public static String validYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return "is a leap year";
				}
			}
			else {
				return "it is a leap year";
			}
		}
		return "not a leap year";
	}
	public static void main(String[] args) {
		String result=validYear(2024);
		System.out.println(result);
		
	}

}
