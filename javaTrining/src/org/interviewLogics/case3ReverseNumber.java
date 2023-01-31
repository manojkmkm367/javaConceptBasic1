package org.interviewLogics;

public class case3ReverseNumber {

	private static void reverseNumber(int a) {
		
		int rev=0;
		while(a!=0) {
		int temp=a%10;
		rev = rev*10 +temp;
		a=a/10;
		}
System.out.println(rev);
	}
	
	
	
	public static void main(String[] args) {
		reverseNumber(12345);

	}

}
