package ArithmeticException;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("The Code above is Working fine..");		
		
          //		int a=20/0;
         //		System.out.println("The Code above is Working fine..");
		
         ////////////////////////////////////////Wrong data /////////////////////////////////////	    
//		try {
//			
//			int a=20/0;
//			System.out.println(a);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//		
//		System.out.println("The Code Below is Working fine..");
       //////////////////////////////////////// Correct data /////////////////////////////////////
        try {
			
			int a=20/10;
			System.out.println("The value of a is : "+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
