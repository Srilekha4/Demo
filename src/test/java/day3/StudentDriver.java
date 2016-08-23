package day3;

public class StudentDriver {
	public static void main(String[] args) {
		Student badreesh= new Student();
		Student shiva = new Student();
		Student smitha = new Student();
		
		badreesh.Name ="Badreesh";
		badreesh.chemistry =10;
		badreesh.english=20;
		badreesh.math=30;
		badreesh.add();
		
		badreesh.schoolname= "St.Marks";
		System.out.println(Student.principal);
		/*String getpassword1 = badreesh.getpassword(2);
		System.out.println(getpassword1);
		*/
		
		System.out.println(badreesh.Name + "   "+ badreesh.chemistry+"  "+badreesh.english+"  "+ badreesh.math+" "+badreesh.schoolname);
	
		smitha.Name ="smitha";
		smitha.chemistry =10;
		smitha.english=25;
		smitha.math=30;
		smitha.add();
		System.out.println(Student.principal);
	/*	String getpassword2 = smitha.getpassword(3);
	
		System.out.println(getpassword2);*/
		
		System.out.println(smitha.Name + "   "+ smitha.chemistry+"  "+smitha.english+"  "+ smitha.math+" "+smitha.schoolname);
	
		shiva.Name ="shiva";
		shiva.chemistry =25;
		shiva.english=30;
		shiva.math=45;
		System.out.println(Student.principal);
		/*shiva.add();
		System.out.println(shiva.getpassword(4));
		*/
		System.out.println(shiva.Name + "   "+ shiva.chemistry+"  "+shiva.english+"  "+ shiva.math+" "+shiva.schoolname);
	
	}

}
