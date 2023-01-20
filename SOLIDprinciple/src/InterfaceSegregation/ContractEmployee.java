package InterfaceSegregation;

public class ContractEmployee {
	public double salary()
	{
		return 5000;		
	}
	public double calculateBonus(double salary)
	{
		return ((salary*0.5)/100);		
	}
}
