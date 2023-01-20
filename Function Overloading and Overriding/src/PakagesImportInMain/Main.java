package PakagesImportInMain;
////////////////////////   import classes in Other packages //////////////////////////////////
import PolymorphysimOverloading.OverloadingClass;
import PolymorphysimOverriding.Animal;  
import PolymorphysimOverriding.Cat;
import PolymorphysimOverriding.Dog;
/////////////////////////////////////////////////////////

public class Main {

	public static void main(String[] args) {
		
		System.out.println("****************************************************");
		System.out.println("Function OverLoading.........");
		OverloadingClass obj =new OverloadingClass();
		obj.Show();
		obj.Show("Asad Shafiq");
		obj.Show("Ali Butt", 27);
		obj.Show("Ali Butt", "Lahore,Pakistan");
		System.out.println("****************************************************");	
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
