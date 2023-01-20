package Interface;

public class Rectangle implements IShape {

	String ShapeName;
	double length;
	double weight;
	double Area;
	@Override
	public void SetName() {
		System.out.println("ShapeName :"+(this.ShapeName="Rectangle"));		
	}
	@Override
	public void SetArea() {
		System.out.println("length :"+(this.length=50.9));
		System.out.println("weight :"+(this.weight=80.6));
		System.out.println("Area is :"+(this.Area=(length*weight)));		
	}
}
