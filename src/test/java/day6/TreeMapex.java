package day6;


import java.util.TreeMap;

public class TreeMapex {
	
public static void main(String[] args) {
		
		
		TreeMap<Integer,String> map = new TreeMap<Integer, String >();
		map.put(101, "US");
		map.put(102, "USA");
		map.put(103, "UK");
		map.put(104, null);
		map.put(101, "US1");
		map.put(105, null);
	//	map.put(null, "GB");
		//map.put(null, "India");
		
		System.out.println(map);
		
		
		System.out.println(map.get(101));
		
		for(Integer x : map.keySet())
		{
			System.out.println(map.get(x));
		}
		}

}


