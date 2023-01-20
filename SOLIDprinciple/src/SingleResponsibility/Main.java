package SingleResponsibility;

public class Main {

	public static void main(String[] args) {
		
		Chef chef=new Chef();
		chef.setName("Hussain");
		chef.setAge(40);
		chef.setWork("I am  a chef");	
		chef.getName();
		chef.getAge();
		chef.getWork();
		System.out.println("************************************");
		Painter painter=new Painter();	
		painter.setName("Asad");
		painter.setAge(26);
		painter.setWork("I am  a wall painter");		
		painter.getName();
		painter.getAge();
		painter.getWork();
		System.out.println("************************************");
		Gardener gardener=new Gardener();
		gardener.setName("Bilal");
		gardener.setAge(45);
		gardener.setWork("I am a Gardener");	
		gardener.getName();
		gardener.getAge();
		gardener.getWork();
		System.out.println("************************************");
		Driver driver=new Driver();	
		driver.setName("Zeeshan");
		driver.setAge(38);
		driver.setWork("I am a Driver");	
		driver.getName();
		driver.getAge();
		driver.getWork();
		
		
	}

}
