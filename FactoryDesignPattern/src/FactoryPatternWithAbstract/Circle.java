package FactoryPatternWithAbstract;

public class Circle extends AbstractShape {

	    String ShapeName;
	    double Area;	
	    double	radius=4.1;		
	@Override	
	public void SetDetail()
	{
		System.out.println("Name :"+(this.ShapeName="Circle"));
		System.out.println("radius :"+ (this.radius=4.1));		
		System.out.println("Area is :"+(this.Area=(radius * radius * Math.PI)));		 
	}

}
