package day5;

import java.io.IOException;

public class GoogleBingDriver {
	
	public static void main(String[] args) throws IOException {
		String browsertype = Getpropertyfile.getfileinfo("browsertype");
		//String browsertype = "ie";
		Google goo = new Google();
		goo.launchbrowser(browsertype);
		goo.googletestcase();
		goo.tear_down();
		
		String searchword = Getpropertyfile.getfileinfo("searchkey");
		Bing bing = new Bing();
		bing.launchbrowser(browsertype);
		bing.bingtestcase(searchword);
		bing.tear_down();
		
	}

}
