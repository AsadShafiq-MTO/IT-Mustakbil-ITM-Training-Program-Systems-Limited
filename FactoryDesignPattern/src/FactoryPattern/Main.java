package FactoryPattern;

public class Main {

	public static void main(String[] args) {

	FactoryLaptop fact=new FactoryLaptop();
      Laptop lap=fact.getLaptop("Secured");
    //Laptop lap=fact.getLaptop("Ordered");
    //Laptop lap=fact.getLaptop("Minimum User");
    // Laptop lap=fact.getLaptop(" ");
    lap.laptop();
		

	}

}
