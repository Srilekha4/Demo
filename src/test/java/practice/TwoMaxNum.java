package practice;

public class TwoMaxNum {
	public void printTwoMaxNum(int[] nums){
		int maxOne=0;
		int maxTwo=0;
		for(int n:nums){
			if(maxOne<n){
				maxTwo=maxOne;
				maxOne=n;
			}
			else if(maxTwo<n){
				maxTwo=n;
			}
		}
		
		System.out.println("First Max Number: "+maxOne);
		System.out.println("Second Max Number: "+maxTwo);
		
	}

	public static void main(String[] args) {
		int Num[]={5,12,56,98,99,121};
		TwoMaxNum tmn=new TwoMaxNum();
		tmn.printTwoMaxNum(num);
	}
}
