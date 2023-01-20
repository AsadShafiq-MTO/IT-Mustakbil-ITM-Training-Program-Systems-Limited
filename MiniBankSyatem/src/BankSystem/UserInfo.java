package BankSystem;

public class UserInfo {
	String customerName;
	int customerId;
	String password;
		
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return this.customerId;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return this.password;
	}	
}
