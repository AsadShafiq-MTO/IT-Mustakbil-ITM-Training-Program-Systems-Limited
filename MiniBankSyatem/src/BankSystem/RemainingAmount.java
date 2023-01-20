package BankSystem;

public class RemainingAmount extends TaxDeduction {

	double remainingAmount;
	
	public double getRemainingAmount()
	{
		this.remainingAmount=(accountBalance-(withdrawal+taxDeduction));
		return remainingAmount;
	}
	
	
}
