package day3;

public class Student1 {
	String Name;
	int rollno;
	int age;
	String gender;
	static 	String schoolname;
	int math;
	int phy;
	
	public static void displayschoolname()
	{
		schoolname ="St.Joseph";
		
		System.out.println(schoolname);
	}
	
	public void add()
	{
		math = 50;
		phy =30;
		System.out.println(schoolname);
		System.out.println(math+phy);
	}
	
	public static void main(String[] args) {
		
		displayschoolname();
		Student1 student1 = new Student1();
		student1.add();
		
	}
	

}
