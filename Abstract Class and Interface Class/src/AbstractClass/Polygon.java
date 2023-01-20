package AbstractClass;

public class Polygon extends Shape {

	int ns;
	double side;
	public void SetDetail()
	{
		System.out.println("ShapeName :"+(this.ShapeName="Polygon"));
		System.out.println("number of sides on the polygon :"+(this.ns=7));
		System.out.println("the length of one of the sides :"+(this.side=6));
		System.out.println("Area is :"+(ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns))));		 
	}
    
     
}
	

