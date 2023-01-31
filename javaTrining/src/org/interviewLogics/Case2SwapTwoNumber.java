package org.interviewLogics;

public class Case2SwapTwoNumber {
	
	
	public static void usingThiredVer(int a,int b) {
	int temp=a;
	a=b;
	b=temp;
	System.out.println(a+" &&&  "+b);
	}

	private static void withoutThirdVer(int a,int b) {
	
		a=a-b;   	//-20 = 20 -40
		b=a+b;		// 20 = -20+40
		a=b-a;		//40  =  20- -20
		System.out.println(a+" &&&  "+b);
	}
	
	
	
	public static void main(String[] args) {
	
		usingThiredVer(10, 30);
		withoutThirdVer(20, 40);
	}

}
