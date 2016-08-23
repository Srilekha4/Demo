package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListex {
	public static void main(String[] args) {
		//ArrayList<String> ls = new ArrayList<String>();
		List<String> ls = new ArrayList<String>();
		
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
