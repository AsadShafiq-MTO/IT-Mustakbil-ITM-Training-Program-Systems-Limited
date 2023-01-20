package Interface;

public class Circle implements IShape {

	String ShapeName;
	double Area;
	double	radius;	
	public void SetName()
	{
		System.out.println("Name :"+(this.ShapeName="Circle"));
	}	
	public void SetArea() 
	{
		System.out.println("radius :"+ (this.radius=4.1));		
		System.out.println("Area is :"+(this.Area=(radius * radius * Math.PI)));	
	}		 
}

