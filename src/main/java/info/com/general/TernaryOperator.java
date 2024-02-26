package info.com.general;


public class TernaryOperator {


	public static void main(String[] args) {
		
		 if(true ==  true)
		        System.out.println("Om bhagavate vasudevaya namaha");


		        String car = "BMW";

		        boolean  isCommercial = (car != "BMW") ? false : true;

		        if (isCommercial){

		            System.out.println("Not for commercial purpose");

		        }

		        //variable = Expression1 ? Expression2: Expression3

		        int num1 = 10;
		        int num2 = 20;

		        int result = num1 > num2 ? (num1 + num2) : (num1 - num2);

		        System.out.println(result);

		        int n1 = 5, n2 = 10, max;

		        max = (n1 > n2) ? n1 : n2 ;

		        System.out.println(max);

		        boolean condition = true;


		        String resultss = (condition) ? "True" : "False";

		        System.out.println(resultss);
		        
		        
		        int num = 8;
//		        String msg = "";
//		        if(num > 10) {
//		            msg = "Number is greater than 10";
//		        }
//		        else {
//		            msg = "Number is less than or equal to 10";
//		        }
//		        
		        
//		        System.out.println(msg);
		        
		        
		        final String message = (num > 10) ? "Number is greater than 10" :  "Number is less than or equal to 10";
		        
		        System.out.println(message);
		        
		        
		        
		        String msg = num > 10 ? "Number is greater than 10" : 
		        	  num > 5 ? "Number is greater than 5" : "Number is less than equal to 5";

		        	  System.out.println(msg);
	
	}
	
	
	
	

}
