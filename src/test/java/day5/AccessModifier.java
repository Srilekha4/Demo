package day5;

public class AccessModifier {
	
	private int x=10;
	int y = 20;
	protected int z = 30;
	
	public int a = 40;
	
	
	private void privatemethod(){
		System.out.println("THis is a private method");
	}
	
	void defaultmethod()
	{
		System.out.println("THis is a default method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("THis is a protected method");
	}
	
	public void publicmethod()
	{
		System.out.println("This is a public method");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();
		System.out.println(obj.x);
		obj.privatemethod();
		
		System.out.println(obj.y);
		obj.defaultmethod();
		
		System.out.println(obj.z);
		obj.protectedmethod();
		
		System.out.println(obj.a);
		obj.publicmethod();
		
		
	}

}
