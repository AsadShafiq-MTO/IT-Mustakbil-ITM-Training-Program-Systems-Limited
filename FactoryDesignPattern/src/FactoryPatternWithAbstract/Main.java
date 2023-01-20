package FactoryPatternWithAbstract;

public class Main {

	public static void main(String[] args) {
		FactoryShapes s =new FactoryShapes();
	      // <--  Change the Name Shape Like (Circle,Rectangle,Parallelogram,Polygon," ")-->//
		  // <-- If provide wrong data or Empty String 
		  // <-- If provide null then Exception Message Show
		try {
			AbstractShape shape=s.getShape("Circle");
			 shape.SetDetail();
		} catch (NullPointerException e) {		
			System.out.println("Please Enter valid name");
		} 

	}

}
