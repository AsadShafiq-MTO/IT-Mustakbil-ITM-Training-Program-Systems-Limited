package NullPointerException;

public class Main {

	public static void main(String[] args) {

		 try {
				
				String a=null;
				System.out.println("The value of a is : "+ a.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
	       ///////////////////////////////////////////////////////////////////////////////////
	       try {
				
				String a=null;
				System.out.println("The value of a is : "+ a.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("String Related Null Pointer Exception");
			}

	}

}
