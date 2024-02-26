package info.com.general;

public class OperatorPrecedingExample {

	public static void main(String[] args) {

		double d = 20.00d;
		
		double d2  = 80.00d;
		
		double result = (d + d2) * 100;
		
		System.out.println("result value : " + result );
		
		double remainder = result % 40 ;
		
		System.out.println("remainder value : " + remainder );
		
		boolean isNoRemainder = (remainder == 0) ? true : false ;
		
		System.out.println("isNoRemainder :"  + isNoRemainder );
		
		if (isNoRemainder) {
			System.out.println("Got some remainder");
		}
		
		
		
	}

}
