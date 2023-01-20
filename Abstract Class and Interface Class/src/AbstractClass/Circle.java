package AbstractClass;

public class Circle extends Shape {

    double	radius=4.1;	
	public void SetDetail()
	{
		System.out.println("Name :"+(this.ShapeName="Circle"));
		System.out.println("radius :"+ (this.radius=4.1));		
		System.out.println("Area is :"+(this.Area=(radius * radius * Math.PI)));		 
	}
}
