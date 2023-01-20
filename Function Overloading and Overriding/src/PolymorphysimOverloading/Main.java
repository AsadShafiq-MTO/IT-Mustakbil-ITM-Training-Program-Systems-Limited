package PolymorphysimOverloading;
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

	}

}
