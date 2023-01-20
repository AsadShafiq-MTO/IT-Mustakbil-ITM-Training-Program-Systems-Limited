package PolymorphysimOverriding;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("****************Function Overriding******************");
		Animal animal= new Animal();
		animal.SetDetail();
		
		System.out.println("****************************************************");
		Animal animal1= new Cat();
		animal1.SetDetail();
		
		System.out.println("****************************************************");
		Animal animal2= new Dog();
		animal2.SetDetail();
		
		System.out.println("****************************************************");

	}

}
