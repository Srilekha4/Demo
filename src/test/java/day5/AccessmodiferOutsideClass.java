package day5;

public class AccessmodiferOutsideClass {
	public static void main(String[] args) {
		
		
		AccessModifier obj = new AccessModifier();
		//Cannot access private variables and methods
		
		System.out.println(obj.y);
		obj.defaultmethod();
		
		System.out.println(obj.z);
		
		obj.protectedmethod();
		
		System.out.println(obj.a);
		obj.publicmethod();
	}

}
