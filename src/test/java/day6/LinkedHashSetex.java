package day6;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetex {
	
	public static void main(String[] args) {
		
		
		//LinkedHashSet<String> ls = new LinkedHashSet<String>();
			Set<String> ls = new LinkedHashSet<String>();	
				ls.add("mango");
				ls.add("apple");
				ls.add("orange");
				ls.add(null);
				ls.add(null);
				ls.add("mango");
				System.out.println(ls);
				
				/*for(String x:ls)
				{
					System.out.println(x);
				}*/
				
				
				
				Iterator<String> iterator = ls.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
					
				}
	}
}
