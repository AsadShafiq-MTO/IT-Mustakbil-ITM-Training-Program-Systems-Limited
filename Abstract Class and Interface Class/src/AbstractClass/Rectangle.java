package AbstractClass;

public class Rectangle extends Shape {

	double length;
	double weight;
	public void SetDetail()
	{
		System.out.println("ShapeName :"+(this.ShapeName="Rectangle"));
		System.out.println("length :"+(this.length=50.9));
		System.out.println("weight :"+(this.weight=80.6));
		System.out.println("Area is :"+(this.Area=(length*weight)));		 
	}
}
