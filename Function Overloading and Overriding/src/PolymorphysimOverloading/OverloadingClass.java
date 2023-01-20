package PolymorphysimOverloading;

public class OverloadingClass {

	String Name;
	int Age;
	String Address;	
	public void Show()
	{
		System.out.println("Default parameter");
	}
	public void Show(String Name)
	{
		System.out.println("The Name is :"+(this.Name=Name));
	}
	public void Show(String Name,int Age)
	{
		System.out.println("The Name is :"+(this.Name=Name));
		System.out.println("The Name is :"+(this.Age=Age));
	}
	public void Show(String Name,String Address)
	{
		System.out.println("The Name is :"+(this.Name=Name));
		System.out.println("The Name is :"+(this.Address=Address));
		
	}
	public void Show(String Name,int Age,String Address)
	{
		System.out.println("The Name is :"+(this.Name=Name));		
		System.out.println("The Name is :"+(this.Age=Age));
		System.out.println("The Name is :"+(this.Address=Address));
	}
	public void Show(int Age,String Name,String Address)
	{	
		System.out.println("The Name is :"+(this.Age=Age));
		System.out.println("The Name is :"+(this.Name=Name));		
		System.out.println("The Name is :"+(this.Address=Address));
	}
}
