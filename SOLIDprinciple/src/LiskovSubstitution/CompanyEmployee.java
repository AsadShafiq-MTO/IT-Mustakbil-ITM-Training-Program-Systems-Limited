package LiskovSubstitution;

public class CompanyEmployee implements Salary,Bonus {

	public double salary()
	{
		return 10000;		
	}
	public double calculateBonus(double salary)
	{
		return ((salary*1.0)/100);		
	}
}
