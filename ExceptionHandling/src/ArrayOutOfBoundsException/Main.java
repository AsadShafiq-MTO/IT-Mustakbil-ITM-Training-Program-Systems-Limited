package ArrayOutOfBoundsException;

public class Main {

	public static void main(String[] args) {


		try {
			int a[]=new int[5];
			  a[8]=50;
			  System.out.println(a[8]);
		    } 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}
