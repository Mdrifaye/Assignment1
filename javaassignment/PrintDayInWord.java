package javaassignment;

public class PrintDayInWord {

	public static void main(String[] args) {
		int daynumber=8;
		
		if (daynumber==0) {
			System.out.println("SUNDAY");
		}
		else if(daynumber==1) {
			System.out.println("MONDAY");
		}
		else if (daynumber==2) {
			System.out.println("TUESDAY");
		}
		else if (daynumber==3) {
			System.out.println("WEDNSDAY");
		}
		else if (daynumber==4) {
			System.out.println("THURSDAY");
		}
		else if (daynumber==5) {
			System.out.println("FRIDAY");
		}
		else if (daynumber==6) {
			System.out.println("SATURDAY");
		}
		else {
			System.out.println("Not a valid day");
		}

	}

}
