package day3;

public class CarDriver {
	
	public static void main(String[] args) {
		Car honda = new Car();
		honda.model = "city";
		honda.colour = "White";
		honda.price= 1200000;
		honda.gear="manual";
		
		System.out.println("This is for honda");
		Car.start();
		Car.accelerate();
		Car.horn();
		honda.gear();
		System.out.println("***************************");
		Car audi = new Car();
		audi.model = "Q7";
		audi.colour = "REd";
		audi.price= 12000000;
		audi.gear="Automatic";
		Car.start();
		Car.accelerate();
		Car.horn();
		audi.gear();
		
		
	}

}
