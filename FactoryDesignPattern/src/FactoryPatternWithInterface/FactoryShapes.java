package FactoryPatternWithInterface;

public class FactoryShapes {

	public IShape getShape(String str)
	{
		if (str.equals("Circle"))			
			return  new Circle();
		else if (str.equals("Rectangle"))
			return new Rectangle();
		else if (str.equals("Polygon"))
			return new Polygon();
		else if (str.equals("Parallelogram"))
			return new Parallelogram();
		else
			return new UnShape();
	}
}
