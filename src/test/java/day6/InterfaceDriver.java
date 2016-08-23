package day6;

import java.util.Scanner;

public class InterfaceDriver {
	public static void main(String[] args) {
		/*HDFC hdfc = new HDFC();
		hdfc.loaninterest();
		hdfc.fixeddeposit();
		hdfc.HDFChappybonanza();
		
		ICICI icici = new ICICI();
		icici.loaninterest();
		icici.fixeddeposit();
		icici.ICICIhappybonanza();*/
		
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Select the bank HDFC or ICICI");
		String bank = in.next();
		RBI rbi = null;
		if(bank.equalsIgnoreCase("icici"))
		{
			 rbi = new ICICI();
			
			//icici.ICICIhappybonanza();
		}
		else if (bank.equalsIgnoreCase("HDFC"))
		{
			 rbi = new HDFC();
		/*	hdfc.loaninterest();
			hdfc.fixeddeposit();*/
			//hdfc.HDFChappybonanza();
		}
		System.out.println(RBI.x);
		rbi.loaninterest();
		rbi.fixeddeposit();
		in.close();
		System.out.println(HDFC.x);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
