package SingleResponsibility;

public class Gardener {
	String name;
	int age;
	String work;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setWork(String work)
	{
		this.work=work;
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
	}	
}
