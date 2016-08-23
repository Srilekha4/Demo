package day5;

public class PageB extends PageA{
	
	public void referclassAadd()
	{
		super.add();
	}
	
	public void add2Sub10()
	{
		/*result = x+y;
		result =result-10;*/
		
		super.add();
		result =result-10;
	}
	
	
	public void add()
	{
		result = 10+20+30;
	}
}
