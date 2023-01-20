package FactoryPattern;

public class FactoryLaptop {

	public Laptop  getLaptop(String str)
	{
		if(str.equals("Secured"))
			return new AppleMacBook();
		else if (str.equals("Ordered"))
			return new DelLaptop();
		else if (str.equals("Minimum User")) 
			return new HpLaptop();
		else
			return new RiseInShineLaptop();
			
		
		
	}
}
