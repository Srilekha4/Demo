package day3;

import java.util.Scanner;

public class GooglePAgeDriver {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the link to be clicked");
		String link = in.next();
		
		System.out.println("Enter the expected title");
		String expected = in.next();
		in.close();
		Googlepage page = new Googlepage();		
		page.launchbrowser();		
		String title = page.clickonLink(link);		
		System.out.println(title);
		if(title.equalsIgnoreCase(expected))
		{
			System.out.println("Validation pass");
		}
		else
		{
			System.out.println("Validation fail");
		}
		page.tear_down();
		
	}

}
