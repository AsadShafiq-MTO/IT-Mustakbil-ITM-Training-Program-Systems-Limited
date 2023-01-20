package HighAndLowCohesion;

public class LowCohesion {
	
	int a;
	int b;
	
	public void setMultiply(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getMultiply()
	{
		return a*b;
	}
	public void setAddition(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getAddition()
	{
		return a+b;
	}
	public void setSubtraction(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getSubtraction()
	{
		return a-b;
	}
	public void setDivision(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getDivision()
	{
		return a/b;
	}
	
}
