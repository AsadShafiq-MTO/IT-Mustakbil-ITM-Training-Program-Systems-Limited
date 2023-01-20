package TightAndLooseCoupling;

public class Volume {

	public static void main(String[] args) {
		System.out.println("*********************************************");
		System.out.println("************   Loose Couping   **************");
		System.out.println("*********************************************");
		Box1 box=new Box1(5, 6, 8);		
		System.out.println("Box Volume :"+box.getVolume());
		System.out.println("*********************************************");
		System.out.println("************   Tight Couping   **************");
		System.out.println("*********************************************");
		Box2 box2=new Box2(5,6,8);
		System.out.println("Box 2 Volume :"+box2.volume);
	}

}
