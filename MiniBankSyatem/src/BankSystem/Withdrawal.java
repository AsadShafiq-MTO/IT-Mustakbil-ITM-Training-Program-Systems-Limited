package BankSystem;

public class Withdrawal extends AccountBalance {

	int withdrawal;
	public int  getWithdrawal(int withdrawal)
	{
		if(withdrawal>accountBalance)
		{
			System.out.println("Your account Balance is less then Withdrawal amount");
		}
		else if (withdrawal<=accountBalance)
		{
			this.withdrawal=withdrawal;
			
		}
		return this.withdrawal;
	}
}
