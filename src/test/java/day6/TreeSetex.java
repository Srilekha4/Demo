package day6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetex {
public static void main(String[] args) {
		
		
		//TreeSet<String> ls = new TreeSet<String>();
			Set<String> ls = new TreeSet<String>();	
				ls.add("mango");
				ls.add("apple");
				ls.add("orange");
				//ls.add(null);
				//ls.add(null);
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
