package day5;

public class InheritanceABCDriver {
	
	public static void main(String[] args) {
		/*PageA obj = new PageA();
		obj.add();
		System.out.println(obj.result);*/
		
		
		/*PageB obj = new PageB();
		obj.add();
		System.out.println(obj.result);
		obj.add2Sub10();
		System.out.println(obj.result);
		*/
		
		PageC obj = new PageC();
		obj.add();
		System.out.println(obj.result);
		obj.add2Sub10();
		System.out.println(obj.result);
		obj.add2Sub10div10();
		System.out.println(obj.result);
		
		
	
		
	}

}
