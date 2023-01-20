package LiskovSubstitution;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************************************");
		CompanyEmployee obj =new CompanyEmployee();	
		System.out.println("Company Employee Bonus :"+(obj.calculateBonus(10000)));
		System.out.println("Company Employee Salary :"+(obj.salary()));
		System.out.println("************************************");
		ContractEmployee obj1 =new ContractEmployee();	
		System.out.println("Contract Employee Bonus :"+(obj1.calculateBonus(5000)));
		System.out.println("Contract Employee Salary :"+(obj1.salary()));
		System.out.println("************************************");		
	}
}
