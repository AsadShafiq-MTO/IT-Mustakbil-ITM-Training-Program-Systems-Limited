package HighAndLowCohesion;

public class Display {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("************   High Cohesion   **************");
		System.out.println("*********************************************");
		Multiply multiply =new Multiply();
		multiply.setMultiply(10, 20);
		System.out.println("Multiplication of two number a and b is :"+multiply.getMultiply());
		System.out.println("*********************************************");
		System.out.println("************   Low Cohesion   **************");
		System.out.println("*********************************************");
		LowCohesion low =new LowCohesion();
		low.setAddition(60, 30);
		low.setSubtraction(60, 30);
		low.setMultiply(60, 30);
		low.setDivision(60, 30);		
		System.out.println("Addition of two number a and b is :"+low.getAddition());
		System.out.println("Subtraction of two number a and b is :"+low.getSubtraction());
		System.out.println("Multiplication of two number a and b is :"+low.getMultiply());
		System.out.println("Division of two number a and b is :"+low.getDivision());
		
	}

}
