package day3;

public class CarRunInSameClass {
	

	String model;
	String colour;
	long price;
	String gear;
	
	public static void main(String[] args) {
		CarRunInSameClass honda = new CarRunInSameClass();
		honda.model = "city";
		honda.colour = "White";
		honda.price= 1200000;
		honda.gear="manual";
		
		System.out.println("Thhis is for honda");
		System.out.println(honda.model +"  "+honda.colour+"  "+honda.price+" "+honda.gear);
		start();
		accelerate();
		horn();
		honda.gear();
		
		System.out.println("******************************");
		System.out.println("This is for audi");
		CarRunInSameClass audi = new CarRunInSameClass();
		
		audi.model = "Q7";
		audi.colour = "REd";
		audi.price= 12000000;
		audi.gear="Automatic";
		System.out.println(audi.model +"  "+audi.colour+"  "+audi.price+" "+audi.gear);
		start();
		accelerate();
		horn();
		audi.gear();
		
	}
	
	public static void start()
	{
		System.out.println(" The car start");
	}
	
	public static void horn()
	{
		System.out.println(" The car horn");
	}
	
	public static void accelerate()
	{
		System.out.println(" The car accelerates");
	}
	
	public void gear()
	{
		System.out.println(" the gear is "+gear);
	}

}
