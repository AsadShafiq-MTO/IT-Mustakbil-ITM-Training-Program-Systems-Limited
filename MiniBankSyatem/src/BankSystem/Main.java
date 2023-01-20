package BankSystem;

public class Main {

	public static void main(String[] args) {

		System.out.println("*********************************************************");
		System.out.println("******************* Bank System *************************");
		System.out.println("*********************************************************");
		
		RemainingAmount ac=new RemainingAmount();
		ac.setCustomerId(3);
		ac.setCustomerName("Asad Shafiq");
		ac.setPassword("EWQ-12389@");
		ac.setAccountBalance(2270000);
		
		System.out.println("*********************  "+"User ID :"+ac.getCustomerId()+"  **********************");	
		System.out.println("************** "+"User Name :"+ac.getCustomerName()+" *******************");
		System.out.println("************* "+"Withdrawal Amount :"+ac.getWithdrawal(27050)+" ******************");		
		System.out.println("***************  "+"Tax Deduction :"+ac.getTaxDeduction()+"   *****************");		
		System.out.println("*********** "+"Remaining Amount :"+ac.getRemainingAmount()+" ****************");
		System.out.println("*********************************************************");
		

	}

}
