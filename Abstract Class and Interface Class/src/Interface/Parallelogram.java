package Interface;

public class Parallelogram implements IShape {

	String ShapeName;
	double Area;
	double height;
	double base;	
	@Override
	public void SetName() {		
		System.out.println("Name :"+ (this.ShapeName="Parallelogram"));		
	}
	@Override
	public void SetArea() {
		System.out.println("height :"+ (this.height=20.5));
		System.out.println("base :"+ (this.base=20.5));
		System.out.println("Area is :"+(this.Area=(height*base)));		
	}	
}
