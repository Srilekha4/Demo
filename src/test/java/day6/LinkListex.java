package day6;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListex {
	public static void main(String[] args) {
		//LinkedList<String> ls = new LinkedList<String>();
		List<String> ls = new LinkedList<String>();
		
		ls.add("mango");
		ls.add("apple");
		ls.add("orange");
		ls.add(null);
		ls.add("mango");
		System.out.println(ls);
		ls.add(1, "pineapple");
		/*for(String x:ls)
		{
			System.out.println(x);
		}*/
		
		System.out.println(ls.get(3)+"with index");
		
		Iterator<String> iterator = ls.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	
	}

}
