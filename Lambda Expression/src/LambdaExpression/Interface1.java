package LambdaExpression;

/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////In Functional Interface we use multiple static and default Method   ///////
///////////////////////////////////////////////////////////////////////////////////////////

@FunctionalInterface            // this is check the interface is Functional interface or not if not then error Generate
public interface Interface1 {

	public void show();            // we use only one method declare
	
	public static void print1()    // we use n time of static method in Fuctional interface
	{
		
	}
	public default void print2()    // we use n time of default method in Fuctional interface
	{
		
	}	
}
