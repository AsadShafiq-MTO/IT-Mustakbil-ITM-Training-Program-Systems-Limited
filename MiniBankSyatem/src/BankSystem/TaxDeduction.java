package BankSystem;

public class TaxDeduction extends Withdrawal {

	double taxDeduction;
	public double getTaxDeduction(){
	if (withdrawal>20000 && withdrawal<=40000 )
	{
		this.taxDeduction=(withdrawal*0.1/100);
	}
	else if (withdrawal>40000 && withdrawal<=60000)
	{
		this.taxDeduction=(withdrawal*0.2/100);
	}
	else if (withdrawal>60000 && withdrawal<=80000)
	{
		this.taxDeduction=(withdrawal*0.3/100);
	}
	else if (withdrawal>80000 && withdrawal<=100000)
	{
		this.taxDeduction=(withdrawal*0.4/100);
	}
	else if (withdrawal>100000 && withdrawal<1000000000)
	{
		this.taxDeduction=(withdrawal*5/100);
	}
	else
	{
		this.taxDeduction=0;
	}	
	 return this.taxDeduction;
	}
}
