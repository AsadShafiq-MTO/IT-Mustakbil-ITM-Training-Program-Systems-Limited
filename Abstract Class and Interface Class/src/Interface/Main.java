package Interface;
public class Main {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		Circle circle =new Circle();
		circle.SetName();
		circle.SetArea();
		System.out.println("*******************************************");
		Parallelogram par =new Parallelogram();
		par.SetName();
		par.SetArea();		
		System.out.println("*******************************************");
		Rectangle rec =new Rectangle();
		rec.SetName();
		rec.SetArea();
		System.out.println("*******************************************");
		Polygon pol =new Polygon();
		pol.SetName();
		pol.SetArea();
		

	}

}
