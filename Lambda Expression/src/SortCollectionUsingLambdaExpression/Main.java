package SortCollectionUsingLambdaExpression;

//import java.util.ArrayList;
//import java.util.List;

import java.util.*;   ////  * mean all 

public class Main {

	public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////
		List<Employee> list =new ArrayList<Employee>();
		list.addAll(Arrays.asList(
				
				new Employee("Asad",102),
				new Employee("Bilal",45),
				new Employee("Asif",23),
				new Employee("Shafiq",56),
				new Employee("Ali",78),
				new Employee("Peer",2)
				
				));
		System.out.println(list);
		
//////////////////////////////////////////////////////////////////////////
///////////////////    By Anonamous Class   /////////////////////////////
//////////////////////////////////////////////////////////////////////////		
		Comparator<Employee> comp=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee obj1, Employee obj2) {
				
				return obj1.getEmpName().compareTo(obj2.getEmpName());
			}
		};
		
		Collections.sort(list,comp);
		System.out.println(list);
//////////////////////////////////////////////////////////////////////////
		
		Collections.sort(list,new Comparator<Employee>() {
			
			@Override
			public int compare(Employee obj1, Employee obj2) {
				
				return obj1.getEmpName().compareTo(obj2.getEmpName());
			}
		});		
		
		System.out.println(list);		
		
///////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
/////////////////////// Code Readablity by lambda expression  /////////////
//////////////////////////////////////////////////////////////////////////		
Collections.sort(list,
		(Employee obj1, Employee obj2) ->				
				        obj1.getEmpName().compareTo(obj2.getEmpName())			
		);			
		System.out.println(list);	
		
///////////////////////////////////////////////////////////////////////////

Collections.sort(list,(Employee obj1, Employee obj2) -> obj1.getEmpName().compareTo(obj2.getEmpName()));			
				System.out.println(list);	
				
///////////////////////////////////////////////////////////////////////////		
		
Collections.sort(list,(obj1,obj2) -> obj1.getEmpName().compareTo(obj2.getEmpName()));			
				System.out.println(list);	
		
//////////////////////////////////////////////////////////////////////////
///////////////////// (::)  Double Colon  (Method Reference)  ///////////////
//////////////////////////////////////////////////////////////////////////				
	
Collections.sort(list,Comparator.comparing(Employee::getEmpName));			
				System.out.println(list);	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
