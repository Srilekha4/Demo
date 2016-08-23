package day5;

public class MethodOverloading {

	public MethodOverloading()
	{
		System.out.println("This is a default contructor");
	}
	
	public MethodOverloading(String x)
	{
		System.out.println("This is a  contructor overloading");
	}
	
	public int add(int x, int y)
	{
		
		return x+y;
	}
	
	public int add(int x, int y,int z)
	{
		return x+y+z;
	}
	public String add(int x, String name)
	{
		return x+name;
	}
	
	public String add(String name1 , String name2)
	{
		return name1+name2;
		
	}
}
