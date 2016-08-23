package day5;

public class MethodOverloadingDriver {
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		String result = obj.add("jim", "Cherian");
		System.out.println(result);
		
		int res = obj.add(10, 20);
		System.out.println(res);
		
		res = obj.add(10, 20, 30);
		System.out.println(res);
		
		MethodOverloading obj1 = new MethodOverloading("Test");
	}

}
