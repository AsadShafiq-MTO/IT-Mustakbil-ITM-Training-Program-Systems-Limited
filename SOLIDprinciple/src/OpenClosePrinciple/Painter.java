package OpenClosePrinciple;

public class Painter extends WorkClass {
	
	String anotherWork;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setWork(String work,String anotherWork)
	{
		this.work=work;
		this.anotherWork=anotherWork;
	}
	public void getName()
	{
		System.out.println("Name : "+(this.name));
	}
	public void getAge()
	{
		System.out.println("Age : "+(this.age));
	}
	public void getWork()
	{
		System.out.println("Work : "+(this.work));	
		System.out.println("Work : "+(this.anotherWork));	
	}	
}
