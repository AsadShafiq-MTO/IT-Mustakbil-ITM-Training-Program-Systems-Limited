package ImplicitInterface;

public class ShapeClass implements ICircle,IParallelogram,IPolygon,IRectangle  {

	String ShapeName;
	double Area , radius;		
	double height , base;
	double length , weight;
	int ns;	double side;	
	@Override
	public void SetName1() {		
		System.out.println("Name :"+(this.ShapeName="Circle"));
	}
	@Override
	public void SetArea1() {		
		System.out.println("radius :"+ (this.radius=4.1));		
		System.out.println("Area is :"+(this.Area=(radius * radius * Math.PI)));	
	}
	@Override
	public void SetName2() {
		System.out.println("Name :"+ (this.ShapeName="Parallelogram"));	
	}

	@Override
	public void SetArea2() {
		System.out.println("height :"+ (this.height=20.5));
		System.out.println("base :"+ (this.base=20.5));
		System.out.println("Area is :"+(this.Area=(height*base)));			
	}

	@Override
	public void SetName3() {
		System.out.println("ShapeName :"+(this.ShapeName="Polygon"));		
	}

	@Override
	public void SetArea3() {
		System.out.println("number of sides on the polygon :"+(this.ns=7));
		System.out.println("the length of one of the sides :"+(this.side=6));
		System.out.println("Area is :"+(ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns))));		
	}
	@Override
	public void SetName4() {
		System.out.println("ShapeName :"+(this.ShapeName="Rectangle"));				
	}
	@Override
	public void SetArea4() {
		System.out.println("length :"+(this.length=50.9));
		System.out.println("weight :"+(this.weight=80.6));
		System.out.println("Area is :"+(this.Area=(length*weight)));				
	}
}
