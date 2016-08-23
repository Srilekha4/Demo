package day6;

import java.util.Scanner;

public class SearchEngineDriver {
	
	public static void main(String[] args) {
		SearchEngineinterface obj = null;
		Scanner in  = new Scanner(System.in);
		System.out.println("Select the search engine");
		String engine = in.next();
		in.close();
		if(engine.equalsIgnoreCase("google"))
		{
			 obj = new GoogleInterface();
		}
		else if(engine.equalsIgnoreCase("bing"))
		{
			obj = new BingInterface();
		}
		
		obj.launchbrowser();
		obj.search();
		obj.results();
		obj.tear_down();
	}

}
