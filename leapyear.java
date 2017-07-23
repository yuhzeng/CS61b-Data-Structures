
public class leapyear {
	public static boolean Leapyear(int year) {
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;		
	}
    
	public static void main(String[] args) {
		int year = 2005;
		if(Leapyear(year)) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
		
	}
}
